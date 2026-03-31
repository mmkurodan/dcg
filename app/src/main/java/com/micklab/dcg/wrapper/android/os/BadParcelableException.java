// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class BadParcelableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BadParcelableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.BadParcelableException wrap(android.os.BadParcelableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.BadParcelableException(real, (__DcgwBridgeToken) null);
    }

    public android.os.BadParcelableException getReal() {
        return (android.os.BadParcelableException) real;
    }

    public android.os.BadParcelableException unwrap() {
        return getReal();
    }

    public BadParcelableException(java.lang.Exception arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BadParcelableException#android.os.BadParcelableException(java.lang.Exception)");
    }

    public BadParcelableException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BadParcelableException#android.os.BadParcelableException(java.lang.String)");
    }

}
