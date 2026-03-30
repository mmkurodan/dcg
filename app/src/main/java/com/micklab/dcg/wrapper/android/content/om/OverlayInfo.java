// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverlayInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayInfo wrap(android.content.om.OverlayInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.om.OverlayInfo getReal() {
        return (android.content.om.OverlayInfo) real;
    }

    public android.content.om.OverlayInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.om.OverlayInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.om.OverlayInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier getOverlayIdentifier() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier.wrap(((android.content.om.OverlayInfo) real).getOverlayIdentifier());
    }

    public java.lang.String getOverlayName() {
        return ((android.content.om.OverlayInfo) real).getOverlayName();
    }

    public java.lang.String getTargetOverlayableName() {
        return ((android.content.om.OverlayInfo) real).getTargetOverlayableName();
    }

    public java.lang.String getTargetPackageName() {
        return ((android.content.om.OverlayInfo) real).getTargetPackageName();
    }

    public int hashCode() {
        return ((android.content.om.OverlayInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.content.om.OverlayInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.om.OverlayInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
