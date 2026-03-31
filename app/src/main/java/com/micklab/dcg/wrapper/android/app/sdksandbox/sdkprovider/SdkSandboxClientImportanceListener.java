// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider;

public final class SdkSandboxClientImportanceListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SdkSandboxClientImportanceListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener wrap(android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener getReal() {
        return (android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener) real;
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener unwrap() {
        return getReal();
    }

    public void onForegroundImportanceChanged(boolean arg0) {
        ((android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener) real).onForegroundImportanceChanged(arg0);
    }

}
