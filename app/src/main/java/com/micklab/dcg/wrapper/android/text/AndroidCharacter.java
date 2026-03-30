// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class AndroidCharacter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AndroidCharacter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.AndroidCharacter wrap(android.text.AndroidCharacter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.AndroidCharacter(real, (__DcgwBridgeToken) null);
    }

    public android.text.AndroidCharacter getReal() {
        return (android.text.AndroidCharacter) real;
    }

    public android.text.AndroidCharacter unwrap() {
        return getReal();
    }

    public AndroidCharacter() {
        this(new android.text.AndroidCharacter(), (__DcgwBridgeToken) null);
    }

    public static void getDirectionalities(char[] arg0, byte[] arg1, int arg2) {
        android.text.AndroidCharacter.getDirectionalities(arg0, arg1, arg2);
    }

    public static int getEastAsianWidth(char arg0) {
        return android.text.AndroidCharacter.getEastAsianWidth(arg0);
    }

    public static void getEastAsianWidths(char[] arg0, int arg1, int arg2, byte[] arg3) {
        android.text.AndroidCharacter.getEastAsianWidths(arg0, arg1, arg2, arg3);
    }

    public static char getMirror(char arg0) {
        return android.text.AndroidCharacter.getMirror(arg0);
    }

    public static boolean mirror(char[] arg0, int arg1, int arg2) {
        return android.text.AndroidCharacter.mirror(arg0, arg1, arg2);
    }

    public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_AMBIGUOUS;
    public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_FULL_WIDTH;
    public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_HALF_WIDTH;
    public static final int EAST_ASIAN_WIDTH_NARROW = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_NARROW;
    public static final int EAST_ASIAN_WIDTH_NEUTRAL = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_NEUTRAL;
    public static final int EAST_ASIAN_WIDTH_WIDE = android.text.AndroidCharacter.EAST_ASIAN_WIDTH_WIDE;

}
