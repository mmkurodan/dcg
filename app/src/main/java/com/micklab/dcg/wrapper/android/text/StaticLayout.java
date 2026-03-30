// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class StaticLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StaticLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.StaticLayout wrap(android.text.StaticLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.StaticLayout(real, (__DcgwBridgeToken) null);
    }

    public android.text.StaticLayout getReal() {
        return (android.text.StaticLayout) real;
    }

    public android.text.StaticLayout unwrap() {
        return getReal();
    }

    public StaticLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, boolean arg6) {
        this(new android.text.StaticLayout(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public StaticLayout(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3, int arg4, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg5, float arg6, float arg7, boolean arg8) {
        this(new android.text.StaticLayout(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6, arg7, arg8), (__DcgwBridgeToken) null);
    }

    public StaticLayout(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3, int arg4, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg5, float arg6, float arg7, boolean arg8, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg9, int arg10) {
        this(new android.text.StaticLayout(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6, arg7, arg8, arg9 == null ? null : arg9.getReal(), arg10), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF computeDrawingBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.text.StaticLayout) real).computeDrawingBoundingBox());
    }

    public int getBottomPadding() {
        return ((android.text.StaticLayout) real).getBottomPadding();
    }

    public int getEllipsisCount(int arg0) {
        return ((android.text.StaticLayout) real).getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return ((android.text.StaticLayout) real).getEllipsisStart(arg0);
    }

    public boolean getLineContainsTab(int arg0) {
        return ((android.text.StaticLayout) real).getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return ((android.text.StaticLayout) real).getLineCount();
    }

    public int getLineDescent(int arg0) {
        return ((android.text.StaticLayout) real).getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(((android.text.StaticLayout) real).getLineDirections(arg0));
    }

    public int getLineForVertical(int arg0) {
        return ((android.text.StaticLayout) real).getLineForVertical(arg0);
    }

    public int getLineStart(int arg0) {
        return ((android.text.StaticLayout) real).getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return ((android.text.StaticLayout) real).getLineTop(arg0);
    }

    public int getParagraphDirection(int arg0) {
        return ((android.text.StaticLayout) real).getParagraphDirection(arg0);
    }

    public int getTopPadding() {
        return ((android.text.StaticLayout) real).getTopPadding();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.StaticLayout.Builder wrap(android.text.StaticLayout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.StaticLayout.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.text.StaticLayout.Builder getReal() {
            return (android.text.StaticLayout.Builder) real;
        }

        public android.text.StaticLayout.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout build() {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.wrap(((android.text.StaticLayout.Builder) real).build());
        }

        public static com.micklab.dcg.wrapper.android.text.StaticLayout.Builder obtain(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3, int arg4) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(android.text.StaticLayout.Builder.obtain(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setAlignment(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setAlignment(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setEllipsize(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setEllipsizedWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setEllipsizedWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setIncludePad(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setIncludePad(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setIndents(int[] arg0, int[] arg1) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setIndents(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setLineBreakConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setLineSpacing(float arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setLineSpacing(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setMaxLines(int arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setMaxLines(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setMinimumFontMetrics(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setShiftDrawingOffsetForStartOverhang(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setShiftDrawingOffsetForStartOverhang(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setText(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setTextDirection(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setTextDirection(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setUseBoundsForWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.StaticLayout.Builder setUseLineSpacingFromFallbacks(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.StaticLayout.Builder.wrap(((android.text.StaticLayout.Builder) real).setUseLineSpacingFromFallbacks(arg0));
        }

    }
}
