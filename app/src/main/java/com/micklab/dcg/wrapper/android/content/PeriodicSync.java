// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class PeriodicSync {
    private final android.content.PeriodicSync real;

    public PeriodicSync(android.content.PeriodicSync real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.PeriodicSync wrap(android.content.PeriodicSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.PeriodicSync(real);
    }

    public android.content.PeriodicSync unwrap() {
        return real;
    }

    public PeriodicSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, long arg3) {
        this(new android.content.PeriodicSync(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
