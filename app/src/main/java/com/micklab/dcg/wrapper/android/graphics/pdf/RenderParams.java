// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class RenderParams {
    private final android.graphics.pdf.RenderParams real;

    public RenderParams(android.graphics.pdf.RenderParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams wrap(android.graphics.pdf.RenderParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams(real);
    }

    public android.graphics.pdf.RenderParams unwrap() {
        return real;
    }

    public int getRenderFlags() {
        return real.getRenderFlags();
    }

    public int getRenderMode() {
        return real.getRenderMode();
    }

    public static final int FLAG_RENDER_HIGHLIGHT_ANNOTATIONS = android.graphics.pdf.RenderParams.FLAG_RENDER_HIGHLIGHT_ANNOTATIONS;
    public static final int FLAG_RENDER_TEXT_ANNOTATIONS = android.graphics.pdf.RenderParams.FLAG_RENDER_TEXT_ANNOTATIONS;
    public static final int RENDER_MODE_FOR_DISPLAY = android.graphics.pdf.RenderParams.RENDER_MODE_FOR_DISPLAY;
    public static final int RENDER_MODE_FOR_PRINT = android.graphics.pdf.RenderParams.RENDER_MODE_FOR_PRINT;

    public static final class Builder {
        private final android.graphics.pdf.RenderParams.Builder real;

        public Builder(android.graphics.pdf.RenderParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder wrap(android.graphics.pdf.RenderParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder(real);
        }

        public android.graphics.pdf.RenderParams.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.graphics.pdf.RenderParams.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder setRenderFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder.wrap(real.setRenderFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder setRenderFlags(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams.Builder.wrap(real.setRenderFlags(arg0, arg1));
        }

    }
}
