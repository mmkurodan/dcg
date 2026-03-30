// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.effect;

public final class EffectFactory {
    private final android.media.effect.EffectFactory real;

    public EffectFactory(android.media.effect.EffectFactory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.effect.EffectFactory wrap(android.media.effect.EffectFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.effect.EffectFactory(real);
    }

    public android.media.effect.EffectFactory unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.effect.Effect createEffect(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.effect.Effect.wrap(real.createEffect(arg0));
    }

    public static boolean isEffectSupported(java.lang.String arg0) {
        return android.media.effect.EffectFactory.isEffectSupported(arg0);
    }

    public static final java.lang.String EFFECT_AUTOFIX = android.media.effect.EffectFactory.EFFECT_AUTOFIX;
    public static final java.lang.String EFFECT_BACKDROPPER = android.media.effect.EffectFactory.EFFECT_BACKDROPPER;
    public static final java.lang.String EFFECT_BITMAPOVERLAY = android.media.effect.EffectFactory.EFFECT_BITMAPOVERLAY;
    public static final java.lang.String EFFECT_BLACKWHITE = android.media.effect.EffectFactory.EFFECT_BLACKWHITE;
    public static final java.lang.String EFFECT_BRIGHTNESS = android.media.effect.EffectFactory.EFFECT_BRIGHTNESS;
    public static final java.lang.String EFFECT_CONTRAST = android.media.effect.EffectFactory.EFFECT_CONTRAST;
    public static final java.lang.String EFFECT_CROP = android.media.effect.EffectFactory.EFFECT_CROP;
    public static final java.lang.String EFFECT_CROSSPROCESS = android.media.effect.EffectFactory.EFFECT_CROSSPROCESS;
    public static final java.lang.String EFFECT_DOCUMENTARY = android.media.effect.EffectFactory.EFFECT_DOCUMENTARY;
    public static final java.lang.String EFFECT_DUOTONE = android.media.effect.EffectFactory.EFFECT_DUOTONE;
    public static final java.lang.String EFFECT_FILLLIGHT = android.media.effect.EffectFactory.EFFECT_FILLLIGHT;
    public static final java.lang.String EFFECT_FISHEYE = android.media.effect.EffectFactory.EFFECT_FISHEYE;
    public static final java.lang.String EFFECT_FLIP = android.media.effect.EffectFactory.EFFECT_FLIP;
    public static final java.lang.String EFFECT_GRAIN = android.media.effect.EffectFactory.EFFECT_GRAIN;
    public static final java.lang.String EFFECT_GRAYSCALE = android.media.effect.EffectFactory.EFFECT_GRAYSCALE;
    public static final java.lang.String EFFECT_LOMOISH = android.media.effect.EffectFactory.EFFECT_LOMOISH;
    public static final java.lang.String EFFECT_NEGATIVE = android.media.effect.EffectFactory.EFFECT_NEGATIVE;
    public static final java.lang.String EFFECT_POSTERIZE = android.media.effect.EffectFactory.EFFECT_POSTERIZE;
    public static final java.lang.String EFFECT_REDEYE = android.media.effect.EffectFactory.EFFECT_REDEYE;
    public static final java.lang.String EFFECT_ROTATE = android.media.effect.EffectFactory.EFFECT_ROTATE;
    public static final java.lang.String EFFECT_SATURATE = android.media.effect.EffectFactory.EFFECT_SATURATE;
    public static final java.lang.String EFFECT_SEPIA = android.media.effect.EffectFactory.EFFECT_SEPIA;
    public static final java.lang.String EFFECT_SHARPEN = android.media.effect.EffectFactory.EFFECT_SHARPEN;
    public static final java.lang.String EFFECT_STRAIGHTEN = android.media.effect.EffectFactory.EFFECT_STRAIGHTEN;
    public static final java.lang.String EFFECT_TEMPERATURE = android.media.effect.EffectFactory.EFFECT_TEMPERATURE;
    public static final java.lang.String EFFECT_TINT = android.media.effect.EffectFactory.EFFECT_TINT;
    public static final java.lang.String EFFECT_VIGNETTE = android.media.effect.EffectFactory.EFFECT_VIGNETTE;

}
