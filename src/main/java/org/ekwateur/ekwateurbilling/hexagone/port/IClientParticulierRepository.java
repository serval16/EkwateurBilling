package org.ekwateur.ekwateurbilling.hexagone.port;

import org.ekwateur.ekwateurbilling.hexagone.domain.ClientParticulier;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;

public interface IClientParticulierRepository {
    ClientParticulier byClientReferenceAndEnergyAndMonth(ClientReference clientReference, EnergyType energyType, Integer month);
}
