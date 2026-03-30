// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class BoringLayout {
    private final android.text.BoringLayout real;

    public BoringLayout(android.text.BoringLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout wrap(android.text.BoringLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.BoringLayout(real);
    }

    public android.text.BoringLayout unwrap() {
        return real;
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7));
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9, boolean arg10) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8 == null ? null : arg8.unwrap(), arg9, arg10));
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF computeDrawingBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.computeDrawingBoundingBox());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2, int arg3) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void ellipsized(int arg0, int arg1) {
        real.ellipsized(arg0, arg1);
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

    public int getHeight() {
        return real.getHeight();
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

    public float getLineMax(int arg0) {
        return real.getLineMax(arg0);
    }

    public int getLineStart(int arg0) {
        return real.getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return real.getLineTop(arg0);
    }

    public float getLineWidth(int arg0) {
        return real.getLineWidth(arg0);
    }

    public int getParagraphDirection(int arg0) {
        return real.getParagraphDirection(arg0);
    }

    public int getTopPadding() {
        return real.getTopPadding();
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg2) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg2, boolean arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public boolean isFallbackLineSpacingEnabled() {
        return real.isFallbackLineSpacingEnabled();
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4, boolean arg5, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg6, int arg7, boolean arg8) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(real.replaceOrMake(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4, boolean arg5, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg6, int arg7, boolean arg8) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(real.replaceOrMake(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(real.replaceOrMake(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7, arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public static final class Metrics {
        private final android.text.BoringLayout.Metrics real;

        public Metrics(android.text.BoringLayout.Metrics real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics wrap(android.text.BoringLayout.Metrics real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics(real);
        }

        public android.text.BoringLayout.Metrics unwrap() {
            return real;
        }

        public Metrics() {
            this(new android.text.BoringLayout.Metrics());
        }

        public com.micklab.dcg.wrapper.android.graphics.RectF getDrawingBoundingBox() {
            return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getDrawingBoundingBox());
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
