// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognizerResultsIntent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognizerResultsIntent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognizerResultsIntent wrap(android.speech.RecognizerResultsIntent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognizerResultsIntent(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognizerResultsIntent getReal() {
        return (android.speech.RecognizerResultsIntent) real;
    }

    public android.speech.RecognizerResultsIntent unwrap() {
        return getReal();
    }

    public static final java.lang.String ACTION_VOICE_SEARCH_RESULTS = android.speech.RecognizerResultsIntent.ACTION_VOICE_SEARCH_RESULTS;
    public static final java.lang.String EXTRA_VOICE_SEARCH_RESULT_HTML = android.speech.RecognizerResultsIntent.EXTRA_VOICE_SEARCH_RESULT_HTML;
    public static final java.lang.String EXTRA_VOICE_SEARCH_RESULT_HTML_BASE_URLS = android.speech.RecognizerResultsIntent.EXTRA_VOICE_SEARCH_RESULT_HTML_BASE_URLS;
    public static final java.lang.String EXTRA_VOICE_SEARCH_RESULT_HTTP_HEADERS = android.speech.RecognizerResultsIntent.EXTRA_VOICE_SEARCH_RESULT_HTTP_HEADERS;
    public static final java.lang.String EXTRA_VOICE_SEARCH_RESULT_STRINGS = android.speech.RecognizerResultsIntent.EXTRA_VOICE_SEARCH_RESULT_STRINGS;
    public static final java.lang.String EXTRA_VOICE_SEARCH_RESULT_URLS = android.speech.RecognizerResultsIntent.EXTRA_VOICE_SEARCH_RESULT_URLS;
    public static final java.lang.String URI_SCHEME_INLINE = android.speech.RecognizerResultsIntent.URI_SCHEME_INLINE;

}
