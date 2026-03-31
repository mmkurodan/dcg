// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Color {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Color(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color wrap(android.graphics.Color real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Color(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Color getReal() {
        return (android.graphics.Color) real;
    }

    public android.graphics.Color unwrap() {
        return getReal();
    }

    public Color() {
        this(new android.graphics.Color(), (__DcgwBridgeToken) null);
    }

    public static int HSVToColor(float[] arg0) {
        return android.graphics.Color.HSVToColor(arg0);
    }

    public static int HSVToColor(int arg0, float[] arg1) {
        return android.graphics.Color.HSVToColor(arg0, arg1);
    }

    public static void RGBToHSV(int arg0, int arg1, int arg2, float[] arg3) {
        android.graphics.Color.RGBToHSV(arg0, arg1, arg2, arg3);
    }

    public float alpha() {
        return ((android.graphics.Color) real).alpha();
    }

    public static float alpha(long arg0) {
        return android.graphics.Color.alpha(arg0);
    }

    public static int alpha(int arg0) {
        return android.graphics.Color.alpha(arg0);
    }

    public static int argb(float arg0, float arg1, float arg2, float arg3) {
        return android.graphics.Color.argb(arg0, arg1, arg2, arg3);
    }

    public static int argb(int arg0, int arg1, int arg2, int arg3) {
        return android.graphics.Color.argb(arg0, arg1, arg2, arg3);
    }

    public float blue() {
        return ((android.graphics.Color) real).blue();
    }

    public static float blue(long arg0) {
        return android.graphics.Color.blue(arg0);
    }

    public static int blue(int arg0) {
        return android.graphics.Color.blue(arg0);
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace colorSpace(long arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.Color.colorSpace(arg0));
    }

    public static void colorToHSV(int arg0, float[] arg1) {
        android.graphics.Color.colorToHSV(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Color convert(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(((android.graphics.Color) real).convert(arg0 == null ? null : arg0.getReal()));
    }

    public static long convert(long arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector arg1) {
        return android.graphics.Color.convert(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static long convert(long arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return android.graphics.Color.convert(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static long convert(int arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return android.graphics.Color.convert(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static long convert(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector arg4) {
        return android.graphics.Color.convert(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public static long convert(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        return android.graphics.Color.convert(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Color) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.Color) real).getColorSpace());
    }

    public float getComponent(int arg0) {
        return ((android.graphics.Color) real).getComponent(arg0);
    }

    public int getComponentCount() {
        return ((android.graphics.Color) real).getComponentCount();
    }

    public float[] getComponents() {
        return ((android.graphics.Color) real).getComponents();
    }

    public float[] getComponents(float[] arg0) {
        return ((android.graphics.Color) real).getComponents(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model getModel() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(((android.graphics.Color) real).getModel());
    }

    public float green() {
        return ((android.graphics.Color) real).green();
    }

    public static float green(long arg0) {
        return android.graphics.Color.green(arg0);
    }

    public static int green(int arg0) {
        return android.graphics.Color.green(arg0);
    }

    public int hashCode() {
        return ((android.graphics.Color) real).hashCode();
    }

    public static boolean isInColorSpace(long arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return android.graphics.Color.isInColorSpace(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean isSrgb() {
        return ((android.graphics.Color) real).isSrgb();
    }

    public static boolean isSrgb(long arg0) {
        return android.graphics.Color.isSrgb(arg0);
    }

    public boolean isWideGamut() {
        return ((android.graphics.Color) real).isWideGamut();
    }

    public static boolean isWideGamut(long arg0) {
        return android.graphics.Color.isWideGamut(arg0);
    }

    public float luminance() {
        return ((android.graphics.Color) real).luminance();
    }

    public static float luminance(int arg0) {
        return android.graphics.Color.luminance(arg0);
    }

    public static float luminance(long arg0) {
        return android.graphics.Color.luminance(arg0);
    }

    public long pack() {
        return ((android.graphics.Color) real).pack();
    }

    public static long pack(int arg0) {
        return android.graphics.Color.pack(arg0);
    }

    public static long pack(float arg0, float arg1, float arg2) {
        return android.graphics.Color.pack(arg0, arg1, arg2);
    }

    public static long pack(float arg0, float arg1, float arg2, float arg3) {
        return android.graphics.Color.pack(arg0, arg1, arg2, arg3);
    }

    public static long pack(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg4) {
        return android.graphics.Color.pack(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public static int parseColor(java.lang.String arg0) {
        return android.graphics.Color.parseColor(arg0);
    }

    public float red() {
        return ((android.graphics.Color) real).red();
    }

    public static float red(long arg0) {
        return android.graphics.Color.red(arg0);
    }

    public static int red(int arg0) {
        return android.graphics.Color.red(arg0);
    }

    public static int rgb(float arg0, float arg1, float arg2) {
        return android.graphics.Color.rgb(arg0, arg1, arg2);
    }

    public static int rgb(int arg0, int arg1, int arg2) {
        return android.graphics.Color.rgb(arg0, arg1, arg2);
    }

    public int toArgb() {
        return ((android.graphics.Color) real).toArgb();
    }

    public static int toArgb(long arg0) {
        return android.graphics.Color.toArgb(arg0);
    }

    public java.lang.String toString() {
        return ((android.graphics.Color) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(long arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(float[] arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(float arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0, arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Color valueOf(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(android.graphics.Color.valueOf(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static final int BLACK = android.graphics.Color.BLACK;
    public static final int BLUE = android.graphics.Color.BLUE;
    public static final int CYAN = android.graphics.Color.CYAN;
    public static final int DKGRAY = android.graphics.Color.DKGRAY;
    public static final int GRAY = android.graphics.Color.GRAY;
    public static final int GREEN = android.graphics.Color.GREEN;
    public static final int LTGRAY = android.graphics.Color.LTGRAY;
    public static final int MAGENTA = android.graphics.Color.MAGENTA;
    public static final int RED = android.graphics.Color.RED;
    public static final int TRANSPARENT = android.graphics.Color.TRANSPARENT;
    public static final int WHITE = android.graphics.Color.WHITE;
    public static final int YELLOW = android.graphics.Color.YELLOW;

}
