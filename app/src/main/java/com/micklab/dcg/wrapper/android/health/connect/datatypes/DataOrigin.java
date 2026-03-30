// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class DataOrigin {
    private final android.health.connect.datatypes.DataOrigin real;

    public DataOrigin(android.health.connect.datatypes.DataOrigin real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin wrap(android.health.connect.datatypes.DataOrigin real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin(real);
    }

    public android.health.connect.datatypes.DataOrigin unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.DataOrigin.Builder real;

        public Builder(android.health.connect.datatypes.DataOrigin.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder wrap(android.health.connect.datatypes.DataOrigin.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder(real);
        }

        public android.health.connect.datatypes.DataOrigin.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.health.connect.datatypes.DataOrigin.Builder());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder setPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.Builder.wrap(real.setPackageName(arg0));
        }

    }
}
