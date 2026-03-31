// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class L2capNetworkSpecifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private L2capNetworkSpecifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier wrap(android.net.L2capNetworkSpecifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier(real, (__DcgwBridgeToken) null);
    }

    public android.net.L2capNetworkSpecifier getReal() {
        return (android.net.L2capNetworkSpecifier) real;
    }

    public android.net.L2capNetworkSpecifier unwrap() {
        return getReal();
    }

    public boolean canBeSatisfiedBy(com.micklab.dcg.wrapper.android.net.NetworkSpecifier arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#canBeSatisfiedBy(android.net.NetworkSpecifier)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#equals(java.lang.Object)");
    }

    public int getHeaderCompression() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#getHeaderCompression()");
    }

    public int getPsm() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#getPsm()");
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getRemoteAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#getRemoteAddress()");
    }

    public int getRole() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#getRole()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#hashCode()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier redact() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#redact()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder wrap(android.net.L2capNetworkSpecifier.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.L2capNetworkSpecifier.Builder getReal() {
            return (android.net.L2capNetworkSpecifier.Builder) real;
        }

        public android.net.L2capNetworkSpecifier.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#android.net.L2capNetworkSpecifier$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder setHeaderCompression(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#setHeaderCompression(int)");
        }

        public com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder setPsm(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#setPsm(int)");
        }

        public com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder setRemoteAddress(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#setRemoteAddress(android.net.MacAddress)");
        }

        public com.micklab.dcg.wrapper.android.net.L2capNetworkSpecifier.Builder setRole(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.L2capNetworkSpecifier$Builder#setRole(int)");
        }

    }
}
