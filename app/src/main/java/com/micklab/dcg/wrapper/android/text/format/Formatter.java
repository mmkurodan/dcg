// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.format;

public final class Formatter {
    private final android.text.format.Formatter real;

    public Formatter(android.text.format.Formatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.format.Formatter wrap(android.text.format.Formatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.format.Formatter(real);
    }

    public android.text.format.Formatter unwrap() {
        return real;
    }

    public Formatter() {
        this(new android.text.format.Formatter());
    }

    public static java.lang.String formatFileSize(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.text.format.Formatter#formatFileSize(android.content.Context,long)");
    }

    public static java.lang.String formatIpAddress(int arg0) {
        return android.text.format.Formatter.formatIpAddress(arg0);
    }

    public static java.lang.String formatShortFileSize(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.text.format.Formatter#formatShortFileSize(android.content.Context,long)");
    }

}
