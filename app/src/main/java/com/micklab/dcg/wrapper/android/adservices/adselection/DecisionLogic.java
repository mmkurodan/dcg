// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class DecisionLogic {
    private final android.adservices.adselection.DecisionLogic real;

    public DecisionLogic(android.adservices.adselection.DecisionLogic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.DecisionLogic wrap(android.adservices.adselection.DecisionLogic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.DecisionLogic(real);
    }

    public android.adservices.adselection.DecisionLogic unwrap() {
        return real;
    }

    public DecisionLogic(java.lang.String arg0) {
        this(new android.adservices.adselection.DecisionLogic(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getLogic() {
        return real.getLogic();
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
