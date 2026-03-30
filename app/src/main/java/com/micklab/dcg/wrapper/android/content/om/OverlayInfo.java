// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayInfo {
    private final android.content.om.OverlayInfo real;

    public OverlayInfo(android.content.om.OverlayInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayInfo wrap(android.content.om.OverlayInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayInfo(real);
    }

    public android.content.om.OverlayInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier getOverlayIdentifier() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier.wrap(real.getOverlayIdentifier());
    }

    public java.lang.String getOverlayName() {
        return real.getOverlayName();
    }

    public java.lang.String getTargetOverlayableName() {
        return real.getTargetOverlayableName();
    }

    public java.lang.String getTargetPackageName() {
        return real.getTargetPackageName();
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
