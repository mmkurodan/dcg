// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdSelectionSignals {
    private final android.adservices.common.AdSelectionSignals real;

    public AdSelectionSignals(android.adservices.common.AdSelectionSignals real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals wrap(android.adservices.common.AdSelectionSignals real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals(real);
    }

    public android.adservices.common.AdSelectionSignals unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals fromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(android.adservices.common.AdSelectionSignals.fromString(arg0));
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

    public static final com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals EMPTY = com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(android.adservices.common.AdSelectionSignals.EMPTY);

}
