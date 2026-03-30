// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class LinearLayout {
    private final android.widget.LinearLayout real;

    public LinearLayout(android.widget.LinearLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.LinearLayout wrap(android.widget.LinearLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.LinearLayout(real);
    }

    public android.widget.LinearLayout unwrap() {
        return real;
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public LinearLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.LinearLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public int getBaselineAlignedChildIndex() {
        return real.getBaselineAlignedChildIndex();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDividerDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDividerDrawable());
    }

    public int getDividerPadding() {
        return real.getDividerPadding();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public int getOrientation() {
        return real.getOrientation();
    }

    public int getShowDividers() {
        return real.getShowDividers();
    }

    public float getWeightSum() {
        return real.getWeightSum();
    }

    public boolean isBaselineAligned() {
        return real.isBaselineAligned();
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return real.isMeasureWithLargestChildEnabled();
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public void setBaselineAligned(boolean arg0) {
        real.setBaselineAligned(arg0);
    }

    public void setBaselineAlignedChildIndex(int arg0) {
        real.setBaselineAlignedChildIndex(arg0);
    }

    public void setDividerDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setDividerDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setDividerPadding(int arg0) {
        real.setDividerPadding(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setHorizontalGravity(int arg0) {
        real.setHorizontalGravity(arg0);
    }

    public void setMeasureWithLargestChildEnabled(boolean arg0) {
        real.setMeasureWithLargestChildEnabled(arg0);
    }

    public void setOrientation(int arg0) {
        real.setOrientation(arg0);
    }

    public void setShowDividers(int arg0) {
        real.setShowDividers(arg0);
    }

    public void setVerticalGravity(int arg0) {
        real.setVerticalGravity(arg0);
    }

    public void setWeightSum(float arg0) {
        real.setWeightSum(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public static final int HORIZONTAL = android.widget.LinearLayout.HORIZONTAL;
    public static final int SHOW_DIVIDER_BEGINNING = android.widget.LinearLayout.SHOW_DIVIDER_BEGINNING;
    public static final int SHOW_DIVIDER_END = android.widget.LinearLayout.SHOW_DIVIDER_END;
    public static final int SHOW_DIVIDER_MIDDLE = android.widget.LinearLayout.SHOW_DIVIDER_MIDDLE;
    public static final int SHOW_DIVIDER_NONE = android.widget.LinearLayout.SHOW_DIVIDER_NONE;
    public static final int VERTICAL = android.widget.LinearLayout.VERTICAL;

    public static final class LayoutParams {
        private final android.widget.LinearLayout.LayoutParams real;

        public LayoutParams(android.widget.LinearLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams wrap(android.widget.LinearLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams(real);
        }

        public android.widget.LinearLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.LinearLayout.LayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.LinearLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.LinearLayout.LayoutParams(arg0, arg1));
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.LinearLayout.LayoutParams(arg0, arg1, arg2));
        }

        public java.lang.String debug(java.lang.String arg0) {
            return real.debug(arg0);
        }


    }
}
