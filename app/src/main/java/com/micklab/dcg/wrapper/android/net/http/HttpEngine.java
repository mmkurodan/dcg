// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class HttpEngine {
    private final android.net.http.HttpEngine real;

    public HttpEngine(android.net.http.HttpEngine real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.HttpEngine wrap(android.net.http.HttpEngine real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HttpEngine(real);
    }

    public android.net.http.HttpEngine unwrap() {
        return real;
    }

    public void bindToNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#bindToNetwork(android.net.Network)");
    }

    public java.net.URLStreamHandlerFactory createUrlStreamHandlerFactory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#createUrlStreamHandlerFactory()");
    }

    public static java.lang.String getVersionString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#getVersionString()");
    }

    public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Callback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#newBidirectionalStreamBuilder(java.lang.String,java.util.concurrent.Executor,android.net.http.BidirectionalStream$Callback)");
    }

    public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder newUrlRequestBuilder(java.lang.String arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.http.UrlRequest.Callback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#newUrlRequestBuilder(java.lang.String,java.util.concurrent.Executor,android.net.http.UrlRequest$Callback)");
    }

    public java.net.URLConnection openConnection(java.net.URL arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#openConnection(java.net.URL)");
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine#shutdown()");
    }

    public static final class Builder {
        private final android.net.http.HttpEngine.Builder real;

        public Builder(android.net.http.HttpEngine.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder wrap(android.net.http.HttpEngine.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder(real);
        }

        public android.net.http.HttpEngine.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#android.net.http.HttpEngine$Builder(android.content.Context)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder addQuicHint(java.lang.String arg0, int arg1, int arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#addQuicHint(java.lang.String,int,int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#build()");
        }

        public java.lang.String getDefaultUserAgent() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#getDefaultUserAgent()");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setConnectionMigrationOptions(com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setConnectionMigrationOptions(android.net.http.ConnectionMigrationOptions)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setDnsOptions(com.micklab.dcg.wrapper.android.net.http.DnsOptions arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setDnsOptions(android.net.http.DnsOptions)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setEnableBrotli(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setEnableBrotli(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setEnableHttp2(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setEnableHttp2(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setEnableHttpCache(int arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setEnableHttpCache(int,long)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setEnablePublicKeyPinningBypassForLocalTrustAnchors(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setEnablePublicKeyPinningBypassForLocalTrustAnchors(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setEnableQuic(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setEnableQuic(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setQuicOptions(com.micklab.dcg.wrapper.android.net.http.QuicOptions arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setQuicOptions(android.net.http.QuicOptions)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setStoragePath(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setStoragePath(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.HttpEngine.Builder setUserAgent(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpEngine$Builder#setUserAgent(java.lang.String)");
        }


    }
}
