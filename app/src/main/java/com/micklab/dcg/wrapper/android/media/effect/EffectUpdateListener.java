// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class EffectUpdateListener {
    private final android.media.effect.EffectUpdateListener real;

    public EffectUpdateListener(android.media.effect.EffectUpdateListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener wrap(android.media.effect.EffectUpdateListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener(real);
    }

    public android.media.effect.EffectUpdateListener unwrap() {
        return real;
    }

    public void onEffectUpdated(com.micklab.dcg.wrapper.android.media.effect.Effect arg0, java.lang.Object arg1) {
        real.onEffectUpdated(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
