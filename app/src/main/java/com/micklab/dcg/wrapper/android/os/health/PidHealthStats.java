// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class PidHealthStats {
    private final android.os.health.PidHealthStats real;

    public PidHealthStats(android.os.health.PidHealthStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.PidHealthStats wrap(android.os.health.PidHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.PidHealthStats(real);
    }

    public android.os.health.PidHealthStats unwrap() {
        return real;
    }


}
