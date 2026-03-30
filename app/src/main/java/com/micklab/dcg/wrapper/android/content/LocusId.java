// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class LocusId {
    private final android.content.LocusId real;

    public LocusId(android.content.LocusId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.LocusId wrap(android.content.LocusId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.LocusId(real);
    }

    public android.content.LocusId unwrap() {
        return real;
    }

    public LocusId(java.lang.String arg0) {
        this(new android.content.LocusId(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getId() {
        return real.getId();
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
