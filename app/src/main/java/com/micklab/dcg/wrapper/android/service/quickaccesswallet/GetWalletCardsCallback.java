// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsCallback {
    private final android.service.quickaccesswallet.GetWalletCardsCallback real;

    public GetWalletCardsCallback(android.service.quickaccesswallet.GetWalletCardsCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback wrap(android.service.quickaccesswallet.GetWalletCardsCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback(real);
    }

    public android.service.quickaccesswallet.GetWalletCardsCallback unwrap() {
        return real;
    }

    public void onFailure(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError arg0) {
        real.onFailure(arg0 == null ? null : arg0.unwrap());
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse arg0) {
        real.onSuccess(arg0 == null ? null : arg0.unwrap());
    }

}
