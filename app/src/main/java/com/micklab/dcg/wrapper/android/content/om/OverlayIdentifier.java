// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayIdentifier {
    private final android.content.om.OverlayIdentifier real;

    public OverlayIdentifier(android.content.om.OverlayIdentifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier wrap(android.content.om.OverlayIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier(real);
    }

    public android.content.om.OverlayIdentifier unwrap() {
        return real;
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
