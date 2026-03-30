// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class EffectContext {
    private final android.media.effect.EffectContext real;

    public EffectContext(android.media.effect.EffectContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectContext wrap(android.media.effect.EffectContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.EffectContext(real);
    }

    public android.media.effect.EffectContext unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectContext createWithCurrentGlContext() {
        return com.micklab.dcg.wrapper.android.media.effect.EffectContext.wrap(android.media.effect.EffectContext.createWithCurrentGlContext());
    }

    public com.micklab.dcg.wrapper.android.media.effect.EffectFactory getFactory() {
        return com.micklab.dcg.wrapper.android.media.effect.EffectFactory.wrap(real.getFactory());
    }

    public void release() {
        real.release();
    }

}
