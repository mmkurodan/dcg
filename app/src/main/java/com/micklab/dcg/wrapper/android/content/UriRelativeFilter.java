// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriRelativeFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UriRelativeFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriRelativeFilter wrap(android.content.UriRelativeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriRelativeFilter(real, (__DcgwBridgeToken) null);
    }

    public android.content.UriRelativeFilter getReal() {
        return (android.content.UriRelativeFilter) real;
    }

    public android.content.UriRelativeFilter unwrap() {
        return getReal();
    }

    public UriRelativeFilter(int arg0, int arg1, java.lang.String arg2) {
        this(new android.content.UriRelativeFilter(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.UriRelativeFilter) real).equals(arg0);
    }

    public java.lang.String getFilter() {
        return ((android.content.UriRelativeFilter) real).getFilter();
    }

    public int getPatternType() {
        return ((android.content.UriRelativeFilter) real).getPatternType();
    }

    public int getUriPart() {
        return ((android.content.UriRelativeFilter) real).getUriPart();
    }

    public int hashCode() {
        return ((android.content.UriRelativeFilter) real).hashCode();
    }

    public boolean matchData(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.UriRelativeFilter) real).matchData(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.content.UriRelativeFilter) real).toString();
    }

    public static final int FRAGMENT = android.content.UriRelativeFilter.FRAGMENT;
    public static final int PATH = android.content.UriRelativeFilter.PATH;
    public static final int QUERY = android.content.UriRelativeFilter.QUERY;

}
