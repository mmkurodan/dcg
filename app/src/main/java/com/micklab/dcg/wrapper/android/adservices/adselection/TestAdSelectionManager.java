// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class TestAdSelectionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TestAdSelectionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager wrap(android.adservices.adselection.TestAdSelectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.TestAdSelectionManager getReal() {
        return (android.adservices.adselection.TestAdSelectionManager) real;
    }

    public android.adservices.adselection.TestAdSelectionManager unwrap() {
        return getReal();
    }

}
