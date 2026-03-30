// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.role;

public final class RoleManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RoleManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.role.RoleManager wrap(android.app.role.RoleManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.role.RoleManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.role.RoleManager getReal() {
        return (android.app.role.RoleManager) real;
    }

    public android.app.role.RoleManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createRequestRoleIntent(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.role.RoleManager) real).createRequestRoleIntent(arg0));
    }

    public boolean isRoleAvailable(java.lang.String arg0) {
        return ((android.app.role.RoleManager) real).isRoleAvailable(arg0);
    }

    public boolean isRoleHeld(java.lang.String arg0) {
        return ((android.app.role.RoleManager) real).isRoleHeld(arg0);
    }

    public static final java.lang.String ROLE_ASSISTANT = android.app.role.RoleManager.ROLE_ASSISTANT;
    public static final java.lang.String ROLE_BROWSER = android.app.role.RoleManager.ROLE_BROWSER;
    public static final java.lang.String ROLE_CALL_REDIRECTION = android.app.role.RoleManager.ROLE_CALL_REDIRECTION;
    public static final java.lang.String ROLE_CALL_SCREENING = android.app.role.RoleManager.ROLE_CALL_SCREENING;
    public static final java.lang.String ROLE_DIALER = android.app.role.RoleManager.ROLE_DIALER;
    public static final java.lang.String ROLE_EMERGENCY = android.app.role.RoleManager.ROLE_EMERGENCY;
    public static final java.lang.String ROLE_HOME = android.app.role.RoleManager.ROLE_HOME;
    public static final java.lang.String ROLE_NOTES = android.app.role.RoleManager.ROLE_NOTES;
    public static final java.lang.String ROLE_SMS = android.app.role.RoleManager.ROLE_SMS;
    public static final java.lang.String ROLE_WALLET = android.app.role.RoleManager.ROLE_WALLET;

}
