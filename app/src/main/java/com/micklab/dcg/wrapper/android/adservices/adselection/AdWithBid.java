// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdWithBid {
    private final android.adservices.adselection.AdWithBid real;

    public AdWithBid(android.adservices.adselection.AdWithBid real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdWithBid wrap(android.adservices.adselection.AdWithBid real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdWithBid(real);
    }

    public android.adservices.adselection.AdWithBid unwrap() {
        return real;
    }

    public AdWithBid(com.micklab.dcg.wrapper.android.adservices.common.AdData arg0, double arg1) {
        this(new android.adservices.adselection.AdWithBid(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdData getAdData() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdData.wrap(real.getAdData());
    }

    public double getBid() {
        return real.getBid();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
