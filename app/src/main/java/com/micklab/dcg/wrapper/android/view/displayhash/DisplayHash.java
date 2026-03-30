// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class DisplayHash {
    private final android.view.displayhash.DisplayHash real;

    public DisplayHash(android.view.displayhash.DisplayHash real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash wrap(android.view.displayhash.DisplayHash real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash(real);
    }

    public android.view.displayhash.DisplayHash unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
