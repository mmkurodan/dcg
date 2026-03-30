// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmEvent wrap(android.drm.DrmEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmEvent(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmEvent getReal() {
        return (android.drm.DrmEvent) real;
    }

    public android.drm.DrmEvent unwrap() {
        return getReal();
    }

    public java.lang.Object getAttribute(java.lang.String arg0) {
        return ((android.drm.DrmEvent) real).getAttribute(arg0);
    }

    public java.lang.String getMessage() {
        return ((android.drm.DrmEvent) real).getMessage();
    }

    public int getType() {
        return ((android.drm.DrmEvent) real).getType();
    }

    public int getUniqueId() {
        return ((android.drm.DrmEvent) real).getUniqueId();
    }

    public static final java.lang.String DRM_INFO_OBJECT = android.drm.DrmEvent.DRM_INFO_OBJECT;
    public static final java.lang.String DRM_INFO_STATUS_OBJECT = android.drm.DrmEvent.DRM_INFO_STATUS_OBJECT;
    public static final int TYPE_ALL_RIGHTS_REMOVED = android.drm.DrmEvent.TYPE_ALL_RIGHTS_REMOVED;
    public static final int TYPE_DRM_INFO_PROCESSED = android.drm.DrmEvent.TYPE_DRM_INFO_PROCESSED;

}
