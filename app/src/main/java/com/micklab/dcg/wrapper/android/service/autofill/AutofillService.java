// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class AutofillService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutofillService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.AutofillService wrap(android.service.autofill.AutofillService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.AutofillService(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.AutofillService getReal() {
        return (android.service.autofill.AutofillService) real;
    }

    public android.service.autofill.AutofillService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory getFillEventHistory() {
        return com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory.wrap(((android.service.autofill.AutofillService) real).getFillEventHistory());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.autofill.AutofillService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConnected() {
        ((android.service.autofill.AutofillService) real).onConnected();
    }

    public void onCreate() {
        ((android.service.autofill.AutofillService) real).onCreate();
    }

    public void onDisconnected() {
        ((android.service.autofill.AutofillService) real).onDisconnected();
    }

    public void onFillRequest(com.micklab.dcg.wrapper.android.service.autofill.FillRequest arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.service.autofill.FillCallback arg2) {
        ((android.service.autofill.AutofillService) real).onFillRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onSaveRequest(com.micklab.dcg.wrapper.android.service.autofill.SaveRequest arg0, com.micklab.dcg.wrapper.android.service.autofill.SaveCallback arg1) {
        ((android.service.autofill.AutofillService) real).onSaveRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSavedDatasetsInfoRequest(com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback arg0) {
        ((android.service.autofill.AutofillService) real).onSavedDatasetsInfoRequest(arg0 == null ? null : arg0.getReal());
    }

    public void onSessionDestroyed(com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory arg0) {
        ((android.service.autofill.AutofillService) real).onSessionDestroyed(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String EXTRA_FILL_RESPONSE = android.service.autofill.AutofillService.EXTRA_FILL_RESPONSE;
    public static final java.lang.String SERVICE_INTERFACE = android.service.autofill.AutofillService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.autofill.AutofillService.SERVICE_META_DATA;

}
