// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider;

public final class SdkSandboxActivityHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SdkSandboxActivityHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler wrap(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler getReal() {
        return (android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler) real;
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler unwrap() {
        return getReal();
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler) real).onActivityCreated(arg0 == null ? null : arg0.getReal());
    }

}
