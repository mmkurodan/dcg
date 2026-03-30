// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class TextToSpeech {
    private final android.speech.tts.TextToSpeech real;

    public TextToSpeech(android.speech.tts.TextToSpeech real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech wrap(android.speech.tts.TextToSpeech real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech(real);
    }

    public android.speech.tts.TextToSpeech unwrap() {
        return real;
    }

    public TextToSpeech(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener arg1) {
        this(new android.speech.tts.TextToSpeech(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TextToSpeech(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener arg1, java.lang.String arg2) {
        this(new android.speech.tts.TextToSpeech(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public int addEarcon(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return real.addEarcon(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int addEarcon(java.lang.String arg0, java.lang.String arg1) {
        return real.addEarcon(arg0, arg1);
    }

    public int addEarcon(java.lang.String arg0, java.io.File arg1) {
        return real.addEarcon(arg0, arg1);
    }

    public int addEarcon(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.addEarcon(arg0, arg1, arg2);
    }

    public int addSpeech(java.lang.CharSequence arg0, java.io.File arg1) {
        return real.addSpeech(arg0, arg1);
    }

    public int addSpeech(java.lang.String arg0, java.lang.String arg1) {
        return real.addSpeech(arg0, arg1);
    }

    public int addSpeech(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return real.addSpeech(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int addSpeech(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.addSpeech(arg0, arg1, arg2);
    }

    public int addSpeech(java.lang.CharSequence arg0, java.lang.String arg1, int arg2) {
        return real.addSpeech(arg0, arg1, arg2);
    }

    public boolean areDefaultsEnforced() {
        return real.areDefaultsEnforced();
    }

    public java.lang.String getDefaultEngine() {
        return real.getDefaultEngine();
    }

    public java.util.Locale getDefaultLanguage() {
        return real.getDefaultLanguage();
    }

    public com.micklab.dcg.wrapper.android.speech.tts.Voice getDefaultVoice() {
        return com.micklab.dcg.wrapper.android.speech.tts.Voice.wrap(real.getDefaultVoice());
    }

    public java.util.Locale getLanguage() {
        return real.getLanguage();
    }

    public static int getMaxSpeechInputLength() {
        return android.speech.tts.TextToSpeech.getMaxSpeechInputLength();
    }

    public com.micklab.dcg.wrapper.android.speech.tts.Voice getVoice() {
        return com.micklab.dcg.wrapper.android.speech.tts.Voice.wrap(real.getVoice());
    }

    public int isLanguageAvailable(java.util.Locale arg0) {
        return real.isLanguageAvailable(arg0);
    }

    public boolean isSpeaking() {
        return real.isSpeaking();
    }

    public int playEarcon(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, java.lang.String arg3) {
        return real.playEarcon(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public int playSilentUtterance(long arg0, int arg1, java.lang.String arg2) {
        return real.playSilentUtterance(arg0, arg1, arg2);
    }

    public int setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        return real.setAudioAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public int setEngineByPackageName(java.lang.String arg0) {
        return real.setEngineByPackageName(arg0);
    }

    public int setLanguage(java.util.Locale arg0) {
        return real.setLanguage(arg0);
    }

    public int setOnUtteranceCompletedListener(com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener arg0) {
        return real.setOnUtteranceCompletedListener(arg0 == null ? null : arg0.unwrap());
    }

    public int setOnUtteranceProgressListener(com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener arg0) {
        return real.setOnUtteranceProgressListener(arg0 == null ? null : arg0.unwrap());
    }

    public int setPitch(float arg0) {
        return real.setPitch(arg0);
    }

    public int setSpeechRate(float arg0) {
        return real.setSpeechRate(arg0);
    }

    public int setVoice(com.micklab.dcg.wrapper.android.speech.tts.Voice arg0) {
        return real.setVoice(arg0 == null ? null : arg0.unwrap());
    }

    public void shutdown() {
        real.shutdown();
    }

    public int speak(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, java.lang.String arg3) {
        return real.speak(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public int stop() {
        return real.stop();
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

    public static final class EngineInfo {
        private final android.speech.tts.TextToSpeech.EngineInfo real;

        public EngineInfo(android.speech.tts.TextToSpeech.EngineInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.EngineInfo wrap(android.speech.tts.TextToSpeech.EngineInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.EngineInfo(real);
        }

        public android.speech.tts.TextToSpeech.EngineInfo unwrap() {
            return real;
        }

        public EngineInfo() {
            this(new android.speech.tts.TextToSpeech.EngineInfo());
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
    public static final class OnInitListener {
        private final android.speech.tts.TextToSpeech.OnInitListener real;

        public OnInitListener(android.speech.tts.TextToSpeech.OnInitListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener wrap(android.speech.tts.TextToSpeech.OnInitListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnInitListener(real);
        }

        public android.speech.tts.TextToSpeech.OnInitListener unwrap() {
            return real;
        }

        public void onInit(int arg0) {
            real.onInit(arg0);
        }

    }
    public static final class OnUtteranceCompletedListener {
        private final android.speech.tts.TextToSpeech.OnUtteranceCompletedListener real;

        public OnUtteranceCompletedListener(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener wrap(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeech.OnUtteranceCompletedListener(real);
        }

        public android.speech.tts.TextToSpeech.OnUtteranceCompletedListener unwrap() {
            return real;
        }

        public void onUtteranceCompleted(java.lang.String arg0) {
            real.onUtteranceCompleted(arg0);
        }

    }
}
