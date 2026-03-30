// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsets {
    private final android.view.WindowInsets real;

    public WindowInsets(android.view.WindowInsets real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsets wrap(android.view.WindowInsets real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets(real);
    }

    public android.view.WindowInsets unwrap() {
        return real;
    }

    public WindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        this(new android.view.WindowInsets(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeDisplayCutout() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.consumeDisplayCutout());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeStableInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.consumeStableInsets());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeSystemWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.consumeSystemWindowInsets());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.DisplayCutout getDisplayCutout() {
        return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(real.getDisplayCutout());
    }

    public com.micklab.dcg.wrapper.android.view.DisplayShape getDisplayShape() {
        return com.micklab.dcg.wrapper.android.view.DisplayShape.wrap(real.getDisplayShape());
    }

    public com.micklab.dcg.wrapper.android.util.Size getFrame() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getFrame());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getInsets(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getInsets(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getInsetsIgnoringVisibility(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getInsetsIgnoringVisibility(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getMandatorySystemGestureInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getMandatorySystemGestureInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getPrivacyIndicatorBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getPrivacyIndicatorBounds());
    }

    public com.micklab.dcg.wrapper.android.view.RoundedCorner getRoundedCorner(int arg0) {
        return com.micklab.dcg.wrapper.android.view.RoundedCorner.wrap(real.getRoundedCorner(arg0));
    }

    public int getStableInsetBottom() {
        return real.getStableInsetBottom();
    }

    public int getStableInsetLeft() {
        return real.getStableInsetLeft();
    }

    public int getStableInsetRight() {
        return real.getStableInsetRight();
    }

    public int getStableInsetTop() {
        return real.getStableInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getStableInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getStableInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getSystemGestureInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getSystemGestureInsets());
    }

    public int getSystemWindowInsetBottom() {
        return real.getSystemWindowInsetBottom();
    }

    public int getSystemWindowInsetLeft() {
        return real.getSystemWindowInsetLeft();
    }

    public int getSystemWindowInsetRight() {
        return real.getSystemWindowInsetRight();
    }

    public int getSystemWindowInsetTop() {
        return real.getSystemWindowInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getSystemWindowInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getSystemWindowInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getTappableElementInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getTappableElementInsets());
    }

    public boolean hasInsets() {
        return real.hasInsets();
    }

    public boolean hasStableInsets() {
        return real.hasStableInsets();
    }

    public boolean hasSystemWindowInsets() {
        return real.hasSystemWindowInsets();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.inset(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets inset(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.inset(arg0, arg1, arg2, arg3));
    }

    public boolean isConsumed() {
        return real.isConsumed();
    }

    public boolean isRound() {
        return real.isRound();
    }

    public boolean isVisible(int arg0) {
        return real.isVisible(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets replaceSystemWindowInsets(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.replaceSystemWindowInsets(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets replaceSystemWindowInsets(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.replaceSystemWindowInsets(arg0, arg1, arg2, arg3));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.view.WindowInsets CONSUMED = com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(android.view.WindowInsets.CONSUMED);

    public static final class Builder {
        private final android.view.WindowInsets.Builder real;

        public Builder(android.view.WindowInsets.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Builder wrap(android.view.WindowInsets.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Builder(real);
        }

        public android.view.WindowInsets.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.WindowInsets.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
            this(new android.view.WindowInsets.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets build() {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setDisplayCutout(com.micklab.dcg.wrapper.android.view.DisplayCutout arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setDisplayCutout(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setDisplayShape(com.micklab.dcg.wrapper.android.view.DisplayShape arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setDisplayShape(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setFrame(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setFrame(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setInsets(int arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setInsets(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setInsetsIgnoringVisibility(int arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setInsetsIgnoringVisibility(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setMandatorySystemGestureInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setMandatorySystemGestureInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setPrivacyIndicatorBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setPrivacyIndicatorBounds(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setRoundedCorner(int arg0, com.micklab.dcg.wrapper.android.view.RoundedCorner arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setRoundedCorner(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setStableInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setStableInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setSystemGestureInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setSystemGestureInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setSystemWindowInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setSystemWindowInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setTappableElementInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setTappableElementInsets(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setVisible(int arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(real.setVisible(arg0, arg1));
        }

    }
    public static final class Side {
        private final android.view.WindowInsets.Side real;

        public Side(android.view.WindowInsets.Side real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Side wrap(android.view.WindowInsets.Side real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Side(real);
        }

        public android.view.WindowInsets.Side unwrap() {
            return real;
        }

        public static int all() {
            return android.view.WindowInsets.Side.all();
        }

        public static final int BOTTOM = android.view.WindowInsets.Side.BOTTOM;
        public static final int LEFT = android.view.WindowInsets.Side.LEFT;
        public static final int RIGHT = android.view.WindowInsets.Side.RIGHT;
        public static final int TOP = android.view.WindowInsets.Side.TOP;

    }
    public static final class Type {
        private final android.view.WindowInsets.Type real;

        public Type(android.view.WindowInsets.Type real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Type wrap(android.view.WindowInsets.Type real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Type(real);
        }

        public android.view.WindowInsets.Type unwrap() {
            return real;
        }

        public static int captionBar() {
            return android.view.WindowInsets.Type.captionBar();
        }

        public static int displayCutout() {
            return android.view.WindowInsets.Type.displayCutout();
        }

        public static int ime() {
            return android.view.WindowInsets.Type.ime();
        }

        public static int mandatorySystemGestures() {
            return android.view.WindowInsets.Type.mandatorySystemGestures();
        }

        public static int navigationBars() {
            return android.view.WindowInsets.Type.navigationBars();
        }

        public static int statusBars() {
            return android.view.WindowInsets.Type.statusBars();
        }

        public static int systemBars() {
            return android.view.WindowInsets.Type.systemBars();
        }

        public static int systemGestures() {
            return android.view.WindowInsets.Type.systemGestures();
        }

        public static int systemOverlays() {
            return android.view.WindowInsets.Type.systemOverlays();
        }

        public static int tappableElement() {
            return android.view.WindowInsets.Type.tappableElement();
        }

    }
}
