// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognitionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionService wrap(android.speech.RecognitionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionService(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognitionService getReal() {
        return (android.speech.RecognitionService) real;
    }

    public android.speech.RecognitionService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.Context createContext(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.speech.RecognitionService) real).createContext(arg0 == null ? null : arg0.getReal()));
    }

    public int getMaxConcurrentSessionsCount() {
        return ((android.speech.RecognitionService) real).getMaxConcurrentSessionsCount();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.speech.RecognitionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCheckRecognitionSupport(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback arg1) {
        ((android.speech.RecognitionService) real).onCheckRecognitionSupport(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onCheckRecognitionSupport(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1, com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback arg2) {
        ((android.speech.RecognitionService) real).onCheckRecognitionSupport(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onDestroy() {
        ((android.speech.RecognitionService) real).onDestroy();
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.speech.RecognitionService) real).onTriggerModelDownload(arg0 == null ? null : arg0.getReal());
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1) {
        ((android.speech.RecognitionService) real).onTriggerModelDownload(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onTriggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.AttributionSource arg1, com.micklab.dcg.wrapper.android.speech.ModelDownloadListener arg2) {
        ((android.speech.RecognitionService) real).onTriggerModelDownload(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.speech.RecognitionService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.speech.RecognitionService.SERVICE_META_DATA;

    public static final class SupportCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SupportCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback wrap(android.speech.RecognitionService.SupportCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionService.SupportCallback(real, (__DcgwBridgeToken) null);
        }

        public android.speech.RecognitionService.SupportCallback getReal() {
            return (android.speech.RecognitionService.SupportCallback) real;
        }

        public android.speech.RecognitionService.SupportCallback unwrap() {
            return getReal();
        }

        public void onError(int arg0) {
            ((android.speech.RecognitionService.SupportCallback) real).onError(arg0);
        }

        public void onSupportResult(com.micklab.dcg.wrapper.android.speech.RecognitionSupport arg0) {
            ((android.speech.RecognitionService.SupportCallback) real).onSupportResult(arg0 == null ? null : arg0.getReal());
        }

    }
}
