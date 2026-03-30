// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsResponse {
    private final android.service.quickaccesswallet.GetWalletCardsResponse real;

    public GetWalletCardsResponse(android.service.quickaccesswallet.GetWalletCardsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse wrap(android.service.quickaccesswallet.GetWalletCardsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsResponse(real);
    }

    public android.service.quickaccesswallet.GetWalletCardsResponse unwrap() {
        return real;
    }

    public GetWalletCardsResponse(java.util.List arg0, int arg1) {
        this(new android.service.quickaccesswallet.GetWalletCardsResponse(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getSelectedIndex() {
        return real.getSelectedIndex();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
