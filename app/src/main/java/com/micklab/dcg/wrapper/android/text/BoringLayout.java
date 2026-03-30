// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class BoringLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BoringLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout wrap(android.text.BoringLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.BoringLayout(real, (__DcgwBridgeToken) null);
    }

    public android.text.BoringLayout getReal() {
        return (android.text.BoringLayout) real;
    }

    public android.text.BoringLayout unwrap() {
        return getReal();
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7), (__DcgwBridgeToken) null);
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8 == null ? null : arg8.getReal(), arg9), (__DcgwBridgeToken) null);
    }

    public BoringLayout(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9, boolean arg10) {
        this(new android.text.BoringLayout(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8 == null ? null : arg8.getReal(), arg9, arg10), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF computeDrawingBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.text.BoringLayout) real).computeDrawingBoundingBox());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2, int arg3) {
        ((android.text.BoringLayout) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void ellipsized(int arg0, int arg1) {
        ((android.text.BoringLayout) real).ellipsized(arg0, arg1);
    }

    public int getBottomPadding() {
        return ((android.text.BoringLayout) real).getBottomPadding();
    }

    public int getEllipsisCount(int arg0) {
        return ((android.text.BoringLayout) real).getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return ((android.text.BoringLayout) real).getEllipsisStart(arg0);
    }

    public int getEllipsizedWidth() {
        return ((android.text.BoringLayout) real).getEllipsizedWidth();
    }

    public int getHeight() {
        return ((android.text.BoringLayout) real).getHeight();
    }

    public boolean getLineContainsTab(int arg0) {
        return ((android.text.BoringLayout) real).getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return ((android.text.BoringLayout) real).getLineCount();
    }

    public int getLineDescent(int arg0) {
        return ((android.text.BoringLayout) real).getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(((android.text.BoringLayout) real).getLineDirections(arg0));
    }

    public float getLineMax(int arg0) {
        return ((android.text.BoringLayout) real).getLineMax(arg0);
    }

    public int getLineStart(int arg0) {
        return ((android.text.BoringLayout) real).getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return ((android.text.BoringLayout) real).getLineTop(arg0);
    }

    public float getLineWidth(int arg0) {
        return ((android.text.BoringLayout) real).getLineWidth(arg0);
    }

    public int getParagraphDirection(int arg0) {
        return ((android.text.BoringLayout) real).getParagraphDirection(arg0);
    }

    public int getTopPadding() {
        return ((android.text.BoringLayout) real).getTopPadding();
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg2) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg2, boolean arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics.wrap(android.text.BoringLayout.isBoring(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal()));
    }

    public boolean isFallbackLineSpacingEnabled() {
        return ((android.text.BoringLayout) real).isFallbackLineSpacingEnabled();
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4, boolean arg5, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg6, int arg7, boolean arg8) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8));
    }

    public static com.micklab.dcg.wrapper.android.text.BoringLayout make(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(android.text.BoringLayout.make(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8 == null ? null : arg8.getReal(), arg9));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(((android.text.BoringLayout) real).replaceOrMake(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg4, boolean arg5, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg6, int arg7, boolean arg8) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(((android.text.BoringLayout) real).replaceOrMake(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8));
    }

    public com.micklab.dcg.wrapper.android.text.BoringLayout replaceOrMake(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, int arg2, com.micklab.dcg.wrapper.android.text.Layout.Alignment arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics arg6, boolean arg7, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg8, int arg9) {
        return com.micklab.dcg.wrapper.android.text.BoringLayout.wrap(((android.text.BoringLayout) real).replaceOrMake(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7, arg8 == null ? null : arg8.getReal(), arg9));
    }

    public static final class Metrics {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Metrics(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics wrap(android.text.BoringLayout.Metrics real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.BoringLayout.Metrics(real, (__DcgwBridgeToken) null);
        }

        public android.text.BoringLayout.Metrics getReal() {
            return (android.text.BoringLayout.Metrics) real;
        }

        public android.text.BoringLayout.Metrics unwrap() {
            return getReal();
        }

        public Metrics() {
            this(new android.text.BoringLayout.Metrics(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.RectF getDrawingBoundingBox() {
            return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.text.BoringLayout.Metrics) real).getDrawingBoundingBox());
        }

        public java.lang.String toString() {
            return ((android.text.BoringLayout.Metrics) real).toString();
        }


    }
}
