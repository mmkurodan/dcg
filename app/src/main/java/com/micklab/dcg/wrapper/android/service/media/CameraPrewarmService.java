// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.media;

public final class CameraPrewarmService {
    private final android.service.media.CameraPrewarmService real;

    public CameraPrewarmService(android.service.media.CameraPrewarmService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.media.CameraPrewarmService wrap(android.service.media.CameraPrewarmService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.CameraPrewarmService(real);
    }

    public android.service.media.CameraPrewarmService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCooldown(boolean arg0) {
        real.onCooldown(arg0);
    }

    public void onPrewarm() {
        real.onPrewarm();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

}
