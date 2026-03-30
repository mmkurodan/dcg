// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class NoCopySpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NoCopySpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.NoCopySpan wrap(android.text.NoCopySpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.NoCopySpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.NoCopySpan getReal() {
        return (android.text.NoCopySpan) real;
    }

    public android.text.NoCopySpan unwrap() {
        return getReal();
    }

    public static final class Concrete {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Concrete(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.NoCopySpan.Concrete wrap(android.text.NoCopySpan.Concrete real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.NoCopySpan.Concrete(real, (__DcgwBridgeToken) null);
        }

        public android.text.NoCopySpan.Concrete getReal() {
            return (android.text.NoCopySpan.Concrete) real;
        }

        public android.text.NoCopySpan.Concrete unwrap() {
            return getReal();
        }

        public Concrete() {
            this(new android.text.NoCopySpan.Concrete(), (__DcgwBridgeToken) null);
        }

    }
}
