// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class AppLinkInfo {
    private final android.media.tv.interactive.AppLinkInfo real;

    public AppLinkInfo(android.media.tv.interactive.AppLinkInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo wrap(android.media.tv.interactive.AppLinkInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo(real);
    }

    public android.media.tv.interactive.AppLinkInfo unwrap() {
        return real;
    }

    public AppLinkInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.media.tv.interactive.AppLinkInfo(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponentName());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
