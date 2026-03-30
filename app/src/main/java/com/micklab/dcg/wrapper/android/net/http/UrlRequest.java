// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class UrlRequest {
    private final android.net.http.UrlRequest real;

    public UrlRequest(android.net.http.UrlRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.UrlRequest wrap(android.net.http.UrlRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlRequest(real);
    }

    public android.net.http.UrlRequest unwrap() {
        return real;
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#cancel()");
    }

    public void followRedirect() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#followRedirect()");
    }

    public com.micklab.dcg.wrapper.android.net.http.HeaderBlock getHeaders() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getHeaders()");
    }

    public java.lang.String getHttpMethod() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getHttpMethod()");
    }

    public int getPriority() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getPriority()");
    }

    public void getStatus(com.micklab.dcg.wrapper.android.net.http.UrlRequest.StatusListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getStatus(android.net.http.UrlRequest$StatusListener)");
    }

    public int getTrafficStatsTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getTrafficStatsTag()");
    }

    public int getTrafficStatsUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#getTrafficStatsUid()");
    }

    public boolean hasTrafficStatsTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#hasTrafficStatsTag()");
    }

    public boolean hasTrafficStatsUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#hasTrafficStatsUid()");
    }

    public boolean isCacheDisabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#isCacheDisabled()");
    }

    public boolean isDirectExecutorAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#isDirectExecutorAllowed()");
    }

    public boolean isDone() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#isDone()");
    }

    public void read(java.nio.ByteBuffer arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#read(java.nio.ByteBuffer)");
    }

    public void start() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest#start()");
    }


    public static final class Builder {
        private final android.net.http.UrlRequest.Builder real;

        public Builder(android.net.http.UrlRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder wrap(android.net.http.UrlRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder(real);
        }

        public android.net.http.UrlRequest.Builder unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder addHeader(java.lang.String arg0, java.lang.String arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#addHeader(java.lang.String,java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder bindToNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#bindToNetwork(android.net.Network)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setCacheDisabled(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setCacheDisabled(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setDirectExecutorAllowed(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setDirectExecutorAllowed(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setHttpMethod(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setHttpMethod(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setPriority(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setPriority(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setTrafficStatsTag(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setTrafficStatsTag(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setTrafficStatsUid(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setTrafficStatsUid(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.UrlRequest.Builder setUploadDataProvider(com.micklab.dcg.wrapper.android.net.http.UploadDataProvider arg0, java.util.concurrent.Executor arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Builder#setUploadDataProvider(android.net.http.UploadDataProvider,java.util.concurrent.Executor)");
        }

    }
    public static final class Callback {
        private final android.net.http.UrlRequest.Callback real;

        public Callback(android.net.http.UrlRequest.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.UrlRequest.Callback wrap(android.net.http.UrlRequest.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlRequest.Callback(real);
        }

        public android.net.http.UrlRequest.Callback unwrap() {
            return real;
        }

        public void onCanceled(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onCanceled(android.net.http.UrlRequest,android.net.http.UrlResponseInfo)");
        }

        public void onFailed(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, com.micklab.dcg.wrapper.android.net.http.HttpException arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onFailed(android.net.http.UrlRequest,android.net.http.UrlResponseInfo,android.net.http.HttpException)");
        }

        public void onReadCompleted(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, java.nio.ByteBuffer arg2) throws java.lang.Exception {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onReadCompleted(android.net.http.UrlRequest,android.net.http.UrlResponseInfo,java.nio.ByteBuffer)");
        }

        public void onRedirectReceived(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, java.lang.String arg2) throws java.lang.Exception {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onRedirectReceived(android.net.http.UrlRequest,android.net.http.UrlResponseInfo,java.lang.String)");
        }

        public void onResponseStarted(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) throws java.lang.Exception {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onResponseStarted(android.net.http.UrlRequest,android.net.http.UrlResponseInfo)");
        }

        public void onSucceeded(com.micklab.dcg.wrapper.android.net.http.UrlRequest arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$Callback#onSucceeded(android.net.http.UrlRequest,android.net.http.UrlResponseInfo)");
        }

    }
    public static final class Status {
        private final android.net.http.UrlRequest.Status real;

        public Status(android.net.http.UrlRequest.Status real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.UrlRequest.Status wrap(android.net.http.UrlRequest.Status real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlRequest.Status(real);
        }

        public android.net.http.UrlRequest.Status unwrap() {
            return real;
        }


    }
    public static final class StatusListener {
        private final android.net.http.UrlRequest.StatusListener real;

        public StatusListener(android.net.http.UrlRequest.StatusListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.UrlRequest.StatusListener wrap(android.net.http.UrlRequest.StatusListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlRequest.StatusListener(real);
        }

        public android.net.http.UrlRequest.StatusListener unwrap() {
            return real;
        }

        public void onStatus(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlRequest$StatusListener#onStatus(int)");
        }

    }
}
