// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class DownloadCompletedOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadCompletedOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput wrap(android.adservices.ondevicepersonalization.DownloadCompletedOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedOutput getReal() {
        return (android.adservices.ondevicepersonalization.DownloadCompletedOutput) real;
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.DownloadCompletedOutput) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.DownloadCompletedOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder wrap(android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder addRetainedKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder.wrap(((android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder) real).addRetainedKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedOutput.wrap(((android.adservices.ondevicepersonalization.DownloadCompletedOutput.Builder) real).build());
        }

    }
}
