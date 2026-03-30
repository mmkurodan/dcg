// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdSelectionSignals {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdSelectionSignals(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals wrap(android.adservices.common.AdSelectionSignals real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdSelectionSignals getReal() {
        return (android.adservices.common.AdSelectionSignals) real;
    }

    public android.adservices.common.AdSelectionSignals unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.AdSelectionSignals) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.AdSelectionSignals) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals fromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(android.adservices.common.AdSelectionSignals.fromString(arg0));
    }

    public int hashCode() {
        return ((android.adservices.common.AdSelectionSignals) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.AdSelectionSignals) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.AdSelectionSignals) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals EMPTY = com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(android.adservices.common.AdSelectionSignals.EMPTY);

}
