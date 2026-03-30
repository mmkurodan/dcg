// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class SpeechRecognizer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpeechRecognizer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.SpeechRecognizer wrap(android.speech.SpeechRecognizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.SpeechRecognizer(real, (__DcgwBridgeToken) null);
    }

    public android.speech.SpeechRecognizer getReal() {
        return (android.speech.SpeechRecognizer) real;
    }

    public android.speech.SpeechRecognizer unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.speech.SpeechRecognizer) real).cancel();
    }

    public void checkRecognitionSupport(com.micklab.dcg.wrapper.android.content.Intent arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.speech.RecognitionSupportCallback arg2) {
        ((android.speech.SpeechRecognizer) real).checkRecognitionSupport(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static com.micklab.dcg.wrapper.android.speech.SpeechRecognizer createOnDeviceSpeechRecognizer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.speech.SpeechRecognizer.wrap(android.speech.SpeechRecognizer.createOnDeviceSpeechRecognizer(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.speech.SpeechRecognizer createSpeechRecognizer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.speech.SpeechRecognizer.wrap(android.speech.SpeechRecognizer.createSpeechRecognizer(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.speech.SpeechRecognizer createSpeechRecognizer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return com.micklab.dcg.wrapper.android.speech.SpeechRecognizer.wrap(android.speech.SpeechRecognizer.createSpeechRecognizer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void destroy() {
        ((android.speech.SpeechRecognizer) real).destroy();
    }

    public static boolean isOnDeviceRecognitionAvailable(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.speech.SpeechRecognizer.isOnDeviceRecognitionAvailable(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isRecognitionAvailable(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.speech.SpeechRecognizer.isRecognitionAvailable(arg0 == null ? null : arg0.getReal());
    }

    public void setRecognitionListener(com.micklab.dcg.wrapper.android.speech.RecognitionListener arg0) {
        ((android.speech.SpeechRecognizer) real).setRecognitionListener(arg0 == null ? null : arg0.getReal());
    }

    public void startListening(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.speech.SpeechRecognizer) real).startListening(arg0 == null ? null : arg0.getReal());
    }

    public void stopListening() {
        ((android.speech.SpeechRecognizer) real).stopListening();
    }

    public void triggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.speech.SpeechRecognizer) real).triggerModelDownload(arg0 == null ? null : arg0.getReal());
    }

    public void triggerModelDownload(com.micklab.dcg.wrapper.android.content.Intent arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.speech.ModelDownloadListener arg2) {
        ((android.speech.SpeechRecognizer) real).triggerModelDownload(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static final java.lang.String CONFIDENCE_SCORES = android.speech.SpeechRecognizer.CONFIDENCE_SCORES;
    public static final java.lang.String DETECTED_LANGUAGE = android.speech.SpeechRecognizer.DETECTED_LANGUAGE;
    public static final int ERROR_AUDIO = android.speech.SpeechRecognizer.ERROR_AUDIO;
    public static final int ERROR_CANNOT_CHECK_SUPPORT = android.speech.SpeechRecognizer.ERROR_CANNOT_CHECK_SUPPORT;
    public static final int ERROR_CANNOT_LISTEN_TO_DOWNLOAD_EVENTS = android.speech.SpeechRecognizer.ERROR_CANNOT_LISTEN_TO_DOWNLOAD_EVENTS;
    public static final int ERROR_CLIENT = android.speech.SpeechRecognizer.ERROR_CLIENT;
    public static final int ERROR_INSUFFICIENT_PERMISSIONS = android.speech.SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS;
    public static final int ERROR_LANGUAGE_NOT_SUPPORTED = android.speech.SpeechRecognizer.ERROR_LANGUAGE_NOT_SUPPORTED;
    public static final int ERROR_LANGUAGE_UNAVAILABLE = android.speech.SpeechRecognizer.ERROR_LANGUAGE_UNAVAILABLE;
    public static final int ERROR_NO_MATCH = android.speech.SpeechRecognizer.ERROR_NO_MATCH;
    public static final int ERROR_RECOGNIZER_BUSY = android.speech.SpeechRecognizer.ERROR_RECOGNIZER_BUSY;
    public static final int ERROR_SERVER = android.speech.SpeechRecognizer.ERROR_SERVER;
    public static final int ERROR_SERVER_DISCONNECTED = android.speech.SpeechRecognizer.ERROR_SERVER_DISCONNECTED;
    public static final int ERROR_SPEECH_TIMEOUT = android.speech.SpeechRecognizer.ERROR_SPEECH_TIMEOUT;
    public static final int ERROR_TOO_MANY_REQUESTS = android.speech.SpeechRecognizer.ERROR_TOO_MANY_REQUESTS;
    public static final java.lang.String LANGUAGE_DETECTION_CONFIDENCE_LEVEL = android.speech.SpeechRecognizer.LANGUAGE_DETECTION_CONFIDENCE_LEVEL;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_CONFIDENT = android.speech.SpeechRecognizer.LANGUAGE_DETECTION_CONFIDENCE_LEVEL_CONFIDENT;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_HIGHLY_CONFIDENT = android.speech.SpeechRecognizer.LANGUAGE_DETECTION_CONFIDENCE_LEVEL_HIGHLY_CONFIDENT;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_NOT_CONFIDENT = android.speech.SpeechRecognizer.LANGUAGE_DETECTION_CONFIDENCE_LEVEL_NOT_CONFIDENT;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_UNKNOWN = android.speech.SpeechRecognizer.LANGUAGE_DETECTION_CONFIDENCE_LEVEL_UNKNOWN;
    public static final java.lang.String LANGUAGE_SWITCH_RESULT = android.speech.SpeechRecognizer.LANGUAGE_SWITCH_RESULT;
    public static final int LANGUAGE_SWITCH_RESULT_FAILED = android.speech.SpeechRecognizer.LANGUAGE_SWITCH_RESULT_FAILED;
    public static final int LANGUAGE_SWITCH_RESULT_NOT_ATTEMPTED = android.speech.SpeechRecognizer.LANGUAGE_SWITCH_RESULT_NOT_ATTEMPTED;
    public static final int LANGUAGE_SWITCH_RESULT_SKIPPED_NO_MODEL = android.speech.SpeechRecognizer.LANGUAGE_SWITCH_RESULT_SKIPPED_NO_MODEL;
    public static final int LANGUAGE_SWITCH_RESULT_SUCCEEDED = android.speech.SpeechRecognizer.LANGUAGE_SWITCH_RESULT_SUCCEEDED;
    public static final java.lang.String RECOGNITION_PARTS = android.speech.SpeechRecognizer.RECOGNITION_PARTS;
    public static final java.lang.String RESULTS_ALTERNATIVES = android.speech.SpeechRecognizer.RESULTS_ALTERNATIVES;
    public static final java.lang.String RESULTS_RECOGNITION = android.speech.SpeechRecognizer.RESULTS_RECOGNITION;
    public static final java.lang.String TOP_LOCALE_ALTERNATIVES = android.speech.SpeechRecognizer.TOP_LOCALE_ALTERNATIVES;

}
