// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class DisplayMetrics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayMetrics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.DisplayMetrics wrap(android.util.DisplayMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.DisplayMetrics(real, (__DcgwBridgeToken) null);
    }

    public android.util.DisplayMetrics getReal() {
        return (android.util.DisplayMetrics) real;
    }

    public android.util.DisplayMetrics unwrap() {
        return getReal();
    }

    public DisplayMetrics() {
        this(new android.util.DisplayMetrics(), (__DcgwBridgeToken) null);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return ((android.util.DisplayMetrics) real).equals(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.DisplayMetrics) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.util.DisplayMetrics) real).hashCode();
    }

    public void setTo(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        ((android.util.DisplayMetrics) real).setTo(arg0 == null ? null : arg0.getReal());
    }

    public void setToDefaults() {
        ((android.util.DisplayMetrics) real).setToDefaults();
    }

    public java.lang.String toString() {
        return ((android.util.DisplayMetrics) real).toString();
    }

    public static final int DENSITY_140 = android.util.DisplayMetrics.DENSITY_140;
    public static final int DENSITY_180 = android.util.DisplayMetrics.DENSITY_180;
    public static final int DENSITY_200 = android.util.DisplayMetrics.DENSITY_200;
    public static final int DENSITY_220 = android.util.DisplayMetrics.DENSITY_220;
    public static final int DENSITY_260 = android.util.DisplayMetrics.DENSITY_260;
    public static final int DENSITY_280 = android.util.DisplayMetrics.DENSITY_280;
    public static final int DENSITY_300 = android.util.DisplayMetrics.DENSITY_300;
    public static final int DENSITY_340 = android.util.DisplayMetrics.DENSITY_340;
    public static final int DENSITY_360 = android.util.DisplayMetrics.DENSITY_360;
    public static final int DENSITY_390 = android.util.DisplayMetrics.DENSITY_390;
    public static final int DENSITY_400 = android.util.DisplayMetrics.DENSITY_400;
    public static final int DENSITY_420 = android.util.DisplayMetrics.DENSITY_420;
    public static final int DENSITY_440 = android.util.DisplayMetrics.DENSITY_440;
    public static final int DENSITY_450 = android.util.DisplayMetrics.DENSITY_450;
    public static final int DENSITY_520 = android.util.DisplayMetrics.DENSITY_520;
    public static final int DENSITY_560 = android.util.DisplayMetrics.DENSITY_560;
    public static final int DENSITY_600 = android.util.DisplayMetrics.DENSITY_600;
    public static final int DENSITY_DEFAULT = android.util.DisplayMetrics.DENSITY_DEFAULT;
    public static final int DENSITY_DEVICE_STABLE = android.util.DisplayMetrics.DENSITY_DEVICE_STABLE;
    public static final int DENSITY_HIGH = android.util.DisplayMetrics.DENSITY_HIGH;
    public static final int DENSITY_LOW = android.util.DisplayMetrics.DENSITY_LOW;
    public static final int DENSITY_MEDIUM = android.util.DisplayMetrics.DENSITY_MEDIUM;
    public static final int DENSITY_TV = android.util.DisplayMetrics.DENSITY_TV;
    public static final int DENSITY_XHIGH = android.util.DisplayMetrics.DENSITY_XHIGH;
    public static final int DENSITY_XXHIGH = android.util.DisplayMetrics.DENSITY_XXHIGH;
    public static final int DENSITY_XXXHIGH = android.util.DisplayMetrics.DENSITY_XXXHIGH;

}
