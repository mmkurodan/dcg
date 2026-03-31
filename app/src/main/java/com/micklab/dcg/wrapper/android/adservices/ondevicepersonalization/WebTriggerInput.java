// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class WebTriggerInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebTriggerInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerInput wrap(android.adservices.ondevicepersonalization.WebTriggerInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.WebTriggerInput getReal() {
        return (android.adservices.ondevicepersonalization.WebTriggerInput) real;
    }

    public android.adservices.ondevicepersonalization.WebTriggerInput unwrap() {
        return getReal();
    }

    public WebTriggerInput(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, byte[] arg2) {
        this(new android.adservices.ondevicepersonalization.WebTriggerInput(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.WebTriggerInput) real).equals(arg0);
    }

    public java.lang.String getAppPackageName() {
        return ((android.adservices.ondevicepersonalization.WebTriggerInput) real).getAppPackageName();
    }

    public byte[] getData() {
        return ((android.adservices.ondevicepersonalization.WebTriggerInput) real).getData();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDestinationUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.ondevicepersonalization.WebTriggerInput) real).getDestinationUrl());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.WebTriggerInput) real).hashCode();
    }

}
