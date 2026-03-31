// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appfunctions;

public final class AppFunctionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppFunctionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionService wrap(android.app.appfunctions.AppFunctionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionService(real, (__DcgwBridgeToken) null);
    }

    public android.app.appfunctions.AppFunctionService getReal() {
        return (android.app.appfunctions.AppFunctionService) real;
    }

    public android.app.appfunctions.AppFunctionService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.appfunctions.AppFunctionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.app.appfunctions.AppFunctionService.SERVICE_INTERFACE;

}
