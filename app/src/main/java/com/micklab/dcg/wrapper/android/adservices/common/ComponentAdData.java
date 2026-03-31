// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class ComponentAdData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComponentAdData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.ComponentAdData wrap(android.adservices.common.ComponentAdData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.ComponentAdData(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.ComponentAdData getReal() {
        return (android.adservices.common.ComponentAdData) real;
    }

    public android.adservices.common.ComponentAdData unwrap() {
        return getReal();
    }

    public ComponentAdData(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        this(new android.adservices.common.ComponentAdData(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.adservices.common.ComponentAdData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.ComponentAdData) real).equals(arg0);
    }

    public java.lang.String getAdRenderId() {
        return ((android.adservices.common.ComponentAdData) real).getAdRenderId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRenderUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.common.ComponentAdData) real).getRenderUri());
    }

    public int hashCode() {
        return ((android.adservices.common.ComponentAdData) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.ComponentAdData) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.ComponentAdData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
