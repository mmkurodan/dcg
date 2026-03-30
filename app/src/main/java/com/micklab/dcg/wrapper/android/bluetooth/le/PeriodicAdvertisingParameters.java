// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class PeriodicAdvertisingParameters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PeriodicAdvertisingParameters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters wrap(android.bluetooth.le.PeriodicAdvertisingParameters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.PeriodicAdvertisingParameters getReal() {
        return (android.bluetooth.le.PeriodicAdvertisingParameters) real;
    }

    public android.bluetooth.le.PeriodicAdvertisingParameters unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.le.PeriodicAdvertisingParameters) real).describeContents();
    }

    public boolean getIncludeTxPower() {
        return ((android.bluetooth.le.PeriodicAdvertisingParameters) real).getIncludeTxPower();
    }

    public int getInterval() {
        return ((android.bluetooth.le.PeriodicAdvertisingParameters) real).getInterval();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.PeriodicAdvertisingParameters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder wrap(android.bluetooth.le.PeriodicAdvertisingParameters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder getReal() {
            return (android.bluetooth.le.PeriodicAdvertisingParameters.Builder) real;
        }

        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.le.PeriodicAdvertisingParameters.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.wrap(((android.bluetooth.le.PeriodicAdvertisingParameters.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder setIncludeTxPower(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder.wrap(((android.bluetooth.le.PeriodicAdvertisingParameters.Builder) real).setIncludeTxPower(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder setInterval(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder.wrap(((android.bluetooth.le.PeriodicAdvertisingParameters.Builder) real).setInterval(arg0));
        }

    }
}
