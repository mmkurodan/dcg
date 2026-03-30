// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Canvas {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Canvas(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Canvas wrap(android.graphics.Canvas real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Canvas getReal() {
        return (android.graphics.Canvas) real;
    }

    public android.graphics.Canvas unwrap() {
        return getReal();
    }

    public Canvas() {
        this(new android.graphics.Canvas(), (__DcgwBridgeToken) null);
    }

    public Canvas(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.Canvas(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean clipOutPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return ((android.graphics.Canvas) real).clipOutPath(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipOutRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.Canvas) real).clipOutRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipOutRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Canvas) real).clipOutRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipOutRect(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.Canvas) real).clipOutRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipOutRect(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Canvas) real).clipOutRect(arg0, arg1, arg2, arg3);
    }

    public void clipOutShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        ((android.graphics.Canvas) real).clipOutShader(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return ((android.graphics.Canvas) real).clipPath(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return ((android.graphics.Canvas) real).clipPath(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.Canvas) real).clipRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Canvas) real).clipRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return ((android.graphics.Canvas) real).clipRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return ((android.graphics.Canvas) real).clipRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean clipRect(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.Canvas) real).clipRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipRect(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Canvas) real).clipRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Region.Op arg4) {
        return ((android.graphics.Canvas) real).clipRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void clipShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        ((android.graphics.Canvas) real).clipShader(arg0 == null ? null : arg0.getReal());
    }

    public void concat(com.micklab.dcg.wrapper.android.graphics.Matrix44 arg0) {
        ((android.graphics.Canvas) real).concat(arg0 == null ? null : arg0.getReal());
    }

    public void concat(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Canvas) real).concat(arg0 == null ? null : arg0.getReal());
    }

    public void disableZ() {
        ((android.graphics.Canvas) real).disableZ();
    }

    public void drawARGB(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Canvas) real).drawARGB(arg0, arg1, arg2, arg3);
    }

    public void drawArc(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, boolean arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawArc(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawArc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, boolean arg6, com.micklab.dcg.wrapper.android.graphics.Paint arg7) {
        ((android.graphics.Canvas) real).drawArc(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawBitmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawBitmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawBitmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawBitmap(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.graphics.Canvas) real).drawBitmap(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public void drawBitmap(int[] arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.graphics.Canvas) real).drawBitmap(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public void drawBitmapMesh(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, float[] arg3, int arg4, int[] arg5, int arg6, com.micklab.dcg.wrapper.android.graphics.Paint arg7) {
        ((android.graphics.Canvas) real).drawBitmapMesh(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void drawCircle(float arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawCircle(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawColor(int arg0) {
        ((android.graphics.Canvas) real).drawColor(arg0);
    }

    public void drawColor(long arg0) {
        ((android.graphics.Canvas) real).drawColor(arg0);
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        ((android.graphics.Canvas) real).drawColor(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        ((android.graphics.Canvas) real).drawColor(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void drawColor(long arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        ((android.graphics.Canvas) real).drawColor(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void drawDoubleRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2, float[] arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawDoubleRoundRect(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawDoubleRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.RectF arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        ((android.graphics.Canvas) real).drawDoubleRoundRect(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void drawGlyphs(int[] arg0, int arg1, float[] arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.fonts.Font arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        ((android.graphics.Canvas) real).drawGlyphs(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void drawLine(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawLine(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawLines(float[] arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawLines(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void drawLines(float[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawLines(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawMesh(com.micklab.dcg.wrapper.android.graphics.Mesh arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawMesh(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void drawOval(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawOval(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawOval(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawOval(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        ((android.graphics.Canvas) real).drawPaint(arg0 == null ? null : arg0.getReal());
    }

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawPatch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawPatch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void drawPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawPath(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        ((android.graphics.Canvas) real).drawPicture(arg0 == null ? null : arg0.getReal());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.graphics.Canvas) real).drawPicture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        ((android.graphics.Canvas) real).drawPicture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawPoint(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawPoint(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void drawPoints(float[] arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawPoints(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void drawPoints(float[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawPoints(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawPosText(java.lang.String arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.Canvas) real).drawPosText(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void drawPosText(char[] arg0, int arg1, int arg2, float[] arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawPosText(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawRGB(int arg0, int arg1, int arg2) {
        ((android.graphics.Canvas) real).drawRGB(arg0, arg1, arg2);
    }

    public void drawRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.Canvas) real).drawRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void drawRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawRenderNode(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        ((android.graphics.Canvas) real).drawRenderNode(arg0 == null ? null : arg0.getReal());
    }

    public void drawRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawRoundRect(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawRoundRect(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        ((android.graphics.Canvas) real).drawRoundRect(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void drawText(java.lang.String arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        ((android.graphics.Canvas) real).drawText(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void drawText(java.lang.CharSequence arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        ((android.graphics.Canvas) real).drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void drawText(char[] arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        ((android.graphics.Canvas) real).drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void drawText(java.lang.String arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        ((android.graphics.Canvas) real).drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void drawTextOnPath(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        ((android.graphics.Canvas) real).drawTextOnPath(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void drawTextOnPath(char[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        ((android.graphics.Canvas) real).drawTextOnPath(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void drawTextRun(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.graphics.Canvas) real).drawTextRun(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public void drawTextRun(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.graphics.Canvas) real).drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public void drawTextRun(char[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.graphics.Canvas) real).drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public void drawVertices(com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, int[] arg6, int arg7, short[] arg8, int arg9, int arg10, com.micklab.dcg.wrapper.android.graphics.Paint arg11) {
        ((android.graphics.Canvas) real).drawVertices(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
    }

    public void enableZ() {
        ((android.graphics.Canvas) real).enableZ();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getClipBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.Canvas) real).getClipBounds());
    }

    public boolean getClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Canvas) real).getClipBounds(arg0 == null ? null : arg0.getReal());
    }

    public int getDensity() {
        return ((android.graphics.Canvas) real).getDensity();
    }

    public com.micklab.dcg.wrapper.android.graphics.DrawFilter getDrawFilter() {
        return com.micklab.dcg.wrapper.android.graphics.DrawFilter.wrap(((android.graphics.Canvas) real).getDrawFilter());
    }

    public int getHeight() {
        return ((android.graphics.Canvas) real).getHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.graphics.Canvas) real).getMatrix());
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Canvas) real).getMatrix(arg0 == null ? null : arg0.getReal());
    }

    public int getMaximumBitmapHeight() {
        return ((android.graphics.Canvas) real).getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        return ((android.graphics.Canvas) real).getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        return ((android.graphics.Canvas) real).getSaveCount();
    }

    public int getWidth() {
        return ((android.graphics.Canvas) real).getWidth();
    }

    public boolean isHardwareAccelerated() {
        return ((android.graphics.Canvas) real).isHardwareAccelerated();
    }

    public boolean isOpaque() {
        return ((android.graphics.Canvas) real).isOpaque();
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return ((android.graphics.Canvas) real).quickReject(arg0 == null ? null : arg0.getReal());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.Canvas) real).quickReject(arg0 == null ? null : arg0.getReal());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg1) {
        return ((android.graphics.Canvas) real).quickReject(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg1) {
        return ((android.graphics.Canvas) real).quickReject(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean quickReject(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.Canvas) real).quickReject(arg0, arg1, arg2, arg3);
    }

    public boolean quickReject(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg4) {
        return ((android.graphics.Canvas) real).quickReject(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void restore() {
        ((android.graphics.Canvas) real).restore();
    }

    public void restoreToCount(int arg0) {
        ((android.graphics.Canvas) real).restoreToCount(arg0);
    }

    public void rotate(float arg0) {
        ((android.graphics.Canvas) real).rotate(arg0);
    }

    public void rotate(float arg0, float arg1, float arg2) {
        ((android.graphics.Canvas) real).rotate(arg0, arg1, arg2);
    }

    public int save() {
        return ((android.graphics.Canvas) real).save();
    }

    public int saveLayer(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        return ((android.graphics.Canvas) real).saveLayer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int saveLayer(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2) {
        return ((android.graphics.Canvas) real).saveLayer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int saveLayer(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        return ((android.graphics.Canvas) real).saveLayer(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public int saveLayer(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4, int arg5) {
        return ((android.graphics.Canvas) real).saveLayer(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5);
    }

    public int saveLayerAlpha(com.micklab.dcg.wrapper.android.graphics.RectF arg0, int arg1) {
        return ((android.graphics.Canvas) real).saveLayerAlpha(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int saveLayerAlpha(com.micklab.dcg.wrapper.android.graphics.RectF arg0, int arg1, int arg2) {
        return ((android.graphics.Canvas) real).saveLayerAlpha(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public int saveLayerAlpha(float arg0, float arg1, float arg2, float arg3, int arg4) {
        return ((android.graphics.Canvas) real).saveLayerAlpha(arg0, arg1, arg2, arg3, arg4);
    }

    public int saveLayerAlpha(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        return ((android.graphics.Canvas) real).saveLayerAlpha(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void scale(float arg0, float arg1) {
        ((android.graphics.Canvas) real).scale(arg0, arg1);
    }

    public void scale(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.Canvas) real).scale(arg0, arg1, arg2, arg3);
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        ((android.graphics.Canvas) real).setBitmap(arg0 == null ? null : arg0.getReal());
    }

    public void setDensity(int arg0) {
        ((android.graphics.Canvas) real).setDensity(arg0);
    }

    public void setDrawFilter(com.micklab.dcg.wrapper.android.graphics.DrawFilter arg0) {
        ((android.graphics.Canvas) real).setDrawFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Canvas) real).setMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void skew(float arg0, float arg1) {
        ((android.graphics.Canvas) real).skew(arg0, arg1);
    }

    public void translate(float arg0, float arg1) {
        ((android.graphics.Canvas) real).translate(arg0, arg1);
    }

    public static final int ALL_SAVE_FLAG = android.graphics.Canvas.ALL_SAVE_FLAG;

    public static final class EdgeType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EdgeType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType wrap(android.graphics.Canvas.EdgeType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Canvas.EdgeType getReal() {
            return (android.graphics.Canvas.EdgeType) real;
        }

        public android.graphics.Canvas.EdgeType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType.wrap(android.graphics.Canvas.EdgeType.valueOf(arg0));
        }

        public static android.graphics.Canvas.EdgeType[] values() {
            return android.graphics.Canvas.EdgeType.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType AA = com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType.wrap(android.graphics.Canvas.EdgeType.AA);
        public static final com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType BW = com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType.wrap(android.graphics.Canvas.EdgeType.BW);

    }
    public static final class VertexMode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VertexMode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode wrap(android.graphics.Canvas.VertexMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Canvas.VertexMode getReal() {
            return (android.graphics.Canvas.VertexMode) real;
        }

        public android.graphics.Canvas.VertexMode unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode.wrap(android.graphics.Canvas.VertexMode.valueOf(arg0));
        }

        public static android.graphics.Canvas.VertexMode[] values() {
            return android.graphics.Canvas.VertexMode.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode TRIANGLES = com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode.wrap(android.graphics.Canvas.VertexMode.TRIANGLES);
        public static final com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode TRIANGLE_FAN = com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode.wrap(android.graphics.Canvas.VertexMode.TRIANGLE_FAN);
        public static final com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode TRIANGLE_STRIP = com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode.wrap(android.graphics.Canvas.VertexMode.TRIANGLE_STRIP);

    }
}
