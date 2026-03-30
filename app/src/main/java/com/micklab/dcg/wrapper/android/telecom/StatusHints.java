// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class StatusHints {
    private final android.telecom.StatusHints real;

    public StatusHints(android.telecom.StatusHints real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.StatusHints wrap(android.telecom.StatusHints real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.StatusHints(real);
    }

    public android.telecom.StatusHints unwrap() {
        return real;
    }

    public StatusHints(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.telecom.StatusHints(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
