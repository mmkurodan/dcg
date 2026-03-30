// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class MeasurementManager {
    private final android.adservices.measurement.MeasurementManager real;

    public MeasurementManager(android.adservices.measurement.MeasurementManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager wrap(android.adservices.measurement.MeasurementManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager(real);
    }

    public android.adservices.measurement.MeasurementManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager.wrap(android.adservices.measurement.MeasurementManager.get(arg0 == null ? null : arg0.unwrap()));
    }

    public static final int MEASUREMENT_API_STATE_DISABLED = android.adservices.measurement.MeasurementManager.MEASUREMENT_API_STATE_DISABLED;
    public static final int MEASUREMENT_API_STATE_ENABLED = android.adservices.measurement.MeasurementManager.MEASUREMENT_API_STATE_ENABLED;

}
