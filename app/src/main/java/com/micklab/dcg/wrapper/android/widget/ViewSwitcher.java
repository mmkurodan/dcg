// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewSwitcher {
    private final android.widget.ViewSwitcher real;

    public ViewSwitcher(android.widget.ViewSwitcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewSwitcher wrap(android.widget.ViewSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewSwitcher(real);
    }

    public android.widget.ViewSwitcher unwrap() {
        return real;
    }

    public ViewSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewSwitcher(arg0 == null ? null : arg0.unwrap()));
    }

    public ViewSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewSwitcher(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getNextView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getNextView());
    }

    public void reset() {
        real.reset();
    }

    public void setFactory(com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory arg0) {
        real.setFactory(arg0 == null ? null : arg0.unwrap());
    }

    public static final class ViewFactory {
        private final android.widget.ViewSwitcher.ViewFactory real;

        public ViewFactory(android.widget.ViewSwitcher.ViewFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory wrap(android.widget.ViewSwitcher.ViewFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewSwitcher.ViewFactory(real);
        }

        public android.widget.ViewSwitcher.ViewFactory unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.view.View makeView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.makeView());
        }

    }
}
