// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.persistentdata;

public final class PersistentDataBlockManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PersistentDataBlockManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.persistentdata.PersistentDataBlockManager wrap(android.service.persistentdata.PersistentDataBlockManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.persistentdata.PersistentDataBlockManager(real, (__DcgwBridgeToken) null);
    }

    public android.service.persistentdata.PersistentDataBlockManager getReal() {
        return (android.service.persistentdata.PersistentDataBlockManager) real;
    }

    public android.service.persistentdata.PersistentDataBlockManager unwrap() {
        return getReal();
    }

    public boolean isFactoryResetProtectionActive() {
        return ((android.service.persistentdata.PersistentDataBlockManager) real).isFactoryResetProtectionActive();
    }

}
