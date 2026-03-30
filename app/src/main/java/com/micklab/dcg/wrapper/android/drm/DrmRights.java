// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmRights {
    private final android.drm.DrmRights real;

    public DrmRights(android.drm.DrmRights real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmRights wrap(android.drm.DrmRights real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmRights(real);
    }

    public android.drm.DrmRights unwrap() {
        return real;
    }

    public DrmRights(com.micklab.dcg.wrapper.android.drm.ProcessedData arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public DrmRights(java.io.File arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0, arg1));
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0, arg1));
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.drm.DrmRights(arg0, arg1, arg2));
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        this(new android.drm.DrmRights(arg0, arg1, arg2, arg3));
    }

    public java.lang.String getAccountId() {
        return real.getAccountId();
    }

    public byte[] getData() {
        return real.getData();
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public java.lang.String getSubscriptionId() {
        return real.getSubscriptionId();
    }

}
