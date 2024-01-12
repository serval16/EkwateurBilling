package org.ekwateur.ekwateurbilling.hexagone.domain.strategy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ElectricityCalculatorForPro implements ProEnergyCalculator {

    @Value("${pro.electricity.gt.million}")
    String priceForGreaterThanMillionCA;

    @Value("${pro.electricity.lt.million}")
    String priceForLesserThanMillionCA;

    @Override
    public Double calculate(Double consumedKWH, Double ca) {
        if (ca < 1000000) {
            return consumedKWH * Double.parseDouble(priceForLesserThanMillionCA);
        } else {
            return consumedKWH * Double.parseDouble(priceForGreaterThanMillionCA);
        }
    }
}
