// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class TelephonyNetworkSpecifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TelephonyNetworkSpecifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier wrap(android.net.TelephonyNetworkSpecifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier(real, (__DcgwBridgeToken) null);
    }

    public android.net.TelephonyNetworkSpecifier getReal() {
        return (android.net.TelephonyNetworkSpecifier) real;
    }

    public android.net.TelephonyNetworkSpecifier unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#equals(java.lang.Object)");
    }

    public int getSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#getSubscriptionId()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier.Builder wrap(android.net.TelephonyNetworkSpecifier.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.TelephonyNetworkSpecifier.Builder getReal() {
            return (android.net.TelephonyNetworkSpecifier.Builder) real;
        }

        public android.net.TelephonyNetworkSpecifier.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier$Builder#android.net.TelephonyNetworkSpecifier$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.TelephonyNetworkSpecifier.Builder setSubscriptionId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TelephonyNetworkSpecifier$Builder#setSubscriptionId(int)");
        }

    }
}
