// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class PackageHealthStats {
    private final android.os.health.PackageHealthStats real;

    public PackageHealthStats(android.os.health.PackageHealthStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.PackageHealthStats wrap(android.os.health.PackageHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.PackageHealthStats(real);
    }

    public android.os.health.PackageHealthStats unwrap() {
        return real;
    }


}
