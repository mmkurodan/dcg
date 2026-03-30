// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class FontRequest {
    private final android.provider.FontRequest real;

    public FontRequest(android.provider.FontRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.FontRequest wrap(android.provider.FontRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontRequest(real);
    }

    public android.provider.FontRequest unwrap() {
        return real;
    }

    public FontRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.provider.FontRequest(arg0, arg1, arg2));
    }

    public FontRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.util.List arg3) {
        this(new android.provider.FontRequest(arg0, arg1, arg2, arg3));
    }

    public java.lang.String getProviderAuthority() {
        return real.getProviderAuthority();
    }

    public java.lang.String getProviderPackage() {
        return real.getProviderPackage();
    }

    public java.lang.String getQuery() {
        return real.getQuery();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
