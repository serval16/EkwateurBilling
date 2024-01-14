package org.ekwateur.ekwateurbilling.hexagone.domain.usecase.monthly;

import lombok.AllArgsConstructor;
import org.ekwateur.ekwateurbilling.controller.port.ICalculateMonthBillForClient;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientParticulier;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientPro;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.ClientType;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;
import org.ekwateur.ekwateurbilling.hexagone.domain.strategy.EnergyCalculator;
import org.ekwateur.ekwateurbilling.hexagone.domain.strategy.ParticulierEnergyCalculatorFactory;
import org.ekwateur.ekwateurbilling.hexagone.domain.strategy.ProEnergyCalculatorFactory;
import org.ekwateur.ekwateurbilling.hexagone.domain.strategy.ProEnergyCalculator;
import org.ekwateur.ekwateurbilling.hexagone.port.IClientParticulierRepository;
import org.ekwateur.ekwateurbilling.hexagone.port.IClientProRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculateMonthBillingForClientImpl implements ICalculateMonthBillForClient {

    private final IClientProRepository iClientProRepository;
    private final IClientParticulierRepository iClientParticulierRepository;
    private final ProEnergyCalculatorFactory proEnergyCalculatorFactory;
    private final ParticulierEnergyCalculatorFactory energyCalculatorFactory;

    public Double execute(ClientReference clientReference,
                          EnergyType energyType,
                          ClientType clientType, Integer month) {

        if (clientType.equals(ClientType.PRO)) {
            ClientPro clientPro = iClientProRepository
                    .byClientReferenceAndEnergyAndMonth(clientReference, energyType, month);

            return calculateBillAmountForPro(energyType, clientPro.consumedKWH(), clientPro.ca());

        } else if (clientType.equals(ClientType.PARTICULIER)) {
            ClientParticulier clientParticulier = iClientParticulierRepository
                    .byClientReferenceAndEnergyAndMonth(clientReference, energyType, month);

            return calculateBillAmountForParticulier(energyType, clientParticulier.consumedKWH());
        } else {
            throw new IllegalArgumentException("client type is wrong");
        }
    }

    private Double calculateBillAmountForPro(EnergyType energyType, Double consumedKWH, Double ca) {
        ProEnergyCalculator energyCalculator = proEnergyCalculatorFactory.getCalculator(energyType);
        return energyCalculator.calculate(consumedKWH, ca);
    }

    private Double calculateBillAmountForParticulier(EnergyType energyType, Double consumedKWH) {
        EnergyCalculator energyCalculator = energyCalculatorFactory.getCalculator(energyType);
        return energyCalculator.calculate(consumedKWH);
    }

}
