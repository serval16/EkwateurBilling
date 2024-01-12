package org.ekwateur.ekwateurbilling.hexagone.port;

import org.ekwateur.ekwateurbilling.hexagone.domain.ClientPro;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;

public interface IClientProRepository {
    ClientPro byClientReferenceAndEnergyAndMonth(ClientReference clientReference, EnergyType energyType, Integer month);
}
