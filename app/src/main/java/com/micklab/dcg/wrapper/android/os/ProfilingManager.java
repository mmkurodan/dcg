// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProfilingManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProfilingManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProfilingManager wrap(android.os.ProfilingManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProfilingManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.ProfilingManager getReal() {
        return (android.os.ProfilingManager) real;
    }

    public android.os.ProfilingManager unwrap() {
        return getReal();
    }


}
