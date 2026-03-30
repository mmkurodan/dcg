// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class WalletServiceEvent {
    private final android.service.quickaccesswallet.WalletServiceEvent real;

    public WalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent wrap(android.service.quickaccesswallet.WalletServiceEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent(real);
    }

    public android.service.quickaccesswallet.WalletServiceEvent unwrap() {
        return real;
    }

    public WalletServiceEvent(int arg0) {
        this(new android.service.quickaccesswallet.WalletServiceEvent(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getEventType() {
        return real.getEventType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_NFC_PAYMENT_STARTED = android.service.quickaccesswallet.WalletServiceEvent.TYPE_NFC_PAYMENT_STARTED;

}
