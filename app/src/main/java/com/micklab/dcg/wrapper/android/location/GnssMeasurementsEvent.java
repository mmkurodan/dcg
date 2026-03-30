// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurementsEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssMeasurementsEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent wrap(android.location.GnssMeasurementsEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssMeasurementsEvent getReal() {
        return (android.location.GnssMeasurementsEvent) real;
    }

    public android.location.GnssMeasurementsEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssMeasurementsEvent) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.location.GnssClock getClock() {
        return com.micklab.dcg.wrapper.android.location.GnssClock.wrap(((android.location.GnssMeasurementsEvent) real).getClock());
    }

    public boolean hasIsFullTracking() {
        return ((android.location.GnssMeasurementsEvent) real).hasIsFullTracking();
    }

    public boolean isFullTracking() {
        return ((android.location.GnssMeasurementsEvent) real).isFullTracking();
    }

    public java.lang.String toString() {
        return ((android.location.GnssMeasurementsEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssMeasurementsEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder wrap(android.location.GnssMeasurementsEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssMeasurementsEvent.Builder getReal() {
            return (android.location.GnssMeasurementsEvent.Builder) real;
        }

        public android.location.GnssMeasurementsEvent.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssMeasurementsEvent.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent arg0) {
            this(new android.location.GnssMeasurementsEvent.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent build() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.wrap(((android.location.GnssMeasurementsEvent.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder clearIsFullTracking() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(((android.location.GnssMeasurementsEvent.Builder) real).clearIsFullTracking());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder setClock(com.micklab.dcg.wrapper.android.location.GnssClock arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(((android.location.GnssMeasurementsEvent.Builder) real).setClock(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder setIsFullTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Builder.wrap(((android.location.GnssMeasurementsEvent.Builder) real).setIsFullTracking(arg0));
        }

    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback wrap(android.location.GnssMeasurementsEvent.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssMeasurementsEvent.Callback getReal() {
            return (android.location.GnssMeasurementsEvent.Callback) real;
        }

        public android.location.GnssMeasurementsEvent.Callback unwrap() {
            return getReal();
        }

        public void onGnssMeasurementsReceived(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent arg0) {
            ((android.location.GnssMeasurementsEvent.Callback) real).onGnssMeasurementsReceived(arg0 == null ? null : arg0.getReal());
        }

        public void onStatusChanged(int arg0) {
            ((android.location.GnssMeasurementsEvent.Callback) real).onStatusChanged(arg0);
        }

        public static final int STATUS_LOCATION_DISABLED = android.location.GnssMeasurementsEvent.Callback.STATUS_LOCATION_DISABLED;
        public static final int STATUS_NOT_ALLOWED = android.location.GnssMeasurementsEvent.Callback.STATUS_NOT_ALLOWED;
        public static final int STATUS_NOT_SUPPORTED = android.location.GnssMeasurementsEvent.Callback.STATUS_NOT_SUPPORTED;
        public static final int STATUS_READY = android.location.GnssMeasurementsEvent.Callback.STATUS_READY;

    }
}
