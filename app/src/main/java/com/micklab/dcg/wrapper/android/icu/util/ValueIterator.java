// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ValueIterator {
    private final android.icu.util.ValueIterator real;

    public ValueIterator(android.icu.util.ValueIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ValueIterator wrap(android.icu.util.ValueIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ValueIterator(real);
    }

    public android.icu.util.ValueIterator unwrap() {
        return real;
    }

    public boolean next(com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element arg0) {
        return real.next(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void setRange(int arg0, int arg1) {
        real.setRange(arg0, arg1);
    }

    public static final class Element {
        private final android.icu.util.ValueIterator.Element real;

        public Element(android.icu.util.ValueIterator.Element real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element wrap(android.icu.util.ValueIterator.Element real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element(real);
        }

        public android.icu.util.ValueIterator.Element unwrap() {
            return real;
        }

        public Element() {
            this(new android.icu.util.ValueIterator.Element());
        }


    }
}
