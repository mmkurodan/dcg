// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class PerBuyerDecisionLogic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PerBuyerDecisionLogic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic wrap(android.adservices.adselection.PerBuyerDecisionLogic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.PerBuyerDecisionLogic getReal() {
        return (android.adservices.adselection.PerBuyerDecisionLogic) real;
    }

    public android.adservices.adselection.PerBuyerDecisionLogic unwrap() {
        return getReal();
    }

    public PerBuyerDecisionLogic(java.util.Map arg0) {
        this(new android.adservices.adselection.PerBuyerDecisionLogic(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.adservices.adselection.PerBuyerDecisionLogic) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.PerBuyerDecisionLogic) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.adselection.PerBuyerDecisionLogic) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.PerBuyerDecisionLogic) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic EMPTY = com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic.wrap(android.adservices.adselection.PerBuyerDecisionLogic.EMPTY);

}
