// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RenderNode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderNode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderNode wrap(android.graphics.RenderNode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RenderNode(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RenderNode getReal() {
        return (android.graphics.RenderNode) real;
    }

    public android.graphics.RenderNode unwrap() {
        return getReal();
    }

    public RenderNode(java.lang.String arg0) {
        this(new android.graphics.RenderNode(arg0), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.RecordingCanvas beginRecording() {
        return com.micklab.dcg.wrapper.android.graphics.RecordingCanvas.wrap(((android.graphics.RenderNode) real).beginRecording());
    }

    public com.micklab.dcg.wrapper.android.graphics.RecordingCanvas beginRecording(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RecordingCanvas.wrap(((android.graphics.RenderNode) real).beginRecording(arg0, arg1));
    }

    public long computeApproximateMemoryUsage() {
        return ((android.graphics.RenderNode) real).computeApproximateMemoryUsage();
    }

    public void discardDisplayList() {
        ((android.graphics.RenderNode) real).discardDisplayList();
    }

    public void endRecording() {
        ((android.graphics.RenderNode) real).endRecording();
    }

    public float getAlpha() {
        return ((android.graphics.RenderNode) real).getAlpha();
    }

    public int getAmbientShadowColor() {
        return ((android.graphics.RenderNode) real).getAmbientShadowColor();
    }

    public int getBottom() {
        return ((android.graphics.RenderNode) real).getBottom();
    }

    public float getCameraDistance() {
        return ((android.graphics.RenderNode) real).getCameraDistance();
    }

    public boolean getClipToBounds() {
        return ((android.graphics.RenderNode) real).getClipToBounds();
    }

    public boolean getClipToOutline() {
        return ((android.graphics.RenderNode) real).getClipToOutline();
    }

    public float getElevation() {
        return ((android.graphics.RenderNode) real).getElevation();
    }

    public int getHeight() {
        return ((android.graphics.RenderNode) real).getHeight();
    }

    public void getInverseMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.RenderNode) real).getInverseMatrix(arg0 == null ? null : arg0.getReal());
    }

    public int getLeft() {
        return ((android.graphics.RenderNode) real).getLeft();
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.RenderNode) real).getMatrix(arg0 == null ? null : arg0.getReal());
    }

    public float getPivotX() {
        return ((android.graphics.RenderNode) real).getPivotX();
    }

    public float getPivotY() {
        return ((android.graphics.RenderNode) real).getPivotY();
    }

    public int getRight() {
        return ((android.graphics.RenderNode) real).getRight();
    }

    public float getRotationX() {
        return ((android.graphics.RenderNode) real).getRotationX();
    }

    public float getRotationY() {
        return ((android.graphics.RenderNode) real).getRotationY();
    }

    public float getRotationZ() {
        return ((android.graphics.RenderNode) real).getRotationZ();
    }

    public float getScaleX() {
        return ((android.graphics.RenderNode) real).getScaleX();
    }

    public float getScaleY() {
        return ((android.graphics.RenderNode) real).getScaleY();
    }

    public int getSpotShadowColor() {
        return ((android.graphics.RenderNode) real).getSpotShadowColor();
    }

    public int getTop() {
        return ((android.graphics.RenderNode) real).getTop();
    }

    public float getTranslationX() {
        return ((android.graphics.RenderNode) real).getTranslationX();
    }

    public float getTranslationY() {
        return ((android.graphics.RenderNode) real).getTranslationY();
    }

    public float getTranslationZ() {
        return ((android.graphics.RenderNode) real).getTranslationZ();
    }

    public long getUniqueId() {
        return ((android.graphics.RenderNode) real).getUniqueId();
    }

    public boolean getUseCompositingLayer() {
        return ((android.graphics.RenderNode) real).getUseCompositingLayer();
    }

    public int getWidth() {
        return ((android.graphics.RenderNode) real).getWidth();
    }

    public boolean hasDisplayList() {
        return ((android.graphics.RenderNode) real).hasDisplayList();
    }

    public boolean hasIdentityMatrix() {
        return ((android.graphics.RenderNode) real).hasIdentityMatrix();
    }

    public boolean hasOverlappingRendering() {
        return ((android.graphics.RenderNode) real).hasOverlappingRendering();
    }

    public boolean hasShadow() {
        return ((android.graphics.RenderNode) real).hasShadow();
    }

    public boolean isForceDarkAllowed() {
        return ((android.graphics.RenderNode) real).isForceDarkAllowed();
    }

    public boolean isPivotExplicitlySet() {
        return ((android.graphics.RenderNode) real).isPivotExplicitlySet();
    }

    public boolean offsetLeftAndRight(int arg0) {
        return ((android.graphics.RenderNode) real).offsetLeftAndRight(arg0);
    }

    public boolean offsetTopAndBottom(int arg0) {
        return ((android.graphics.RenderNode) real).offsetTopAndBottom(arg0);
    }

    public boolean resetPivot() {
        return ((android.graphics.RenderNode) real).resetPivot();
    }

    public boolean setAlpha(float arg0) {
        return ((android.graphics.RenderNode) real).setAlpha(arg0);
    }

    public boolean setAmbientShadowColor(int arg0) {
        return ((android.graphics.RenderNode) real).setAmbientShadowColor(arg0);
    }

    public boolean setCameraDistance(float arg0) {
        return ((android.graphics.RenderNode) real).setCameraDistance(arg0);
    }

    public boolean setClipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.RenderNode) real).setClipRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean setClipToBounds(boolean arg0) {
        return ((android.graphics.RenderNode) real).setClipToBounds(arg0);
    }

    public boolean setClipToOutline(boolean arg0) {
        return ((android.graphics.RenderNode) real).setClipToOutline(arg0);
    }

    public boolean setElevation(float arg0) {
        return ((android.graphics.RenderNode) real).setElevation(arg0);
    }

    public boolean setForceDarkAllowed(boolean arg0) {
        return ((android.graphics.RenderNode) real).setForceDarkAllowed(arg0);
    }

    public boolean setHasOverlappingRendering(boolean arg0) {
        return ((android.graphics.RenderNode) real).setHasOverlappingRendering(arg0);
    }

    public boolean setOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        return ((android.graphics.RenderNode) real).setOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPivotX(float arg0) {
        return ((android.graphics.RenderNode) real).setPivotX(arg0);
    }

    public boolean setPivotY(float arg0) {
        return ((android.graphics.RenderNode) real).setPivotY(arg0);
    }

    public boolean setPosition(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.RenderNode) real).setPosition(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPosition(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.RenderNode) real).setPosition(arg0, arg1, arg2, arg3);
    }

    public boolean setProjectBackwards(boolean arg0) {
        return ((android.graphics.RenderNode) real).setProjectBackwards(arg0);
    }

    public boolean setProjectionReceiver(boolean arg0) {
        return ((android.graphics.RenderNode) real).setProjectionReceiver(arg0);
    }

    public boolean setRenderEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0) {
        return ((android.graphics.RenderNode) real).setRenderEffect(arg0 == null ? null : arg0.getReal());
    }

    public boolean setRotationX(float arg0) {
        return ((android.graphics.RenderNode) real).setRotationX(arg0);
    }

    public boolean setRotationY(float arg0) {
        return ((android.graphics.RenderNode) real).setRotationY(arg0);
    }

    public boolean setRotationZ(float arg0) {
        return ((android.graphics.RenderNode) real).setRotationZ(arg0);
    }

    public boolean setScaleX(float arg0) {
        return ((android.graphics.RenderNode) real).setScaleX(arg0);
    }

    public boolean setScaleY(float arg0) {
        return ((android.graphics.RenderNode) real).setScaleY(arg0);
    }

    public boolean setSpotShadowColor(int arg0) {
        return ((android.graphics.RenderNode) real).setSpotShadowColor(arg0);
    }

    public boolean setTranslationX(float arg0) {
        return ((android.graphics.RenderNode) real).setTranslationX(arg0);
    }

    public boolean setTranslationY(float arg0) {
        return ((android.graphics.RenderNode) real).setTranslationY(arg0);
    }

    public boolean setTranslationZ(float arg0) {
        return ((android.graphics.RenderNode) real).setTranslationZ(arg0);
    }

    public boolean setUseCompositingLayer(boolean arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        return ((android.graphics.RenderNode) real).setUseCompositingLayer(arg0, arg1 == null ? null : arg1.getReal());
    }

}
