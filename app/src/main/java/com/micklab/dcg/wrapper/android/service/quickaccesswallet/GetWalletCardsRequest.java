// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetWalletCardsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest wrap(android.service.quickaccesswallet.GetWalletCardsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.GetWalletCardsRequest getReal() {
        return (android.service.quickaccesswallet.GetWalletCardsRequest) real;
    }

    public android.service.quickaccesswallet.GetWalletCardsRequest unwrap() {
        return getReal();
    }

    public GetWalletCardsRequest(int arg0, int arg1, int arg2, int arg3) {
        this(new android.service.quickaccesswallet.GetWalletCardsRequest(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.quickaccesswallet.GetWalletCardsRequest) real).describeContents();
    }

    public int getCardHeightPx() {
        return ((android.service.quickaccesswallet.GetWalletCardsRequest) real).getCardHeightPx();
    }

    public int getCardWidthPx() {
        return ((android.service.quickaccesswallet.GetWalletCardsRequest) real).getCardWidthPx();
    }

    public int getIconSizePx() {
        return ((android.service.quickaccesswallet.GetWalletCardsRequest) real).getIconSizePx();
    }

    public int getMaxCards() {
        return ((android.service.quickaccesswallet.GetWalletCardsRequest) real).getMaxCards();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quickaccesswallet.GetWalletCardsRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
