// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider;

public final class SdkSandboxActivityHandler {
    private final android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler real;

    public SdkSandboxActivityHandler(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler wrap(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler(real);
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler unwrap() {
        return real;
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.onActivityCreated(arg0 == null ? null : arg0.unwrap());
    }

}
