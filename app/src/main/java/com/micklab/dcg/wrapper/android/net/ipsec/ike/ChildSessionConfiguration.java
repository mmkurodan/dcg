// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSessionConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChildSessionConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration wrap(android.net.ipsec.ike.ChildSessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.ChildSessionConfiguration getReal() {
        return (android.net.ipsec.ike.ChildSessionConfiguration) real;
    }

    public android.net.ipsec.ike.ChildSessionConfiguration unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration.Builder wrap(android.net.ipsec.ike.ChildSessionConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.ipsec.ike.ChildSessionConfiguration.Builder getReal() {
            return (android.net.ipsec.ike.ChildSessionConfiguration.Builder) real;
        }

        public android.net.ipsec.ike.ChildSessionConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0, java.util.List arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionConfiguration$Builder#android.net.ipsec.ike.ChildSessionConfiguration$Builder(java.util.List,java.util.List)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionConfiguration$Builder#build()");
        }

    }
}
