// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Magnifier {
    private final android.widget.Magnifier real;

    public Magnifier(android.widget.Magnifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Magnifier wrap(android.widget.Magnifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Magnifier(real);
    }

    public android.widget.Magnifier unwrap() {
        return real;
    }

    public Magnifier(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.Magnifier(arg0 == null ? null : arg0.unwrap()));
    }

    public void dismiss() {
        real.dismiss();
    }

    public float getCornerRadius() {
        return real.getCornerRadius();
    }

    public int getDefaultHorizontalSourceToMagnifierOffset() {
        return real.getDefaultHorizontalSourceToMagnifierOffset();
    }

    public int getDefaultVerticalSourceToMagnifierOffset() {
        return real.getDefaultVerticalSourceToMagnifierOffset();
    }

    public float getElevation() {
        return real.getElevation();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverlay() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getOverlay());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getPosition());
    }

    public int getSourceHeight() {
        return real.getSourceHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getSourcePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getSourcePosition());
    }

    public int getSourceWidth() {
        return real.getSourceWidth();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public float getZoom() {
        return real.getZoom();
    }

    public boolean isClippingEnabled() {
        return real.isClippingEnabled();
    }

    public void setZoom(float arg0) {
        real.setZoom(arg0);
    }

    public void show(float arg0, float arg1) {
        real.show(arg0, arg1);
    }

    public void show(float arg0, float arg1, float arg2, float arg3) {
        real.show(arg0, arg1, arg2, arg3);
    }

    public void update() {
        real.update();
    }

    public static final int SOURCE_BOUND_MAX_IN_SURFACE = android.widget.Magnifier.SOURCE_BOUND_MAX_IN_SURFACE;
    public static final int SOURCE_BOUND_MAX_VISIBLE = android.widget.Magnifier.SOURCE_BOUND_MAX_VISIBLE;

    public static final class Builder {
        private final android.widget.Magnifier.Builder real;

        public Builder(android.widget.Magnifier.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Magnifier.Builder wrap(android.widget.Magnifier.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Magnifier.Builder(real);
        }

        public android.widget.Magnifier.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.View arg0) {
            this(new android.widget.Magnifier.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier build() {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setClippingEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setClippingEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setCornerRadius(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setCornerRadius(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setDefaultSourceToMagnifierOffset(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setDefaultSourceToMagnifierOffset(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setElevation(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setElevation(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setInitialZoom(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setInitialZoom(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setOverlay(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setOverlay(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setSize(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setSize(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setSourceBounds(int arg0, int arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(real.setSourceBounds(arg0, arg1, arg2, arg3));
        }

    }
}
