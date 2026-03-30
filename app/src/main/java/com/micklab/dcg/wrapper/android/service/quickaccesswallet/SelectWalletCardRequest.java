// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class SelectWalletCardRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectWalletCardRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest wrap(android.service.quickaccesswallet.SelectWalletCardRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.SelectWalletCardRequest getReal() {
        return (android.service.quickaccesswallet.SelectWalletCardRequest) real;
    }

    public android.service.quickaccesswallet.SelectWalletCardRequest unwrap() {
        return getReal();
    }

    public SelectWalletCardRequest(java.lang.String arg0) {
        this(new android.service.quickaccesswallet.SelectWalletCardRequest(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.quickaccesswallet.SelectWalletCardRequest) real).describeContents();
    }

    public java.lang.String getCardId() {
        return ((android.service.quickaccesswallet.SelectWalletCardRequest) real).getCardId();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quickaccesswallet.SelectWalletCardRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
