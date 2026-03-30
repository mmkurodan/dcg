// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class CamcorderProfile {
    private final android.media.CamcorderProfile real;

    public CamcorderProfile(android.media.CamcorderProfile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.CamcorderProfile wrap(android.media.CamcorderProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.CamcorderProfile(real);
    }

    public android.media.CamcorderProfile unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.CamcorderProfile get(int arg0) {
        return com.micklab.dcg.wrapper.android.media.CamcorderProfile.wrap(android.media.CamcorderProfile.get(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.CamcorderProfile get(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.CamcorderProfile.wrap(android.media.CamcorderProfile.get(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.EncoderProfiles getAll(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.EncoderProfiles.wrap(android.media.CamcorderProfile.getAll(arg0, arg1));
    }

    public static boolean hasProfile(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.CamcorderProfile#hasProfile(int)");
    }

    public static boolean hasProfile(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.CamcorderProfile#hasProfile(int,int)");
    }

    public static final int QUALITY_1080P = android.media.CamcorderProfile.QUALITY_1080P;
    public static final int QUALITY_2160P = android.media.CamcorderProfile.QUALITY_2160P;
    public static final int QUALITY_2K = android.media.CamcorderProfile.QUALITY_2K;
    public static final int QUALITY_480P = android.media.CamcorderProfile.QUALITY_480P;
    public static final int QUALITY_4KDCI = android.media.CamcorderProfile.QUALITY_4KDCI;
    public static final int QUALITY_720P = android.media.CamcorderProfile.QUALITY_720P;
    public static final int QUALITY_8KUHD = android.media.CamcorderProfile.QUALITY_8KUHD;
    public static final int QUALITY_CIF = android.media.CamcorderProfile.QUALITY_CIF;
    public static final int QUALITY_HIGH = android.media.CamcorderProfile.QUALITY_HIGH;
    public static final int QUALITY_HIGH_SPEED_1080P = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_1080P;
    public static final int QUALITY_HIGH_SPEED_2160P = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_2160P;
    public static final int QUALITY_HIGH_SPEED_480P = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_480P;
    public static final int QUALITY_HIGH_SPEED_4KDCI = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_4KDCI;
    public static final int QUALITY_HIGH_SPEED_720P = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_720P;
    public static final int QUALITY_HIGH_SPEED_CIF = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_CIF;
    public static final int QUALITY_HIGH_SPEED_HIGH = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_HIGH;
    public static final int QUALITY_HIGH_SPEED_LOW = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_LOW;
    public static final int QUALITY_HIGH_SPEED_VGA = android.media.CamcorderProfile.QUALITY_HIGH_SPEED_VGA;
    public static final int QUALITY_LOW = android.media.CamcorderProfile.QUALITY_LOW;
    public static final int QUALITY_QCIF = android.media.CamcorderProfile.QUALITY_QCIF;
    public static final int QUALITY_QHD = android.media.CamcorderProfile.QUALITY_QHD;
    public static final int QUALITY_QVGA = android.media.CamcorderProfile.QUALITY_QVGA;
    public static final int QUALITY_TIME_LAPSE_1080P = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_1080P;
    public static final int QUALITY_TIME_LAPSE_2160P = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_2160P;
    public static final int QUALITY_TIME_LAPSE_2K = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_2K;
    public static final int QUALITY_TIME_LAPSE_480P = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_480P;
    public static final int QUALITY_TIME_LAPSE_4KDCI = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_4KDCI;
    public static final int QUALITY_TIME_LAPSE_720P = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_720P;
    public static final int QUALITY_TIME_LAPSE_8KUHD = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_8KUHD;
    public static final int QUALITY_TIME_LAPSE_CIF = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_CIF;
    public static final int QUALITY_TIME_LAPSE_HIGH = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_HIGH;
    public static final int QUALITY_TIME_LAPSE_LOW = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_LOW;
    public static final int QUALITY_TIME_LAPSE_QCIF = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_QCIF;
    public static final int QUALITY_TIME_LAPSE_QHD = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_QHD;
    public static final int QUALITY_TIME_LAPSE_QVGA = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_QVGA;
    public static final int QUALITY_TIME_LAPSE_VGA = android.media.CamcorderProfile.QUALITY_TIME_LAPSE_VGA;
    public static final int QUALITY_VGA = android.media.CamcorderProfile.QUALITY_VGA;

}
