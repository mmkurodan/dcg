// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceSpec {
    private final android.app.slice.SliceSpec real;

    public SliceSpec(android.app.slice.SliceSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceSpec wrap(android.app.slice.SliceSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceSpec(real);
    }

    public android.app.slice.SliceSpec unwrap() {
        return real;
    }

    public SliceSpec(java.lang.String arg0, int arg1) {
        this(new android.app.slice.SliceSpec(arg0, arg1));
    }

    public boolean canRender(com.micklab.dcg.wrapper.android.app.slice.SliceSpec arg0) {
        return real.canRender(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getRevision() {
        return real.getRevision();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
