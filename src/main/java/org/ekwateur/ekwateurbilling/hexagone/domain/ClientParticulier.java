package org.ekwateur.ekwateurbilling.hexagone.domain;

public record ClientParticulier(ClientReference referenceClient,
                                String civility,
                                String name,
                                String firstName,
                                Double consumedKWH) {
}
