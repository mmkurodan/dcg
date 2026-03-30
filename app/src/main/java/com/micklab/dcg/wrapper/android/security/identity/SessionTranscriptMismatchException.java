// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class SessionTranscriptMismatchException {
    private final android.security.identity.SessionTranscriptMismatchException real;

    public SessionTranscriptMismatchException(android.security.identity.SessionTranscriptMismatchException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.SessionTranscriptMismatchException wrap(android.security.identity.SessionTranscriptMismatchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.SessionTranscriptMismatchException(real);
    }

    public android.security.identity.SessionTranscriptMismatchException unwrap() {
        return real;
    }

    public SessionTranscriptMismatchException(java.lang.String arg0) {
        this(new android.security.identity.SessionTranscriptMismatchException(arg0));
    }

    public SessionTranscriptMismatchException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.SessionTranscriptMismatchException(arg0, arg1));
    }

}
