// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Animatable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Animatable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable wrap(android.graphics.drawable.Animatable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.Animatable getReal() {
        return (android.graphics.drawable.Animatable) real;
    }

    public android.graphics.drawable.Animatable unwrap() {
        return getReal();
    }

    public boolean isRunning() {
        return ((android.graphics.drawable.Animatable) real).isRunning();
    }

    public void start() {
        ((android.graphics.drawable.Animatable) real).start();
    }

    public void stop() {
        ((android.graphics.drawable.Animatable) real).stop();
    }

}
