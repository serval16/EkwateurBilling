package org.ekwateur.ekwateurbilling.hexagone.domain.strategy;

import lombok.AllArgsConstructor;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;
import org.springframework.stereotype.Service;

import static org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType.GAZ;

@Service
@AllArgsConstructor
public class ProEnergyCalculatorFactory {

    private final GazCalculatorForPro gazCalculatorForPro;
    private final ElectricityCalculatorForPro electricityCalculatorForPro;

    public ProEnergyCalculator getCalculator(EnergyType energyType) {

        if (energyType.equals(GAZ)) return gazCalculatorForPro;
        else return electricityCalculatorForPro;

    }

}
