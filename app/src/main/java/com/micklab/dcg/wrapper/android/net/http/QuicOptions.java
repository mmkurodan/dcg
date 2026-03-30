// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class QuicOptions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QuicOptions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.QuicOptions wrap(android.net.http.QuicOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.QuicOptions(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.QuicOptions getReal() {
        return (android.net.http.QuicOptions) real;
    }

    public android.net.http.QuicOptions unwrap() {
        return getReal();
    }

    public java.lang.String getHandshakeUserAgent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions#getHandshakeUserAgent()");
    }

    public java.time.Duration getIdleConnectionTimeout() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions#getIdleConnectionTimeout()");
    }

    public int getInMemoryServerConfigsCacheSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions#getInMemoryServerConfigsCacheSize()");
    }

    public boolean hasInMemoryServerConfigsCacheSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions#hasInMemoryServerConfigsCacheSize()");
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder wrap(android.net.http.QuicOptions.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.http.QuicOptions.Builder getReal() {
            return (android.net.http.QuicOptions.Builder) real;
        }

        public android.net.http.QuicOptions.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#android.net.http.QuicOptions$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder addAllowedQuicHost(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#addAllowedQuicHost(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.QuicOptions build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder setHandshakeUserAgent(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#setHandshakeUserAgent(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder setIdleConnectionTimeout(java.time.Duration arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#setIdleConnectionTimeout(java.time.Duration)");
        }

        public com.micklab.dcg.wrapper.android.net.http.QuicOptions.Builder setInMemoryServerConfigsCacheSize(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.QuicOptions$Builder#setInMemoryServerConfigsCacheSize(int)");
        }

    }
}
