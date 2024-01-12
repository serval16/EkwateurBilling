package org.ekwateur.ekwateurbilling.hexagone.domain.strategy;

import lombok.AllArgsConstructor;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParticulierEnergyCalculatorFactory {

    private final GazCalculatorForPro gazCalculatorForPro;
    private final ElectricityCalculatorForPro electricityCalculatorForPro;

    public EnergyCalculator getCalculator(EnergyType energyType) {

        return null;

    }

}
