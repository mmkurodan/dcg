// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProfilingManager {
    private final android.os.ProfilingManager real;

    public ProfilingManager(android.os.ProfilingManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProfilingManager wrap(android.os.ProfilingManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProfilingManager(real);
    }

    public android.os.ProfilingManager unwrap() {
        return real;
    }


}
