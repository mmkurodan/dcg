// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class BackendBusyException {
    private final android.security.keystore.BackendBusyException real;

    public BackendBusyException(android.security.keystore.BackendBusyException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.BackendBusyException wrap(android.security.keystore.BackendBusyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.BackendBusyException(real);
    }

    public android.security.keystore.BackendBusyException unwrap() {
        return real;
    }

    public BackendBusyException(long arg0) {
        this(new android.security.keystore.BackendBusyException(arg0));
    }

    public BackendBusyException(long arg0, java.lang.String arg1) {
        this(new android.security.keystore.BackendBusyException(arg0, arg1));
    }

    public BackendBusyException(long arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.security.keystore.BackendBusyException(arg0, arg1, arg2));
    }

    public long getBackOffHintMillis() {
        return real.getBackOffHintMillis();
    }

}
