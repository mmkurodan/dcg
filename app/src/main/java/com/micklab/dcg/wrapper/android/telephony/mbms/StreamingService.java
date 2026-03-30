// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class StreamingService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StreamingService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.StreamingService wrap(android.telephony.mbms.StreamingService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.StreamingService(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.StreamingService getReal() {
        return (android.telephony.mbms.StreamingService) real;
    }

    public android.telephony.mbms.StreamingService unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingService#close()");
    }

    public com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceInfo getInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingService#getInfo()");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getPlaybackUri() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingService#getPlaybackUri()");
    }


}
