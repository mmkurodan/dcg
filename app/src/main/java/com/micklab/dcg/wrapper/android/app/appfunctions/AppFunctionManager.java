// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appfunctions;

public final class AppFunctionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppFunctionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionManager wrap(android.app.appfunctions.AppFunctionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.appfunctions.AppFunctionManager getReal() {
        return (android.app.appfunctions.AppFunctionManager) real;
    }

    public android.app.appfunctions.AppFunctionManager unwrap() {
        return getReal();
    }

    public static final int APP_FUNCTION_STATE_DEFAULT = android.app.appfunctions.AppFunctionManager.APP_FUNCTION_STATE_DEFAULT;
    public static final int APP_FUNCTION_STATE_DISABLED = android.app.appfunctions.AppFunctionManager.APP_FUNCTION_STATE_DISABLED;
    public static final int APP_FUNCTION_STATE_ENABLED = android.app.appfunctions.AppFunctionManager.APP_FUNCTION_STATE_ENABLED;

}
