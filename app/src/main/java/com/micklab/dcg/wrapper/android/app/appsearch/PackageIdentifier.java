// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PackageIdentifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PackageIdentifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier wrap(android.app.appsearch.PackageIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.PackageIdentifier getReal() {
        return (android.app.appsearch.PackageIdentifier) real;
    }

    public android.app.appsearch.PackageIdentifier unwrap() {
        return getReal();
    }

    public PackageIdentifier(java.lang.String arg0, byte[] arg1) {
        this(new android.app.appsearch.PackageIdentifier(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.PackageIdentifier) real).equals(arg0);
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.PackageIdentifier) real).getPackageName();
    }

    public byte[] getSha256Certificate() {
        return ((android.app.appsearch.PackageIdentifier) real).getSha256Certificate();
    }

    public int hashCode() {
        return ((android.app.appsearch.PackageIdentifier) real).hashCode();
    }

}
