// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdWithBid {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdWithBid(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdWithBid wrap(android.adservices.adselection.AdWithBid real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdWithBid(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AdWithBid getReal() {
        return (android.adservices.adselection.AdWithBid) real;
    }

    public android.adservices.adselection.AdWithBid unwrap() {
        return getReal();
    }

    public AdWithBid(com.micklab.dcg.wrapper.android.adservices.common.AdData arg0, double arg1) {
        this(new android.adservices.adselection.AdWithBid(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.adservices.adselection.AdWithBid) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.AdWithBid) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdData getAdData() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdData.wrap(((android.adservices.adselection.AdWithBid) real).getAdData());
    }

    public double getBid() {
        return ((android.adservices.adselection.AdWithBid) real).getBid();
    }

    public int hashCode() {
        return ((android.adservices.adselection.AdWithBid) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.AdWithBid) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
