// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class Account {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Account(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.Account wrap(android.accounts.Account real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.Account(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.Account getReal() {
        return (android.accounts.Account) real;
    }

    public android.accounts.Account unwrap() {
        return getReal();
    }

    public Account(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.accounts.Account(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Account(java.lang.String arg0, java.lang.String arg1) {
        this(new android.accounts.Account(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.accounts.Account) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.accounts.Account) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.accounts.Account) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.accounts.Account) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accounts.Account) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
