// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class InlineExecutionProhibitedException {
    private final android.net.http.InlineExecutionProhibitedException real;

    public InlineExecutionProhibitedException(android.net.http.InlineExecutionProhibitedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.InlineExecutionProhibitedException wrap(android.net.http.InlineExecutionProhibitedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.InlineExecutionProhibitedException(real);
    }

    public android.net.http.InlineExecutionProhibitedException unwrap() {
        return real;
    }

    public InlineExecutionProhibitedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.InlineExecutionProhibitedException#android.net.http.InlineExecutionProhibitedException()");
    }

}
