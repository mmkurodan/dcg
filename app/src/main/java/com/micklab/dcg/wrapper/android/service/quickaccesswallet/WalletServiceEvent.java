// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class WalletServiceEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WalletServiceEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent wrap(android.service.quickaccesswallet.WalletServiceEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.WalletServiceEvent getReal() {
        return (android.service.quickaccesswallet.WalletServiceEvent) real;
    }

    public android.service.quickaccesswallet.WalletServiceEvent unwrap() {
        return getReal();
    }

    public WalletServiceEvent(int arg0) {
        this(new android.service.quickaccesswallet.WalletServiceEvent(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.quickaccesswallet.WalletServiceEvent) real).describeContents();
    }

    public int getEventType() {
        return ((android.service.quickaccesswallet.WalletServiceEvent) real).getEventType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quickaccesswallet.WalletServiceEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_NFC_PAYMENT_STARTED = android.service.quickaccesswallet.WalletServiceEvent.TYPE_NFC_PAYMENT_STARTED;

}
