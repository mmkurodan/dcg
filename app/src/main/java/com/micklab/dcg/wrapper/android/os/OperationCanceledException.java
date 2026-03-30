// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class OperationCanceledException {
    private final android.os.OperationCanceledException real;

    public OperationCanceledException(android.os.OperationCanceledException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.OperationCanceledException wrap(android.os.OperationCanceledException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.OperationCanceledException(real);
    }

    public android.os.OperationCanceledException unwrap() {
        return real;
    }

    public OperationCanceledException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OperationCanceledException#android.os.OperationCanceledException()");
    }

    public OperationCanceledException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OperationCanceledException#android.os.OperationCanceledException(java.lang.String)");
    }

}
