// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriRelativeFilterGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UriRelativeFilterGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup wrap(android.content.UriRelativeFilterGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup(real, (__DcgwBridgeToken) null);
    }

    public android.content.UriRelativeFilterGroup getReal() {
        return (android.content.UriRelativeFilterGroup) real;
    }

    public android.content.UriRelativeFilterGroup unwrap() {
        return getReal();
    }

    public UriRelativeFilterGroup(int arg0) {
        this(new android.content.UriRelativeFilterGroup(arg0), (__DcgwBridgeToken) null);
    }

    public void addUriRelativeFilter(com.micklab.dcg.wrapper.android.content.UriRelativeFilter arg0) {
        ((android.content.UriRelativeFilterGroup) real).addUriRelativeFilter(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.UriRelativeFilterGroup) real).equals(arg0);
    }

    public int getAction() {
        return ((android.content.UriRelativeFilterGroup) real).getAction();
    }

    public int hashCode() {
        return ((android.content.UriRelativeFilterGroup) real).hashCode();
    }

    public boolean matchData(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.UriRelativeFilterGroup) real).matchData(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.content.UriRelativeFilterGroup) real).toString();
    }

    public static final int ACTION_ALLOW = android.content.UriRelativeFilterGroup.ACTION_ALLOW;
    public static final int ACTION_BLOCK = android.content.UriRelativeFilterGroup.ACTION_BLOCK;

}
