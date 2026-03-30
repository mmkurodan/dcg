// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class DynamicLayout {
    private final android.text.DynamicLayout real;

    public DynamicLayout(android.text.DynamicLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.DynamicLayout wrap(android.text.DynamicLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.DynamicLayout(real);
    }

    public android.text.DynamicLayout unwrap() {
        return real;
    }

    public DynamicLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, boolean arg6) {
        this(new android.text.DynamicLayout(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6));
    }

    public DynamicLayout(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.text.TextPaint arg2, int arg3, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg4, float arg5, float arg6, boolean arg7) {
        this(new android.text.DynamicLayout(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7));
    }

    public DynamicLayout(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.text.TextPaint arg2, int arg3, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        this(new android.text.DynamicLayout(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public int getBottomPadding() {
        return real.getBottomPadding();
    }

    public int getEllipsisCount(int arg0) {
        return real.getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return real.getEllipsisStart(arg0);
    }

    public int getEllipsizedWidth() {
        return real.getEllipsizedWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(real.getLineBreakConfig());
    }

    public boolean getLineContainsTab(int arg0) {
        return real.getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return real.getLineCount();
    }

    public int getLineDescent(int arg0) {
        return real.getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(real.getLineDirections(arg0));
    }

    public int getLineStart(int arg0) {
        return real.getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return real.getLineTop(arg0);
    }

    public int getParagraphDirection(int arg0) {
        return real.getParagraphDirection(arg0);
    }

    public int getTopPadding() {
        return real.getTopPadding();
    }

    public static final class Builder {
        private final android.text.DynamicLayout.Builder real;

        public Builder(android.text.DynamicLayout.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder wrap(android.text.DynamicLayout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder(real);
        }

        public android.text.DynamicLayout.Builder unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout build() {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.wrap(real.build());
        }

        public static com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder obtain(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(android.text.DynamicLayout.Builder.obtain(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setAlignment(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setAlignment(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setDisplayText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setDisplayText(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setEllipsize(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setEllipsizedWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setEllipsizedWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setIncludePad(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setIncludePad(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setLineBreakConfig(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setLineSpacing(float arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setLineSpacing(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setMinimumFontMetrics(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setShiftDrawingOffsetForStartOverhang(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setShiftDrawingOffsetForStartOverhang(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setTextDirection(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setTextDirection(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setUseBoundsForWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder setUseLineSpacingFromFallbacks(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.DynamicLayout.Builder.wrap(real.setUseLineSpacingFromFallbacks(arg0));
        }

    }
}
