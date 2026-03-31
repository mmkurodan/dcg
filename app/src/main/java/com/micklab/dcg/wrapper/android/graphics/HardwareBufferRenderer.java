// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class HardwareBufferRenderer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HardwareBufferRenderer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer wrap(android.graphics.HardwareBufferRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.HardwareBufferRenderer getReal() {
        return (android.graphics.HardwareBufferRenderer) real;
    }

    public android.graphics.HardwareBufferRenderer unwrap() {
        return getReal();
    }

    public HardwareBufferRenderer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0) {
        this(new android.graphics.HardwareBufferRenderer(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.graphics.HardwareBufferRenderer) real).close();
    }

    public boolean isClosed() {
        return ((android.graphics.HardwareBufferRenderer) real).isClosed();
    }

    public com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest obtainRenderRequest() {
        return com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest.wrap(((android.graphics.HardwareBufferRenderer) real).obtainRenderRequest());
    }

    public void setContentRoot(com.micklab.dcg.wrapper.android.graphics.RenderNode arg0) {
        ((android.graphics.HardwareBufferRenderer) real).setContentRoot(arg0 == null ? null : arg0.getReal());
    }

    public void setLightSourceAlpha(float arg0, float arg1) {
        ((android.graphics.HardwareBufferRenderer) real).setLightSourceAlpha(arg0, arg1);
    }

    public void setLightSourceGeometry(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.HardwareBufferRenderer) real).setLightSourceGeometry(arg0, arg1, arg2, arg3);
    }

    public static final class RenderRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RenderRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest wrap(android.graphics.HardwareBufferRenderer.RenderRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.HardwareBufferRenderer.RenderRequest getReal() {
            return (android.graphics.HardwareBufferRenderer.RenderRequest) real;
        }

        public android.graphics.HardwareBufferRenderer.RenderRequest unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest setBufferTransform(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest.wrap(((android.graphics.HardwareBufferRenderer.RenderRequest) real).setBufferTransform(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
            return com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderRequest.wrap(((android.graphics.HardwareBufferRenderer.RenderRequest) real).setColorSpace(arg0 == null ? null : arg0.getReal()));
        }


    }
    public static final class RenderResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RenderResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderResult wrap(android.graphics.HardwareBufferRenderer.RenderResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.HardwareBufferRenderer.RenderResult(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.HardwareBufferRenderer.RenderResult getReal() {
            return (android.graphics.HardwareBufferRenderer.RenderResult) real;
        }

        public android.graphics.HardwareBufferRenderer.RenderResult unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.hardware.SyncFence getFence() {
            return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(((android.graphics.HardwareBufferRenderer.RenderResult) real).getFence());
        }

        public int getStatus() {
            return ((android.graphics.HardwareBufferRenderer.RenderResult) real).getStatus();
        }

        public static final int ERROR_UNKNOWN = android.graphics.HardwareBufferRenderer.RenderResult.ERROR_UNKNOWN;
        public static final int SUCCESS = android.graphics.HardwareBufferRenderer.RenderResult.SUCCESS;

    }
}
