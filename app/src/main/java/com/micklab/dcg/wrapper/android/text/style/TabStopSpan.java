// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TabStopSpan {
    private final android.text.style.TabStopSpan real;

    public TabStopSpan(android.text.style.TabStopSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TabStopSpan wrap(android.text.style.TabStopSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TabStopSpan(real);
    }

    public android.text.style.TabStopSpan unwrap() {
        return real;
    }

    public int getTabStop() {
        return real.getTabStop();
    }

    public static final class Standard {
        private final android.text.style.TabStopSpan.Standard real;

        public Standard(android.text.style.TabStopSpan.Standard real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TabStopSpan.Standard wrap(android.text.style.TabStopSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TabStopSpan.Standard(real);
        }

        public android.text.style.TabStopSpan.Standard unwrap() {
            return real;
        }

        public Standard(int arg0) {
            this(new android.text.style.TabStopSpan.Standard(arg0));
        }

        public int getTabStop() {
            return real.getTabStop();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
