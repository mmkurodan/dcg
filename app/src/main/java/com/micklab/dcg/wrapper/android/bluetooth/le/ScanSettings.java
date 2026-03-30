// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanSettings {
    private final android.bluetooth.le.ScanSettings real;

    public ScanSettings(android.bluetooth.le.ScanSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings wrap(android.bluetooth.le.ScanSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings(real);
    }

    public android.bluetooth.le.ScanSettings unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCallbackType() {
        return real.getCallbackType();
    }

    public boolean getLegacy() {
        return real.getLegacy();
    }

    public int getPhy() {
        return real.getPhy();
    }

    public long getReportDelayMillis() {
        return real.getReportDelayMillis();
    }

    public int getScanMode() {
        return real.getScanMode();
    }

    public int getScanResultType() {
        return real.getScanResultType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long AUTO_BATCH_MIN_REPORT_DELAY_MILLIS = android.bluetooth.le.ScanSettings.AUTO_BATCH_MIN_REPORT_DELAY_MILLIS;
    public static final int CALLBACK_TYPE_ALL_MATCHES = android.bluetooth.le.ScanSettings.CALLBACK_TYPE_ALL_MATCHES;
    public static final int CALLBACK_TYPE_ALL_MATCHES_AUTO_BATCH = android.bluetooth.le.ScanSettings.CALLBACK_TYPE_ALL_MATCHES_AUTO_BATCH;
    public static final int CALLBACK_TYPE_FIRST_MATCH = android.bluetooth.le.ScanSettings.CALLBACK_TYPE_FIRST_MATCH;
    public static final int CALLBACK_TYPE_MATCH_LOST = android.bluetooth.le.ScanSettings.CALLBACK_TYPE_MATCH_LOST;
    public static final int MATCH_MODE_AGGRESSIVE = android.bluetooth.le.ScanSettings.MATCH_MODE_AGGRESSIVE;
    public static final int MATCH_MODE_STICKY = android.bluetooth.le.ScanSettings.MATCH_MODE_STICKY;
    public static final int MATCH_NUM_FEW_ADVERTISEMENT = android.bluetooth.le.ScanSettings.MATCH_NUM_FEW_ADVERTISEMENT;
    public static final int MATCH_NUM_MAX_ADVERTISEMENT = android.bluetooth.le.ScanSettings.MATCH_NUM_MAX_ADVERTISEMENT;
    public static final int MATCH_NUM_ONE_ADVERTISEMENT = android.bluetooth.le.ScanSettings.MATCH_NUM_ONE_ADVERTISEMENT;
    public static final int PHY_LE_ALL_SUPPORTED = android.bluetooth.le.ScanSettings.PHY_LE_ALL_SUPPORTED;
    public static final int SCAN_MODE_BALANCED = android.bluetooth.le.ScanSettings.SCAN_MODE_BALANCED;
    public static final int SCAN_MODE_LOW_LATENCY = android.bluetooth.le.ScanSettings.SCAN_MODE_LOW_LATENCY;
    public static final int SCAN_MODE_LOW_POWER = android.bluetooth.le.ScanSettings.SCAN_MODE_LOW_POWER;
    public static final int SCAN_MODE_OPPORTUNISTIC = android.bluetooth.le.ScanSettings.SCAN_MODE_OPPORTUNISTIC;

    public static final class Builder {
        private final android.bluetooth.le.ScanSettings.Builder real;

        public Builder(android.bluetooth.le.ScanSettings.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder wrap(android.bluetooth.le.ScanSettings.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder(real);
        }

        public android.bluetooth.le.ScanSettings.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.ScanSettings.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setCallbackType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setCallbackType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setLegacy(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setLegacy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setMatchMode(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setMatchMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setNumOfMatches(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setNumOfMatches(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setPhy(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setPhy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setReportDelay(long arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setReportDelay(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder setScanMode(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanSettings.Builder.wrap(real.setScanMode(arg0));
        }

    }
}
