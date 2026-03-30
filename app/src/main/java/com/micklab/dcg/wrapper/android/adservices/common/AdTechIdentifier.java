// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdTechIdentifier {
    private final android.adservices.common.AdTechIdentifier real;

    public AdTechIdentifier(android.adservices.common.AdTechIdentifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier wrap(android.adservices.common.AdTechIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier(real);
    }

    public android.adservices.common.AdTechIdentifier unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier fromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(android.adservices.common.AdTechIdentifier.fromString(arg0));
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
