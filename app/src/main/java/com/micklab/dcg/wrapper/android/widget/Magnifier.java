// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Magnifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Magnifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Magnifier wrap(android.widget.Magnifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Magnifier(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Magnifier getReal() {
        return (android.widget.Magnifier) real;
    }

    public android.widget.Magnifier unwrap() {
        return getReal();
    }

    public Magnifier(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.Magnifier(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void dismiss() {
        ((android.widget.Magnifier) real).dismiss();
    }

    public float getCornerRadius() {
        return ((android.widget.Magnifier) real).getCornerRadius();
    }

    public int getDefaultHorizontalSourceToMagnifierOffset() {
        return ((android.widget.Magnifier) real).getDefaultHorizontalSourceToMagnifierOffset();
    }

    public int getDefaultVerticalSourceToMagnifierOffset() {
        return ((android.widget.Magnifier) real).getDefaultVerticalSourceToMagnifierOffset();
    }

    public float getElevation() {
        return ((android.widget.Magnifier) real).getElevation();
    }

    public int getHeight() {
        return ((android.widget.Magnifier) real).getHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverlay() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.Magnifier) real).getOverlay());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.widget.Magnifier) real).getPosition());
    }

    public int getSourceHeight() {
        return ((android.widget.Magnifier) real).getSourceHeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getSourcePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.widget.Magnifier) real).getSourcePosition());
    }

    public int getSourceWidth() {
        return ((android.widget.Magnifier) real).getSourceWidth();
    }

    public int getWidth() {
        return ((android.widget.Magnifier) real).getWidth();
    }

    public float getZoom() {
        return ((android.widget.Magnifier) real).getZoom();
    }

    public boolean isClippingEnabled() {
        return ((android.widget.Magnifier) real).isClippingEnabled();
    }

    public void setZoom(float arg0) {
        ((android.widget.Magnifier) real).setZoom(arg0);
    }

    public void show(float arg0, float arg1) {
        ((android.widget.Magnifier) real).show(arg0, arg1);
    }

    public void show(float arg0, float arg1, float arg2, float arg3) {
        ((android.widget.Magnifier) real).show(arg0, arg1, arg2, arg3);
    }

    public void update() {
        ((android.widget.Magnifier) real).update();
    }

    public static final int SOURCE_BOUND_MAX_IN_SURFACE = android.widget.Magnifier.SOURCE_BOUND_MAX_IN_SURFACE;
    public static final int SOURCE_BOUND_MAX_VISIBLE = android.widget.Magnifier.SOURCE_BOUND_MAX_VISIBLE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Magnifier.Builder wrap(android.widget.Magnifier.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Magnifier.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Magnifier.Builder getReal() {
            return (android.widget.Magnifier.Builder) real;
        }

        public android.widget.Magnifier.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.View arg0) {
            this(new android.widget.Magnifier.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier build() {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.wrap(((android.widget.Magnifier.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setClippingEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setClippingEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setCornerRadius(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setCornerRadius(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setDefaultSourceToMagnifierOffset(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setDefaultSourceToMagnifierOffset(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setElevation(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setElevation(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setInitialZoom(float arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setInitialZoom(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setOverlay(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setOverlay(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setSize(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setSize(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.widget.Magnifier.Builder setSourceBounds(int arg0, int arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.widget.Magnifier.Builder.wrap(((android.widget.Magnifier.Builder) real).setSourceBounds(arg0, arg1, arg2, arg3));
        }

    }
}
