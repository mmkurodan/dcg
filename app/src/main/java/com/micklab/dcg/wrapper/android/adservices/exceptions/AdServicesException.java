// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.exceptions;

public final class AdServicesException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdServicesException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.exceptions.AdServicesException wrap(android.adservices.exceptions.AdServicesException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.exceptions.AdServicesException(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.exceptions.AdServicesException getReal() {
        return (android.adservices.exceptions.AdServicesException) real;
    }

    public android.adservices.exceptions.AdServicesException unwrap() {
        return getReal();
    }

    public AdServicesException(java.lang.String arg0) {
        this(new android.adservices.exceptions.AdServicesException(arg0), (__DcgwBridgeToken) null);
    }

    public AdServicesException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.adservices.exceptions.AdServicesException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
