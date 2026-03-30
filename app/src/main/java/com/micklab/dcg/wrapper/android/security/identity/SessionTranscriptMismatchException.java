// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class SessionTranscriptMismatchException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SessionTranscriptMismatchException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.SessionTranscriptMismatchException wrap(android.security.identity.SessionTranscriptMismatchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.SessionTranscriptMismatchException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.SessionTranscriptMismatchException getReal() {
        return (android.security.identity.SessionTranscriptMismatchException) real;
    }

    public android.security.identity.SessionTranscriptMismatchException unwrap() {
        return getReal();
    }

    public SessionTranscriptMismatchException(java.lang.String arg0) {
        this(new android.security.identity.SessionTranscriptMismatchException(arg0), (__DcgwBridgeToken) null);
    }

    public SessionTranscriptMismatchException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.SessionTranscriptMismatchException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
