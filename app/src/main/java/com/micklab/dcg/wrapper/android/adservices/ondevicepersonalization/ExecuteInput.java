// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInput wrap(android.adservices.ondevicepersonalization.ExecuteInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.ExecuteInput getReal() {
        return (android.adservices.ondevicepersonalization.ExecuteInput) real;
    }

    public android.adservices.ondevicepersonalization.ExecuteInput unwrap() {
        return getReal();
    }

    public java.lang.String getAppPackageName() {
        return ((android.adservices.ondevicepersonalization.ExecuteInput) real).getAppPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getAppParams() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.adservices.ondevicepersonalization.ExecuteInput) real).getAppParams());
    }

}
