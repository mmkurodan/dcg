// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class GetWalletCardsError {
    private final android.service.quickaccesswallet.GetWalletCardsError real;

    public GetWalletCardsError(android.service.quickaccesswallet.GetWalletCardsError real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError wrap(android.service.quickaccesswallet.GetWalletCardsError real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsError(real);
    }

    public android.service.quickaccesswallet.GetWalletCardsError unwrap() {
        return real;
    }

    public GetWalletCardsError(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1) {
        this(new android.service.quickaccesswallet.GetWalletCardsError(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.CharSequence getMessage() {
        return real.getMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
