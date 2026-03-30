// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteInput {
    private final android.adservices.ondevicepersonalization.ExecuteInput real;

    public ExecuteInput(android.adservices.ondevicepersonalization.ExecuteInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInput wrap(android.adservices.ondevicepersonalization.ExecuteInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInput(real);
    }

    public android.adservices.ondevicepersonalization.ExecuteInput unwrap() {
        return real;
    }

    public java.lang.String getAppPackageName() {
        return real.getAppPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getAppParams() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getAppParams());
    }

}
