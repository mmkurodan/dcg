// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.exceptions;

public final class AdServicesException {
    private final android.adservices.exceptions.AdServicesException real;

    public AdServicesException(android.adservices.exceptions.AdServicesException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.exceptions.AdServicesException wrap(android.adservices.exceptions.AdServicesException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.exceptions.AdServicesException(real);
    }

    public android.adservices.exceptions.AdServicesException unwrap() {
        return real;
    }

    public AdServicesException(java.lang.String arg0) {
        this(new android.adservices.exceptions.AdServicesException(arg0));
    }

    public AdServicesException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.adservices.exceptions.AdServicesException(arg0, arg1));
    }

}
