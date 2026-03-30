// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceView {
    private final android.view.SurfaceView real;

    public SurfaceView(android.view.SurfaceView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceView wrap(android.view.SurfaceView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceView(real);
    }

    public android.view.SurfaceView unwrap() {
        return real;
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.unwrap()));
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void applyTransactionToFrame(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        real.applyTransactionToFrame(arg0 == null ? null : arg0.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.gatherTransparentRegion(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceHolder getHolder() {
        return com.micklab.dcg.wrapper.android.view.SurfaceHolder.wrap(real.getHolder());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getHostToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getHostToken());
    }

    public int getImportantForAccessibility() {
        return real.getImportantForAccessibility();
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(real.getSurfaceControl());
    }

    public boolean hasOverlappingRendering() {
        return real.hasOverlappingRendering();
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setChildSurfacePackage(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0) {
        real.setChildSurfacePackage(arg0 == null ? null : arg0.unwrap());
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setClipBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setDesiredHdrHeadroom(float arg0) {
        real.setDesiredHdrHeadroom(arg0);
    }

    public void setSecure(boolean arg0) {
        real.setSecure(arg0);
    }

    public void setSurfaceLifecycle(int arg0) {
        real.setSurfaceLifecycle(arg0);
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public void setZOrderMediaOverlay(boolean arg0) {
        real.setZOrderMediaOverlay(arg0);
    }

    public void setZOrderOnTop(boolean arg0) {
        real.setZOrderOnTop(arg0);
    }

    public static final int SURFACE_LIFECYCLE_DEFAULT = android.view.SurfaceView.SURFACE_LIFECYCLE_DEFAULT;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT = android.view.SurfaceView.SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY = android.view.SurfaceView.SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY;

}
