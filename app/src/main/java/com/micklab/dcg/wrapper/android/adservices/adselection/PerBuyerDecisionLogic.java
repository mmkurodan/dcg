// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class PerBuyerDecisionLogic {
    private final android.adservices.adselection.PerBuyerDecisionLogic real;

    public PerBuyerDecisionLogic(android.adservices.adselection.PerBuyerDecisionLogic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic wrap(android.adservices.adselection.PerBuyerDecisionLogic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic(real);
    }

    public android.adservices.adselection.PerBuyerDecisionLogic unwrap() {
        return real;
    }

    public PerBuyerDecisionLogic(java.util.Map arg0) {
        this(new android.adservices.adselection.PerBuyerDecisionLogic(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic EMPTY = com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic.wrap(android.adservices.adselection.PerBuyerDecisionLogic.EMPTY);

}
