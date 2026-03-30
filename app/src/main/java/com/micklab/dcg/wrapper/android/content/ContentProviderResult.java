// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProviderResult {
    private final android.content.ContentProviderResult real;

    public ContentProviderResult(android.content.ContentProviderResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderResult wrap(android.content.ContentProviderResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderResult(real);
    }

    public android.content.ContentProviderResult unwrap() {
        return real;
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.unwrap()));
    }

    public ContentProviderResult(java.lang.Throwable arg0) {
        this(new android.content.ContentProviderResult(arg0));
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.unwrap()));
    }

    public ContentProviderResult(int arg0) {
        this(new android.content.ContentProviderResult(arg0));
    }

    public ContentProviderResult(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        this(new android.content.ContentProviderResult(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
