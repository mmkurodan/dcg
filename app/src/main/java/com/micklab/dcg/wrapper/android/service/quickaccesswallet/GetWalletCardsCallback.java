// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetWalletCardsCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback wrap(android.service.quickaccesswallet.GetWalletCardsCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.GetWalletCardsCallback getReal() {
        return (android.service.quickaccesswallet.GetWalletCardsCallback) real;
    }

    public android.service.quickaccesswallet.GetWalletCardsCallback unwrap() {
        return getReal();
    }

    public void onFailure(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError arg0) {
        ((android.service.quickaccesswallet.GetWalletCardsCallback) real).onFailure(arg0 == null ? null : arg0.getReal());
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse arg0) {
        ((android.service.quickaccesswallet.GetWalletCardsCallback) real).onSuccess(arg0 == null ? null : arg0.getReal());
    }

}
