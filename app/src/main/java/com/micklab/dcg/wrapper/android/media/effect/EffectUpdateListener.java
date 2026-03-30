// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class EffectUpdateListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EffectUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener wrap(android.media.effect.EffectUpdateListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.EffectUpdateListener(real, (__DcgwBridgeToken) null);
    }

    public android.media.effect.EffectUpdateListener getReal() {
        return (android.media.effect.EffectUpdateListener) real;
    }

    public android.media.effect.EffectUpdateListener unwrap() {
        return getReal();
    }

    public void onEffectUpdated(com.micklab.dcg.wrapper.android.media.effect.Effect arg0, java.lang.Object arg1) {
        ((android.media.effect.EffectUpdateListener) real).onEffectUpdated(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
