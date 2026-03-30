// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LocalSocketAddress {
    private final android.net.LocalSocketAddress real;

    public LocalSocketAddress(android.net.LocalSocketAddress real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress wrap(android.net.LocalSocketAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalSocketAddress(real);
    }

    public android.net.LocalSocketAddress unwrap() {
        return real;
    }

    public LocalSocketAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress#android.net.LocalSocketAddress(java.lang.String)");
    }

    public LocalSocketAddress(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress#android.net.LocalSocketAddress(java.lang.String,android.net.LocalSocketAddress$Namespace)");
    }

    public java.lang.String getName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress#getName()");
    }

    public com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace getNamespace() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress#getNamespace()");
    }

    public static final class Namespace {
        private final android.net.LocalSocketAddress.Namespace real;

        public Namespace(android.net.LocalSocketAddress.Namespace real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace wrap(android.net.LocalSocketAddress.Namespace real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace(real);
        }

        public android.net.LocalSocketAddress.Namespace unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress$Namespace#valueOf(java.lang.String)");
        }

        public static android.net.LocalSocketAddress.Namespace[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress$Namespace#values()");
        }


    }
}
