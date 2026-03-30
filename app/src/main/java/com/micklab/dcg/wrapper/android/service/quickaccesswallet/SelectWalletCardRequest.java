// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class SelectWalletCardRequest {
    private final android.service.quickaccesswallet.SelectWalletCardRequest real;

    public SelectWalletCardRequest(android.service.quickaccesswallet.SelectWalletCardRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest wrap(android.service.quickaccesswallet.SelectWalletCardRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest(real);
    }

    public android.service.quickaccesswallet.SelectWalletCardRequest unwrap() {
        return real;
    }

    public SelectWalletCardRequest(java.lang.String arg0) {
        this(new android.service.quickaccesswallet.SelectWalletCardRequest(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getCardId() {
        return real.getCardId();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
