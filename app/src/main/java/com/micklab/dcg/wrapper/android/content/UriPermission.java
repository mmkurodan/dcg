// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class UriPermission {
    private final android.content.UriPermission real;

    public UriPermission(android.content.UriPermission real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.UriPermission wrap(android.content.UriPermission real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.UriPermission(real);
    }

    public android.content.UriPermission unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getPersistedTime() {
        return real.getPersistedTime();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public boolean isReadPermission() {
        return real.isReadPermission();
    }

    public boolean isWritePermission() {
        return real.isWritePermission();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long INVALID_TIME = android.content.UriPermission.INVALID_TIME;

}
