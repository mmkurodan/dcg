// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriPermission {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UriPermission(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriPermission wrap(android.content.UriPermission real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriPermission(real, (__DcgwBridgeToken) null);
    }

    public android.content.UriPermission getReal() {
        return (android.content.UriPermission) real;
    }

    public android.content.UriPermission unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.UriPermission) real).describeContents();
    }

    public long getPersistedTime() {
        return ((android.content.UriPermission) real).getPersistedTime();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.UriPermission) real).getUri());
    }

    public boolean isReadPermission() {
        return ((android.content.UriPermission) real).isReadPermission();
    }

    public boolean isWritePermission() {
        return ((android.content.UriPermission) real).isWritePermission();
    }

    public java.lang.String toString() {
        return ((android.content.UriPermission) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.UriPermission) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long INVALID_TIME = android.content.UriPermission.INVALID_TIME;

}
