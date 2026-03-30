// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Filter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Filter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Filter wrap(android.widget.Filter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Filter getReal() {
        return (android.widget.Filter) real;
    }

    public android.widget.Filter unwrap() {
        return getReal();
    }

    public java.lang.CharSequence convertResultToString(java.lang.Object arg0) {
        return ((android.widget.Filter) real).convertResultToString(arg0);
    }

    public void filter(java.lang.CharSequence arg0) {
        ((android.widget.Filter) real).filter(arg0);
    }

    public void filter(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.Filter.FilterListener arg1) {
        ((android.widget.Filter) real).filter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final class FilterListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FilterListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Filter.FilterListener wrap(android.widget.Filter.FilterListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filter.FilterListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Filter.FilterListener getReal() {
            return (android.widget.Filter.FilterListener) real;
        }

        public android.widget.Filter.FilterListener unwrap() {
            return getReal();
        }

        public void onFilterComplete(int arg0) {
            ((android.widget.Filter.FilterListener) real).onFilterComplete(arg0);
        }

    }
}
