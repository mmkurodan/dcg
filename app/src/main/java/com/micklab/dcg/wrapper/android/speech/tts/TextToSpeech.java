// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class TextToSpeech {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextToSpeech(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech wrap(android.speech.tts.TextToSpeech real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech(real, (__DcgwBridgeToken) null);
    }

    public android.speech.tts.TextToSpeech getReal() {
        return (android.speech.tts.TextToSpeech) real;
    }

    public android.speech.tts.TextToSpeech unwrap() {
        return getReal();
    }

    public TextToSpeech(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener arg1) {
        this(new android.speech.tts.TextToSpeech(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TextToSpeech(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener arg1, java.lang.String arg2) {
        this(new android.speech.tts.TextToSpeech(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public int addEarcon(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return ((android.speech.tts.TextToSpeech) real).addEarcon(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int addEarcon(java.lang.String arg0, java.io.File arg1) {
        return ((android.speech.tts.TextToSpeech) real).addEarcon(arg0, arg1);
    }

    public int addEarcon(java.lang.String arg0, java.lang.String arg1) {
        return ((android.speech.tts.TextToSpeech) real).addEarcon(arg0, arg1);
    }

    public int addEarcon(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.speech.tts.TextToSpeech) real).addEarcon(arg0, arg1, arg2);
    }

    public int addSpeech(java.lang.CharSequence arg0, java.io.File arg1) {
        return ((android.speech.tts.TextToSpeech) real).addSpeech(arg0, arg1);
    }

    public int addSpeech(java.lang.String arg0, java.lang.String arg1) {
        return ((android.speech.tts.TextToSpeech) real).addSpeech(arg0, arg1);
    }

    public int addSpeech(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return ((android.speech.tts.TextToSpeech) real).addSpeech(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int addSpeech(java.lang.CharSequence arg0, java.lang.String arg1, int arg2) {
        return ((android.speech.tts.TextToSpeech) real).addSpeech(arg0, arg1, arg2);
    }

    public int addSpeech(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.speech.tts.TextToSpeech) real).addSpeech(arg0, arg1, arg2);
    }

    public boolean areDefaultsEnforced() {
        return ((android.speech.tts.TextToSpeech) real).areDefaultsEnforced();
    }

    public java.lang.String getDefaultEngine() {
        return ((android.speech.tts.TextToSpeech) real).getDefaultEngine();
    }

    public java.util.Locale getDefaultLanguage() {
        return ((android.speech.tts.TextToSpeech) real).getDefaultLanguage();
    }

    public com.micklab.dcg.wrapper.android.speech.tts.Voice getDefaultVoice() {
        return com.micklab.dcg.wrapper.android.speech.tts.Voice.wrap(((android.speech.tts.TextToSpeech) real).getDefaultVoice());
    }

    public java.util.Locale getLanguage() {
        return ((android.speech.tts.TextToSpeech) real).getLanguage();
    }

    public static int getMaxSpeechInputLength() {
        return android.speech.tts.TextToSpeech.getMaxSpeechInputLength();
    }

    public com.micklab.dcg.wrapper.android.speech.tts.Voice getVoice() {
        return com.micklab.dcg.wrapper.android.speech.tts.Voice.wrap(((android.speech.tts.TextToSpeech) real).getVoice());
    }

    public int isLanguageAvailable(java.util.Locale arg0) {
        return ((android.speech.tts.TextToSpeech) real).isLanguageAvailable(arg0);
    }

    public boolean isSpeaking() {
        return ((android.speech.tts.TextToSpeech) real).isSpeaking();
    }

    public int playEarcon(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, java.lang.String arg3) {
        return ((android.speech.tts.TextToSpeech) real).playEarcon(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public int playSilentUtterance(long arg0, int arg1, java.lang.String arg2) {
        return ((android.speech.tts.TextToSpeech) real).playSilentUtterance(arg0, arg1, arg2);
    }

    public int setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        return ((android.speech.tts.TextToSpeech) real).setAudioAttributes(arg0 == null ? null : arg0.getReal());
    }

    public int setEngineByPackageName(java.lang.String arg0) {
        return ((android.speech.tts.TextToSpeech) real).setEngineByPackageName(arg0);
    }

    public int setLanguage(java.util.Locale arg0) {
        return ((android.speech.tts.TextToSpeech) real).setLanguage(arg0);
    }

    public int setOnUtteranceCompletedListener(com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener arg0) {
        return ((android.speech.tts.TextToSpeech) real).setOnUtteranceCompletedListener(arg0 == null ? null : arg0.getReal());
    }

    public int setOnUtteranceProgressListener(com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener arg0) {
        return ((android.speech.tts.TextToSpeech) real).setOnUtteranceProgressListener(arg0 == null ? null : arg0.getReal());
    }

    public int setPitch(float arg0) {
        return ((android.speech.tts.TextToSpeech) real).setPitch(arg0);
    }

    public int setSpeechRate(float arg0) {
        return ((android.speech.tts.TextToSpeech) real).setSpeechRate(arg0);
    }

    public int setVoice(com.micklab.dcg.wrapper.android.speech.tts.Voice arg0) {
        return ((android.speech.tts.TextToSpeech) real).setVoice(arg0 == null ? null : arg0.getReal());
    }

    public void shutdown() {
        ((android.speech.tts.TextToSpeech) real).shutdown();
    }

    public int speak(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, java.lang.String arg3) {
        return ((android.speech.tts.TextToSpeech) real).speak(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public int stop() {
        return ((android.speech.tts.TextToSpeech) real).stop();
    }

    public int synthesizeToFile(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, java.io.File arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.speech.tts.TextToSpeech#synthesizeToFile(java.lang.CharSequence,android.os.Bundle,java.io.File,java.lang.String)");
    }

    public int synthesizeToFile(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.speech.tts.TextToSpeech#synthesizeToFile(java.lang.CharSequence,android.os.Bundle,android.os.ParcelFileDescriptor,java.lang.String)");
    }

    public static final java.lang.String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = android.speech.tts.TextToSpeech.ACTION_TTS_QUEUE_PROCESSING_COMPLETED;
    public static final int ERROR = android.speech.tts.TextToSpeech.ERROR;
    public static final int ERROR_INVALID_REQUEST = android.speech.tts.TextToSpeech.ERROR_INVALID_REQUEST;
    public static final int ERROR_NOT_INSTALLED_YET = android.speech.tts.TextToSpeech.ERROR_NOT_INSTALLED_YET;
    public static final int ERROR_OUTPUT = android.speech.tts.TextToSpeech.ERROR_OUTPUT;
    public static final int ERROR_SERVICE = android.speech.tts.TextToSpeech.ERROR_SERVICE;
    public static final int ERROR_SYNTHESIS = android.speech.tts.TextToSpeech.ERROR_SYNTHESIS;
    public static final int LANG_AVAILABLE = android.speech.tts.TextToSpeech.LANG_AVAILABLE;
    public static final int LANG_COUNTRY_AVAILABLE = android.speech.tts.TextToSpeech.LANG_COUNTRY_AVAILABLE;
    public static final int LANG_COUNTRY_VAR_AVAILABLE = android.speech.tts.TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE;
    public static final int LANG_MISSING_DATA = android.speech.tts.TextToSpeech.LANG_MISSING_DATA;
    public static final int LANG_NOT_SUPPORTED = android.speech.tts.TextToSpeech.LANG_NOT_SUPPORTED;
    public static final int QUEUE_ADD = android.speech.tts.TextToSpeech.QUEUE_ADD;
    public static final int QUEUE_FLUSH = android.speech.tts.TextToSpeech.QUEUE_FLUSH;
    public static final int STOPPED = android.speech.tts.TextToSpeech.STOPPED;
    public static final int SUCCESS = android.speech.tts.TextToSpeech.SUCCESS;

    public static final class Engine {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Engine(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.Engine wrap(android.speech.tts.TextToSpeech.Engine real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.Engine(real, (__DcgwBridgeToken) null);
        }

        public android.speech.tts.TextToSpeech.Engine getReal() {
            return (android.speech.tts.TextToSpeech.Engine) real;
        }

        public android.speech.tts.TextToSpeech.Engine unwrap() {
            return getReal();
        }

        public static final java.lang.String ACTION_CHECK_TTS_DATA = android.speech.tts.TextToSpeech.Engine.ACTION_CHECK_TTS_DATA;
        public static final java.lang.String ACTION_GET_SAMPLE_TEXT = android.speech.tts.TextToSpeech.Engine.ACTION_GET_SAMPLE_TEXT;
        public static final java.lang.String ACTION_INSTALL_TTS_DATA = android.speech.tts.TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA;
        public static final java.lang.String ACTION_TTS_DATA_INSTALLED = android.speech.tts.TextToSpeech.Engine.ACTION_TTS_DATA_INSTALLED;
        public static final int CHECK_VOICE_DATA_BAD_DATA = android.speech.tts.TextToSpeech.Engine.CHECK_VOICE_DATA_BAD_DATA;
        public static final int CHECK_VOICE_DATA_FAIL = android.speech.tts.TextToSpeech.Engine.CHECK_VOICE_DATA_FAIL;
        public static final int CHECK_VOICE_DATA_MISSING_DATA = android.speech.tts.TextToSpeech.Engine.CHECK_VOICE_DATA_MISSING_DATA;
        public static final int CHECK_VOICE_DATA_MISSING_VOLUME = android.speech.tts.TextToSpeech.Engine.CHECK_VOICE_DATA_MISSING_VOLUME;
        public static final int CHECK_VOICE_DATA_PASS = android.speech.tts.TextToSpeech.Engine.CHECK_VOICE_DATA_PASS;
        public static final int DEFAULT_STREAM = android.speech.tts.TextToSpeech.Engine.DEFAULT_STREAM;
        public static final java.lang.String EXTRA_AVAILABLE_VOICES = android.speech.tts.TextToSpeech.Engine.EXTRA_AVAILABLE_VOICES;
        public static final java.lang.String EXTRA_CHECK_VOICE_DATA_FOR = android.speech.tts.TextToSpeech.Engine.EXTRA_CHECK_VOICE_DATA_FOR;
        public static final java.lang.String EXTRA_SAMPLE_TEXT = android.speech.tts.TextToSpeech.Engine.EXTRA_SAMPLE_TEXT;
        public static final java.lang.String EXTRA_TTS_DATA_INSTALLED = android.speech.tts.TextToSpeech.Engine.EXTRA_TTS_DATA_INSTALLED;
        public static final java.lang.String EXTRA_UNAVAILABLE_VOICES = android.speech.tts.TextToSpeech.Engine.EXTRA_UNAVAILABLE_VOICES;
        public static final java.lang.String EXTRA_VOICE_DATA_ROOT_DIRECTORY = android.speech.tts.TextToSpeech.Engine.EXTRA_VOICE_DATA_ROOT_DIRECTORY;
        public static final java.lang.String INTENT_ACTION_TTS_SERVICE = android.speech.tts.TextToSpeech.Engine.INTENT_ACTION_TTS_SERVICE;
        public static final java.lang.String KEY_FEATURE_EMBEDDED_SYNTHESIS = android.speech.tts.TextToSpeech.Engine.KEY_FEATURE_EMBEDDED_SYNTHESIS;
        public static final java.lang.String KEY_FEATURE_NOT_INSTALLED = android.speech.tts.TextToSpeech.Engine.KEY_FEATURE_NOT_INSTALLED;
        public static final java.lang.String KEY_PARAM_PAN = android.speech.tts.TextToSpeech.Engine.KEY_PARAM_PAN;
        public static final java.lang.String KEY_PARAM_SESSION_ID = android.speech.tts.TextToSpeech.Engine.KEY_PARAM_SESSION_ID;
        public static final java.lang.String KEY_PARAM_STREAM = android.speech.tts.TextToSpeech.Engine.KEY_PARAM_STREAM;
        public static final java.lang.String KEY_PARAM_UTTERANCE_ID = android.speech.tts.TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID;
        public static final java.lang.String KEY_PARAM_VOLUME = android.speech.tts.TextToSpeech.Engine.KEY_PARAM_VOLUME;
        public static final java.lang.String SERVICE_META_DATA = android.speech.tts.TextToSpeech.Engine.SERVICE_META_DATA;

    }
    public static final class EngineInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EngineInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.EngineInfo wrap(android.speech.tts.TextToSpeech.EngineInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.EngineInfo(real, (__DcgwBridgeToken) null);
        }

        public android.speech.tts.TextToSpeech.EngineInfo getReal() {
            return (android.speech.tts.TextToSpeech.EngineInfo) real;
        }

        public android.speech.tts.TextToSpeech.EngineInfo unwrap() {
            return getReal();
        }

        public EngineInfo() {
            this(new android.speech.tts.TextToSpeech.EngineInfo(), (__DcgwBridgeToken) null);
        }

        public java.lang.String toString() {
            return ((android.speech.tts.TextToSpeech.EngineInfo) real).toString();
        }


    }
    public static final class OnInitListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnInitListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener wrap(android.speech.tts.TextToSpeech.OnInitListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener(real, (__DcgwBridgeToken) null);
        }

        public android.speech.tts.TextToSpeech.OnInitListener getReal() {
            return (android.speech.tts.TextToSpeech.OnInitListener) real;
        }

        public android.speech.tts.TextToSpeech.OnInitListener unwrap() {
            return getReal();
        }

        public void onInit(int arg0) {
            ((android.speech.tts.TextToSpeech.OnInitListener) real).onInit(arg0);
        }

    }
    public static final class OnUtteranceCompletedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnUtteranceCompletedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener wrap(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener(real, (__DcgwBridgeToken) null);
        }

        public android.speech.tts.TextToSpeech.OnUtteranceCompletedListener getReal() {
            return (android.speech.tts.TextToSpeech.OnUtteranceCompletedListener) real;
        }

        public android.speech.tts.TextToSpeech.OnUtteranceCompletedListener unwrap() {
            return getReal();
        }

        public void onUtteranceCompleted(java.lang.String arg0) {
            ((android.speech.tts.TextToSpeech.OnUtteranceCompletedListener) real).onUtteranceCompleted(arg0);
        }

    }
}
