// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider;

public final class SdkSandboxController {
    private final android.app.sdksandbox.sdkprovider.SdkSandboxController real;

    public SdkSandboxController(android.app.sdksandbox.sdkprovider.SdkSandboxController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxController wrap(android.app.sdksandbox.sdkprovider.SdkSandboxController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxController(real);
    }

    public android.app.sdksandbox.sdkprovider.SdkSandboxController unwrap() {
        return real;
    }

    public java.lang.String getClientPackageName() {
        return real.getClientPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getClientSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(real.getClientSharedPreferences());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder registerSdkSandboxActivityHandler(com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.registerSdkSandboxActivityHandler(arg0 == null ? null : arg0.unwrap()));
    }

    public void unregisterSdkSandboxActivityHandler(com.micklab.dcg.wrapper.android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler arg0) {
        real.unregisterSdkSandboxActivityHandler(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SDK_SANDBOX_CONTROLLER_SERVICE = android.app.sdksandbox.sdkprovider.SdkSandboxController.SDK_SANDBOX_CONTROLLER_SERVICE;

}
