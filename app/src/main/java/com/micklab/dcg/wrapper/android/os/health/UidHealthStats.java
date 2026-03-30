// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class UidHealthStats {
    private final android.os.health.UidHealthStats real;

    public UidHealthStats(android.os.health.UidHealthStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.UidHealthStats wrap(android.os.health.UidHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.UidHealthStats(real);
    }

    public android.os.health.UidHealthStats unwrap() {
        return real;
    }


}
