// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsoluteLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbsoluteLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsoluteLayout wrap(android.widget.AbsoluteLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsoluteLayout(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AbsoluteLayout getReal() {
        return (android.widget.AbsoluteLayout) real;
    }

    public android.widget.AbsoluteLayout unwrap() {
        return getReal();
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public AbsoluteLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AbsoluteLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(((android.widget.AbsoluteLayout) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.widget.AbsoluteLayout) real).shouldDelayChildPressedState();
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsoluteLayout.LayoutParams wrap(android.widget.AbsoluteLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsoluteLayout.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsoluteLayout.LayoutParams getReal() {
            return (android.widget.AbsoluteLayout.LayoutParams) real;
        }

        public android.widget.AbsoluteLayout.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, int arg2, int arg3) {
            this(new android.widget.AbsoluteLayout.LayoutParams(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public java.lang.String debug(java.lang.String arg0) {
            return ((android.widget.AbsoluteLayout.LayoutParams) real).debug(arg0);
        }


    }
}
