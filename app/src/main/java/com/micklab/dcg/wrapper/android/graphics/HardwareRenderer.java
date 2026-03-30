// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class HardwareRenderer {
    private final android.graphics.HardwareRenderer real;

    public HardwareRenderer(android.graphics.HardwareRenderer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.HardwareRenderer wrap(android.graphics.HardwareRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareRenderer(real);
    }

    public android.graphics.HardwareRenderer unwrap() {
        return real;
    }

    public HardwareRenderer() {
        this(new android.graphics.HardwareRenderer());
    }

    public void clearContent() {
        real.clearContent();
    }

    public android.graphics.HardwareRenderer.FrameRenderRequest createRenderRequest() {
        return real.createRenderRequest();
    }

    public void destroy() {
        real.destroy();
    }

    public static boolean isDrawingEnabled() {
        return android.graphics.HardwareRenderer.isDrawingEnabled();
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public void notifyFramePending() {
        real.notifyFramePending();
    }

    public void setContentRoot(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        real.setContentRoot(arg0 == null ? null : arg0.unwrap());
    }

    public static void setDrawingEnabled(boolean arg0) {
        android.graphics.HardwareRenderer.setDrawingEnabled(arg0);
    }

    public void setLightSourceAlpha(float arg0, float arg1) {
        real.setLightSourceAlpha(arg0, arg1);
    }

    public void setLightSourceGeometry(float arg0, float arg1, float arg2, float arg3) {
        real.setLightSourceGeometry(arg0, arg1, arg2, arg3);
    }

    public void setName(java.lang.String arg0) {
        real.setName(arg0);
    }

    public void setOpaque(boolean arg0) {
        real.setOpaque(arg0);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

    public static final int SYNC_CONTEXT_IS_STOPPED = android.graphics.HardwareRenderer.SYNC_CONTEXT_IS_STOPPED;
    public static final int SYNC_FRAME_DROPPED = android.graphics.HardwareRenderer.SYNC_FRAME_DROPPED;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = android.graphics.HardwareRenderer.SYNC_LOST_SURFACE_REWARD_IF_FOUND;
    public static final int SYNC_OK = android.graphics.HardwareRenderer.SYNC_OK;
    public static final int SYNC_REDRAW_REQUESTED = android.graphics.HardwareRenderer.SYNC_REDRAW_REQUESTED;

}
