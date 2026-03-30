// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LocalSocketAddress {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalSocketAddress(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress wrap(android.net.LocalSocketAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalSocketAddress(real, (__DcgwBridgeToken) null);
    }

    public android.net.LocalSocketAddress getReal() {
        return (android.net.LocalSocketAddress) real;
    }

    public android.net.LocalSocketAddress unwrap() {
        return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Namespace(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace wrap(android.net.LocalSocketAddress.Namespace real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace(real, (__DcgwBridgeToken) null);
        }

        public android.net.LocalSocketAddress.Namespace getReal() {
            return (android.net.LocalSocketAddress.Namespace) real;
        }

        public android.net.LocalSocketAddress.Namespace unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.net.LocalSocketAddress.Namespace valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress$Namespace#valueOf(java.lang.String)");
        }

        public static android.net.LocalSocketAddress.Namespace[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocketAddress$Namespace#values()");
        }


    }
}
