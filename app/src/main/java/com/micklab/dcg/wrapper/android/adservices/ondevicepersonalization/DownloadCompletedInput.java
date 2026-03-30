// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class DownloadCompletedInput {
    private final android.adservices.ondevicepersonalization.DownloadCompletedInput real;

    public DownloadCompletedInput(android.adservices.ondevicepersonalization.DownloadCompletedInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedInput wrap(android.adservices.ondevicepersonalization.DownloadCompletedInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.DownloadCompletedInput(real);
    }

    public android.adservices.ondevicepersonalization.DownloadCompletedInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getDownloadedContents() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(real.getDownloadedContents());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
