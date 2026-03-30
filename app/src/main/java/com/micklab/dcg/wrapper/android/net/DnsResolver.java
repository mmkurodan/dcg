// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class DnsResolver {
    private final android.net.DnsResolver real;

    public DnsResolver(android.net.DnsResolver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.DnsResolver wrap(android.net.DnsResolver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.DnsResolver(real);
    }

    public android.net.DnsResolver unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.net.DnsResolver getInstance() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DnsResolver#getInstance()");
    }


    public static final class Callback {
        private final android.net.DnsResolver.Callback real;

        public Callback(android.net.DnsResolver.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.DnsResolver.Callback wrap(android.net.DnsResolver.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.DnsResolver.Callback(real);
        }

        public android.net.DnsResolver.Callback unwrap() {
            return real;
        }

        public void onAnswer(java.lang.Object arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DnsResolver$Callback#onAnswer(java.lang.Object,int)");
        }

        public void onError(com.micklab.dcg.wrapper.android.net.DnsResolver.DnsException arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DnsResolver$Callback#onError(android.net.DnsResolver$DnsException)");
        }

    }
    public static final class DnsException {
        private final android.net.DnsResolver.DnsException real;

        public DnsException(android.net.DnsResolver.DnsException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.DnsResolver.DnsException wrap(android.net.DnsResolver.DnsException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.DnsResolver.DnsException(real);
        }

        public android.net.DnsResolver.DnsException unwrap() {
            return real;
        }

        public DnsException(int arg0, java.lang.Throwable arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DnsResolver$DnsException#android.net.DnsResolver$DnsException(int,java.lang.Throwable)");
        }


    }
}
