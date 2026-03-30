// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsets {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowInsets(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsets wrap(android.view.WindowInsets real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowInsets getReal() {
        return (android.view.WindowInsets) real;
    }

    public android.view.WindowInsets unwrap() {
        return getReal();
    }

    public WindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        this(new android.view.WindowInsets(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeDisplayCutout() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).consumeDisplayCutout());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeStableInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).consumeStableInsets());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets consumeSystemWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).consumeSystemWindowInsets());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.WindowInsets) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.DisplayCutout getDisplayCutout() {
        return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(((android.view.WindowInsets) real).getDisplayCutout());
    }

    public com.micklab.dcg.wrapper.android.view.DisplayShape getDisplayShape() {
        return com.micklab.dcg.wrapper.android.view.DisplayShape.wrap(((android.view.WindowInsets) real).getDisplayShape());
    }

    public com.micklab.dcg.wrapper.android.util.Size getFrame() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.view.WindowInsets) real).getFrame());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getInsets(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getInsets(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getInsetsIgnoringVisibility(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getInsetsIgnoringVisibility(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getMandatorySystemGestureInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getMandatorySystemGestureInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getPrivacyIndicatorBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.WindowInsets) real).getPrivacyIndicatorBounds());
    }

    public com.micklab.dcg.wrapper.android.view.RoundedCorner getRoundedCorner(int arg0) {
        return com.micklab.dcg.wrapper.android.view.RoundedCorner.wrap(((android.view.WindowInsets) real).getRoundedCorner(arg0));
    }

    public int getStableInsetBottom() {
        return ((android.view.WindowInsets) real).getStableInsetBottom();
    }

    public int getStableInsetLeft() {
        return ((android.view.WindowInsets) real).getStableInsetLeft();
    }

    public int getStableInsetRight() {
        return ((android.view.WindowInsets) real).getStableInsetRight();
    }

    public int getStableInsetTop() {
        return ((android.view.WindowInsets) real).getStableInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getStableInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getStableInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getSystemGestureInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getSystemGestureInsets());
    }

    public int getSystemWindowInsetBottom() {
        return ((android.view.WindowInsets) real).getSystemWindowInsetBottom();
    }

    public int getSystemWindowInsetLeft() {
        return ((android.view.WindowInsets) real).getSystemWindowInsetLeft();
    }

    public int getSystemWindowInsetRight() {
        return ((android.view.WindowInsets) real).getSystemWindowInsetRight();
    }

    public int getSystemWindowInsetTop() {
        return ((android.view.WindowInsets) real).getSystemWindowInsetTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getSystemWindowInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getSystemWindowInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getTappableElementInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsets) real).getTappableElementInsets());
    }

    public boolean hasInsets() {
        return ((android.view.WindowInsets) real).hasInsets();
    }

    public boolean hasStableInsets() {
        return ((android.view.WindowInsets) real).hasStableInsets();
    }

    public boolean hasSystemWindowInsets() {
        return ((android.view.WindowInsets) real).hasSystemWindowInsets();
    }

    public int hashCode() {
        return ((android.view.WindowInsets) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).inset(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets inset(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).inset(arg0, arg1, arg2, arg3));
    }

    public boolean isConsumed() {
        return ((android.view.WindowInsets) real).isConsumed();
    }

    public boolean isRound() {
        return ((android.view.WindowInsets) real).isRound();
    }

    public boolean isVisible(int arg0) {
        return ((android.view.WindowInsets) real).isVisible(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets replaceSystemWindowInsets(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).replaceSystemWindowInsets(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets replaceSystemWindowInsets(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets) real).replaceSystemWindowInsets(arg0, arg1, arg2, arg3));
    }

    public java.lang.String toString() {
        return ((android.view.WindowInsets) real).toString();
    }

    public static final com.micklab.dcg.wrapper.android.view.WindowInsets CONSUMED = com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(android.view.WindowInsets.CONSUMED);

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Builder wrap(android.view.WindowInsets.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowInsets.Builder getReal() {
            return (android.view.WindowInsets.Builder) real;
        }

        public android.view.WindowInsets.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.WindowInsets.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
            this(new android.view.WindowInsets.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets build() {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowInsets.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setDisplayCutout(com.micklab.dcg.wrapper.android.view.DisplayCutout arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setDisplayCutout(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setDisplayShape(com.micklab.dcg.wrapper.android.view.DisplayShape arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setDisplayShape(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setFrame(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setFrame(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setInsets(int arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setInsets(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setInsetsIgnoringVisibility(int arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setInsetsIgnoringVisibility(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setMandatorySystemGestureInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setMandatorySystemGestureInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setPrivacyIndicatorBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setPrivacyIndicatorBounds(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setRoundedCorner(int arg0, com.micklab.dcg.wrapper.android.view.RoundedCorner arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setRoundedCorner(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setStableInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setStableInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setSystemGestureInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setSystemGestureInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setSystemWindowInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setSystemWindowInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setTappableElementInsets(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setTappableElementInsets(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets.Builder setVisible(int arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.Builder.wrap(((android.view.WindowInsets.Builder) real).setVisible(arg0, arg1));
        }

    }
    public static final class Side {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Side(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Side wrap(android.view.WindowInsets.Side real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Side(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowInsets.Side getReal() {
            return (android.view.WindowInsets.Side) real;
        }

        public android.view.WindowInsets.Side unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Type(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsets.Type wrap(android.view.WindowInsets.Type real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsets.Type(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowInsets.Type getReal() {
            return (android.view.WindowInsets.Type) real;
        }

        public android.view.WindowInsets.Type unwrap() {
            return getReal();
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
