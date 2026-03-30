// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class TextureView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextureView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.TextureView wrap(android.view.TextureView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.TextureView(real, (__DcgwBridgeToken) null);
    }

    public android.view.TextureView getReal() {
        return (android.view.TextureView) real;
    }

    public android.view.TextureView unwrap() {
        return getReal();
    }

    public TextureView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.TextureView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextureView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.TextureView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TextureView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.TextureView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TextureView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.TextureView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void buildLayer() {
        ((android.view.TextureView) real).buildLayer();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.TextureView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.TextureView) real).getBitmap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.TextureView) real).getBitmap(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.TextureView) real).getBitmap(arg0, arg1));
    }

    public int getLayerType() {
        return ((android.view.TextureView) real).getLayerType();
    }

    public com.micklab.dcg.wrapper.android.graphics.SurfaceTexture getSurfaceTexture() {
        return com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.wrap(((android.view.TextureView) real).getSurfaceTexture());
    }

    public com.micklab.dcg.wrapper.android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return com.micklab.dcg.wrapper.android.view.TextureView.SurfaceTextureListener.wrap(((android.view.TextureView) real).getSurfaceTextureListener());
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getTransform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.view.TextureView) real).getTransform(arg0 == null ? null : arg0.getReal()));
    }

    public boolean isAvailable() {
        return ((android.view.TextureView) real).isAvailable();
    }

    public boolean isOpaque() {
        return ((android.view.TextureView) real).isOpaque();
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.TextureView) real).lockCanvas());
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.TextureView) real).lockCanvas(arg0 == null ? null : arg0.getReal()));
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.TextureView) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setForeground(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.TextureView) real).setForeground(arg0 == null ? null : arg0.getReal());
    }

    public void setLayerPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        ((android.view.TextureView) real).setLayerPaint(arg0 == null ? null : arg0.getReal());
    }

    public void setLayerType(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.view.TextureView) real).setLayerType(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOpaque(boolean arg0) {
        ((android.view.TextureView) real).setOpaque(arg0);
    }

    public void setSurfaceTexture(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
        ((android.view.TextureView) real).setSurfaceTexture(arg0 == null ? null : arg0.getReal());
    }

    public void setSurfaceTextureListener(com.micklab.dcg.wrapper.android.view.TextureView.SurfaceTextureListener arg0) {
        ((android.view.TextureView) real).setSurfaceTextureListener(arg0 == null ? null : arg0.getReal());
    }

    public void setTransform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.TextureView) real).setTransform(arg0 == null ? null : arg0.getReal());
    }

    public void unlockCanvasAndPost(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.TextureView) real).unlockCanvasAndPost(arg0 == null ? null : arg0.getReal());
    }

    public static final class SurfaceTextureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SurfaceTextureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.TextureView.SurfaceTextureListener wrap(android.view.TextureView.SurfaceTextureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.TextureView.SurfaceTextureListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.TextureView.SurfaceTextureListener getReal() {
            return (android.view.TextureView.SurfaceTextureListener) real;
        }

        public android.view.TextureView.SurfaceTextureListener unwrap() {
            return getReal();
        }

        public void onSurfaceTextureAvailable(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0, int arg1, int arg2) {
            ((android.view.TextureView.SurfaceTextureListener) real).onSurfaceTextureAvailable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public boolean onSurfaceTextureDestroyed(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
            return ((android.view.TextureView.SurfaceTextureListener) real).onSurfaceTextureDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onSurfaceTextureSizeChanged(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0, int arg1, int arg2) {
            ((android.view.TextureView.SurfaceTextureListener) real).onSurfaceTextureSizeChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onSurfaceTextureUpdated(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
            ((android.view.TextureView.SurfaceTextureListener) real).onSurfaceTextureUpdated(arg0 == null ? null : arg0.getReal());
        }

    }
}
