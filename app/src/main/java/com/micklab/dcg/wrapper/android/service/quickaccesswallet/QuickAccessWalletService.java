// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class QuickAccessWalletService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QuickAccessWalletService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.QuickAccessWalletService wrap(android.service.quickaccesswallet.QuickAccessWalletService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.QuickAccessWalletService(real, (__DcgwBridgeToken) null);
    }

    public android.service.quickaccesswallet.QuickAccessWalletService getReal() {
        return (android.service.quickaccesswallet.QuickAccessWalletService) real;
    }

    public android.service.quickaccesswallet.QuickAccessWalletService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getTargetActivityPendingIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.service.quickaccesswallet.QuickAccessWalletService) real).getTargetActivityPendingIntent());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.quickaccesswallet.QuickAccessWalletService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onWalletCardSelected(com.micklab.dcg.wrapper.android.service.quickaccesswallet.SelectWalletCardRequest arg0) {
        ((android.service.quickaccesswallet.QuickAccessWalletService) real).onWalletCardSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onWalletCardsRequested(com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsRequest arg0, com.micklab.dcg.wrapper.android.service.quickaccesswallet.GetWalletCardsCallback arg1) {
        ((android.service.quickaccesswallet.QuickAccessWalletService) real).onWalletCardsRequested(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onWalletDismissed() {
        ((android.service.quickaccesswallet.QuickAccessWalletService) real).onWalletDismissed();
    }

    public void sendWalletServiceEvent(com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletServiceEvent arg0) {
        ((android.service.quickaccesswallet.QuickAccessWalletService) real).sendWalletServiceEvent(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_VIEW_WALLET = android.service.quickaccesswallet.QuickAccessWalletService.ACTION_VIEW_WALLET;
    public static final java.lang.String ACTION_VIEW_WALLET_SETTINGS = android.service.quickaccesswallet.QuickAccessWalletService.ACTION_VIEW_WALLET_SETTINGS;
    public static final java.lang.String SERVICE_INTERFACE = android.service.quickaccesswallet.QuickAccessWalletService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.quickaccesswallet.QuickAccessWalletService.SERVICE_META_DATA;

}
