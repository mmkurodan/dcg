// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjectionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaProjectionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionManager wrap(android.media.projection.MediaProjectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjectionManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.projection.MediaProjectionManager getReal() {
        return (android.media.projection.MediaProjectionManager) real;
    }

    public android.media.projection.MediaProjectionManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createScreenCaptureIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.media.projection.MediaProjectionManager) real).createScreenCaptureIntent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createScreenCaptureIntent(com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.media.projection.MediaProjectionManager) real).createScreenCaptureIntent(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.projection.MediaProjection getMediaProjection(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjection.wrap(((android.media.projection.MediaProjectionManager) real).getMediaProjection(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
