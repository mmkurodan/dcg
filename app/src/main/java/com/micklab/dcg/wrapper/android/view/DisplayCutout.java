// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DisplayCutout {
    private final android.view.DisplayCutout real;

    public DisplayCutout(android.view.DisplayCutout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DisplayCutout wrap(android.view.DisplayCutout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayCutout(real);
    }

    public android.view.DisplayCutout unwrap() {
        return real;
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Rect arg0, java.util.List arg1) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public DisplayCutout(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4, com.micklab.dcg.wrapper.android.graphics.Insets arg5) {
        this(new android.view.DisplayCutout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectBottom() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBoundingRectBottom());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectLeft() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBoundingRectLeft());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectRight() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBoundingRectRight());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundingRectTop() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBoundingRectTop());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getCutoutPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getCutoutPath());
    }

    public int getSafeInsetBottom() {
        return real.getSafeInsetBottom();
    }

    public int getSafeInsetLeft() {
        return real.getSafeInsetLeft();
    }

    public int getSafeInsetRight() {
        return real.getSafeInsetRight();
    }

    public int getSafeInsetTop() {
        return real.getSafeInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getWaterfallInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getWaterfallInsets());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.view.DisplayCutout.Builder real;

        public Builder(android.view.DisplayCutout.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder wrap(android.view.DisplayCutout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder(real);
        }

        public android.view.DisplayCutout.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.DisplayCutout.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout build() {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectBottom(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setBoundingRectBottom(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectLeft(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setBoundingRectLeft(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectRight(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setBoundingRectRight(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setBoundingRectTop(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setBoundingRectTop(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setCutoutPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setCutoutPath(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setSafeInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setSafeInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder setWaterfallInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.DisplayCutout.Builder.wrap(real.setWaterfallInsets(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
