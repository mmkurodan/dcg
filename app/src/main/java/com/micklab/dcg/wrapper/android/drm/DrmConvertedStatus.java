// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmConvertedStatus {
    private final android.drm.DrmConvertedStatus real;

    public DrmConvertedStatus(android.drm.DrmConvertedStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus wrap(android.drm.DrmConvertedStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus(real);
    }

    public android.drm.DrmConvertedStatus unwrap() {
        return real;
    }

    public DrmConvertedStatus(int arg0, byte[] arg1, int arg2) {
        this(new android.drm.DrmConvertedStatus(arg0, arg1, arg2));
    }

    public static final int STATUS_ERROR = android.drm.DrmConvertedStatus.STATUS_ERROR;
    public static final int STATUS_INPUTDATA_ERROR = android.drm.DrmConvertedStatus.STATUS_INPUTDATA_ERROR;
    public static final int STATUS_OK = android.drm.DrmConvertedStatus.STATUS_OK;

}
