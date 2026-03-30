// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MandatoryStreamCombination {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MandatoryStreamCombination(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination wrap(android.hardware.camera2.params.MandatoryStreamCombination real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.MandatoryStreamCombination getReal() {
        return (android.hardware.camera2.params.MandatoryStreamCombination) real;
    }

    public android.hardware.camera2.params.MandatoryStreamCombination unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.MandatoryStreamCombination) real).equals(arg0);
    }

    public java.lang.CharSequence getDescription() {
        return ((android.hardware.camera2.params.MandatoryStreamCombination) real).getDescription();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.MandatoryStreamCombination) real).hashCode();
    }

    public boolean isReprocessable() {
        return ((android.hardware.camera2.params.MandatoryStreamCombination) real).isReprocessable();
    }

    public static final class MandatoryStreamInformation {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MandatoryStreamInformation(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation wrap(android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation getReal() {
            return (android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real;
        }

        public android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).equals(arg0);
        }

        public int get10BitFormat() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).get10BitFormat();
        }

        public int getFormat() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).getFormat();
        }

        public long getStreamUseCase() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).getStreamUseCase();
        }

        public int hashCode() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).hashCode();
        }

        public boolean is10BitCapable() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).is10BitCapable();
        }

        public boolean isInput() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).isInput();
        }

        public boolean isMaximumSize() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).isMaximumSize();
        }

        public boolean isUltraHighResolution() {
            return ((android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation) real).isUltraHighResolution();
        }

    }
}
