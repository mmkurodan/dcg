// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionService {
    private final android.speech.RecognitionService real;

    public RecognitionService(android.speech.RecognitionService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionService wrap(android.speech.RecognitionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionService(real);
    }

    public android.speech.RecognitionService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.Context createContext(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createContext(arg0 == null ? null : arg0.unwrap()));
    }

    public int getMaxConcurrentSessionsCount() {
        return real.getMaxConcurrentSessionsCount();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCheckRecognitionSupport(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback arg1) {
        real.onCheckRecognitionSupport(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onCheckRecognitionSupport(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1, com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback arg2) {
        real.onCheckRecognitionSupport(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.onTriggerModelDownload(arg0 == null ? null : arg0.unwrap());
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1) {
        real.onTriggerModelDownload(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1, com.micklab.dcg.wrapper.android.speech.ModelDownloadListener arg2) {
        real.onTriggerModelDownload(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.speech.RecognitionService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.speech.RecognitionService.SERVICE_META_DATA;

    public static final class SupportCallback {
        private final android.speech.RecognitionService.SupportCallback real;

        public SupportCallback(android.speech.RecognitionService.SupportCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback wrap(android.speech.RecognitionService.SupportCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback(real);
        }

        public android.speech.RecognitionService.SupportCallback unwrap() {
            return real;
        }

        public void onError(int arg0) {
            real.onError(arg0);
        }

        public void onSupportResult(com.micklab.dcg.wrapper.android.speech.RecognitionSupport arg0) {
            real.onSupportResult(arg0 == null ? null : arg0.unwrap());
        }

    }
}
