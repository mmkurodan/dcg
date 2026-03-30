// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class InlineExecutionProhibitedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineExecutionProhibitedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.InlineExecutionProhibitedException wrap(android.net.http.InlineExecutionProhibitedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.InlineExecutionProhibitedException(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.InlineExecutionProhibitedException getReal() {
        return (android.net.http.InlineExecutionProhibitedException) real;
    }

    public android.net.http.InlineExecutionProhibitedException unwrap() {
        return getReal();
    }

    public InlineExecutionProhibitedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.InlineExecutionProhibitedException#android.net.http.InlineExecutionProhibitedException()");
    }

}
