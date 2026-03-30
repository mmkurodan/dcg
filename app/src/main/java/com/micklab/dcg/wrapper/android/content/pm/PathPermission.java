// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class PathPermission {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathPermission(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PathPermission wrap(android.content.pm.PathPermission real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PathPermission(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.PathPermission getReal() {
        return (android.content.pm.PathPermission) real;
    }

    public android.content.pm.PathPermission unwrap() {
        return getReal();
    }

    public PathPermission(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PathPermission#android.content.pm.PathPermission(android.os.Parcel)");
    }

    public PathPermission(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PathPermission#android.content.pm.PathPermission(java.lang.String,int,java.lang.String,java.lang.String)");
    }

    public java.lang.String getReadPermission() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PathPermission#getReadPermission()");
    }

    public java.lang.String getWritePermission() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PathPermission#getWritePermission()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PathPermission#writeToParcel(android.os.Parcel,int)");
    }


}
