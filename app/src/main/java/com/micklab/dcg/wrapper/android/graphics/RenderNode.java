// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RenderNode {
    private final android.graphics.RenderNode real;

    public RenderNode(android.graphics.RenderNode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RenderNode wrap(android.graphics.RenderNode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RenderNode(real);
    }

    public android.graphics.RenderNode unwrap() {
        return real;
    }

    public RenderNode(java.lang.String arg0) {
        this(new android.graphics.RenderNode(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.RecordingCanvas beginRecording() {
        return com.micklab.dcg.wrapper.android.graphics.RecordingCanvas.wrap(real.beginRecording());
    }

    public com.micklab.dcg.wrapper.android.graphics.RecordingCanvas beginRecording(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.RecordingCanvas.wrap(real.beginRecording(arg0, arg1));
    }

    public long computeApproximateMemoryUsage() {
        return real.computeApproximateMemoryUsage();
    }

    public void discardDisplayList() {
        real.discardDisplayList();
    }

    public void endRecording() {
        real.endRecording();
    }

    public float getAlpha() {
        return real.getAlpha();
    }

    public int getAmbientShadowColor() {
        return real.getAmbientShadowColor();
    }

    public int getBottom() {
        return real.getBottom();
    }

    public float getCameraDistance() {
        return real.getCameraDistance();
    }

    public boolean getClipToBounds() {
        return real.getClipToBounds();
    }

    public boolean getClipToOutline() {
        return real.getClipToOutline();
    }

    public float getElevation() {
        return real.getElevation();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public void getInverseMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.getInverseMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public int getLeft() {
        return real.getLeft();
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.getMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public float getPivotX() {
        return real.getPivotX();
    }

    public float getPivotY() {
        return real.getPivotY();
    }

    public int getRight() {
        return real.getRight();
    }

    public float getRotationX() {
        return real.getRotationX();
    }

    public float getRotationY() {
        return real.getRotationY();
    }

    public float getRotationZ() {
        return real.getRotationZ();
    }

    public float getScaleX() {
        return real.getScaleX();
    }

    public float getScaleY() {
        return real.getScaleY();
    }

    public int getSpotShadowColor() {
        return real.getSpotShadowColor();
    }

    public int getTop() {
        return real.getTop();
    }

    public float getTranslationX() {
        return real.getTranslationX();
    }

    public float getTranslationY() {
        return real.getTranslationY();
    }

    public float getTranslationZ() {
        return real.getTranslationZ();
    }

    public long getUniqueId() {
        return real.getUniqueId();
    }

    public boolean getUseCompositingLayer() {
        return real.getUseCompositingLayer();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean hasDisplayList() {
        return real.hasDisplayList();
    }

    public boolean hasIdentityMatrix() {
        return real.hasIdentityMatrix();
    }

    public boolean hasOverlappingRendering() {
        return real.hasOverlappingRendering();
    }

    public boolean hasShadow() {
        return real.hasShadow();
    }

    public boolean isForceDarkAllowed() {
        return real.isForceDarkAllowed();
    }

    public boolean isPivotExplicitlySet() {
        return real.isPivotExplicitlySet();
    }

    public boolean offsetLeftAndRight(int arg0) {
        return real.offsetLeftAndRight(arg0);
    }

    public boolean offsetTopAndBottom(int arg0) {
        return real.offsetTopAndBottom(arg0);
    }

    public boolean resetPivot() {
        return real.resetPivot();
    }

    public boolean setAlpha(float arg0) {
        return real.setAlpha(arg0);
    }

    public boolean setAmbientShadowColor(int arg0) {
        return real.setAmbientShadowColor(arg0);
    }

    public boolean setCameraDistance(float arg0) {
        return real.setCameraDistance(arg0);
    }

    public boolean setClipRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.setClipRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setClipToBounds(boolean arg0) {
        return real.setClipToBounds(arg0);
    }

    public boolean setClipToOutline(boolean arg0) {
        return real.setClipToOutline(arg0);
    }

    public boolean setElevation(float arg0) {
        return real.setElevation(arg0);
    }

    public boolean setForceDarkAllowed(boolean arg0) {
        return real.setForceDarkAllowed(arg0);
    }

    public boolean setHasOverlappingRendering(boolean arg0) {
        return real.setHasOverlappingRendering(arg0);
    }

    public boolean setOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        return real.setOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setPivotX(float arg0) {
        return real.setPivotX(arg0);
    }

    public boolean setPivotY(float arg0) {
        return real.setPivotY(arg0);
    }

    public boolean setPosition(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.setPosition(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setPosition(int arg0, int arg1, int arg2, int arg3) {
        return real.setPosition(arg0, arg1, arg2, arg3);
    }

    public boolean setProjectBackwards(boolean arg0) {
        return real.setProjectBackwards(arg0);
    }

    public boolean setProjectionReceiver(boolean arg0) {
        return real.setProjectionReceiver(arg0);
    }

    public boolean setRenderEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0) {
        return real.setRenderEffect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setRotationX(float arg0) {
        return real.setRotationX(arg0);
    }

    public boolean setRotationY(float arg0) {
        return real.setRotationY(arg0);
    }

    public boolean setRotationZ(float arg0) {
        return real.setRotationZ(arg0);
    }

    public boolean setScaleX(float arg0) {
        return real.setScaleX(arg0);
    }

    public boolean setScaleY(float arg0) {
        return real.setScaleY(arg0);
    }

    public boolean setSpotShadowColor(int arg0) {
        return real.setSpotShadowColor(arg0);
    }

    public boolean setTranslationX(float arg0) {
        return real.setTranslationX(arg0);
    }

    public boolean setTranslationY(float arg0) {
        return real.setTranslationY(arg0);
    }

    public boolean setTranslationZ(float arg0) {
        return real.setTranslationZ(arg0);
    }

    public boolean setUseCompositingLayer(boolean arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        return real.setUseCompositingLayer(arg0, arg1 == null ? null : arg1.unwrap());
    }

}
