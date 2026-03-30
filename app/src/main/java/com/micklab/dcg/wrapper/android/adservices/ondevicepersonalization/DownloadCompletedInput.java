// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class DownloadCompletedInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadCompletedInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedInput wrap(android.adservices.ondevicepersonalization.DownloadCompletedInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedInput getReal() {
        return (android.adservices.ondevicepersonalization.DownloadCompletedInput) real;
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedInput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.DownloadCompletedInput) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getDownloadedContents() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(((android.adservices.ondevicepersonalization.DownloadCompletedInput) real).getDownloadedContents());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.DownloadCompletedInput) real).hashCode();
    }

}
