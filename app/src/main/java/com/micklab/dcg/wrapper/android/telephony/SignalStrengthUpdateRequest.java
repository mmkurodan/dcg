// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SignalStrengthUpdateRequest {
    private final android.telephony.SignalStrengthUpdateRequest real;

    public SignalStrengthUpdateRequest(android.telephony.SignalStrengthUpdateRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest wrap(android.telephony.SignalStrengthUpdateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest(real);
    }

    public android.telephony.SignalStrengthUpdateRequest unwrap() {
        return real;
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
        private final android.telephony.SignalStrengthUpdateRequest.Builder real;

        public Builder(android.telephony.SignalStrengthUpdateRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest.Builder wrap(android.telephony.SignalStrengthUpdateRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest.Builder(real);
        }

        public android.telephony.SignalStrengthUpdateRequest.Builder unwrap() {
            return real;
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
