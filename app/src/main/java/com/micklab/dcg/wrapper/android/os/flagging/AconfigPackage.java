// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.flagging;

public final class AconfigPackage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AconfigPackage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.flagging.AconfigPackage wrap(android.os.flagging.AconfigPackage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.flagging.AconfigPackage(real, (__DcgwBridgeToken) null);
    }

    public android.os.flagging.AconfigPackage getReal() {
        return (android.os.flagging.AconfigPackage) real;
    }

    public android.os.flagging.AconfigPackage unwrap() {
        return getReal();
    }

    public boolean getBooleanFlagValue(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.flagging.AconfigPackage#getBooleanFlagValue(java.lang.String,boolean)");
    }

    public static com.micklab.dcg.wrapper.android.os.flagging.AconfigPackage load(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.flagging.AconfigPackage#load(java.lang.String)");
    }

}
