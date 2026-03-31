// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingConfig wrap(android.ranging.RangingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingConfig getReal() {
        return (android.ranging.RangingConfig) real;
    }

    public android.ranging.RangingConfig unwrap() {
        return getReal();
    }

    public int getRangingSessionType() {
        return ((android.ranging.RangingConfig) real).getRangingSessionType();
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingConfig) real).toString();
    }

    public static final int RANGING_SESSION_OOB = android.ranging.RangingConfig.RANGING_SESSION_OOB;
    public static final int RANGING_SESSION_RAW = android.ranging.RangingConfig.RANGING_SESSION_RAW;

}
