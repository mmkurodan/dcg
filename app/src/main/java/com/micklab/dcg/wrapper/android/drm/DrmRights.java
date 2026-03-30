// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmRights {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmRights(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmRights wrap(android.drm.DrmRights real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmRights(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmRights getReal() {
        return (android.drm.DrmRights) real;
    }

    public android.drm.DrmRights unwrap() {
        return getReal();
    }

    public DrmRights(com.micklab.dcg.wrapper.android.drm.ProcessedData arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public DrmRights(java.io.File arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1) {
        this(new android.drm.DrmRights(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.drm.DrmRights(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public DrmRights(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        this(new android.drm.DrmRights(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.String getAccountId() {
        return ((android.drm.DrmRights) real).getAccountId();
    }

    public byte[] getData() {
        return ((android.drm.DrmRights) real).getData();
    }

    public java.lang.String getMimeType() {
        return ((android.drm.DrmRights) real).getMimeType();
    }

    public java.lang.String getSubscriptionId() {
        return ((android.drm.DrmRights) real).getSubscriptionId();
    }

}
