// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class LimitExceededException {
    private final android.os.LimitExceededException real;

    public LimitExceededException(android.os.LimitExceededException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.LimitExceededException wrap(android.os.LimitExceededException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.LimitExceededException(real);
    }

    public android.os.LimitExceededException unwrap() {
        return real;
    }

    public LimitExceededException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.LimitExceededException#android.os.LimitExceededException()");
    }

    public LimitExceededException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.LimitExceededException#android.os.LimitExceededException(java.lang.String)");
    }

}
