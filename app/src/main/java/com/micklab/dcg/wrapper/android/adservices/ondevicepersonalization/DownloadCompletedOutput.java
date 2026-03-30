// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class DownloadCompletedOutput {
    private final android.adservices.ondevicepersonalization.DownloadCompletedOutput real;

    public DownloadCompletedOutput(android.adservices.ondevicepersonalization.DownloadCompletedOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput wrap(android.adservices.ondevicepersonalization.DownloadCompletedOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput(real);
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder wrap(android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder addRetainedKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder.wrap(real.addRetainedKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.wrap(real.build());
        }

    }
}
