// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RenderEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect wrap(android.graphics.RenderEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RenderEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RenderEffect getReal() {
        return (android.graphics.RenderEffect) real;
    }

    public android.graphics.RenderEffect unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createBitmapEffect(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createBitmapEffect(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createBitmapEffect(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createBitmapEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createBlendModeEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0, com.micklab.dcg.wrapper.android.graphics.RenderEffect arg1, com.micklab.dcg.wrapper.android.graphics.BlendMode arg2) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createBlendModeEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createBlurEffect(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg2) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createBlurEffect(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createBlurEffect(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.RenderEffect arg2, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg3) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createBlurEffect(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createChainEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0, com.micklab.dcg.wrapper.android.graphics.RenderEffect arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createChainEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createColorFilterEffect(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createColorFilterEffect(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createColorFilterEffect(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0, com.micklab.dcg.wrapper.android.graphics.RenderEffect arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createColorFilterEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createOffsetEffect(float arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createOffsetEffect(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createOffsetEffect(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.RenderEffect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createOffsetEffect(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createRuntimeShaderEffect(com.micklab.dcg.wrapper.android.graphics.RuntimeShader arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createRuntimeShaderEffect(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderEffect createShaderEffect(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        return com.micklab.dcg.wrapper.android.graphics.RenderEffect.wrap(android.graphics.RenderEffect.createShaderEffect(arg0 == null ? null : arg0.getReal()));
    }

}
