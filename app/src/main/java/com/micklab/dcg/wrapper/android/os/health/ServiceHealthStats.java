// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class ServiceHealthStats {
    private final android.os.health.ServiceHealthStats real;

    public ServiceHealthStats(android.os.health.ServiceHealthStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.ServiceHealthStats wrap(android.os.health.ServiceHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.ServiceHealthStats(real);
    }

    public android.os.health.ServiceHealthStats unwrap() {
        return real;
    }


}
