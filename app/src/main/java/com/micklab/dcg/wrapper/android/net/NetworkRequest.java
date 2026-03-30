// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class NetworkRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.NetworkRequest wrap(android.net.NetworkRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkRequest(real, (__DcgwBridgeToken) null);
    }

    public android.net.NetworkRequest getReal() {
        return (android.net.NetworkRequest) real;
    }

    public android.net.NetworkRequest unwrap() {
        return getReal();
    }

    public boolean canBeSatisfiedBy(com.micklab.dcg.wrapper.android.net.NetworkCapabilities arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#canBeSatisfiedBy(android.net.NetworkCapabilities)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#equals(java.lang.Object)");
    }

    public int[] getCapabilities() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#getCapabilities()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier getNetworkSpecifier() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#getNetworkSpecifier()");
    }

    public int[] getTransportTypes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#getTransportTypes()");
    }

    public boolean hasCapability(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#hasCapability(int)");
    }

    public boolean hasTransport(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#hasTransport(int)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder wrap(android.net.NetworkRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.NetworkRequest.Builder getReal() {
            return (android.net.NetworkRequest.Builder) real;
        }

        public android.net.NetworkRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#android.net.NetworkRequest$Builder()");
        }

        public Builder(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#android.net.NetworkRequest$Builder(android.net.NetworkRequest)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder addCapability(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#addCapability(int)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder addTransportType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#addTransportType(int)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder clearCapabilities() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#clearCapabilities()");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder removeCapability(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#removeCapability(int)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder removeTransportType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#removeTransportType(int)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder setIncludeOtherUidNetworks(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#setIncludeOtherUidNetworks(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder setNetworkSpecifier(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#setNetworkSpecifier(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkRequest.Builder setNetworkSpecifier(com.micklab.dcg.wrapper.android.net.NetworkSpecifier arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkRequest$Builder#setNetworkSpecifier(android.net.NetworkSpecifier)");
        }

    }
}
