// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class ParseException {
    private final android.net.ParseException real;

    public ParseException(android.net.ParseException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ParseException wrap(android.net.ParseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ParseException(real);
    }

    public android.net.ParseException unwrap() {
        return real;
    }

    public ParseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ParseException#android.net.ParseException(java.lang.String)");
    }

    public ParseException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ParseException#android.net.ParseException(java.lang.String,java.lang.Throwable)");
    }


}
