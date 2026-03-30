// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DisplayCutout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayCutout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DisplayCutout wrap(android.view.DisplayCutout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayCutout(real, (__DcgwBridgeToken) null);
    }

    public android.view.DisplayCutout getReal() {
        return (android.view.DisplayCutout) real;
    }

    public android.view.DisplayCutout unwrap() {
        return getReal();
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Rect arg0, java.util.List arg1) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4, com.micklab.dcg.wrapper.android.graphics.Insets arg5) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.DisplayCutout) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectBottom() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.DisplayCutout) real).getBoundingRectBottom());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectLeft() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.DisplayCutout) real).getBoundingRectLeft());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectRight() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.DisplayCutout) real).getBoundingRectRight());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectTop() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.DisplayCutout) real).getBoundingRectTop());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getCutoutPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.view.DisplayCutout) real).getCutoutPath());
    }

    public int getSafeInsetBottom() {
        return ((android.view.DisplayCutout) real).getSafeInsetBottom();
    }

    public int getSafeInsetLeft() {
        return ((android.view.DisplayCutout) real).getSafeInsetLeft();
    }

    public int getSafeInsetRight() {
        return ((android.view.DisplayCutout) real).getSafeInsetRight();
    }

    public int getSafeInsetTop() {
        return ((android.view.DisplayCutout) real).getSafeInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getWaterfallInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.DisplayCutout) real).getWaterfallInsets());
    }

    public int hashCode() {
        return ((android.view.DisplayCutout) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.DisplayCutout) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder wrap(android.view.DisplayCutout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.DisplayCutout.Builder getReal() {
            return (android.view.DisplayCutout.Builder) real;
        }

        public android.view.DisplayCutout.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.DisplayCutout.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout build() {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(((android.view.DisplayCutout.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectBottom(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setBoundingRectBottom(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectLeft(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setBoundingRectLeft(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectRight(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setBoundingRectRight(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectTop(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setBoundingRectTop(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setCutoutPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setCutoutPath(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setSafeInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setSafeInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setWaterfallInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(((android.view.DisplayCutout.Builder) real).setWaterfallInsets(arg0 == null ? null : arg0.getReal()));
        }

    }
}
