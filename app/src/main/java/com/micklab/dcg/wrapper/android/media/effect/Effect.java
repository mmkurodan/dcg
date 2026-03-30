// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class Effect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Effect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.Effect wrap(android.media.effect.Effect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.Effect(real, (__DcgwBridgeToken) null);
    }

    public android.media.effect.Effect getReal() {
        return (android.media.effect.Effect) real;
    }

    public android.media.effect.Effect unwrap() {
        return getReal();
    }

    public void apply(int arg0, int arg1, int arg2, int arg3) {
        ((android.media.effect.Effect) real).apply(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getName() {
        return ((android.media.effect.Effect) real).getName();
    }

    public void release() {
        ((android.media.effect.Effect) real).release();
    }

    public void setParameter(java.lang.String arg0, java.lang.Object arg1) {
        ((android.media.effect.Effect) real).setParameter(arg0, arg1);
    }

    public void setUpdateListener(com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener arg0) {
        ((android.media.effect.Effect) real).setUpdateListener(arg0 == null ? null : arg0.getReal());
    }

}
