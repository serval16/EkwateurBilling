package org.ekwateur.ekwateurbilling.infra;

import org.ekwateur.ekwateurbilling.hexagone.domain.ClientParticulier;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;
import org.ekwateur.ekwateurbilling.hexagone.port.IClientParticulierRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClientParticulierRepositoryImpl implements IClientParticulierRepository {
    @Override
    public ClientParticulier byClientReferenceAndEnergyAndMonth(ClientReference clientReference, EnergyType energyType, Integer month) {
        return null;
    }
}
