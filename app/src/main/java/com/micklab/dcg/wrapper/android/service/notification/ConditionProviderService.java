// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class ConditionProviderService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConditionProviderService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.ConditionProviderService wrap(android.service.notification.ConditionProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ConditionProviderService(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.ConditionProviderService getReal() {
        return (android.service.notification.ConditionProviderService) real;
    }

    public android.service.notification.ConditionProviderService unwrap() {
        return getReal();
    }

    public void notifyCondition(com.micklab.dcg.wrapper.android.service.notification.Condition arg0) {
        ((android.service.notification.ConditionProviderService) real).notifyCondition(arg0 == null ? null : arg0.getReal());
    }

    public void notifyConditions(android.service.notification.Condition... arg0) {
        ((android.service.notification.ConditionProviderService) real).notifyConditions(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.notification.ConditionProviderService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConnected() {
        ((android.service.notification.ConditionProviderService) real).onConnected();
    }

    public void onRequestConditions(int arg0) {
        ((android.service.notification.ConditionProviderService) real).onRequestConditions(arg0);
    }

    public void onSubscribe(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.service.notification.ConditionProviderService) real).onSubscribe(arg0 == null ? null : arg0.getReal());
    }

    public void onUnsubscribe(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.service.notification.ConditionProviderService) real).onUnsubscribe(arg0 == null ? null : arg0.getReal());
    }

    public static void requestRebind(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        android.service.notification.ConditionProviderService.requestRebind(arg0 == null ? null : arg0.getReal());
    }

    public void requestUnbind() {
        ((android.service.notification.ConditionProviderService) real).requestUnbind();
    }

    public static final java.lang.String EXTRA_RULE_ID = android.service.notification.ConditionProviderService.EXTRA_RULE_ID;
    public static final java.lang.String META_DATA_CONFIGURATION_ACTIVITY = android.service.notification.ConditionProviderService.META_DATA_CONFIGURATION_ACTIVITY;
    public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = android.service.notification.ConditionProviderService.META_DATA_RULE_INSTANCE_LIMIT;
    public static final java.lang.String META_DATA_RULE_TYPE = android.service.notification.ConditionProviderService.META_DATA_RULE_TYPE;
    public static final java.lang.String SERVICE_INTERFACE = android.service.notification.ConditionProviderService.SERVICE_INTERFACE;

}
