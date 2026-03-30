// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class EffectContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EffectContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectContext wrap(android.media.effect.EffectContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.EffectContext(real, (__DcgwBridgeToken) null);
    }

    public android.media.effect.EffectContext getReal() {
        return (android.media.effect.EffectContext) real;
    }

    public android.media.effect.EffectContext unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectContext createWithCurrentGlContext() {
        return com.micklab.dcg.wrapper.android.media.effect.EffectContext.wrap(android.media.effect.EffectContext.createWithCurrentGlContext());
    }

    public com.micklab.dcg.wrapper.android.media.effect.EffectFactory getFactory() {
        return com.micklab.dcg.wrapper.android.media.effect.EffectFactory.wrap(((android.media.effect.EffectContext) real).getFactory());
    }

    public void release() {
        ((android.media.effect.EffectContext) real).release();
    }

}
