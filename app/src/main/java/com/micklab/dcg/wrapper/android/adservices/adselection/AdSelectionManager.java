// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdSelectionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager wrap(android.adservices.adselection.AdSelectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AdSelectionManager getReal() {
        return (android.adservices.adselection.AdSelectionManager) real;
    }

    public android.adservices.adselection.AdSelectionManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager.wrap(android.adservices.adselection.AdSelectionManager.get(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager getTestAdSelectionManager() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager.wrap(((android.adservices.adselection.AdSelectionManager) real).getTestAdSelectionManager());
    }

}
