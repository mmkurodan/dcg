// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjectionManager {
    private final android.media.projection.MediaProjectionManager real;

    public MediaProjectionManager(android.media.projection.MediaProjectionManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjectionManager wrap(android.media.projection.MediaProjectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjectionManager(real);
    }

    public android.media.projection.MediaProjectionManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.Intent createScreenCaptureIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createScreenCaptureIntent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createScreenCaptureIntent(com.micklab.dcg.wrapper.android.media.projection.MediaProjectionConfig arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createScreenCaptureIntent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.projection.MediaProjection getMediaProjection(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjection.wrap(real.getMediaProjection(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
