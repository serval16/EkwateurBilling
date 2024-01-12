package org.ekwateur.ekwateurbilling.hexagone.domain.strategy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GazCalculatorForPro implements ProEnergyCalculator {

    @Value("${pro.gaz.gt.million}")
    private Double priceForGreaterThanMillionCA;

    @Value("${pro.gaz.lt.million}")
    private Double priceForLesserThanMillionCA;

    @Override
    public Double calculate(Double consumedKWH, Double ca) {
        if (ca < 1000000) {
            return consumedKWH * priceForLesserThanMillionCA;
        } else {
            return consumedKWH * priceForGreaterThanMillionCA;
        }
    }
}
