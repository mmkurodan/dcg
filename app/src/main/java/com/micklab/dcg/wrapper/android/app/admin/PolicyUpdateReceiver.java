// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PolicyUpdateReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PolicyUpdateReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateReceiver wrap(android.app.admin.PolicyUpdateReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.PolicyUpdateReceiver getReal() {
        return (android.app.admin.PolicyUpdateReceiver) real;
    }

    public android.app.admin.PolicyUpdateReceiver unwrap() {
        return getReal();
    }

    public void onPolicyChanged(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.app.admin.TargetUser arg3, com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateResult arg4) {
        ((android.app.admin.PolicyUpdateReceiver) real).onPolicyChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void onPolicySetResult(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.app.admin.TargetUser arg3, com.micklab.dcg.wrapper.android.app.admin.PolicyUpdateResult arg4) {
        ((android.app.admin.PolicyUpdateReceiver) real).onPolicySetResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.PolicyUpdateReceiver) real).onReceive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final java.lang.String ACTION_DEVICE_POLICY_CHANGED = android.app.admin.PolicyUpdateReceiver.ACTION_DEVICE_POLICY_CHANGED;
    public static final java.lang.String ACTION_DEVICE_POLICY_SET_RESULT = android.app.admin.PolicyUpdateReceiver.ACTION_DEVICE_POLICY_SET_RESULT;
    public static final java.lang.String EXTRA_ACCOUNT_TYPE = android.app.admin.PolicyUpdateReceiver.EXTRA_ACCOUNT_TYPE;
    public static final java.lang.String EXTRA_INTENT_FILTER = android.app.admin.PolicyUpdateReceiver.EXTRA_INTENT_FILTER;
    public static final java.lang.String EXTRA_PACKAGE_NAME = android.app.admin.PolicyUpdateReceiver.EXTRA_PACKAGE_NAME;
    public static final java.lang.String EXTRA_PERMISSION_NAME = android.app.admin.PolicyUpdateReceiver.EXTRA_PERMISSION_NAME;

}
