// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class HardwareBufferRenderer {
    private final android.graphics.HardwareBufferRenderer real;

    public HardwareBufferRenderer(android.graphics.HardwareBufferRenderer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer wrap(android.graphics.HardwareBufferRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer(real);
    }

    public android.graphics.HardwareBufferRenderer unwrap() {
        return real;
    }

    public HardwareBufferRenderer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0) {
        this(new android.graphics.HardwareBufferRenderer(arg0 == null ? null : arg0.unwrap()));
    }

    public void close() {
        real.close();
    }

    public boolean isClosed() {
        return real.isClosed();
    }

    public android.graphics.HardwareBufferRenderer.RenderRequest obtainRenderRequest() {
        return real.obtainRenderRequest();
    }

    public void setContentRoot(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        real.setContentRoot(arg0 == null ? null : arg0.unwrap());
    }

    public void setLightSourceAlpha(float arg0, float arg1) {
        real.setLightSourceAlpha(arg0, arg1);
    }

    public void setLightSourceGeometry(float arg0, float arg1, float arg2, float arg3) {
        real.setLightSourceGeometry(arg0, arg1, arg2, arg3);
    }

    public static final class RenderResult {
        private final android.graphics.HardwareBufferRenderer.RenderResult real;

        public RenderResult(android.graphics.HardwareBufferRenderer.RenderResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderResult wrap(android.graphics.HardwareBufferRenderer.RenderResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderResult(real);
        }

        public android.graphics.HardwareBufferRenderer.RenderResult unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.hardware.SyncFence getFence() {
            return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(real.getFence());
        }

        public int getStatus() {
            return real.getStatus();
        }

        public static final int ERROR_UNKNOWN = android.graphics.HardwareBufferRenderer.RenderResult.ERROR_UNKNOWN;
        public static final int SUCCESS = android.graphics.HardwareBufferRenderer.RenderResult.SUCCESS;

    }
}
