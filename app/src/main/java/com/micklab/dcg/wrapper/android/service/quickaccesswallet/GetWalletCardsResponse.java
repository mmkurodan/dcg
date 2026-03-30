// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetWalletCardsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse wrap(android.service.quickaccesswallet.GetWalletCardsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.GetWalletCardsResponse getReal() {
        return (android.service.quickaccesswallet.GetWalletCardsResponse) real;
    }

    public android.service.quickaccesswallet.GetWalletCardsResponse unwrap() {
        return getReal();
    }

    public GetWalletCardsResponse(java.util.List arg0, int arg1) {
        this(new android.service.quickaccesswallet.GetWalletCardsResponse(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.quickaccesswallet.GetWalletCardsResponse) real).describeContents();
    }

    public int getSelectedIndex() {
        return ((android.service.quickaccesswallet.GetWalletCardsResponse) real).getSelectedIndex();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quickaccesswallet.GetWalletCardsResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
