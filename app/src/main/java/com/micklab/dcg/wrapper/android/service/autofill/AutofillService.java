// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class AutofillService {
    private final android.service.autofill.AutofillService real;

    public AutofillService(android.service.autofill.AutofillService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.AutofillService wrap(android.service.autofill.AutofillService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.AutofillService(real);
    }

    public android.service.autofill.AutofillService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory getFillEventHistory() {
        return com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory.wrap(real.getFillEventHistory());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onConnected() {
        real.onConnected();
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDisconnected() {
        real.onDisconnected();
    }

    public void onFillRequest(com.micklab.dcg.wrapper.android.service.autofill.FillRequest arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.service.autofill.FillCallback arg2) {
        real.onFillRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onSaveRequest(com.micklab.dcg.wrapper.android.service.autofill.SaveRequest arg0, com.micklab.dcg.wrapper.android.service.autofill.SaveCallback arg1) {
        real.onSaveRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onSavedDatasetsInfoRequest(com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback arg0) {
        real.onSavedDatasetsInfoRequest(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String EXTRA_FILL_RESPONSE = android.service.autofill.AutofillService.EXTRA_FILL_RESPONSE;
    public static final java.lang.String SERVICE_INTERFACE = android.service.autofill.AutofillService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.autofill.AutofillService.SERVICE_META_DATA;

}
