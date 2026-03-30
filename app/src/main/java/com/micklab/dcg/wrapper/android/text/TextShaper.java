// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextShaper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextShaper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextShaper wrap(android.text.TextShaper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextShaper(real, (__DcgwBridgeToken) null);
    }

    public android.text.TextShaper getReal() {
        return (android.text.TextShaper) real;
    }

    public android.text.TextShaper unwrap() {
        return getReal();
    }

    public static void shapeText(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg3, com.micklab.dcg.wrapper.android.text.TextPaint arg4, com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer arg5) {
        android.text.TextShaper.shapeText(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
    }

    public static final class GlyphsConsumer {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GlyphsConsumer(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer wrap(android.text.TextShaper.GlyphsConsumer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer(real, (__DcgwBridgeToken) null);
        }

        public android.text.TextShaper.GlyphsConsumer getReal() {
            return (android.text.TextShaper.GlyphsConsumer) real;
        }

        public android.text.TextShaper.GlyphsConsumer unwrap() {
            return getReal();
        }

        public void accept(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3) {
            ((android.text.TextShaper.GlyphsConsumer) real).accept(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
        }

    }
}
