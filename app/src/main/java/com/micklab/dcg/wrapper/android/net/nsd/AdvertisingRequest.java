// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.nsd;

public final class AdvertisingRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertisingRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest wrap(android.net.nsd.AdvertisingRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest(real, (__DcgwBridgeToken) null);
    }

    public android.net.nsd.AdvertisingRequest getReal() {
        return (android.net.nsd.AdvertisingRequest) real;
    }

    public android.net.nsd.AdvertisingRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#equals(java.lang.Object)");
    }

    public long getFlags() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#getFlags()");
    }

    public int getProtocolType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#getProtocolType()");
    }

    public com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo getServiceInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#getServiceInfo()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest.Builder wrap(android.net.nsd.AdvertisingRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.AdvertisingRequest.Builder getReal() {
            return (android.net.nsd.AdvertisingRequest.Builder) real;
        }

        public android.net.nsd.AdvertisingRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest$Builder#android.net.nsd.AdvertisingRequest$Builder(android.net.nsd.NsdServiceInfo)");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest.Builder setFlags(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest$Builder#setFlags(long)");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.AdvertisingRequest.Builder setProtocolType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.AdvertisingRequest$Builder#setProtocolType(int)");
        }

    }
}
