// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CollationKey {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CollationKey(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CollationKey wrap(android.icu.text.CollationKey real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationKey(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.CollationKey getReal() {
        return (android.icu.text.CollationKey) real;
    }

    public android.icu.text.CollationKey unwrap() {
        return getReal();
    }

    public CollationKey(java.lang.String arg0, byte[] arg1) {
        this(new android.icu.text.CollationKey(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return ((android.icu.text.CollationKey) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.CollationKey) real).equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return ((android.icu.text.CollationKey) real).equals(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getBound(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(((android.icu.text.CollationKey) real).getBound(arg0, arg1));
    }

    public java.lang.String getSourceString() {
        return ((android.icu.text.CollationKey) real).getSourceString();
    }

    public int hashCode() {
        return ((android.icu.text.CollationKey) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey merge(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(((android.icu.text.CollationKey) real).merge(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] toByteArray() {
        return ((android.icu.text.CollationKey) real).toByteArray();
    }

    public static final class BoundMode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BoundMode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CollationKey.BoundMode wrap(android.icu.text.CollationKey.BoundMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationKey.BoundMode(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CollationKey.BoundMode getReal() {
            return (android.icu.text.CollationKey.BoundMode) real;
        }

        public android.icu.text.CollationKey.BoundMode unwrap() {
            return getReal();
        }

        public static final int LOWER = android.icu.text.CollationKey.BoundMode.LOWER;
        public static final int UPPER = android.icu.text.CollationKey.BoundMode.UPPER;
        public static final int UPPER_LONG = android.icu.text.CollationKey.BoundMode.UPPER_LONG;

    }
}
