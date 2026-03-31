// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProviderResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentProviderResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderResult wrap(android.content.ContentProviderResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderResult(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentProviderResult getReal() {
        return (android.content.ContentProviderResult) real;
    }

    public android.content.ContentProviderResult unwrap() {
        return getReal();
    }

    public ContentProviderResult(java.lang.Throwable arg0) {
        this(new android.content.ContentProviderResult(arg0), (__DcgwBridgeToken) null);
    }

    public ContentProviderResult(int arg0) {
        this(new android.content.ContentProviderResult(arg0), (__DcgwBridgeToken) null);
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.content.ContentProviderResult) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.content.ContentProviderResult) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.ContentProviderResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
