// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider;

public final class SdkSandboxController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SdkSandboxController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxController wrap(android.app.sdksandbox.sdkprovider.SdkSandboxController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxController(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxController getReal() {
        return (android.app.sdksandbox.sdkprovider.SdkSandboxController) real;
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxController unwrap() {
        return getReal();
    }

    public java.lang.String getClientPackageName() {
        return ((android.app.sdksandbox.sdkprovider.SdkSandboxController) real).getClientPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getClientSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.app.sdksandbox.sdkprovider.SdkSandboxController) real).getClientSharedPreferences());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder registerSdkSandboxActivityHandler(com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.sdksandbox.sdkprovider.SdkSandboxController) real).registerSdkSandboxActivityHandler(arg0 == null ? null : arg0.getReal()));
    }

    public void unregisterSdkSandboxActivityHandler(com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler arg0) {
        ((android.app.sdksandbox.sdkprovider.SdkSandboxController) real).unregisterSdkSandboxActivityHandler(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SDK_SANDBOX_CONTROLLER_SERVICE = android.app.sdksandbox.sdkprovider.SdkSandboxController.SDK_SANDBOX_CONTROLLER_SERVICE;

}
