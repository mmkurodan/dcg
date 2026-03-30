// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriMatcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UriMatcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriMatcher wrap(android.content.UriMatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriMatcher(real, (__DcgwBridgeToken) null);
    }

    public android.content.UriMatcher getReal() {
        return (android.content.UriMatcher) real;
    }

    public android.content.UriMatcher unwrap() {
        return getReal();
    }

    public UriMatcher(int arg0) {
        this(new android.content.UriMatcher(arg0), (__DcgwBridgeToken) null);
    }

    public void addURI(java.lang.String arg0, java.lang.String arg1, int arg2) {
        ((android.content.UriMatcher) real).addURI(arg0, arg1, arg2);
    }

    public int match(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.UriMatcher) real).match(arg0 == null ? null : arg0.getReal());
    }

    public static final int NO_MATCH = android.content.UriMatcher.NO_MATCH;

}
