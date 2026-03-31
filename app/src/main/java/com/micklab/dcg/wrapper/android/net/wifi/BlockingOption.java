// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class BlockingOption {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlockingOption(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.BlockingOption wrap(android.net.wifi.BlockingOption real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.BlockingOption(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.BlockingOption getReal() {
        return (android.net.wifi.BlockingOption) real;
    }

    public android.net.wifi.BlockingOption unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#equals(java.lang.Object)");
    }

    public int getBlockingTimeSeconds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#getBlockingTimeSeconds()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#hashCode()");
    }

    public boolean isBlockingBssidOnly() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#isBlockingBssidOnly()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.BlockingOption.Builder wrap(android.net.wifi.BlockingOption.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.BlockingOption.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.BlockingOption.Builder getReal() {
            return (android.net.wifi.BlockingOption.Builder) real;
        }

        public android.net.wifi.BlockingOption.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption$Builder#android.net.wifi.BlockingOption$Builder(int)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.BlockingOption build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.BlockingOption.Builder setBlockingBssidOnly(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.BlockingOption$Builder#setBlockingBssidOnly(boolean)");
        }

    }
}
