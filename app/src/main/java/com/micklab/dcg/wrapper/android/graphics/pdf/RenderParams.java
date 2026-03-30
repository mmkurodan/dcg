// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class RenderParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams wrap(android.graphics.pdf.RenderParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.RenderParams getReal() {
        return (android.graphics.pdf.RenderParams) real;
    }

    public android.graphics.pdf.RenderParams unwrap() {
        return getReal();
    }

    public int getRenderFlags() {
        return ((android.graphics.pdf.RenderParams) real).getRenderFlags();
    }

    public int getRenderMode() {
        return ((android.graphics.pdf.RenderParams) real).getRenderMode();
    }

    public static final int FLAG_RENDER_HIGHLIGHT_ANNOTATIONS = android.graphics.pdf.RenderParams.FLAG_RENDER_HIGHLIGHT_ANNOTATIONS;
    public static final int FLAG_RENDER_TEXT_ANNOTATIONS = android.graphics.pdf.RenderParams.FLAG_RENDER_TEXT_ANNOTATIONS;
    public static final int RENDER_MODE_FOR_DISPLAY = android.graphics.pdf.RenderParams.RENDER_MODE_FOR_DISPLAY;
    public static final int RENDER_MODE_FOR_PRINT = android.graphics.pdf.RenderParams.RENDER_MODE_FOR_PRINT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder wrap(android.graphics.pdf.RenderParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.RenderParams.Builder getReal() {
            return (android.graphics.pdf.RenderParams.Builder) real;
        }

        public android.graphics.pdf.RenderParams.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.graphics.pdf.RenderParams.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.wrap(((android.graphics.pdf.RenderParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder setRenderFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder.wrap(((android.graphics.pdf.RenderParams.Builder) real).setRenderFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder setRenderFlags(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder.wrap(((android.graphics.pdf.RenderParams.Builder) real).setRenderFlags(arg0, arg1));
        }

    }
}
