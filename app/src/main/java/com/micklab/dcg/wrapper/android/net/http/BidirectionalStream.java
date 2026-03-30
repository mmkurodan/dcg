// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class BidirectionalStream {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BidirectionalStream(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.BidirectionalStream wrap(android.net.http.BidirectionalStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.BidirectionalStream(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.BidirectionalStream getReal() {
        return (android.net.http.BidirectionalStream) real;
    }

    public android.net.http.BidirectionalStream unwrap() {
        return getReal();
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#cancel()");
    }

    public void flush() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#flush()");
    }

    public com.micklab.dcg.wrapper.android.net.http.HeaderBlock getHeaders() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#getHeaders()");
    }

    public java.lang.String getHttpMethod() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#getHttpMethod()");
    }

    public int getPriority() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#getPriority()");
    }

    public int getTrafficStatsTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#getTrafficStatsTag()");
    }

    public int getTrafficStatsUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#getTrafficStatsUid()");
    }

    public boolean hasTrafficStatsTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#hasTrafficStatsTag()");
    }

    public boolean hasTrafficStatsUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#hasTrafficStatsUid()");
    }

    public boolean isDelayRequestHeadersUntilFirstFlushEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#isDelayRequestHeadersUntilFirstFlushEnabled()");
    }

    public boolean isDone() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#isDone()");
    }

    public void read(java.nio.ByteBuffer arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#read(java.nio.ByteBuffer)");
    }

    public void start() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#start()");
    }

    public void write(java.nio.ByteBuffer arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream#write(java.nio.ByteBuffer,boolean)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder wrap(android.net.http.BidirectionalStream.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.http.BidirectionalStream.Builder getReal() {
            return (android.net.http.BidirectionalStream.Builder) real;
        }

        public android.net.http.BidirectionalStream.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder addHeader(java.lang.String arg0, java.lang.String arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#addHeader(java.lang.String,java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder setDelayRequestHeadersUntilFirstFlushEnabled(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#setDelayRequestHeadersUntilFirstFlushEnabled(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder setHttpMethod(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#setHttpMethod(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder setPriority(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#setPriority(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder setTrafficStatsTag(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#setTrafficStatsTag(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Builder setTrafficStatsUid(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Builder#setTrafficStatsUid(int)");
        }

    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Callback wrap(android.net.http.BidirectionalStream.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.BidirectionalStream.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.net.http.BidirectionalStream.Callback getReal() {
            return (android.net.http.BidirectionalStream.Callback) real;
        }

        public android.net.http.BidirectionalStream.Callback unwrap() {
            return getReal();
        }

        public void onCanceled(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onCanceled(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo)");
        }

        public void onFailed(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, com.micklab.dcg.wrapper.android.net.http.HttpException arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onFailed(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo,android.net.http.HttpException)");
        }

        public void onReadCompleted(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, java.nio.ByteBuffer arg2, boolean arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onReadCompleted(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo,java.nio.ByteBuffer,boolean)");
        }

        public void onResponseHeadersReceived(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onResponseHeadersReceived(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo)");
        }

        public void onResponseTrailersReceived(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, com.micklab.dcg.wrapper.android.net.http.HeaderBlock arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onResponseTrailersReceived(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo,android.net.http.HeaderBlock)");
        }

        public void onStreamReady(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onStreamReady(android.net.http.BidirectionalStream)");
        }

        public void onSucceeded(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onSucceeded(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo)");
        }

        public void onWriteCompleted(com.micklab.dcg.wrapper.android.net.http.BidirectionalStream arg0, com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo arg1, java.nio.ByteBuffer arg2, boolean arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.BidirectionalStream$Callback#onWriteCompleted(android.net.http.BidirectionalStream,android.net.http.UrlResponseInfo,java.nio.ByteBuffer,boolean)");
        }

    }
}
