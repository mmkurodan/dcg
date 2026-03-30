// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ProgressBar {
    private final android.widget.ProgressBar real;

    public ProgressBar(android.widget.ProgressBar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ProgressBar wrap(android.widget.ProgressBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ProgressBar(real);
    }

    public android.widget.ProgressBar unwrap() {
        return real;
    }

    public ProgressBar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ProgressBar(arg0 == null ? null : arg0.unwrap()));
    }

    public ProgressBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ProgressBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ProgressBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ProgressBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ProgressBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ProgressBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrentDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getCurrentDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIndeterminateDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIndeterminateDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getIndeterminateTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getIndeterminateTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getIndeterminateTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getIndeterminateTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getIndeterminateTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getIndeterminateTintMode());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(real.getInterpolator());
    }

    public int getMax() {
        return real.getMax();
    }

    public int getMaxHeight() {
        return real.getMaxHeight();
    }

    public int getMaxWidth() {
        return real.getMaxWidth();
    }

    public int getMin() {
        return real.getMin();
    }

    public int getMinHeight() {
        return real.getMinHeight();
    }

    public int getMinWidth() {
        return real.getMinWidth();
    }

    public int getProgress() {
        return real.getProgress();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getProgressBackgroundTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getProgressBackgroundTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getProgressBackgroundTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getProgressBackgroundTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getProgressBackgroundTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getProgressBackgroundTintMode());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getProgressDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getProgressDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getProgressTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getProgressTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getProgressTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getProgressTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getProgressTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getProgressTintMode());
    }

    public int getSecondaryProgress() {
        return real.getSecondaryProgress();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getSecondaryProgressTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getSecondaryProgressTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getSecondaryProgressTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getSecondaryProgressTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getSecondaryProgressTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getSecondaryProgressTintMode());
    }

    public void incrementProgressBy(int arg0) {
        real.incrementProgressBy(arg0);
    }

    public void incrementSecondaryProgressBy(int arg0) {
        real.incrementSecondaryProgressBy(arg0);
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAnimating() {
        return real.isAnimating();
    }

    public boolean isIndeterminate() {
        return real.isIndeterminate();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public void onVisibilityAggregated(boolean arg0) {
        real.onVisibilityAggregated(arg0);
    }

    public void postInvalidate() {
        real.postInvalidate();
    }

    public void setIndeterminate(boolean arg0) {
        real.setIndeterminate(arg0);
    }

    public void setIndeterminateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIndeterminateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndeterminateDrawableTiled(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIndeterminateDrawableTiled(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndeterminateTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setIndeterminateTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndeterminateTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setIndeterminateTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndeterminateTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setIndeterminateTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.view.animation.Interpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setMax(int arg0) {
        real.setMax(arg0);
    }

    public void setMaxHeight(int arg0) {
        real.setMaxHeight(arg0);
    }

    public void setMaxWidth(int arg0) {
        real.setMaxWidth(arg0);
    }

    public void setMin(int arg0) {
        real.setMin(arg0);
    }

    public void setMinHeight(int arg0) {
        real.setMinHeight(arg0);
    }

    public void setMinWidth(int arg0) {
        real.setMinWidth(arg0);
    }

    public void setProgress(int arg0) {
        real.setProgress(arg0);
    }

    public void setProgress(int arg0, boolean arg1) {
        real.setProgress(arg0, arg1);
    }

    public void setProgressBackgroundTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setProgressBackgroundTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressBackgroundTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setProgressBackgroundTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressBackgroundTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setProgressBackgroundTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setProgressDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressDrawableTiled(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setProgressDrawableTiled(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setProgressTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setProgressTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setProgressTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondaryProgress(int arg0) {
        real.setSecondaryProgress(arg0);
    }

    public void setSecondaryProgressTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setSecondaryProgressTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondaryProgressTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setSecondaryProgressTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondaryProgressTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setSecondaryProgressTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        real.setStateDescription(arg0);
    }

}
