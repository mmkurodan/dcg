// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class BadParcelableException {
    private final android.os.BadParcelableException real;

    public BadParcelableException(android.os.BadParcelableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.BadParcelableException wrap(android.os.BadParcelableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.BadParcelableException(real);
    }

    public android.os.BadParcelableException unwrap() {
        return real;
    }

    public BadParcelableException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BadParcelableException#android.os.BadParcelableException(java.lang.String)");
    }

    public BadParcelableException(java.lang.Exception arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BadParcelableException#android.os.BadParcelableException(java.lang.Exception)");
    }

}
