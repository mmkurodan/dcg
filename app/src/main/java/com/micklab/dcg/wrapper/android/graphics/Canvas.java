// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Canvas {
    private final android.graphics.Canvas real;

    public Canvas(android.graphics.Canvas real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Canvas wrap(android.graphics.Canvas real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas(real);
    }

    public android.graphics.Canvas unwrap() {
        return real;
    }

    public Canvas() {
        this(new android.graphics.Canvas());
    }

    public Canvas(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.Canvas(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean clipOutPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return real.clipOutPath(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipOutRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.clipOutRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipOutRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.clipOutRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipOutRect(float arg0, float arg1, float arg2, float arg3) {
        return real.clipOutRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipOutRect(int arg0, int arg1, int arg2, int arg3) {
        return real.clipOutRect(arg0, arg1, arg2, arg3);
    }

    public void clipOutShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        real.clipOutShader(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return real.clipPath(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return real.clipPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.clipRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.clipRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return real.clipRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean clipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return real.clipRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean clipRect(int arg0, int arg1, int arg2, int arg3) {
        return real.clipRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipRect(float arg0, float arg1, float arg2, float arg3) {
        return real.clipRect(arg0, arg1, arg2, arg3);
    }

    public boolean clipRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Region.Op arg4) {
        return real.clipRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void clipShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        real.clipShader(arg0 == null ? null : arg0.unwrap());
    }

    public void concat(com.micklab.dcg.wrapper.android.graphics.Matrix44 arg0) {
        real.concat(arg0 == null ? null : arg0.unwrap());
    }

    public void concat(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.concat(arg0 == null ? null : arg0.unwrap());
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

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.drawBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void drawBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
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

    public void drawColor(long arg0) {
        real.drawColor(arg0);
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        real.drawColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawColor(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        real.drawColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void drawColor(long arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
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

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.drawPatch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void drawPatch(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
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

    public void drawText(java.lang.CharSequence arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        real.drawText(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void drawText(char[] arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
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

    public void drawTextRun(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawTextRun(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawTextRun(char[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, boolean arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.drawTextRun(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public void drawVertices(com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, int[] arg6, int arg7, short[] arg8, int arg9, int arg10, com.micklab.dcg.wrapper.android.graphics.Paint arg11) {
        real.drawVertices(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
    }

    public void enableZ() {
        real.enableZ();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getClipBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getClipBounds());
    }

    public boolean getClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getClipBounds(arg0 == null ? null : arg0.unwrap());
    }

    public int getDensity() {
        return real.getDensity();
    }

    public com.micklab.dcg.wrapper.android.graphics.DrawFilter getDrawFilter() {
        return com.micklab.dcg.wrapper.android.graphics.DrawFilter.wrap(real.getDrawFilter());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getMatrix());
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.getMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public int getMaximumBitmapHeight() {
        return real.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        return real.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        return real.getSaveCount();
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

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg1) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg1) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean quickReject(float arg0, float arg1, float arg2, float arg3) {
        return real.quickReject(arg0, arg1, arg2, arg3);
    }

    public boolean quickReject(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType arg4) {
        return real.quickReject(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void restore() {
        real.restore();
    }

    public void restoreToCount(int arg0) {
        real.restoreToCount(arg0);
    }

    public void rotate(float arg0) {
        real.rotate(arg0);
    }

    public void rotate(float arg0, float arg1, float arg2) {
        real.rotate(arg0, arg1, arg2);
    }

    public int save() {
        return real.save();
    }

    public int saveLayer(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        return real.saveLayer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int saveLayer(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2) {
        return real.saveLayer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int saveLayer(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4) {
        return real.saveLayer(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public int saveLayer(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Paint arg4, int arg5) {
        return real.saveLayer(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public int saveLayerAlpha(com.micklab.dcg.wrapper.android.graphics.RectF arg0, int arg1) {
        return real.saveLayerAlpha(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int saveLayerAlpha(com.micklab.dcg.wrapper.android.graphics.RectF arg0, int arg1, int arg2) {
        return real.saveLayerAlpha(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public int saveLayerAlpha(float arg0, float arg1, float arg2, float arg3, int arg4) {
        return real.saveLayerAlpha(arg0, arg1, arg2, arg3, arg4);
    }

    public int saveLayerAlpha(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        return real.saveLayerAlpha(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void scale(float arg0, float arg1) {
        real.scale(arg0, arg1);
    }

    public void scale(float arg0, float arg1, float arg2, float arg3) {
        real.scale(arg0, arg1, arg2, arg3);
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        real.setBitmap(arg0 == null ? null : arg0.unwrap());
    }

    public void setDensity(int arg0) {
        real.setDensity(arg0);
    }

    public void setDrawFilter(com.micklab.dcg.wrapper.android.graphics.DrawFilter arg0) {
        real.setDrawFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.setMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void skew(float arg0, float arg1) {
        real.skew(arg0, arg1);
    }

    public void translate(float arg0, float arg1) {
        real.translate(arg0, arg1);
    }

    public static final int ALL_SAVE_FLAG = android.graphics.Canvas.ALL_SAVE_FLAG;

    public static final class EdgeType {
        private final android.graphics.Canvas.EdgeType real;

        public EdgeType(android.graphics.Canvas.EdgeType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType wrap(android.graphics.Canvas.EdgeType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas.EdgeType(real);
        }

        public android.graphics.Canvas.EdgeType unwrap() {
            return real;
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
        private final android.graphics.Canvas.VertexMode real;

        public VertexMode(android.graphics.Canvas.VertexMode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode wrap(android.graphics.Canvas.VertexMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Canvas.VertexMode(real);
        }

        public android.graphics.Canvas.VertexMode unwrap() {
            return real;
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
