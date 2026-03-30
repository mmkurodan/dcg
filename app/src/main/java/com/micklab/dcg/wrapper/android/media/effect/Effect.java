// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class Effect {
    private final android.media.effect.Effect real;

    public Effect(android.media.effect.Effect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.Effect wrap(android.media.effect.Effect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.Effect(real);
    }

    public android.media.effect.Effect unwrap() {
        return real;
    }

    public void apply(int arg0, int arg1, int arg2, int arg3) {
        real.apply(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public void release() {
        real.release();
    }

    public void setParameter(java.lang.String arg0, java.lang.Object arg1) {
        real.setParameter(arg0, arg1);
    }

    public void setUpdateListener(com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener arg0) {
        real.setUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

}
