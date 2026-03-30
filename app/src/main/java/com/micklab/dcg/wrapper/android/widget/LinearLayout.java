// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class LinearLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LinearLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.LinearLayout wrap(android.widget.LinearLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.LinearLayout(real, (__DcgwBridgeToken) null);
    }

    public android.widget.LinearLayout getReal() {
        return (android.widget.LinearLayout) real;
    }

    public android.widget.LinearLayout unwrap() {
        return getReal();
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams.wrap(((android.widget.LinearLayout) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.LinearLayout) real).getAccessibilityClassName();
    }

    public int getBaseline() {
        return ((android.widget.LinearLayout) real).getBaseline();
    }

    public int getBaselineAlignedChildIndex() {
        return ((android.widget.LinearLayout) real).getBaselineAlignedChildIndex();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDividerDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.LinearLayout) real).getDividerDrawable());
    }

    public int getDividerPadding() {
        return ((android.widget.LinearLayout) real).getDividerPadding();
    }

    public int getGravity() {
        return ((android.widget.LinearLayout) real).getGravity();
    }

    public int getOrientation() {
        return ((android.widget.LinearLayout) real).getOrientation();
    }

    public int getShowDividers() {
        return ((android.widget.LinearLayout) real).getShowDividers();
    }

    public float getWeightSum() {
        return ((android.widget.LinearLayout) real).getWeightSum();
    }

    public boolean isBaselineAligned() {
        return ((android.widget.LinearLayout) real).isBaselineAligned();
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return ((android.widget.LinearLayout) real).isMeasureWithLargestChildEnabled();
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.LinearLayout) real).onRtlPropertiesChanged(arg0);
    }

    public void setBaselineAligned(boolean arg0) {
        ((android.widget.LinearLayout) real).setBaselineAligned(arg0);
    }

    public void setBaselineAlignedChildIndex(int arg0) {
        ((android.widget.LinearLayout) real).setBaselineAlignedChildIndex(arg0);
    }

    public void setDividerDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.LinearLayout) real).setDividerDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setDividerPadding(int arg0) {
        ((android.widget.LinearLayout) real).setDividerPadding(arg0);
    }

    public void setGravity(int arg0) {
        ((android.widget.LinearLayout) real).setGravity(arg0);
    }

    public void setHorizontalGravity(int arg0) {
        ((android.widget.LinearLayout) real).setHorizontalGravity(arg0);
    }

    public void setMeasureWithLargestChildEnabled(boolean arg0) {
        ((android.widget.LinearLayout) real).setMeasureWithLargestChildEnabled(arg0);
    }

    public void setOrientation(int arg0) {
        ((android.widget.LinearLayout) real).setOrientation(arg0);
    }

    public void setShowDividers(int arg0) {
        ((android.widget.LinearLayout) real).setShowDividers(arg0);
    }

    public void setVerticalGravity(int arg0) {
        ((android.widget.LinearLayout) real).setVerticalGravity(arg0);
    }

    public void setWeightSum(float arg0) {
        ((android.widget.LinearLayout) real).setWeightSum(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.widget.LinearLayout) real).shouldDelayChildPressedState();
    }

    public static final int HORIZONTAL = android.widget.LinearLayout.HORIZONTAL;
    public static final int SHOW_DIVIDER_BEGINNING = android.widget.LinearLayout.SHOW_DIVIDER_BEGINNING;
    public static final int SHOW_DIVIDER_END = android.widget.LinearLayout.SHOW_DIVIDER_END;
    public static final int SHOW_DIVIDER_MIDDLE = android.widget.LinearLayout.SHOW_DIVIDER_MIDDLE;
    public static final int SHOW_DIVIDER_NONE = android.widget.LinearLayout.SHOW_DIVIDER_NONE;
    public static final int VERTICAL = android.widget.LinearLayout.VERTICAL;

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams wrap(android.widget.LinearLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.LinearLayout.LayoutParams getReal() {
            return (android.widget.LinearLayout.LayoutParams) real;
        }

        public android.widget.LinearLayout.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.LinearLayout.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.LinearLayout.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public java.lang.String debug(java.lang.String arg0) {
            return ((android.widget.LinearLayout.LayoutParams) real).debug(arg0);
        }


    }
}
