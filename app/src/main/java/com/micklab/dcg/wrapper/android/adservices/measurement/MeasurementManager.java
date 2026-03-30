// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class MeasurementManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MeasurementManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager wrap(android.adservices.measurement.MeasurementManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.MeasurementManager getReal() {
        return (android.adservices.measurement.MeasurementManager) real;
    }

    public android.adservices.measurement.MeasurementManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.measurement.MeasurementManager.wrap(android.adservices.measurement.MeasurementManager.get(arg0 == null ? null : arg0.getReal()));
    }

    public static final int MEASUREMENT_API_STATE_DISABLED = android.adservices.measurement.MeasurementManager.MEASUREMENT_API_STATE_DISABLED;
    public static final int MEASUREMENT_API_STATE_ENABLED = android.adservices.measurement.MeasurementManager.MEASUREMENT_API_STATE_ENABLED;

}
