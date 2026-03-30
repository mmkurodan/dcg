// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class PeriodicAdvertisingParameters {
    private final android.bluetooth.le.PeriodicAdvertisingParameters real;

    public PeriodicAdvertisingParameters(android.bluetooth.le.PeriodicAdvertisingParameters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters wrap(android.bluetooth.le.PeriodicAdvertisingParameters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters(real);
    }

    public android.bluetooth.le.PeriodicAdvertisingParameters unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean getIncludeTxPower() {
        return real.getIncludeTxPower();
    }

    public int getInterval() {
        return real.getInterval();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.bluetooth.le.PeriodicAdvertisingParameters.Builder real;

        public Builder(android.bluetooth.le.PeriodicAdvertisingParameters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder wrap(android.bluetooth.le.PeriodicAdvertisingParameters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder(real);
        }

        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.PeriodicAdvertisingParameters.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder setIncludeTxPower(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder.wrap(real.setIncludeTxPower(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder setInterval(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters.Builder.wrap(real.setInterval(arg0));
        }

    }
}
