// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSessionConfiguration {
    private final android.net.ipsec.ike.ChildSessionConfiguration real;

    public ChildSessionConfiguration(android.net.ipsec.ike.ChildSessionConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration wrap(android.net.ipsec.ike.ChildSessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration(real);
    }

    public android.net.ipsec.ike.ChildSessionConfiguration unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.net.ipsec.ike.ChildSessionConfiguration.Builder real;

        public Builder(android.net.ipsec.ike.ChildSessionConfiguration.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration.Builder wrap(android.net.ipsec.ike.ChildSessionConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration.Builder(real);
        }

        public android.net.ipsec.ike.ChildSessionConfiguration.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0, java.util.List arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionConfiguration$Builder#android.net.ipsec.ike.ChildSessionConfiguration$Builder(java.util.List,java.util.List)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionConfiguration$Builder#build()");
        }

    }
}
