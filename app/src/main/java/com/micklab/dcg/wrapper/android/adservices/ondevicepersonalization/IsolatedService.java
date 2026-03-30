// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class IsolatedService {
    private final android.adservices.ondevicepersonalization.IsolatedService real;

    public IsolatedService(android.adservices.ondevicepersonalization.IsolatedService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedService wrap(android.adservices.ondevicepersonalization.IsolatedService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedService(real);
    }

    public android.adservices.ondevicepersonalization.IsolatedService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider getEventUrlProvider(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider.wrap(real.getEventUrlProvider(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler getFederatedComputeScheduler(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.wrap(real.getFederatedComputeScheduler(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore getLocalData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore.wrap(real.getLocalData(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader getLogReader(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader.wrap(real.getLogReader(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager getModelManager(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager.wrap(real.getModelManager(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getRemoteData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(real.getRemoteData(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData getUserData(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData.wrap(real.getUserData(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker onRequest(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken arg0) {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker.wrap(real.onRequest(arg0 == null ? null : arg0.unwrap()));
    }

}
