// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class SdkSandboxManager {
    private final android.app.sdksandbox.SdkSandboxManager real;

    public SdkSandboxManager(android.app.sdksandbox.SdkSandboxManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager wrap(android.app.sdksandbox.SdkSandboxManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager(real);
    }

    public android.app.sdksandbox.SdkSandboxManager unwrap() {
        return real;
    }

    public void addSdkSandboxProcessDeathCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback arg1) {
        real.addSdkSandboxProcessDeathCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static int getSdkSandboxState() {
        return android.app.sdksandbox.SdkSandboxManager.getSdkSandboxState();
    }

    public void registerAppOwnedSdkSandboxInterface(com.micklab.dcg.wrapper.android.app.sdksandbox.AppOwnedSdkSandboxInterface arg0) {
        real.registerAppOwnedSdkSandboxInterface(arg0 == null ? null : arg0.unwrap());
    }

    public void removeSdkSandboxProcessDeathCallback(com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback arg0) {
        real.removeSdkSandboxProcessDeathCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void startSdkSandboxActivity(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1) {
        real.startSdkSandboxActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unloadSdk(java.lang.String arg0) {
        real.unloadSdk(arg0);
    }

    public void unregisterAppOwnedSdkSandboxInterface(java.lang.String arg0) {
        real.unregisterAppOwnedSdkSandboxInterface(arg0);
    }

    public static final java.lang.String EXTRA_DISPLAY_ID = android.app.sdksandbox.SdkSandboxManager.EXTRA_DISPLAY_ID;
    public static final java.lang.String EXTRA_HEIGHT_IN_PIXELS = android.app.sdksandbox.SdkSandboxManager.EXTRA_HEIGHT_IN_PIXELS;
    public static final java.lang.String EXTRA_HOST_TOKEN = android.app.sdksandbox.SdkSandboxManager.EXTRA_HOST_TOKEN;
    public static final java.lang.String EXTRA_SURFACE_PACKAGE = android.app.sdksandbox.SdkSandboxManager.EXTRA_SURFACE_PACKAGE;
    public static final java.lang.String EXTRA_WIDTH_IN_PIXELS = android.app.sdksandbox.SdkSandboxManager.EXTRA_WIDTH_IN_PIXELS;
    public static final int LOAD_SDK_ALREADY_LOADED = android.app.sdksandbox.SdkSandboxManager.LOAD_SDK_ALREADY_LOADED;
    public static final int LOAD_SDK_INTERNAL_ERROR = android.app.sdksandbox.SdkSandboxManager.LOAD_SDK_INTERNAL_ERROR;
    public static final int LOAD_SDK_NOT_FOUND = android.app.sdksandbox.SdkSandboxManager.LOAD_SDK_NOT_FOUND;
    public static final int LOAD_SDK_SDK_DEFINED_ERROR = android.app.sdksandbox.SdkSandboxManager.LOAD_SDK_SDK_DEFINED_ERROR;
    public static final int LOAD_SDK_SDK_SANDBOX_DISABLED = android.app.sdksandbox.SdkSandboxManager.LOAD_SDK_SDK_SANDBOX_DISABLED;
    public static final int REQUEST_SURFACE_PACKAGE_INTERNAL_ERROR = android.app.sdksandbox.SdkSandboxManager.REQUEST_SURFACE_PACKAGE_INTERNAL_ERROR;
    public static final int REQUEST_SURFACE_PACKAGE_SDK_NOT_LOADED = android.app.sdksandbox.SdkSandboxManager.REQUEST_SURFACE_PACKAGE_SDK_NOT_LOADED;
    public static final int SDK_SANDBOX_PROCESS_NOT_AVAILABLE = android.app.sdksandbox.SdkSandboxManager.SDK_SANDBOX_PROCESS_NOT_AVAILABLE;
    public static final java.lang.String SDK_SANDBOX_SERVICE = android.app.sdksandbox.SdkSandboxManager.SDK_SANDBOX_SERVICE;
    public static final int SDK_SANDBOX_STATE_DISABLED = android.app.sdksandbox.SdkSandboxManager.SDK_SANDBOX_STATE_DISABLED;
    public static final int SDK_SANDBOX_STATE_ENABLED_PROCESS_ISOLATION = android.app.sdksandbox.SdkSandboxManager.SDK_SANDBOX_STATE_ENABLED_PROCESS_ISOLATION;

    public static final class SdkSandboxProcessDeathCallback {
        private final android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback real;

        public SdkSandboxProcessDeathCallback(android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback wrap(android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback(real);
        }

        public android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback unwrap() {
            return real;
        }

        public void onSdkSandboxDied() {
            real.onSdkSandboxDied();
        }

    }
}
