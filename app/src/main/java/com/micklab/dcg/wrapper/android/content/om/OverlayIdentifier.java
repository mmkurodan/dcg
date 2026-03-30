// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayIdentifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverlayIdentifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier wrap(android.content.om.OverlayIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier(real, (__DcgwBridgeToken) null);
    }

    public android.content.om.OverlayIdentifier getReal() {
        return (android.content.om.OverlayIdentifier) real;
    }

    public android.content.om.OverlayIdentifier unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.om.OverlayIdentifier) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.om.OverlayIdentifier) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.content.om.OverlayIdentifier) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.content.om.OverlayIdentifier) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.om.OverlayIdentifier) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
