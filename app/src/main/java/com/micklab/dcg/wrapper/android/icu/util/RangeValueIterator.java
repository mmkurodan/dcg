// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class RangeValueIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangeValueIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator wrap(android.icu.util.RangeValueIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.RangeValueIterator getReal() {
        return (android.icu.util.RangeValueIterator) real;
    }

    public android.icu.util.RangeValueIterator unwrap() {
        return getReal();
    }

    public boolean next(com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element arg0) {
        return ((android.icu.util.RangeValueIterator) real).next(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.icu.util.RangeValueIterator) real).reset();
    }

    public static final class Element {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Element(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element wrap(android.icu.util.RangeValueIterator.Element real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.RangeValueIterator.Element(real, (__DcgwBridgeToken) null);
        }

        public android.icu.util.RangeValueIterator.Element getReal() {
            return (android.icu.util.RangeValueIterator.Element) real;
        }

        public android.icu.util.RangeValueIterator.Element unwrap() {
            return getReal();
        }

        public Element() {
            this(new android.icu.util.RangeValueIterator.Element(), (__DcgwBridgeToken) null);
        }


    }
}
