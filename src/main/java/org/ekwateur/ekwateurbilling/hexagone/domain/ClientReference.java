package org.ekwateur.ekwateurbilling.hexagone.domain;

import lombok.Builder;

public class ClientReference {
    private final String clientReference;

    @Builder
    public ClientReference(String clientReference) {
        this.clientReference = clientReference;
    }
}
