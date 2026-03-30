// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class IsolatedService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IsolatedService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedService wrap(android.adservices.ondevicepersonalization.IsolatedService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedService(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.IsolatedService getReal() {
        return (android.adservices.ondevicepersonalization.IsolatedService) real;
    }

    public android.adservices.ondevicepersonalization.IsolatedService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider getEventUrlProvider(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getEventUrlProvider(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler getFederatedComputeScheduler(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getFederatedComputeScheduler(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore getLocalData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getLocalData(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader getLogReader(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getLogReader(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager getModelManager(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getModelManager(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getRemoteData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getRemoteData(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData getUserData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).getUserData(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.adservices.ondevicepersonalization.IsolatedService) real).onCreate();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker onRequest(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker.wrap(((android.adservices.ondevicepersonalization.IsolatedService) real).onRequest(arg0 == null ? null : arg0.getReal()));
    }

}
