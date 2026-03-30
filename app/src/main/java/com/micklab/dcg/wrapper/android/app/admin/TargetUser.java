// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class TargetUser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TargetUser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.TargetUser wrap(android.app.admin.TargetUser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.TargetUser(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.TargetUser getReal() {
        return (android.app.admin.TargetUser) real;
    }

    public android.app.admin.TargetUser unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.TargetUser) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.app.admin.TargetUser) real).hashCode();
    }

    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser GLOBAL = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.GLOBAL);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser LOCAL_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.LOCAL_USER);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser PARENT_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.PARENT_USER);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser UNKNOWN_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.UNKNOWN_USER);

}
