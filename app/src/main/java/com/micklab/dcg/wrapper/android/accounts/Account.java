// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class Account {
    private final android.accounts.Account real;

    public Account(android.accounts.Account real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.Account wrap(android.accounts.Account real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.Account(real);
    }

    public android.accounts.Account unwrap() {
        return real;
    }

    public Account(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.accounts.Account(arg0 == null ? null : arg0.unwrap()));
    }

    public Account(java.lang.String arg0, java.lang.String arg1) {
        this(new android.accounts.Account(arg0, arg1));
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

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
