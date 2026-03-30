// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class QuickAccessWalletService {
    private final android.service.quickaccesswallet.QuickAccessWalletService real;

    public QuickAccessWalletService(android.service.quickaccesswallet.QuickAccessWalletService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.QuickAccessWalletService wrap(android.service.quickaccesswallet.QuickAccessWalletService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.QuickAccessWalletService(real);
    }

    public android.service.quickaccesswallet.QuickAccessWalletService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getTargetActivityPendingIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getTargetActivityPendingIntent());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onWalletCardSelected(com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest arg0) {
        real.onWalletCardSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void onWalletCardsRequested(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest arg0, com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback arg1) {
        real.onWalletCardsRequested(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onWalletDismissed() {
        real.onWalletDismissed();
    }

    public void sendWalletServiceEvent(com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent arg0) {
        real.sendWalletServiceEvent(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_VIEW_WALLET = android.service.quickaccesswallet.QuickAccessWalletService.ACTION_VIEW_WALLET;
    public static final java.lang.String ACTION_VIEW_WALLET_SETTINGS = android.service.quickaccesswallet.QuickAccessWalletService.ACTION_VIEW_WALLET_SETTINGS;
    public static final java.lang.String SERVICE_INTERFACE = android.service.quickaccesswallet.QuickAccessWalletService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.quickaccesswallet.QuickAccessWalletService.SERVICE_META_DATA;

}
