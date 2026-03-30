// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class DrawableContainer {
    private final android.graphics.drawable.DrawableContainer real;

    public DrawableContainer(android.graphics.drawable.DrawableContainer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.DrawableContainer wrap(android.graphics.drawable.DrawableContainer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.DrawableContainer(real);
    }

    public android.graphics.drawable.DrawableContainer unwrap() {
        return real;
    }

    public DrawableContainer() {
        this(new android.graphics.drawable.DrawableContainer());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrent() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getCurrent());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHotspotBounds(arg0 == null ? null : arg0.unwrap());
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return real.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return real.getMinimumWidth();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public void jumpToCurrentState() {
        real.jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return real.onLayoutDirectionChanged(arg0);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        real.scheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean selectDrawable(int arg0) {
        return real.selectDrawable(arg0);
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        real.setAutoMirrored(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setEnterFadeDuration(int arg0) {
        real.setEnterFadeDuration(arg0);
    }

    public void setExitFadeDuration(int arg0) {
        real.setExitFadeDuration(arg0);
    }

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final class DrawableContainerState {
        private final android.graphics.drawable.DrawableContainer.DrawableContainerState real;

        public DrawableContainerState(android.graphics.drawable.DrawableContainer.DrawableContainerState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.DrawableContainer.DrawableContainerState wrap(android.graphics.drawable.DrawableContainer.DrawableContainerState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.DrawableContainer.DrawableContainerState(real);
        }

        public android.graphics.drawable.DrawableContainer.DrawableContainerState unwrap() {
            return real;
        }

        public int addChild(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return real.addChild(arg0 == null ? null : arg0.unwrap());
        }

        public boolean canApplyTheme() {
            return real.canApplyTheme();
        }

        public boolean canConstantState() {
            return real.canConstantState();
        }

        public int getChangingConfigurations() {
            return real.getChangingConfigurations();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getChild(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getChild(arg0));
        }

        public int getChildCount() {
            return real.getChildCount();
        }

        public android.graphics.drawable.Drawable[] getChildren() {
            return real.getChildren();
        }

        public int getConstantHeight() {
            return real.getConstantHeight();
        }

        public int getConstantMinimumHeight() {
            return real.getConstantMinimumHeight();
        }

        public int getConstantMinimumWidth() {
            return real.getConstantMinimumWidth();
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect getConstantPadding() {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getConstantPadding());
        }

        public int getConstantWidth() {
            return real.getConstantWidth();
        }

        public int getEnterFadeDuration() {
            return real.getEnterFadeDuration();
        }

        public int getExitFadeDuration() {
            return real.getExitFadeDuration();
        }

        public int getOpacity() {
            return real.getOpacity();
        }

        public void growArray(int arg0, int arg1) {
            real.growArray(arg0, arg1);
        }

        public boolean isConstantSize() {
            return real.isConstantSize();
        }

        public boolean isStateful() {
            return real.isStateful();
        }

        public void setConstantSize(boolean arg0) {
            real.setConstantSize(arg0);
        }

        public void setEnterFadeDuration(int arg0) {
            real.setEnterFadeDuration(arg0);
        }

        public void setExitFadeDuration(int arg0) {
            real.setExitFadeDuration(arg0);
        }

        public void setVariablePadding(boolean arg0) {
            real.setVariablePadding(arg0);
        }

    }
}
