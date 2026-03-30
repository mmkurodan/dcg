// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsoluteLayout {
    private final android.widget.AbsoluteLayout real;

    public AbsoluteLayout(android.widget.AbsoluteLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsoluteLayout wrap(android.widget.AbsoluteLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsoluteLayout(real);
    }

    public android.widget.AbsoluteLayout unwrap() {
        return real;
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public static final class LayoutParams {
        private final android.widget.AbsoluteLayout.LayoutParams real;

        public LayoutParams(android.widget.AbsoluteLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsoluteLayout.LayoutParams wrap(android.widget.AbsoluteLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsoluteLayout.LayoutParams(real);
        }

        public android.widget.AbsoluteLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1, int arg2, int arg3) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0, arg1, arg2, arg3));
        }

        public java.lang.String debug(java.lang.String arg0) {
            return real.debug(arg0);
        }


    }
}
