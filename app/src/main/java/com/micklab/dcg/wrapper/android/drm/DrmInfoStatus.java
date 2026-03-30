// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfoStatus {
    private final android.drm.DrmInfoStatus real;

    public DrmInfoStatus(android.drm.DrmInfoStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfoStatus wrap(android.drm.DrmInfoStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfoStatus(real);
    }

    public android.drm.DrmInfoStatus unwrap() {
        return real;
    }

    public DrmInfoStatus(int arg0, int arg1, com.micklab.dcg.wrapper.android.drm.ProcessedData arg2, java.lang.String arg3) {
        this(new android.drm.DrmInfoStatus(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public static final int STATUS_ERROR = android.drm.DrmInfoStatus.STATUS_ERROR;
    public static final int STATUS_OK = android.drm.DrmInfoStatus.STATUS_OK;

}
