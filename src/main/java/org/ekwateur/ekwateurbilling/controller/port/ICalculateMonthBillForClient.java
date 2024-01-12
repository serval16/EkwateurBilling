package org.ekwateur.ekwateurbilling.controller.port;

import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.ClientType;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;

public interface ICalculateMonthBillForClient {
    Double execute(ClientReference referenceClient,
                   EnergyType energyType,
                   ClientType clientType, Integer month);
}
