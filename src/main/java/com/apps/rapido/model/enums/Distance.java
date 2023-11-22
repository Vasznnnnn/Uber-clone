package com.apps.rapido.model.enums;

public enum Distance {
    LOCAL(50),
    INTER_STATE(100),
    S2S(200);

    private Long value;

    Distance(long value) {
        this.value = value;
    }

    public Long getValue(){
        return value;
    }
}
