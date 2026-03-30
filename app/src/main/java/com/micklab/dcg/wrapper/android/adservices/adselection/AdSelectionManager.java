// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionManager {
    private final android.adservices.adselection.AdSelectionManager real;

    public AdSelectionManager(android.adservices.adselection.AdSelectionManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager wrap(android.adservices.adselection.AdSelectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager(real);
    }

    public android.adservices.adselection.AdSelectionManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionManager.wrap(android.adservices.adselection.AdSelectionManager.get(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager getTestAdSelectionManager() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.TestAdSelectionManager.wrap(real.getTestAdSelectionManager());
    }

}
