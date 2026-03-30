// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.media;

public final class CameraPrewarmService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraPrewarmService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.media.CameraPrewarmService wrap(android.service.media.CameraPrewarmService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.CameraPrewarmService(real, (__DcgwBridgeToken) null);
    }

    public android.service.media.CameraPrewarmService getReal() {
        return (android.service.media.CameraPrewarmService) real;
    }

    public android.service.media.CameraPrewarmService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.media.CameraPrewarmService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCooldown(boolean arg0) {
        ((android.service.media.CameraPrewarmService) real).onCooldown(arg0);
    }

    public void onPrewarm() {
        ((android.service.media.CameraPrewarmService) real).onPrewarm();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.service.media.CameraPrewarmService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

}
