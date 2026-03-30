// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class CameraProfile {
    private final android.media.CameraProfile real;

    public CameraProfile(android.media.CameraProfile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.CameraProfile wrap(android.media.CameraProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.CameraProfile(real);
    }

    public android.media.CameraProfile unwrap() {
        return real;
    }

    public CameraProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.CameraProfile#android.media.CameraProfile()");
    }

    public static int getJpegEncodingQualityParameter(int arg0) {
        return android.media.CameraProfile.getJpegEncodingQualityParameter(arg0);
    }

    public static int getJpegEncodingQualityParameter(int arg0, int arg1) {
        return android.media.CameraProfile.getJpegEncodingQualityParameter(arg0, arg1);
    }

    public static final int QUALITY_HIGH = android.media.CameraProfile.QUALITY_HIGH;
    public static final int QUALITY_LOW = android.media.CameraProfile.QUALITY_LOW;
    public static final int QUALITY_MEDIUM = android.media.CameraProfile.QUALITY_MEDIUM;

}
