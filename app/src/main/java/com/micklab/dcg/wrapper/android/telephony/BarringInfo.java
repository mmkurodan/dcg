// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class BarringInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BarringInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.BarringInfo wrap(android.telephony.BarringInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.BarringInfo(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.BarringInfo getReal() {
        return (android.telephony.BarringInfo) real;
    }

    public android.telephony.BarringInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.BarringInfo.BarringServiceInfo getBarringServiceInfo(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#getBarringServiceInfo(int)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo#writeToParcel(android.os.Parcel,int)");
    }


    public static final class BarringServiceInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BarringServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.BarringInfo.BarringServiceInfo wrap(android.telephony.BarringInfo.BarringServiceInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.BarringInfo.BarringServiceInfo(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.BarringInfo.BarringServiceInfo getReal() {
            return (android.telephony.BarringInfo.BarringServiceInfo) real;
        }

        public android.telephony.BarringInfo.BarringServiceInfo unwrap() {
            return getReal();
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#equals(java.lang.Object)");
        }

        public int getBarringType() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#getBarringType()");
        }

        public int getConditionalBarringFactor() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#getConditionalBarringFactor()");
        }

        public int getConditionalBarringTimeSeconds() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#getConditionalBarringTimeSeconds()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#hashCode()");
        }

        public boolean isBarred() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#isBarred()");
        }

        public boolean isConditionallyBarred() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#isConditionallyBarred()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#toString()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.BarringInfo$BarringServiceInfo#writeToParcel(android.os.Parcel,int)");
        }


    }
}
