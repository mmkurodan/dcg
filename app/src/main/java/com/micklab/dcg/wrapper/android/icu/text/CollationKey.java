// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CollationKey {
    private final android.icu.text.CollationKey real;

    public CollationKey(android.icu.text.CollationKey real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CollationKey wrap(android.icu.text.CollationKey real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationKey(real);
    }

    public android.icu.text.CollationKey unwrap() {
        return real;
    }

    public CollationKey(java.lang.String arg0, byte[] arg1) {
        this(new android.icu.text.CollationKey(arg0, arg1));
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return real.equals(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getBound(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(real.getBound(arg0, arg1));
    }

    public java.lang.String getSourceString() {
        return real.getSourceString();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey merge(com.micklab.dcg.wrapper.android.icu.text.CollationKey arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(real.merge(arg0 == null ? null : arg0.unwrap()));
    }

    public byte[] toByteArray() {
        return real.toByteArray();
    }

    public static final class BoundMode {
        private final android.icu.text.CollationKey.BoundMode real;

        public BoundMode(android.icu.text.CollationKey.BoundMode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CollationKey.BoundMode wrap(android.icu.text.CollationKey.BoundMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationKey.BoundMode(real);
        }

        public android.icu.text.CollationKey.BoundMode unwrap() {
            return real;
        }

        public static final int LOWER = android.icu.text.CollationKey.BoundMode.LOWER;
        public static final int UPPER = android.icu.text.CollationKey.BoundMode.UPPER;
        public static final int UPPER_LONG = android.icu.text.CollationKey.BoundMode.UPPER_LONG;

    }
}
