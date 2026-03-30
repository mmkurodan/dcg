// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class DynamicLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DynamicLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.DynamicLayout wrap(android.text.DynamicLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.DynamicLayout(real, (__DcgwBridgeToken) null);
    }

    public android.text.DynamicLayout getReal() {
        return (android.text.DynamicLayout) real;
    }

    public android.text.DynamicLayout unwrap() {
        return getReal();
    }

    public DynamicLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, boolean arg6) {
        this(new android.text.DynamicLayout(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public DynamicLayout(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.text.TextPaint arg2, int arg3, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg4, float arg5, float arg6, boolean arg7) {
        this(new android.text.DynamicLayout(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public DynamicLayout(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.text.TextPaint arg2, int arg3, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        this(new android.text.DynamicLayout(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7, arg8 == null ? null : arg8.getReal(), arg9), (__DcgwBridgeToken) null);
    }

    public int getBottomPadding() {
        return ((android.text.DynamicLayout) real).getBottomPadding();
    }

    public int getEllipsisCount(int arg0) {
        return ((android.text.DynamicLayout) real).getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return ((android.text.DynamicLayout) real).getEllipsisStart(arg0);
    }

    public int getEllipsizedWidth() {
        return ((android.text.DynamicLayout) real).getEllipsizedWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.text.DynamicLayout) real).getLineBreakConfig());
    }

    public boolean getLineContainsTab(int arg0) {
        return ((android.text.DynamicLayout) real).getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return ((android.text.DynamicLayout) real).getLineCount();
    }

    public int getLineDescent(int arg0) {
        return ((android.text.DynamicLayout) real).getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(((android.text.DynamicLayout) real).getLineDirections(arg0));
    }

    public int getLineStart(int arg0) {
        return ((android.text.DynamicLayout) real).getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return ((android.text.DynamicLayout) real).getLineTop(arg0);
    }

    public int getParagraphDirection(int arg0) {
        return ((android.text.DynamicLayout) real).getParagraphDirection(arg0);
    }

    public int getTopPadding() {
        return ((android.text.DynamicLayout) real).getTopPadding();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder wrap(android.text.DynamicLayout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.text.DynamicLayout.Builder getReal() {
            return (android.text.DynamicLayout.Builder) real;
        }

        public android.text.DynamicLayout.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout build() {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.wrap(((android.text.DynamicLayout.Builder) real).build());
        }

        public static com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder obtain(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(android.text.DynamicLayout.Builder.obtain(arg0, arg1 == null ? null : arg1.getReal(), arg2));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setAlignment(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setAlignment(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setDisplayText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setDisplayText(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setEllipsize(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setEllipsizedWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setEllipsizedWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setIncludePad(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setIncludePad(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setLineBreakConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setLineSpacing(float arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setLineSpacing(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setMinimumFontMetrics(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setShiftDrawingOffsetForStartOverhang(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setShiftDrawingOffsetForStartOverhang(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setTextDirection(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setTextDirection(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setUseBoundsForWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setUseLineSpacingFromFallbacks(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(((android.text.DynamicLayout.Builder) real).setUseLineSpacingFromFallbacks(arg0));
        }

    }
}
