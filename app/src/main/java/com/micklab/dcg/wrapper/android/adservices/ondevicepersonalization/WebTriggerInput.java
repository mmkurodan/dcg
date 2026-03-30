// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class WebTriggerInput {
    private final android.adservices.ondevicepersonalization.WebTriggerInput real;

    public WebTriggerInput(android.adservices.ondevicepersonalization.WebTriggerInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerInput wrap(android.adservices.ondevicepersonalization.WebTriggerInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerInput(real);
    }

    public android.adservices.ondevicepersonalization.WebTriggerInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAppPackageName() {
        return real.getAppPackageName();
    }

    public byte[] getData() {
        return real.getData();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDestinationUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDestinationUrl());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
