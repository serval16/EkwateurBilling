package org.ekwateur.ekwateurbilling.controller;

import lombok.AllArgsConstructor;
import org.ekwateur.ekwateurbilling.controller.port.ICalculateMonthBillForClient;
import org.ekwateur.ekwateurbilling.hexagone.domain.ClientReference;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.ClientType;
import org.ekwateur.ekwateurbilling.hexagone.domain.enums.EnergyType;

/**
 * Optional : to confirm if it will be a REST API
 */
@AllArgsConstructor
public class BillingController {

    private final ICalculateMonthBillForClient iCalculateMonthBillForClient;

    Double calculateMonthBillingForClient(String referenceClient,
                                          String clientType,
                                          String energyType,
                                          Integer month) {

        var clientReference = ClientReference.builder().clientReference(referenceClient).build();

        return iCalculateMonthBillForClient.execute(clientReference,
                EnergyType.valueOf(energyType),
                ClientType.valueOf(clientType),
                month);
    }
}
