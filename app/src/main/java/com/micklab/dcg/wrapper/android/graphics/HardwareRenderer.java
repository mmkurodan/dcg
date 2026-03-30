// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class HardwareRenderer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HardwareRenderer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.HardwareRenderer wrap(android.graphics.HardwareRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareRenderer(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.HardwareRenderer getReal() {
        return (android.graphics.HardwareRenderer) real;
    }

    public android.graphics.HardwareRenderer unwrap() {
        return getReal();
    }

    public HardwareRenderer() {
        this(new android.graphics.HardwareRenderer(), (__DcgwBridgeToken) null);
    }

    public void clearContent() {
        ((android.graphics.HardwareRenderer) real).clearContent();
    }

    public android.graphics.HardwareRenderer.FrameRenderRequest createRenderRequest() {
        return ((android.graphics.HardwareRenderer) real).createRenderRequest();
    }

    public void destroy() {
        ((android.graphics.HardwareRenderer) real).destroy();
    }

    public static boolean isDrawingEnabled() {
        return android.graphics.HardwareRenderer.isDrawingEnabled();
    }

    public boolean isOpaque() {
        return ((android.graphics.HardwareRenderer) real).isOpaque();
    }

    public void notifyFramePending() {
        ((android.graphics.HardwareRenderer) real).notifyFramePending();
    }

    public void setContentRoot(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        ((android.graphics.HardwareRenderer) real).setContentRoot(arg0 == null ? null : arg0.getReal());
    }

    public static void setDrawingEnabled(boolean arg0) {
        android.graphics.HardwareRenderer.setDrawingEnabled(arg0);
    }

    public void setLightSourceAlpha(float arg0, float arg1) {
        ((android.graphics.HardwareRenderer) real).setLightSourceAlpha(arg0, arg1);
    }

    public void setLightSourceGeometry(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.HardwareRenderer) real).setLightSourceGeometry(arg0, arg1, arg2, arg3);
    }

    public void setName(java.lang.String arg0) {
        ((android.graphics.HardwareRenderer) real).setName(arg0);
    }

    public void setOpaque(boolean arg0) {
        ((android.graphics.HardwareRenderer) real).setOpaque(arg0);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.graphics.HardwareRenderer) real).setSurface(arg0 == null ? null : arg0.getReal());
    }

    public void start() {
        ((android.graphics.HardwareRenderer) real).start();
    }

    public void stop() {
        ((android.graphics.HardwareRenderer) real).stop();
    }

    public static final int SYNC_CONTEXT_IS_STOPPED = android.graphics.HardwareRenderer.SYNC_CONTEXT_IS_STOPPED;
    public static final int SYNC_FRAME_DROPPED = android.graphics.HardwareRenderer.SYNC_FRAME_DROPPED;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = android.graphics.HardwareRenderer.SYNC_LOST_SURFACE_REWARD_IF_FOUND;
    public static final int SYNC_OK = android.graphics.HardwareRenderer.SYNC_OK;
    public static final int SYNC_REDRAW_REQUESTED = android.graphics.HardwareRenderer.SYNC_REDRAW_REQUESTED;

}
