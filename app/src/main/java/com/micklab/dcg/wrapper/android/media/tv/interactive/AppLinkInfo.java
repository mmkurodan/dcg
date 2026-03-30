// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class AppLinkInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppLinkInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo wrap(android.media.tv.interactive.AppLinkInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.interactive.AppLinkInfo getReal() {
        return (android.media.tv.interactive.AppLinkInfo) real;
    }

    public android.media.tv.interactive.AppLinkInfo unwrap() {
        return getReal();
    }

    public AppLinkInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.media.tv.interactive.AppLinkInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.interactive.AppLinkInfo) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.media.tv.interactive.AppLinkInfo) real).getComponentName());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.interactive.AppLinkInfo) real).getUri());
    }

    public java.lang.String toString() {
        return ((android.media.tv.interactive.AppLinkInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.interactive.AppLinkInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
