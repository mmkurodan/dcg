// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayManagerTransaction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverlayManagerTransaction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction wrap(android.content.om.OverlayManagerTransaction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction(real, (__DcgwBridgeToken) null);
    }

    public android.content.om.OverlayManagerTransaction getReal() {
        return (android.content.om.OverlayManagerTransaction) real;
    }

    public android.content.om.OverlayManagerTransaction unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.om.OverlayManagerTransaction) real).describeContents();
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction newInstance() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction.wrap(android.content.om.OverlayManagerTransaction.newInstance());
    }

    public void registerFabricatedOverlay(com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay arg0) {
        ((android.content.om.OverlayManagerTransaction) real).registerFabricatedOverlay(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.content.om.OverlayManagerTransaction) real).toString();
    }

    public void unregisterFabricatedOverlay(com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier arg0) {
        ((android.content.om.OverlayManagerTransaction) real).unregisterFabricatedOverlay(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.om.OverlayManagerTransaction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
