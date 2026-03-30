// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class DataOrigin {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataOrigin(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin wrap(android.health.connect.datatypes.DataOrigin real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.DataOrigin getReal() {
        return (android.health.connect.datatypes.DataOrigin) real;
    }

    public android.health.connect.datatypes.DataOrigin unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.DataOrigin) real).equals(arg0);
    }

    public java.lang.String getPackageName() {
        return ((android.health.connect.datatypes.DataOrigin) real).getPackageName();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.DataOrigin) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder wrap(android.health.connect.datatypes.DataOrigin.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.DataOrigin.Builder getReal() {
            return (android.health.connect.datatypes.DataOrigin.Builder) real;
        }

        public android.health.connect.datatypes.DataOrigin.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.datatypes.DataOrigin.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.wrap(((android.health.connect.datatypes.DataOrigin.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder setPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder.wrap(((android.health.connect.datatypes.DataOrigin.Builder) real).setPackageName(arg0));
        }

    }
}
