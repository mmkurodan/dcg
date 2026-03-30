// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceView wrap(android.view.SurfaceView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceView(real, (__DcgwBridgeToken) null);
    }

    public android.view.SurfaceView getReal() {
        return (android.view.SurfaceView) real;
    }

    public android.view.SurfaceView unwrap() {
        return getReal();
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public SurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.SurfaceView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void applyTransactionToFrame(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        ((android.view.SurfaceView) real).applyTransactionToFrame(arg0 == null ? null : arg0.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.SurfaceView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.view.SurfaceView) real).gatherTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceHolder getHolder() {
        return com.micklab.dcg.wrapper.android.view.SurfaceHolder.wrap(((android.view.SurfaceView) real).getHolder());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getHostToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.view.SurfaceView) real).getHostToken());
    }

    public int getImportantForAccessibility() {
        return ((android.view.SurfaceView) real).getImportantForAccessibility();
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(((android.view.SurfaceView) real).getSurfaceControl());
    }

    public boolean hasOverlappingRendering() {
        return ((android.view.SurfaceView) real).hasOverlappingRendering();
    }

    public void setAlpha(float arg0) {
        ((android.view.SurfaceView) real).setAlpha(arg0);
    }

    public void setChildSurfacePackage(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0) {
        ((android.view.SurfaceView) real).setChildSurfacePackage(arg0 == null ? null : arg0.getReal());
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.SurfaceView) real).setClipBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setDesiredHdrHeadroom(float arg0) {
        ((android.view.SurfaceView) real).setDesiredHdrHeadroom(arg0);
    }

    public void setSecure(boolean arg0) {
        ((android.view.SurfaceView) real).setSecure(arg0);
    }

    public void setSurfaceLifecycle(int arg0) {
        ((android.view.SurfaceView) real).setSurfaceLifecycle(arg0);
    }

    public void setVisibility(int arg0) {
        ((android.view.SurfaceView) real).setVisibility(arg0);
    }

    public void setZOrderMediaOverlay(boolean arg0) {
        ((android.view.SurfaceView) real).setZOrderMediaOverlay(arg0);
    }

    public void setZOrderOnTop(boolean arg0) {
        ((android.view.SurfaceView) real).setZOrderOnTop(arg0);
    }

    public static final int SURFACE_LIFECYCLE_DEFAULT = android.view.SurfaceView.SURFACE_LIFECYCLE_DEFAULT;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT = android.view.SurfaceView.SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY = android.view.SurfaceView.SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY;

}
