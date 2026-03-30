// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjectionConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaProjectionConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig wrap(android.media.projection.MediaProjectionConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig(real, (__DcgwBridgeToken) null);
    }

    public android.media.projection.MediaProjectionConfig getReal() {
        return (android.media.projection.MediaProjectionConfig) real;
    }

    public android.media.projection.MediaProjectionConfig unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig createConfigForDefaultDisplay() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig.wrap(android.media.projection.MediaProjectionConfig.createConfigForDefaultDisplay());
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig createConfigForUserChoice() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig.wrap(android.media.projection.MediaProjectionConfig.createConfigForUserChoice());
    }

    public int describeContents() {
        return ((android.media.projection.MediaProjectionConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.projection.MediaProjectionConfig) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.media.projection.MediaProjectionConfig) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.projection.MediaProjectionConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.projection.MediaProjectionConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
