// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.nsd;

public final class DiscoveryRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DiscoveryRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest wrap(android.net.nsd.DiscoveryRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest(real, (__DcgwBridgeToken) null);
    }

    public android.net.nsd.DiscoveryRequest getReal() {
        return (android.net.nsd.DiscoveryRequest) real;
    }

    public android.net.nsd.DiscoveryRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#getNetwork()");
    }

    public java.lang.String getServiceType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#getServiceType()");
    }

    public java.lang.String getSubtype() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#getSubtype()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest.Builder wrap(android.net.nsd.DiscoveryRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.DiscoveryRequest.Builder getReal() {
            return (android.net.nsd.DiscoveryRequest.Builder) real;
        }

        public android.net.nsd.DiscoveryRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest$Builder#android.net.nsd.DiscoveryRequest$Builder(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest.Builder setNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest$Builder#setNetwork(android.net.Network)");
        }

        public com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest.Builder setSubtype(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.DiscoveryRequest$Builder#setSubtype(java.lang.String)");
        }

    }
}
