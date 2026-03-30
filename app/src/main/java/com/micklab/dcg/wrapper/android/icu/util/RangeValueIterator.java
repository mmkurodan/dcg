// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class RangeValueIterator {
    private final android.icu.util.RangeValueIterator real;

    public RangeValueIterator(android.icu.util.RangeValueIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator wrap(android.icu.util.RangeValueIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator(real);
    }

    public android.icu.util.RangeValueIterator unwrap() {
        return real;
    }

    public boolean next(com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element arg0) {
        return real.next(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public static final class Element {
        private final android.icu.util.RangeValueIterator.Element real;

        public Element(android.icu.util.RangeValueIterator.Element real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element wrap(android.icu.util.RangeValueIterator.Element real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element(real);
        }

        public android.icu.util.RangeValueIterator.Element unwrap() {
            return real;
        }

        public Element() {
            this(new android.icu.util.RangeValueIterator.Element());
        }


    }
}
