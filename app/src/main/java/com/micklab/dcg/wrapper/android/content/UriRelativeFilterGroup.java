// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriRelativeFilterGroup {
    private final android.content.UriRelativeFilterGroup real;

    public UriRelativeFilterGroup(android.content.UriRelativeFilterGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup wrap(android.content.UriRelativeFilterGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup(real);
    }

    public android.content.UriRelativeFilterGroup unwrap() {
        return real;
    }

    public UriRelativeFilterGroup(int arg0) {
        this(new android.content.UriRelativeFilterGroup(arg0));
    }

    public void addUriRelativeFilter(com.micklab.dcg.wrapper.android.content.UriRelativeFilter arg0) {
        real.addUriRelativeFilter(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAction() {
        return real.getAction();
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

    public static final int ACTION_ALLOW = android.content.UriRelativeFilterGroup.ACTION_ALLOW;
    public static final int ACTION_BLOCK = android.content.UriRelativeFilterGroup.ACTION_BLOCK;

}
