// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class FontScaleConverter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FontScaleConverter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.FontScaleConverter wrap(android.content.res.FontScaleConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.FontScaleConverter(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.FontScaleConverter getReal() {
        return (android.content.res.FontScaleConverter) real;
    }

    public android.content.res.FontScaleConverter unwrap() {
        return getReal();
    }

    public float convertDpToSp(float arg0) {
        return ((android.content.res.FontScaleConverter) real).convertDpToSp(arg0);
    }

    public float convertSpToDp(float arg0) {
        return ((android.content.res.FontScaleConverter) real).convertSpToDp(arg0);
    }

    public static com.micklab.dcg.wrapper.android.content.res.FontScaleConverter forScale(float arg0) {
        return com.micklab.dcg.wrapper.android.content.res.FontScaleConverter.wrap(android.content.res.FontScaleConverter.forScale(arg0));
    }

    public static boolean isNonLinearFontScalingActive(float arg0) {
        return android.content.res.FontScaleConverter.isNonLinearFontScalingActive(arg0);
    }

}
