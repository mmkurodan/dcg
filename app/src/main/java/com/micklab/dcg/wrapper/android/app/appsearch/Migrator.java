// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class Migrator {
    private final android.app.appsearch.Migrator real;

    public Migrator(android.app.appsearch.Migrator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.Migrator wrap(android.app.appsearch.Migrator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.Migrator(real);
    }

    public android.app.appsearch.Migrator unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument onDowngrade(int arg0, int arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(real.onDowngrade(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument onUpgrade(int arg0, int arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(real.onUpgrade(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public boolean shouldMigrate(int arg0, int arg1) {
        return real.shouldMigrate(arg0, arg1);
    }

}
