// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsRequest {
    private final android.service.quickaccesswallet.GetWalletCardsRequest real;

    public GetWalletCardsRequest(android.service.quickaccesswallet.GetWalletCardsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest wrap(android.service.quickaccesswallet.GetWalletCardsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest(real);
    }

    public android.service.quickaccesswallet.GetWalletCardsRequest unwrap() {
        return real;
    }

    public GetWalletCardsRequest(int arg0, int arg1, int arg2, int arg3) {
        this(new android.service.quickaccesswallet.GetWalletCardsRequest(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCardHeightPx() {
        return real.getCardHeightPx();
    }

    public int getCardWidthPx() {
        return real.getCardWidthPx();
    }

    public int getIconSizePx() {
        return real.getIconSizePx();
    }

    public int getMaxCards() {
        return real.getMaxCards();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
