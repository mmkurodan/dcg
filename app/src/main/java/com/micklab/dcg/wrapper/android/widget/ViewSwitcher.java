// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewSwitcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewSwitcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewSwitcher wrap(android.widget.ViewSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewSwitcher(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ViewSwitcher getReal() {
        return (android.widget.ViewSwitcher) real;
    }

    public android.widget.ViewSwitcher unwrap() {
        return getReal();
    }

    public ViewSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewSwitcher(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ViewSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewSwitcher(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.ViewSwitcher) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ViewSwitcher) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getNextView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ViewSwitcher) real).getNextView());
    }

    public void reset() {
        ((android.widget.ViewSwitcher) real).reset();
    }

    public void setFactory(com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory arg0) {
        ((android.widget.ViewSwitcher) real).setFactory(arg0 == null ? null : arg0.getReal());
    }

    public static final class ViewFactory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ViewFactory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory wrap(android.widget.ViewSwitcher.ViewFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ViewSwitcher.ViewFactory getReal() {
            return (android.widget.ViewSwitcher.ViewFactory) real;
        }

        public android.widget.ViewSwitcher.ViewFactory unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.view.View makeView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ViewSwitcher.ViewFactory) real).makeView());
        }

    }
}
