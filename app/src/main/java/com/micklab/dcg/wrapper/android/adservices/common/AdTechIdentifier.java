// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdTechIdentifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdTechIdentifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier wrap(android.adservices.common.AdTechIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdTechIdentifier getReal() {
        return (android.adservices.common.AdTechIdentifier) real;
    }

    public android.adservices.common.AdTechIdentifier unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.AdTechIdentifier) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.AdTechIdentifier) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier fromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(android.adservices.common.AdTechIdentifier.fromString(arg0));
    }

    public int hashCode() {
        return ((android.adservices.common.AdTechIdentifier) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.AdTechIdentifier) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.AdTechIdentifier) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
