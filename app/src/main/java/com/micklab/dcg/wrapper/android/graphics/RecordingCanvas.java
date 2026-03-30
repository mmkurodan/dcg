// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RecordingCanvas {
    private final android.graphics.RecordingCanvas real;

    public RecordingCanvas(android.graphics.RecordingCanvas real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RecordingCanvas wrap(android.graphics.RecordingCanvas real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RecordingCanvas(real);
    }

    public android.graphics.RecordingCanvas unwrap() {
        return real;
    }

    public void disableZ() {
        real.disableZ();
    }

    public void drawARGB(int arg0, int arg1, int arg2, int arg3) {
        real.drawARGB(arg0, arg1, arg2, arg3);
    }

    public void drawArc(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, boolean arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawArc(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawArc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, boolean arg6, com.micklab.dcg.wrapper.android.graphics.Paint arg7) {
        real.drawArc(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawBitmap(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawBitmap(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawBitmap(int[] arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawBitmap(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawBitmapMesh(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, float[] arg3, int arg4, int[] arg5, int arg6, com.micklab.dcg.wrapper.android.graphics.Paint arg7) {
        real.drawBitmapMesh(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void drawCircle(float arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawCircle(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawColor(int arg0) {
        real.drawColor(arg0);
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        real.drawColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawColor(long arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        real.drawColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        real.drawColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawDoubleRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2, float[] arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawDoubleRoundRect(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawDoubleRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.RectF arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        real.drawDoubleRoundRect(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void drawGlyphs(int[] arg0, int arg1, float[] arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.fonts.Font arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        real.drawGlyphs(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void drawLine(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawLine(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawLines(float[] arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawLines(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawLines(float[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawLines(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawMesh(com.micklab.dcg.wrapper.android.graphics.Mesh arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawMesh(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void drawOval(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawOval(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawOval(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawOval(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        real.drawPaint(arg0 == null ? null : arg0.unwrap());
    }

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawPatch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawPatch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void drawPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        real.drawPicture(arg0 == null ? null : arg0.unwrap());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.drawPicture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        real.drawPicture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawPoint(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawPoint(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void drawPoints(float[] arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawPoints(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawPoints(float[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawPoints(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawPosText(java.lang.String arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawPosText(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void drawPosText(char[] arg0, int arg1, int arg2, float[] arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawPosText(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawRGB(int arg0, int arg1, int arg2) {
        real.drawRGB(arg0, arg1, arg2);
    }

    public void drawRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.drawRegion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void drawRenderNode(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        real.drawRenderNode(arg0 == null ? null : arg0.unwrap());
    }

    public void drawRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawRoundRect(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawRoundRect(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        real.drawRoundRect(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void drawText(java.lang.String arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawText(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void drawText(char[] arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        real.drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void drawText(java.lang.CharSequence arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        real.drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void drawText(java.lang.String arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        real.drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void drawTextOnPath(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        real.drawTextOnPath(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void drawTextOnPath(char[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Paint arg6) {
        real.drawTextOnPath(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void drawTextRun(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawTextRun(char[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawTextRun(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawVertices(com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, int[] arg6, int arg7, short[] arg8, int arg9, int arg10, com.micklab.dcg.wrapper.android.graphics.Paint arg11) {
        real.drawVertices(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
    }

    public void enableZ() {
        real.enableZ();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getMaximumBitmapHeight() {
        return real.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        return real.getMaximumBitmapWidth();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean isHardwareAccelerated() {
        return real.isHardwareAccelerated();
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        real.setBitmap(arg0 == null ? null : arg0.unwrap());
    }

    public void setDensity(int arg0) {
        real.setDensity(arg0);
    }

}
