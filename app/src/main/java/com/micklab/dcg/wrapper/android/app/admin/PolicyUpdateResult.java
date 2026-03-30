// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PolicyUpdateResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PolicyUpdateResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateResult wrap(android.app.admin.PolicyUpdateResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateResult(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.PolicyUpdateResult getReal() {
        return (android.app.admin.PolicyUpdateResult) real;
    }

    public android.app.admin.PolicyUpdateResult unwrap() {
        return getReal();
    }

    public PolicyUpdateResult(int arg0) {
        this(new android.app.admin.PolicyUpdateResult(arg0), (__DcgwBridgeToken) null);
    }

    public int getResultCode() {
        return ((android.app.admin.PolicyUpdateResult) real).getResultCode();
    }

    public static final int RESULT_FAILURE_CONFLICTING_ADMIN_POLICY = android.app.admin.PolicyUpdateResult.RESULT_FAILURE_CONFLICTING_ADMIN_POLICY;
    public static final int RESULT_FAILURE_HARDWARE_LIMITATION = android.app.admin.PolicyUpdateResult.RESULT_FAILURE_HARDWARE_LIMITATION;
    public static final int RESULT_FAILURE_STORAGE_LIMIT_REACHED = android.app.admin.PolicyUpdateResult.RESULT_FAILURE_STORAGE_LIMIT_REACHED;
    public static final int RESULT_FAILURE_UNKNOWN = android.app.admin.PolicyUpdateResult.RESULT_FAILURE_UNKNOWN;
    public static final int RESULT_POLICY_CLEARED = android.app.admin.PolicyUpdateResult.RESULT_POLICY_CLEARED;
    public static final int RESULT_POLICY_SET = android.app.admin.PolicyUpdateResult.RESULT_POLICY_SET;

}
