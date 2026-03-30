// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.persistentdata;

public final class PersistentDataBlockManager {
    private final android.service.persistentdata.PersistentDataBlockManager real;

    public PersistentDataBlockManager(android.service.persistentdata.PersistentDataBlockManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.persistentdata.PersistentDataBlockManager wrap(android.service.persistentdata.PersistentDataBlockManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.persistentdata.PersistentDataBlockManager(real);
    }

    public android.service.persistentdata.PersistentDataBlockManager unwrap() {
        return real;
    }

    public boolean isFactoryResetProtectionActive() {
        return real.isFactoryResetProtectionActive();
    }

}
