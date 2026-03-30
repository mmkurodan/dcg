// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmErrorEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmErrorEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmErrorEvent wrap(android.drm.DrmErrorEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmErrorEvent(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmErrorEvent getReal() {
        return (android.drm.DrmErrorEvent) real;
    }

    public android.drm.DrmErrorEvent unwrap() {
        return getReal();
    }

    public DrmErrorEvent(int arg0, int arg1, java.lang.String arg2) {
        this(new android.drm.DrmErrorEvent(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public DrmErrorEvent(int arg0, int arg1, java.lang.String arg2, java.util.HashMap arg3) {
        this(new android.drm.DrmErrorEvent(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public static final int TYPE_ACQUIRE_DRM_INFO_FAILED = android.drm.DrmErrorEvent.TYPE_ACQUIRE_DRM_INFO_FAILED;
    public static final int TYPE_NOT_SUPPORTED = android.drm.DrmErrorEvent.TYPE_NOT_SUPPORTED;
    public static final int TYPE_NO_INTERNET_CONNECTION = android.drm.DrmErrorEvent.TYPE_NO_INTERNET_CONNECTION;
    public static final int TYPE_OUT_OF_MEMORY = android.drm.DrmErrorEvent.TYPE_OUT_OF_MEMORY;
    public static final int TYPE_PROCESS_DRM_INFO_FAILED = android.drm.DrmErrorEvent.TYPE_PROCESS_DRM_INFO_FAILED;
    public static final int TYPE_REMOVE_ALL_RIGHTS_FAILED = android.drm.DrmErrorEvent.TYPE_REMOVE_ALL_RIGHTS_FAILED;
    public static final int TYPE_RIGHTS_NOT_INSTALLED = android.drm.DrmErrorEvent.TYPE_RIGHTS_NOT_INSTALLED;
    public static final int TYPE_RIGHTS_RENEWAL_NOT_ALLOWED = android.drm.DrmErrorEvent.TYPE_RIGHTS_RENEWAL_NOT_ALLOWED;

}
