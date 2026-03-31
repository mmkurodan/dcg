// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.advancedprotection;

public final class AdvancedProtectionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvancedProtectionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager wrap(android.security.advancedprotection.AdvancedProtectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager(real, (__DcgwBridgeToken) null);
    }

    public android.security.advancedprotection.AdvancedProtectionManager getReal() {
        return (android.security.advancedprotection.AdvancedProtectionManager) real;
    }

    public android.security.advancedprotection.AdvancedProtectionManager unwrap() {
        return getReal();
    }

    public boolean isAdvancedProtectionEnabled() {
        return ((android.security.advancedprotection.AdvancedProtectionManager) real).isAdvancedProtectionEnabled();
    }

    public void registerAdvancedProtectionCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager.Callback arg1) {
        ((android.security.advancedprotection.AdvancedProtectionManager) real).registerAdvancedProtectionCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterAdvancedProtectionCallback(com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager.Callback arg0) {
        ((android.security.advancedprotection.AdvancedProtectionManager) real).unregisterAdvancedProtectionCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager.Callback wrap(android.security.advancedprotection.AdvancedProtectionManager.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.advancedprotection.AdvancedProtectionManager.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.security.advancedprotection.AdvancedProtectionManager.Callback getReal() {
            return (android.security.advancedprotection.AdvancedProtectionManager.Callback) real;
        }

        public android.security.advancedprotection.AdvancedProtectionManager.Callback unwrap() {
            return getReal();
        }

        public void onAdvancedProtectionChanged(boolean arg0) {
            ((android.security.advancedprotection.AdvancedProtectionManager.Callback) real).onAdvancedProtectionChanged(arg0);
        }

    }
}
