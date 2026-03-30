// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class Visualizer {
    private final android.media.audiofx.Visualizer real;

    public Visualizer(android.media.audiofx.Visualizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.Visualizer wrap(android.media.audiofx.Visualizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Visualizer(real);
    }

    public android.media.audiofx.Visualizer unwrap() {
        return real;
    }

    public Visualizer(int arg0) throws java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.Visualizer(arg0));
    }

    public int getCaptureSize() throws java.lang.IllegalStateException {
        return real.getCaptureSize();
    }

    public static int[] getCaptureSizeRange() {
        return android.media.audiofx.Visualizer.getCaptureSizeRange();
    }

    public boolean getEnabled() {
        return real.getEnabled();
    }

    public int getFft(byte[] arg0) throws java.lang.IllegalStateException {
        return real.getFft(arg0);
    }

    public static int getMaxCaptureRate() {
        return android.media.audiofx.Visualizer.getMaxCaptureRate();
    }

    public int getMeasurementMode() throws java.lang.IllegalStateException {
        return real.getMeasurementMode();
    }

    public int getMeasurementPeakRms(com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.MeasurementPeakRms arg0) {
        return real.getMeasurementPeakRms(arg0 == null ? null : arg0.unwrap());
    }

    public int getSamplingRate() throws java.lang.IllegalStateException {
        return real.getSamplingRate();
    }

    public int getScalingMode() throws java.lang.IllegalStateException {
        return real.getScalingMode();
    }

    public int getWaveForm(byte[] arg0) throws java.lang.IllegalStateException {
        return real.getWaveForm(arg0);
    }

    public void release() {
        real.release();
    }

    public int setCaptureSize(int arg0) throws java.lang.IllegalStateException {
        return real.setCaptureSize(arg0);
    }

    public int setDataCaptureListener(com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.OnDataCaptureListener arg0, int arg1, boolean arg2, boolean arg3) {
        return real.setDataCaptureListener(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public int setEnabled(boolean arg0) throws java.lang.IllegalStateException {
        return real.setEnabled(arg0);
    }

    public int setMeasurementMode(int arg0) throws java.lang.IllegalStateException {
        return real.setMeasurementMode(arg0);
    }

    public int setScalingMode(int arg0) throws java.lang.IllegalStateException {
        return real.setScalingMode(arg0);
    }

    public static final int ALREADY_EXISTS = android.media.audiofx.Visualizer.ALREADY_EXISTS;
    public static final int ERROR = android.media.audiofx.Visualizer.ERROR;
    public static final int ERROR_BAD_VALUE = android.media.audiofx.Visualizer.ERROR_BAD_VALUE;
    public static final int ERROR_DEAD_OBJECT = android.media.audiofx.Visualizer.ERROR_DEAD_OBJECT;
    public static final int ERROR_INVALID_OPERATION = android.media.audiofx.Visualizer.ERROR_INVALID_OPERATION;
    public static final int ERROR_NO_INIT = android.media.audiofx.Visualizer.ERROR_NO_INIT;
    public static final int ERROR_NO_MEMORY = android.media.audiofx.Visualizer.ERROR_NO_MEMORY;
    public static final int MEASUREMENT_MODE_NONE = android.media.audiofx.Visualizer.MEASUREMENT_MODE_NONE;
    public static final int MEASUREMENT_MODE_PEAK_RMS = android.media.audiofx.Visualizer.MEASUREMENT_MODE_PEAK_RMS;
    public static final int SCALING_MODE_AS_PLAYED = android.media.audiofx.Visualizer.SCALING_MODE_AS_PLAYED;
    public static final int SCALING_MODE_NORMALIZED = android.media.audiofx.Visualizer.SCALING_MODE_NORMALIZED;
    public static final int STATE_ENABLED = android.media.audiofx.Visualizer.STATE_ENABLED;
    public static final int STATE_INITIALIZED = android.media.audiofx.Visualizer.STATE_INITIALIZED;
    public static final int STATE_UNINITIALIZED = android.media.audiofx.Visualizer.STATE_UNINITIALIZED;
    public static final int SUCCESS = android.media.audiofx.Visualizer.SUCCESS;

    public static final class MeasurementPeakRms {
        private final android.media.audiofx.Visualizer.MeasurementPeakRms real;

        public MeasurementPeakRms(android.media.audiofx.Visualizer.MeasurementPeakRms real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.MeasurementPeakRms wrap(android.media.audiofx.Visualizer.MeasurementPeakRms real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.MeasurementPeakRms(real);
        }

        public android.media.audiofx.Visualizer.MeasurementPeakRms unwrap() {
            return real;
        }

        public MeasurementPeakRms() {
            this(new android.media.audiofx.Visualizer.MeasurementPeakRms());
        }


    }
    public static final class OnDataCaptureListener {
        private final android.media.audiofx.Visualizer.OnDataCaptureListener real;

        public OnDataCaptureListener(android.media.audiofx.Visualizer.OnDataCaptureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.OnDataCaptureListener wrap(android.media.audiofx.Visualizer.OnDataCaptureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Visualizer.OnDataCaptureListener(real);
        }

        public android.media.audiofx.Visualizer.OnDataCaptureListener unwrap() {
            return real;
        }

        public void onFftDataCapture(com.micklab.dcg.wrapper.android.media.audiofx.Visualizer arg0, byte[] arg1, int arg2) {
            real.onFftDataCapture(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public void onWaveFormDataCapture(com.micklab.dcg.wrapper.android.media.audiofx.Visualizer arg0, byte[] arg1, int arg2) {
            real.onWaveFormDataCapture(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
