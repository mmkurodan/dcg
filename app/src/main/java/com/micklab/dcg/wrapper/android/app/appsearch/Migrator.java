// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class Migrator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Migrator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.Migrator wrap(android.app.appsearch.Migrator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.Migrator(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.Migrator getReal() {
        return (android.app.appsearch.Migrator) real;
    }

    public android.app.appsearch.Migrator unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument onDowngrade(int arg0, int arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appsearch.Migrator) real).onDowngrade(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument onUpgrade(int arg0, int arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appsearch.Migrator) real).onUpgrade(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public boolean shouldMigrate(int arg0, int arg1) {
        return ((android.app.appsearch.Migrator) real).shouldMigrate(arg0, arg1);
    }

}
