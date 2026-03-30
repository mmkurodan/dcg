// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjectionConfig {
    private final android.media.projection.MediaProjectionConfig real;

    public MediaProjectionConfig(android.media.projection.MediaProjectionConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig wrap(android.media.projection.MediaProjectionConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig(real);
    }

    public android.media.projection.MediaProjectionConfig unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig createConfigForDefaultDisplay() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig.wrap(android.media.projection.MediaProjectionConfig.createConfigForDefaultDisplay());
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig createConfigForUserChoice() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig.wrap(android.media.projection.MediaProjectionConfig.createConfigForUserChoice());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
