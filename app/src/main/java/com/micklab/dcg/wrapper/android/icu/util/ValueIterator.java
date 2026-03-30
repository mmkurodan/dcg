// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ValueIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ValueIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ValueIterator wrap(android.icu.util.ValueIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ValueIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.ValueIterator getReal() {
        return (android.icu.util.ValueIterator) real;
    }

    public android.icu.util.ValueIterator unwrap() {
        return getReal();
    }

    public boolean next(com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element arg0) {
        return ((android.icu.util.ValueIterator) real).next(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.icu.util.ValueIterator) real).reset();
    }

    public void setRange(int arg0, int arg1) {
        ((android.icu.util.ValueIterator) real).setRange(arg0, arg1);
    }

    public static final class Element {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Element(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element wrap(android.icu.util.ValueIterator.Element real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ValueIterator.Element(real, (__DcgwBridgeToken) null);
        }

        public android.icu.util.ValueIterator.Element getReal() {
            return (android.icu.util.ValueIterator.Element) real;
        }

        public android.icu.util.ValueIterator.Element unwrap() {
            return getReal();
        }

        public Element() {
            this(new android.icu.util.ValueIterator.Element(), (__DcgwBridgeToken) null);
        }


    }
}
