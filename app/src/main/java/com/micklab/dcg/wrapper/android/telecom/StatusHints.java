// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class StatusHints {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StatusHints(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.StatusHints wrap(android.telecom.StatusHints real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.StatusHints(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.StatusHints getReal() {
        return (android.telecom.StatusHints) real;
    }

    public android.telecom.StatusHints unwrap() {
        return getReal();
    }

    public StatusHints(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.telecom.StatusHints(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.StatusHints) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.StatusHints) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.StatusHints) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.telecom.StatusHints) real).getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.telecom.StatusHints) real).getLabel();
    }

    public int hashCode() {
        return ((android.telecom.StatusHints) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.StatusHints) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
