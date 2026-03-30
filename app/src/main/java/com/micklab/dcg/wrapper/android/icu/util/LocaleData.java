// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class LocaleData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocaleData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.LocaleData wrap(android.icu.util.LocaleData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.LocaleData(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.LocaleData getReal() {
        return (android.icu.util.LocaleData) real;
    }

    public android.icu.util.LocaleData unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.VersionInfo getCLDRVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(android.icu.util.LocaleData.getCLDRVersion());
    }

    public java.lang.String getDelimiter(int arg0) {
        return ((android.icu.util.LocaleData) real).getDelimiter(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.LocaleData getInstance() {
        return com.micklab.dcg.wrapper.android.icu.util.LocaleData.wrap(android.icu.util.LocaleData.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.util.LocaleData getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.LocaleData.wrap(android.icu.util.LocaleData.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem getMeasurementSystem(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem.wrap(android.icu.util.LocaleData.getMeasurementSystem(arg0 == null ? null : arg0.getReal()));
    }

    public boolean getNoSubstitute() {
        return ((android.icu.util.LocaleData) real).getNoSubstitute();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.LocaleData.PaperSize getPaperSize(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.LocaleData.PaperSize.wrap(android.icu.util.LocaleData.getPaperSize(arg0 == null ? null : arg0.getReal()));
    }

    public void setNoSubstitute(boolean arg0) {
        ((android.icu.util.LocaleData) real).setNoSubstitute(arg0);
    }

    public static final int ALT_QUOTATION_END = android.icu.util.LocaleData.ALT_QUOTATION_END;
    public static final int ALT_QUOTATION_START = android.icu.util.LocaleData.ALT_QUOTATION_START;
    public static final int QUOTATION_END = android.icu.util.LocaleData.QUOTATION_END;
    public static final int QUOTATION_START = android.icu.util.LocaleData.QUOTATION_START;

    public static final class MeasurementSystem {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MeasurementSystem(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem wrap(android.icu.util.LocaleData.MeasurementSystem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem(real, (__DcgwBridgeToken) null);
        }

        public android.icu.util.LocaleData.MeasurementSystem getReal() {
            return (android.icu.util.LocaleData.MeasurementSystem) real;
        }

        public android.icu.util.LocaleData.MeasurementSystem unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem SI = com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem.wrap(android.icu.util.LocaleData.MeasurementSystem.SI);
        public static final com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem UK = com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem.wrap(android.icu.util.LocaleData.MeasurementSystem.UK);
        public static final com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem US = com.micklab.dcg.wrapper.android.icu.util.LocaleData.MeasurementSystem.wrap(android.icu.util.LocaleData.MeasurementSystem.US);

    }
    public static final class PaperSize {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PaperSize(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.LocaleData.PaperSize wrap(android.icu.util.LocaleData.PaperSize real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.LocaleData.PaperSize(real, (__DcgwBridgeToken) null);
        }

        public android.icu.util.LocaleData.PaperSize getReal() {
            return (android.icu.util.LocaleData.PaperSize) real;
        }

        public android.icu.util.LocaleData.PaperSize unwrap() {
            return getReal();
        }

        public int getHeight() {
            return ((android.icu.util.LocaleData.PaperSize) real).getHeight();
        }

        public int getWidth() {
            return ((android.icu.util.LocaleData.PaperSize) real).getWidth();
        }

    }
}
