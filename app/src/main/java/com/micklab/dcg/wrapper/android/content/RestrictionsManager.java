// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class RestrictionsManager {
    private final android.content.RestrictionsManager real;

    public RestrictionsManager(android.content.RestrictionsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionsManager wrap(android.content.RestrictionsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.RestrictionsManager(real);
    }

    public android.content.RestrictionsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.Intent createLocalApprovalIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createLocalApprovalIntent());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getApplicationRestrictions() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getApplicationRestrictions());
    }

    public boolean hasRestrictionsProvider() {
        return real.hasRestrictionsProvider();
    }

    public void notifyPermissionResponse(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.notifyPermissionResponse(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void requestPermission(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.requestPermission(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final java.lang.String ACTION_PERMISSION_RESPONSE_RECEIVED = android.content.RestrictionsManager.ACTION_PERMISSION_RESPONSE_RECEIVED;
    public static final java.lang.String ACTION_REQUEST_LOCAL_APPROVAL = android.content.RestrictionsManager.ACTION_REQUEST_LOCAL_APPROVAL;
    public static final java.lang.String ACTION_REQUEST_PERMISSION = android.content.RestrictionsManager.ACTION_REQUEST_PERMISSION;
    public static final java.lang.String EXTRA_PACKAGE_NAME = android.content.RestrictionsManager.EXTRA_PACKAGE_NAME;
    public static final java.lang.String EXTRA_REQUEST_BUNDLE = android.content.RestrictionsManager.EXTRA_REQUEST_BUNDLE;
    public static final java.lang.String EXTRA_REQUEST_ID = android.content.RestrictionsManager.EXTRA_REQUEST_ID;
    public static final java.lang.String EXTRA_REQUEST_TYPE = android.content.RestrictionsManager.EXTRA_REQUEST_TYPE;
    public static final java.lang.String EXTRA_RESPONSE_BUNDLE = android.content.RestrictionsManager.EXTRA_RESPONSE_BUNDLE;
    public static final java.lang.String META_DATA_APP_RESTRICTIONS = android.content.RestrictionsManager.META_DATA_APP_RESTRICTIONS;
    public static final java.lang.String REQUEST_KEY_APPROVE_LABEL = android.content.RestrictionsManager.REQUEST_KEY_APPROVE_LABEL;
    public static final java.lang.String REQUEST_KEY_DATA = android.content.RestrictionsManager.REQUEST_KEY_DATA;
    public static final java.lang.String REQUEST_KEY_DENY_LABEL = android.content.RestrictionsManager.REQUEST_KEY_DENY_LABEL;
    public static final java.lang.String REQUEST_KEY_ICON = android.content.RestrictionsManager.REQUEST_KEY_ICON;
    public static final java.lang.String REQUEST_KEY_ID = android.content.RestrictionsManager.REQUEST_KEY_ID;
    public static final java.lang.String REQUEST_KEY_MESSAGE = android.content.RestrictionsManager.REQUEST_KEY_MESSAGE;
    public static final java.lang.String REQUEST_KEY_NEW_REQUEST = android.content.RestrictionsManager.REQUEST_KEY_NEW_REQUEST;
    public static final java.lang.String REQUEST_KEY_TITLE = android.content.RestrictionsManager.REQUEST_KEY_TITLE;
    public static final java.lang.String REQUEST_TYPE_APPROVAL = android.content.RestrictionsManager.REQUEST_TYPE_APPROVAL;
    public static final java.lang.String RESPONSE_KEY_ERROR_CODE = android.content.RestrictionsManager.RESPONSE_KEY_ERROR_CODE;
    public static final java.lang.String RESPONSE_KEY_MESSAGE = android.content.RestrictionsManager.RESPONSE_KEY_MESSAGE;
    public static final java.lang.String RESPONSE_KEY_RESPONSE_TIMESTAMP = android.content.RestrictionsManager.RESPONSE_KEY_RESPONSE_TIMESTAMP;
    public static final java.lang.String RESPONSE_KEY_RESULT = android.content.RestrictionsManager.RESPONSE_KEY_RESULT;
    public static final int RESULT_APPROVED = android.content.RestrictionsManager.RESULT_APPROVED;
    public static final int RESULT_DENIED = android.content.RestrictionsManager.RESULT_DENIED;
    public static final int RESULT_ERROR = android.content.RestrictionsManager.RESULT_ERROR;
    public static final int RESULT_ERROR_BAD_REQUEST = android.content.RestrictionsManager.RESULT_ERROR_BAD_REQUEST;
    public static final int RESULT_ERROR_INTERNAL = android.content.RestrictionsManager.RESULT_ERROR_INTERNAL;
    public static final int RESULT_NO_RESPONSE = android.content.RestrictionsManager.RESULT_NO_RESPONSE;
    public static final int RESULT_UNKNOWN_REQUEST = android.content.RestrictionsManager.RESULT_UNKNOWN_REQUEST;

}
