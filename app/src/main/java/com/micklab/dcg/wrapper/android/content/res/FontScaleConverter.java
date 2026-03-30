// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class FontScaleConverter {
    private final android.content.res.FontScaleConverter real;

    public FontScaleConverter(android.content.res.FontScaleConverter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.FontScaleConverter wrap(android.content.res.FontScaleConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.FontScaleConverter(real);
    }

    public android.content.res.FontScaleConverter unwrap() {
        return real;
    }

    public float convertDpToSp(float arg0) {
        return real.convertDpToSp(arg0);
    }

    public float convertSpToDp(float arg0) {
        return real.convertSpToDp(arg0);
    }

    public static com.micklab.dcg.wrapper.android.content.res.FontScaleConverter forScale(float arg0) {
        return com.micklab.dcg.wrapper.android.content.res.FontScaleConverter.wrap(android.content.res.FontScaleConverter.forScale(arg0));
    }

    public static boolean isNonLinearFontScalingActive(float arg0) {
        return android.content.res.FontScaleConverter.isNonLinearFontScalingActive(arg0);
    }

}
