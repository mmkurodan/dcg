// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognizerIntent {
    private final android.speech.RecognizerIntent real;

    public RecognizerIntent(android.speech.RecognizerIntent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognizerIntent wrap(android.speech.RecognizerIntent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognizerIntent(real);
    }

    public android.speech.RecognizerIntent unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.content.Intent getVoiceDetailsIntent(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.speech.RecognizerIntent.getVoiceDetailsIntent(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String ACTION_GET_LANGUAGE_DETAILS = android.speech.RecognizerIntent.ACTION_GET_LANGUAGE_DETAILS;
    public static final java.lang.String ACTION_RECOGNIZE_SPEECH = android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH;
    public static final java.lang.String ACTION_VOICE_SEARCH_HANDS_FREE = android.speech.RecognizerIntent.ACTION_VOICE_SEARCH_HANDS_FREE;
    public static final java.lang.String ACTION_WEB_SEARCH = android.speech.RecognizerIntent.ACTION_WEB_SEARCH;
    public static final java.lang.String DETAILS_META_DATA = android.speech.RecognizerIntent.DETAILS_META_DATA;
    public static final java.lang.String EXTRA_AUDIO_INJECT_SOURCE = android.speech.RecognizerIntent.EXTRA_AUDIO_INJECT_SOURCE;
    public static final java.lang.String EXTRA_AUDIO_SOURCE = android.speech.RecognizerIntent.EXTRA_AUDIO_SOURCE;
    public static final java.lang.String EXTRA_AUDIO_SOURCE_CHANNEL_COUNT = android.speech.RecognizerIntent.EXTRA_AUDIO_SOURCE_CHANNEL_COUNT;
    public static final java.lang.String EXTRA_AUDIO_SOURCE_ENCODING = android.speech.RecognizerIntent.EXTRA_AUDIO_SOURCE_ENCODING;
    public static final java.lang.String EXTRA_AUDIO_SOURCE_SAMPLING_RATE = android.speech.RecognizerIntent.EXTRA_AUDIO_SOURCE_SAMPLING_RATE;
    public static final java.lang.String EXTRA_BIASING_STRINGS = android.speech.RecognizerIntent.EXTRA_BIASING_STRINGS;
    public static final java.lang.String EXTRA_CALLING_PACKAGE = android.speech.RecognizerIntent.EXTRA_CALLING_PACKAGE;
    public static final java.lang.String EXTRA_CONFIDENCE_SCORES = android.speech.RecognizerIntent.EXTRA_CONFIDENCE_SCORES;
    public static final java.lang.String EXTRA_ENABLE_BIASING_DEVICE_CONTEXT = android.speech.RecognizerIntent.EXTRA_ENABLE_BIASING_DEVICE_CONTEXT;
    public static final java.lang.String EXTRA_ENABLE_FORMATTING = android.speech.RecognizerIntent.EXTRA_ENABLE_FORMATTING;
    public static final java.lang.String EXTRA_ENABLE_LANGUAGE_DETECTION = android.speech.RecognizerIntent.EXTRA_ENABLE_LANGUAGE_DETECTION;
    public static final java.lang.String EXTRA_ENABLE_LANGUAGE_SWITCH = android.speech.RecognizerIntent.EXTRA_ENABLE_LANGUAGE_SWITCH;
    public static final java.lang.String EXTRA_HIDE_PARTIAL_TRAILING_PUNCTUATION = android.speech.RecognizerIntent.EXTRA_HIDE_PARTIAL_TRAILING_PUNCTUATION;
    public static final java.lang.String EXTRA_LANGUAGE = android.speech.RecognizerIntent.EXTRA_LANGUAGE;
    public static final java.lang.String EXTRA_LANGUAGE_DETECTION_ALLOWED_LANGUAGES = android.speech.RecognizerIntent.EXTRA_LANGUAGE_DETECTION_ALLOWED_LANGUAGES;
    public static final java.lang.String EXTRA_LANGUAGE_MODEL = android.speech.RecognizerIntent.EXTRA_LANGUAGE_MODEL;
    public static final java.lang.String EXTRA_LANGUAGE_PREFERENCE = android.speech.RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE;
    public static final java.lang.String EXTRA_LANGUAGE_SWITCH_ALLOWED_LANGUAGES = android.speech.RecognizerIntent.EXTRA_LANGUAGE_SWITCH_ALLOWED_LANGUAGES;
    public static final java.lang.String EXTRA_LANGUAGE_SWITCH_INITIAL_ACTIVE_DURATION_TIME_MILLIS = android.speech.RecognizerIntent.EXTRA_LANGUAGE_SWITCH_INITIAL_ACTIVE_DURATION_TIME_MILLIS;
    public static final java.lang.String EXTRA_LANGUAGE_SWITCH_MAX_SWITCHES = android.speech.RecognizerIntent.EXTRA_LANGUAGE_SWITCH_MAX_SWITCHES;
    public static final java.lang.String EXTRA_MASK_OFFENSIVE_WORDS = android.speech.RecognizerIntent.EXTRA_MASK_OFFENSIVE_WORDS;
    public static final java.lang.String EXTRA_MAX_RESULTS = android.speech.RecognizerIntent.EXTRA_MAX_RESULTS;
    public static final java.lang.String EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE = android.speech.RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE;
    public static final java.lang.String EXTRA_ORIGIN = android.speech.RecognizerIntent.EXTRA_ORIGIN;
    public static final java.lang.String EXTRA_PARTIAL_RESULTS = android.speech.RecognizerIntent.EXTRA_PARTIAL_RESULTS;
    public static final java.lang.String EXTRA_PREFER_OFFLINE = android.speech.RecognizerIntent.EXTRA_PREFER_OFFLINE;
    public static final java.lang.String EXTRA_PROMPT = android.speech.RecognizerIntent.EXTRA_PROMPT;
    public static final java.lang.String EXTRA_REQUEST_WORD_CONFIDENCE = android.speech.RecognizerIntent.EXTRA_REQUEST_WORD_CONFIDENCE;
    public static final java.lang.String EXTRA_REQUEST_WORD_TIMING = android.speech.RecognizerIntent.EXTRA_REQUEST_WORD_TIMING;
    public static final java.lang.String EXTRA_RESULTS = android.speech.RecognizerIntent.EXTRA_RESULTS;
    public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT = android.speech.RecognizerIntent.EXTRA_RESULTS_PENDINGINTENT;
    public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT_BUNDLE = android.speech.RecognizerIntent.EXTRA_RESULTS_PENDINGINTENT_BUNDLE;
    public static final java.lang.String EXTRA_SECURE = android.speech.RecognizerIntent.EXTRA_SECURE;
    public static final java.lang.String EXTRA_SEGMENTED_SESSION = android.speech.RecognizerIntent.EXTRA_SEGMENTED_SESSION;
    public static final java.lang.String EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS = android.speech.RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS;
    public static final java.lang.String EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS = android.speech.RecognizerIntent.EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS;
    public static final java.lang.String EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS = android.speech.RecognizerIntent.EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS;
    public static final java.lang.String EXTRA_SUPPORTED_LANGUAGES = android.speech.RecognizerIntent.EXTRA_SUPPORTED_LANGUAGES;
    public static final java.lang.String EXTRA_WEB_SEARCH_ONLY = android.speech.RecognizerIntent.EXTRA_WEB_SEARCH_ONLY;
    public static final java.lang.String FORMATTING_OPTIMIZE_LATENCY = android.speech.RecognizerIntent.FORMATTING_OPTIMIZE_LATENCY;
    public static final java.lang.String FORMATTING_OPTIMIZE_QUALITY = android.speech.RecognizerIntent.FORMATTING_OPTIMIZE_QUALITY;
    public static final java.lang.String LANGUAGE_MODEL_FREE_FORM = android.speech.RecognizerIntent.LANGUAGE_MODEL_FREE_FORM;
    public static final java.lang.String LANGUAGE_MODEL_WEB_SEARCH = android.speech.RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH;
    public static final java.lang.String LANGUAGE_SWITCH_BALANCED = android.speech.RecognizerIntent.LANGUAGE_SWITCH_BALANCED;
    public static final java.lang.String LANGUAGE_SWITCH_HIGH_PRECISION = android.speech.RecognizerIntent.LANGUAGE_SWITCH_HIGH_PRECISION;
    public static final java.lang.String LANGUAGE_SWITCH_QUICK_RESPONSE = android.speech.RecognizerIntent.LANGUAGE_SWITCH_QUICK_RESPONSE;
    public static final int RESULT_AUDIO_ERROR = android.speech.RecognizerIntent.RESULT_AUDIO_ERROR;
    public static final int RESULT_CLIENT_ERROR = android.speech.RecognizerIntent.RESULT_CLIENT_ERROR;
    public static final int RESULT_NO_MATCH = android.speech.RecognizerIntent.RESULT_NO_MATCH;
    public static final int RESULT_SERVER_ERROR = android.speech.RecognizerIntent.RESULT_SERVER_ERROR;

}
