// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AlreadyPersonalizedException {
    private final android.security.identity.AlreadyPersonalizedException real;

    public AlreadyPersonalizedException(android.security.identity.AlreadyPersonalizedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AlreadyPersonalizedException wrap(android.security.identity.AlreadyPersonalizedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AlreadyPersonalizedException(real);
    }

    public android.security.identity.AlreadyPersonalizedException unwrap() {
        return real;
    }

    public AlreadyPersonalizedException(java.lang.String arg0) {
        this(new android.security.identity.AlreadyPersonalizedException(arg0));
    }

    public AlreadyPersonalizedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.AlreadyPersonalizedException(arg0, arg1));
    }

}
