// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsError {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetWalletCardsError(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError wrap(android.service.quickaccesswallet.GetWalletCardsError real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.GetWalletCardsError getReal() {
        return (android.service.quickaccesswallet.GetWalletCardsError) real;
    }

    public android.service.quickaccesswallet.GetWalletCardsError unwrap() {
        return getReal();
    }

    public GetWalletCardsError(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1) {
        this(new android.service.quickaccesswallet.GetWalletCardsError(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.quickaccesswallet.GetWalletCardsError) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.quickaccesswallet.GetWalletCardsError) real).getIcon());
    }

    public java.lang.CharSequence getMessage() {
        return ((android.service.quickaccesswallet.GetWalletCardsError) real).getMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quickaccesswallet.GetWalletCardsError) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
