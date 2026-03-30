// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.data;

public final class TrafficDescriptor {
    private final android.telephony.data.TrafficDescriptor real;

    public TrafficDescriptor(android.telephony.data.TrafficDescriptor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor wrap(android.telephony.data.TrafficDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor(real);
    }

    public android.telephony.data.TrafficDescriptor unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#equals(java.lang.Object)");
    }

    public java.lang.String getDataNetworkName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#getDataNetworkName()");
    }

    public byte[] getOsAppId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#getOsAppId()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private final android.telephony.data.TrafficDescriptor.Builder real;

        public Builder(android.telephony.data.TrafficDescriptor.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor.Builder wrap(android.telephony.data.TrafficDescriptor.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor.Builder(real);
        }

        public android.telephony.data.TrafficDescriptor.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor$Builder#android.telephony.data.TrafficDescriptor$Builder()");
        }

        public com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor.Builder setDataNetworkName(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor$Builder#setDataNetworkName(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.telephony.data.TrafficDescriptor.Builder setOsAppId(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.data.TrafficDescriptor$Builder#setOsAppId([B)");
        }

    }
}
