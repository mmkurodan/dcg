// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayManagerTransaction {
    private final android.content.om.OverlayManagerTransaction real;

    public OverlayManagerTransaction(android.content.om.OverlayManagerTransaction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction wrap(android.content.om.OverlayManagerTransaction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction(real);
    }

    public android.content.om.OverlayManagerTransaction unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction newInstance() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction.wrap(android.content.om.OverlayManagerTransaction.newInstance());
    }

    public void registerFabricatedOverlay(com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay arg0) {
        real.registerFabricatedOverlay(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void unregisterFabricatedOverlay(com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier arg0) {
        real.unregisterFabricatedOverlay(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
