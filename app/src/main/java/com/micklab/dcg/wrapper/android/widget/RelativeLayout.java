// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RelativeLayout {
    private final android.widget.RelativeLayout real;

    public RelativeLayout(android.widget.RelativeLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RelativeLayout wrap(android.widget.RelativeLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RelativeLayout(real);
    }

    public android.widget.RelativeLayout unwrap() {
        return real;
    }

    public RelativeLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RelativeLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public RelativeLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RelativeLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RelativeLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.RelativeLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public RelativeLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.RelativeLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.widget.RelativeLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.RelativeLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public int getIgnoreGravity() {
        return real.getIgnoreGravity();
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setHorizontalGravity(int arg0) {
        real.setHorizontalGravity(arg0);
    }

    public void setIgnoreGravity(int arg0) {
        real.setIgnoreGravity(arg0);
    }

    public void setVerticalGravity(int arg0) {
        real.setVerticalGravity(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public static final int ABOVE = android.widget.RelativeLayout.ABOVE;
    public static final int ALIGN_BASELINE = android.widget.RelativeLayout.ALIGN_BASELINE;
    public static final int ALIGN_BOTTOM = android.widget.RelativeLayout.ALIGN_BOTTOM;
    public static final int ALIGN_END = android.widget.RelativeLayout.ALIGN_END;
    public static final int ALIGN_LEFT = android.widget.RelativeLayout.ALIGN_LEFT;
    public static final int ALIGN_PARENT_BOTTOM = android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM;
    public static final int ALIGN_PARENT_END = android.widget.RelativeLayout.ALIGN_PARENT_END;
    public static final int ALIGN_PARENT_LEFT = android.widget.RelativeLayout.ALIGN_PARENT_LEFT;
    public static final int ALIGN_PARENT_RIGHT = android.widget.RelativeLayout.ALIGN_PARENT_RIGHT;
    public static final int ALIGN_PARENT_START = android.widget.RelativeLayout.ALIGN_PARENT_START;
    public static final int ALIGN_PARENT_TOP = android.widget.RelativeLayout.ALIGN_PARENT_TOP;
    public static final int ALIGN_RIGHT = android.widget.RelativeLayout.ALIGN_RIGHT;
    public static final int ALIGN_START = android.widget.RelativeLayout.ALIGN_START;
    public static final int ALIGN_TOP = android.widget.RelativeLayout.ALIGN_TOP;
    public static final int BELOW = android.widget.RelativeLayout.BELOW;
    public static final int CENTER_HORIZONTAL = android.widget.RelativeLayout.CENTER_HORIZONTAL;
    public static final int CENTER_IN_PARENT = android.widget.RelativeLayout.CENTER_IN_PARENT;
    public static final int CENTER_VERTICAL = android.widget.RelativeLayout.CENTER_VERTICAL;
    public static final int END_OF = android.widget.RelativeLayout.END_OF;
    public static final int LEFT_OF = android.widget.RelativeLayout.LEFT_OF;
    public static final int RIGHT_OF = android.widget.RelativeLayout.RIGHT_OF;
    public static final int START_OF = android.widget.RelativeLayout.START_OF;
    public static final int TRUE = android.widget.RelativeLayout.TRUE;

    public static final class LayoutParams {
        private final android.widget.RelativeLayout.LayoutParams real;

        public LayoutParams(android.widget.RelativeLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RelativeLayout.LayoutParams wrap(android.widget.RelativeLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RelativeLayout.LayoutParams(real);
        }

        public android.widget.RelativeLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.RelativeLayout.LayoutParams arg0) {
            this(new android.widget.RelativeLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.RelativeLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.RelativeLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.RelativeLayout.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.RelativeLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void addRule(int arg0) {
            real.addRule(arg0);
        }

        public void addRule(int arg0, int arg1) {
            real.addRule(arg0, arg1);
        }

        public java.lang.String debug(java.lang.String arg0) {
            return real.debug(arg0);
        }

        public int getRule(int arg0) {
            return real.getRule(arg0);
        }

        public int[] getRules() {
            return real.getRules();
        }

        public void removeRule(int arg0) {
            real.removeRule(arg0);
        }

        public void resolveLayoutDirection(int arg0) {
            real.resolveLayoutDirection(arg0);
        }


    }
}
