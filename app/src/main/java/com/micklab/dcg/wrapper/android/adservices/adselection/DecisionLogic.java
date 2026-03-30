// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class DecisionLogic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DecisionLogic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.DecisionLogic wrap(android.adservices.adselection.DecisionLogic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.DecisionLogic(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.DecisionLogic getReal() {
        return (android.adservices.adselection.DecisionLogic) real;
    }

    public android.adservices.adselection.DecisionLogic unwrap() {
        return getReal();
    }

    public DecisionLogic(java.lang.String arg0) {
        this(new android.adservices.adselection.DecisionLogic(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.adservices.adselection.DecisionLogic) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.DecisionLogic) real).equals(arg0);
    }

    public java.lang.String getLogic() {
        return ((android.adservices.adselection.DecisionLogic) real).getLogic();
    }

    public int hashCode() {
        return ((android.adservices.adselection.DecisionLogic) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.adselection.DecisionLogic) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.DecisionLogic) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
