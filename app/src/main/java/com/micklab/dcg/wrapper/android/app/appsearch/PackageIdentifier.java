// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PackageIdentifier {
    private final android.app.appsearch.PackageIdentifier real;

    public PackageIdentifier(android.app.appsearch.PackageIdentifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier wrap(android.app.appsearch.PackageIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier(real);
    }

    public android.app.appsearch.PackageIdentifier unwrap() {
        return real;
    }

    public PackageIdentifier(java.lang.String arg0, byte[] arg1) {
        this(new android.app.appsearch.PackageIdentifier(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public byte[] getSha256Certificate() {
        return real.getSha256Certificate();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
