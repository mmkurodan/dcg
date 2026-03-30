// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfoRequest {
    private final android.drm.DrmInfoRequest real;

    public DrmInfoRequest(android.drm.DrmInfoRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfoRequest wrap(android.drm.DrmInfoRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfoRequest(real);
    }

    public android.drm.DrmInfoRequest unwrap() {
        return real;
    }

    public DrmInfoRequest(int arg0, java.lang.String arg1) {
        this(new android.drm.DrmInfoRequest(arg0, arg1));
    }

    public java.lang.Object get(java.lang.String arg0) {
        return real.get(arg0);
    }

    public int getInfoType() {
        return real.getInfoType();
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public void put(java.lang.String arg0, java.lang.Object arg1) {
        real.put(arg0, arg1);
    }

    public static final java.lang.String ACCOUNT_ID = android.drm.DrmInfoRequest.ACCOUNT_ID;
    public static final java.lang.String SUBSCRIPTION_ID = android.drm.DrmInfoRequest.SUBSCRIPTION_ID;
    public static final int TYPE_REGISTRATION_INFO = android.drm.DrmInfoRequest.TYPE_REGISTRATION_INFO;
    public static final int TYPE_RIGHTS_ACQUISITION_INFO = android.drm.DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_INFO;
    public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = android.drm.DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO;
    public static final int TYPE_UNREGISTRATION_INFO = android.drm.DrmInfoRequest.TYPE_UNREGISTRATION_INFO;

}
