// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SignalThresholdInfo {
    private final android.telephony.SignalThresholdInfo real;

    public SignalThresholdInfo(android.telephony.SignalThresholdInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo wrap(android.telephony.SignalThresholdInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo(real);
    }

    public android.telephony.SignalThresholdInfo unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#equals(java.lang.Object)");
    }

    public int getHysteresisDb() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getHysteresisDb()");
    }

    public static int getMaximumNumberOfThresholdsAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getMaximumNumberOfThresholdsAllowed()");
    }

    public static int getMinimumNumberOfThresholdsAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getMinimumNumberOfThresholdsAllowed()");
    }

    public int getRadioAccessNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getRadioAccessNetworkType()");
    }

    public int getSignalMeasurementType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getSignalMeasurementType()");
    }

    public int[] getThresholds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#getThresholds()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private final android.telephony.SignalThresholdInfo.Builder real;

        public Builder(android.telephony.SignalThresholdInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder wrap(android.telephony.SignalThresholdInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder(real);
        }

        public android.telephony.SignalThresholdInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#android.telephony.SignalThresholdInfo$Builder()");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder setHysteresisDb(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#setHysteresisDb(int)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder setRadioAccessNetworkType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#setRadioAccessNetworkType(int)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder setSignalMeasurementType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#setSignalMeasurementType(int)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SignalThresholdInfo.Builder setThresholds(int[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SignalThresholdInfo$Builder#setThresholds([I)");
        }

    }
}
