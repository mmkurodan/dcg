// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class FrameLayout {
    private final android.widget.FrameLayout real;

    public FrameLayout(android.widget.FrameLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.FrameLayout wrap(android.widget.FrameLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FrameLayout(real);
    }

    public android.widget.FrameLayout unwrap() {
        return real;
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public FrameLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.FrameLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean getConsiderGoneChildrenWhenMeasuring() {
        return real.getConsiderGoneChildrenWhenMeasuring();
    }

    public boolean getMeasureAllChildren() {
        return real.getMeasureAllChildren();
    }

    public void setForegroundGravity(int arg0) {
        real.setForegroundGravity(arg0);
    }

    public void setMeasureAllChildren(boolean arg0) {
        real.setMeasureAllChildren(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public static final class LayoutParams {
        private final android.widget.FrameLayout.LayoutParams real;

        public LayoutParams(android.widget.FrameLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams wrap(android.widget.FrameLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams(real);
        }

        public android.widget.FrameLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.FrameLayout.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.FrameLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.widget.FrameLayout.LayoutParams(arg0, arg1, arg2));
        }

        public static final int UNSPECIFIED_GRAVITY = android.widget.FrameLayout.LayoutParams.UNSPECIFIED_GRAVITY;

    }
}
