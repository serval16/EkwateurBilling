package org.ekwateur.ekwateurbilling.hexagone.domain;

public record ClientPro(ClientReference referenceClient,
                        String siretNumber,
                        String raisonSociale,
                        Double ca,
                        Double consumedKWH) {
}
