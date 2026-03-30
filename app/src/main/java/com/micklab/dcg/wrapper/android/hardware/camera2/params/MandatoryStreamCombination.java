// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MandatoryStreamCombination {
    private final android.hardware.camera2.params.MandatoryStreamCombination real;

    public MandatoryStreamCombination(android.hardware.camera2.params.MandatoryStreamCombination real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination wrap(android.hardware.camera2.params.MandatoryStreamCombination real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination(real);
    }

    public android.hardware.camera2.params.MandatoryStreamCombination unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isReprocessable() {
        return real.isReprocessable();
    }

    public static final class MandatoryStreamInformation {
        private final android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation real;

        public MandatoryStreamInformation(android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation wrap(android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation(real);
        }

        public android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int get10BitFormat() {
            return real.get10BitFormat();
        }

        public int getFormat() {
            return real.getFormat();
        }

        public long getStreamUseCase() {
            return real.getStreamUseCase();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public boolean is10BitCapable() {
            return real.is10BitCapable();
        }

        public boolean isInput() {
            return real.isInput();
        }

        public boolean isMaximumSize() {
            return real.isMaximumSize();
        }

        public boolean isUltraHighResolution() {
            return real.isUltraHighResolution();
        }

    }
}
