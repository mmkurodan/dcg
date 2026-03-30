// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfoRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmInfoRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfoRequest wrap(android.drm.DrmInfoRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfoRequest(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmInfoRequest getReal() {
        return (android.drm.DrmInfoRequest) real;
    }

    public android.drm.DrmInfoRequest unwrap() {
        return getReal();
    }

    public DrmInfoRequest(int arg0, java.lang.String arg1) {
        this(new android.drm.DrmInfoRequest(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public java.lang.Object get(java.lang.String arg0) {
        return ((android.drm.DrmInfoRequest) real).get(arg0);
    }

    public int getInfoType() {
        return ((android.drm.DrmInfoRequest) real).getInfoType();
    }

    public java.lang.String getMimeType() {
        return ((android.drm.DrmInfoRequest) real).getMimeType();
    }

    public void put(java.lang.String arg0, java.lang.Object arg1) {
        ((android.drm.DrmInfoRequest) real).put(arg0, arg1);
    }

    public static final java.lang.String ACCOUNT_ID = android.drm.DrmInfoRequest.ACCOUNT_ID;
    public static final java.lang.String SUBSCRIPTION_ID = android.drm.DrmInfoRequest.SUBSCRIPTION_ID;
    public static final int TYPE_REGISTRATION_INFO = android.drm.DrmInfoRequest.TYPE_REGISTRATION_INFO;
    public static final int TYPE_RIGHTS_ACQUISITION_INFO = android.drm.DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_INFO;
    public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = android.drm.DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO;
    public static final int TYPE_UNREGISTRATION_INFO = android.drm.DrmInfoRequest.TYPE_UNREGISTRATION_INFO;

}
