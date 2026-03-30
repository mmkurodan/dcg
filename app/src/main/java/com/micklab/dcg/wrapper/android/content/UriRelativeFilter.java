// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriRelativeFilter {
    private final android.content.UriRelativeFilter real;

    public UriRelativeFilter(android.content.UriRelativeFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriRelativeFilter wrap(android.content.UriRelativeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriRelativeFilter(real);
    }

    public android.content.UriRelativeFilter unwrap() {
        return real;
    }

    public UriRelativeFilter(int arg0, int arg1, java.lang.String arg2) {
        this(new android.content.UriRelativeFilter(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getFilter() {
        return real.getFilter();
    }

    public int getPatternType() {
        return real.getPatternType();
    }

    public int getUriPart() {
        return real.getUriPart();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean matchData(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.matchData(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int FRAGMENT = android.content.UriRelativeFilter.FRAGMENT;
    public static final int PATH = android.content.UriRelativeFilter.PATH;
    public static final int QUERY = android.content.UriRelativeFilter.QUERY;

}
