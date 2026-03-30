// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DisplayShape {
    private final android.view.DisplayShape real;

    public DisplayShape(android.view.DisplayShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DisplayShape wrap(android.view.DisplayShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayShape(real);
    }

    public android.view.DisplayShape unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath());
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
