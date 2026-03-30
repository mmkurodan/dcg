// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextShaper {
    private final android.text.TextShaper real;

    public TextShaper(android.text.TextShaper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextShaper wrap(android.text.TextShaper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextShaper(real);
    }

    public android.text.TextShaper unwrap() {
        return real;
    }

    public static void shapeText(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg3, com.micklab.dcg.wrapper.android.text.TextPaint arg4, com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer arg5) {
        android.text.TextShaper.shapeText(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public static final class GlyphsConsumer {
        private final android.text.TextShaper.GlyphsConsumer real;

        public GlyphsConsumer(android.text.TextShaper.GlyphsConsumer real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer wrap(android.text.TextShaper.GlyphsConsumer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextShaper.GlyphsConsumer(real);
        }

        public android.text.TextShaper.GlyphsConsumer unwrap() {
            return real;
        }

        public void accept(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3) {
            real.accept(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
        }

    }
}
