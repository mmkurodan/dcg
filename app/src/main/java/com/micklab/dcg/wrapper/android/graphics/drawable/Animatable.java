// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Animatable {
    private final android.graphics.drawable.Animatable real;

    public Animatable(android.graphics.drawable.Animatable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable wrap(android.graphics.drawable.Animatable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable(real);
    }

    public android.graphics.drawable.Animatable unwrap() {
        return real;
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

}
