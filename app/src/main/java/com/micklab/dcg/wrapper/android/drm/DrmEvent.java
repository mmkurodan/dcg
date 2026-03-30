// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmEvent {
    private final android.drm.DrmEvent real;

    public DrmEvent(android.drm.DrmEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmEvent wrap(android.drm.DrmEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmEvent(real);
    }

    public android.drm.DrmEvent unwrap() {
        return real;
    }

    public java.lang.Object getAttribute(java.lang.String arg0) {
        return real.getAttribute(arg0);
    }

    public java.lang.String getMessage() {
        return real.getMessage();
    }

    public int getType() {
        return real.getType();
    }

    public int getUniqueId() {
        return real.getUniqueId();
    }

    public static final java.lang.String DRM_INFO_OBJECT = android.drm.DrmEvent.DRM_INFO_OBJECT;
    public static final java.lang.String DRM_INFO_STATUS_OBJECT = android.drm.DrmEvent.DRM_INFO_STATUS_OBJECT;
    public static final int TYPE_ALL_RIGHTS_REMOVED = android.drm.DrmEvent.TYPE_ALL_RIGHTS_REMOVED;
    public static final int TYPE_DRM_INFO_PROCESSED = android.drm.DrmEvent.TYPE_DRM_INFO_PROCESSED;

}
