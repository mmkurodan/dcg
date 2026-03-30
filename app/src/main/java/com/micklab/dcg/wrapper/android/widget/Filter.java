// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Filter {
    private final android.widget.Filter real;

    public Filter(android.widget.Filter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Filter wrap(android.widget.Filter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filter(real);
    }

    public android.widget.Filter unwrap() {
        return real;
    }

    public java.lang.CharSequence convertResultToString(java.lang.Object arg0) {
        return real.convertResultToString(arg0);
    }

    public void filter(java.lang.CharSequence arg0) {
        real.filter(arg0);
    }

    public void filter(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.Filter.FilterListener arg1) {
        real.filter(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final class FilterListener {
        private final android.widget.Filter.FilterListener real;

        public FilterListener(android.widget.Filter.FilterListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Filter.FilterListener wrap(android.widget.Filter.FilterListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filter.FilterListener(real);
        }

        public android.widget.Filter.FilterListener unwrap() {
            return real;
        }

        public void onFilterComplete(int arg0) {
            real.onFilterComplete(arg0);
        }

    }
}
