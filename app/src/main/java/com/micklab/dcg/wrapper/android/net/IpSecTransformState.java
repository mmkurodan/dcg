// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpSecTransformState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IpSecTransformState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpSecTransformState wrap(android.net.IpSecTransformState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecTransformState(real, (__DcgwBridgeToken) null);
    }

    public android.net.IpSecTransformState getReal() {
        return (android.net.IpSecTransformState) real;
    }

    public android.net.IpSecTransformState unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#describeContents()");
    }

    public long getByteCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getByteCount()");
    }

    public long getPacketCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getPacketCount()");
    }

    public byte[] getReplayBitmap() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getReplayBitmap()");
    }

    public long getRxHighestSequenceNumber() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getRxHighestSequenceNumber()");
    }

    public long getTimestampMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getTimestampMillis()");
    }

    public long getTxHighestSequenceNumber() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#getTxHighestSequenceNumber()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder wrap(android.net.IpSecTransformState.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpSecTransformState.Builder getReal() {
            return (android.net.IpSecTransformState.Builder) real;
        }

        public android.net.IpSecTransformState.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#android.net.IpSecTransformState$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setByteCount(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setByteCount(long)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setPacketCount(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setPacketCount(long)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setReplayBitmap(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setReplayBitmap([B)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setRxHighestSequenceNumber(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setRxHighestSequenceNumber(long)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setTimestampMillis(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setTimestampMillis(long)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransformState.Builder setTxHighestSequenceNumber(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransformState$Builder#setTxHighestSequenceNumber(long)");
        }

    }
}
