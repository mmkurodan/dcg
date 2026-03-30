// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class ProcessHealthStats {
    private final android.os.health.ProcessHealthStats real;

    public ProcessHealthStats(android.os.health.ProcessHealthStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.ProcessHealthStats wrap(android.os.health.ProcessHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.ProcessHealthStats(real);
    }

    public android.os.health.ProcessHealthStats unwrap() {
        return real;
    }


}
