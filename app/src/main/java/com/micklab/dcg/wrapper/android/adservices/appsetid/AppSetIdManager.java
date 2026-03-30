// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.appsetid;

public final class AppSetIdManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSetIdManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager wrap(android.adservices.appsetid.AppSetIdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.appsetid.AppSetIdManager getReal() {
        return (android.adservices.appsetid.AppSetIdManager) real;
    }

    public android.adservices.appsetid.AppSetIdManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager.wrap(android.adservices.appsetid.AppSetIdManager.get(arg0 == null ? null : arg0.getReal()));
    }

}
