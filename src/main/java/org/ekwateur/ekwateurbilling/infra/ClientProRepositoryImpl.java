package org.ekwateur.ekwateurbilling.infra;

import org.ekwateur.ekwateurbilling.hexagone.domain.ClientPro;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;
import org.ekwateur.ekwateurbilling.hexagone.port.IClientProRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClientProRepositoryImpl implements IClientProRepository {
    @Override
    public ClientPro byClientReferenceAndEnergyAndMonth(ClientReference clientReference, EnergyType energyType, Integer month) {
        return null;
    }
}
