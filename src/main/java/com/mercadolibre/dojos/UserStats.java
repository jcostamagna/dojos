package com.mercadolibre.dojos;

import java.util.Optional;

public class UserStats {
    Optional<Long> visitCount;

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}
