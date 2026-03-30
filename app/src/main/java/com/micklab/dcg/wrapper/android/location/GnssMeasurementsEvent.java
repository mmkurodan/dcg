// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurementsEvent {
    private final android.location.GnssMeasurementsEvent real;

    public GnssMeasurementsEvent(android.location.GnssMeasurementsEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent wrap(android.location.GnssMeasurementsEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent(real);
    }

    public android.location.GnssMeasurementsEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.location.GnssClock getClock() {
        return com.micklab.dcg.wrapper.android.location.GnssClock.wrap(real.getClock());
    }

    public boolean hasIsFullTracking() {
        return real.hasIsFullTracking();
    }

    public boolean isFullTracking() {
        return real.isFullTracking();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.location.GnssMeasurementsEvent.Builder real;

        public Builder(android.location.GnssMeasurementsEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder wrap(android.location.GnssMeasurementsEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder(real);
        }

        public android.location.GnssMeasurementsEvent.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssMeasurementsEvent.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent arg0) {
            this(new android.location.GnssMeasurementsEvent.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent build() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder clearIsFullTracking() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(real.clearIsFullTracking());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder setClock(com.micklab.dcg.wrapper.android.location.GnssClock arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(real.setClock(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder setIsFullTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(real.setIsFullTracking(arg0));
        }

    }
    public static final class Callback {
        private final android.location.GnssMeasurementsEvent.Callback real;

        public Callback(android.location.GnssMeasurementsEvent.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback wrap(android.location.GnssMeasurementsEvent.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback(real);
        }

        public android.location.GnssMeasurementsEvent.Callback unwrap() {
            return real;
        }

        public void onGnssMeasurementsReceived(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent arg0) {
            real.onGnssMeasurementsReceived(arg0 == null ? null : arg0.unwrap());
        }

        public void onStatusChanged(int arg0) {
            real.onStatusChanged(arg0);
        }

        public static final int STATUS_LOCATION_DISABLED = android.location.GnssMeasurementsEvent.Callback.STATUS_LOCATION_DISABLED;
        public static final int STATUS_NOT_ALLOWED = android.location.GnssMeasurementsEvent.Callback.STATUS_NOT_ALLOWED;
        public static final int STATUS_NOT_SUPPORTED = android.location.GnssMeasurementsEvent.Callback.STATUS_NOT_SUPPORTED;
        public static final int STATUS_READY = android.location.GnssMeasurementsEvent.Callback.STATUS_READY;

    }
}
