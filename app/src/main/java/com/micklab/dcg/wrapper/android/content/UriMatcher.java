// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriMatcher {
    private final android.content.UriMatcher real;

    public UriMatcher(android.content.UriMatcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriMatcher wrap(android.content.UriMatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriMatcher(real);
    }

    public android.content.UriMatcher unwrap() {
        return real;
    }

    public UriMatcher(int arg0) {
        this(new android.content.UriMatcher(arg0));
    }

    public void addURI(java.lang.String arg0, java.lang.String arg1, int arg2) {
        real.addURI(arg0, arg1, arg2);
    }

    public int match(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.match(arg0 == null ? null : arg0.unwrap());
    }

    public static final int NO_MATCH = android.content.UriMatcher.NO_MATCH;

}
