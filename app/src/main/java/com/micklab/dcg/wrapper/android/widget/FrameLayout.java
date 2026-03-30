// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class FrameLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FrameLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.FrameLayout wrap(android.widget.FrameLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FrameLayout(real, (__DcgwBridgeToken) null);
    }

    public android.widget.FrameLayout getReal() {
        return (android.widget.FrameLayout) real;
    }

    public android.widget.FrameLayout unwrap() {
        return getReal();
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams.wrap(((android.widget.FrameLayout) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.FrameLayout) real).getAccessibilityClassName();
    }

    public boolean getConsiderGoneChildrenWhenMeasuring() {
        return ((android.widget.FrameLayout) real).getConsiderGoneChildrenWhenMeasuring();
    }

    public boolean getMeasureAllChildren() {
        return ((android.widget.FrameLayout) real).getMeasureAllChildren();
    }

    public void setForegroundGravity(int arg0) {
        ((android.widget.FrameLayout) real).setForegroundGravity(arg0);
    }

    public void setMeasureAllChildren(boolean arg0) {
        ((android.widget.FrameLayout) real).setMeasureAllChildren(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.widget.FrameLayout) real).shouldDelayChildPressedState();
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams wrap(android.widget.FrameLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.FrameLayout.LayoutParams getReal() {
            return (android.widget.FrameLayout.LayoutParams) real;
        }

        public android.widget.FrameLayout.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.FrameLayout.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.widget.FrameLayout.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public static final int UNSPECIFIED_GRAVITY = android.widget.FrameLayout.LayoutParams.UNSPECIFIED_GRAVITY;

    }
}
