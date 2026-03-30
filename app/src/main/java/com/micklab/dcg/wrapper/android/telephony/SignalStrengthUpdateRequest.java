// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SignalStrengthUpdateRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SignalStrengthUpdateRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest wrap(android.telephony.SignalStrengthUpdateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.SignalStrengthUpdateRequest getReal() {
        return (android.telephony.SignalStrengthUpdateRequest) real;
    }

    public android.telephony.SignalStrengthUpdateRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#hashCode()");
    }

    public boolean isReportingRequestedWhileIdle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#isReportingRequestedWhileIdle()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest.Builder wrap(android.telephony.SignalStrengthUpdateRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SignalStrengthUpdateRequest.Builder getReal() {
            return (android.telephony.SignalStrengthUpdateRequest.Builder) real;
        }

        public android.telephony.SignalStrengthUpdateRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest$Builder#android.telephony.SignalStrengthUpdateRequest$Builder()");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest.Builder setReportingRequestedWhileIdle(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalStrengthUpdateRequest$Builder#setReportingRequestedWhileIdle(boolean)");
        }

    }
}
