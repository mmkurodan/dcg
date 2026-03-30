// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmConvertedStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmConvertedStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus wrap(android.drm.DrmConvertedStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmConvertedStatus getReal() {
        return (android.drm.DrmConvertedStatus) real;
    }

    public android.drm.DrmConvertedStatus unwrap() {
        return getReal();
    }

    public DrmConvertedStatus(int arg0, byte[] arg1, int arg2) {
        this(new android.drm.DrmConvertedStatus(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public static final int STATUS_ERROR = android.drm.DrmConvertedStatus.STATUS_ERROR;
    public static final int STATUS_INPUTDATA_ERROR = android.drm.DrmConvertedStatus.STATUS_INPUTDATA_ERROR;
    public static final int STATUS_OK = android.drm.DrmConvertedStatus.STATUS_OK;

}
