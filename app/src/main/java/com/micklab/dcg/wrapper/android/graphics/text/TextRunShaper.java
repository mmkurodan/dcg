// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class TextRunShaper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextRunShaper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.TextRunShaper wrap(android.graphics.text.TextRunShaper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.TextRunShaper(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.text.TextRunShaper getReal() {
        return (android.graphics.text.TextRunShaper) real;
    }

    public android.graphics.text.TextRunShaper unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs shapeTextRun(char[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        return com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs.wrap(android.graphics.text.TextRunShaper.shapeTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs shapeTextRun(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        return com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs.wrap(android.graphics.text.TextRunShaper.shapeTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal()));
    }

}
