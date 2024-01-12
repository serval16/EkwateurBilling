package org.ekwateur.ekwateurbilling.hexagone.domain.strategy;

public interface ProEnergyCalculator {
    Double calculate(Double consumedKWH, Double ca);
}
