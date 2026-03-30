// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SearchRecentSuggestions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchRecentSuggestions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SearchRecentSuggestions wrap(android.provider.SearchRecentSuggestions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SearchRecentSuggestions(real, (__DcgwBridgeToken) null);
    }

    public android.provider.SearchRecentSuggestions getReal() {
        return (android.provider.SearchRecentSuggestions) real;
    }

    public android.provider.SearchRecentSuggestions unwrap() {
        return getReal();
    }

    public SearchRecentSuggestions(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2) {
        this(new android.provider.SearchRecentSuggestions(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public void clearHistory() {
        ((android.provider.SearchRecentSuggestions) real).clearHistory();
    }

    public void saveRecentQuery(java.lang.String arg0, java.lang.String arg1) {
        ((android.provider.SearchRecentSuggestions) real).saveRecentQuery(arg0, arg1);
    }

    public static final java.lang.String[] QUERIES_PROJECTION_1LINE = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_1LINE;
    public static final java.lang.String[] QUERIES_PROJECTION_2LINE = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_2LINE;
    public static final int QUERIES_PROJECTION_DATE_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DATE_INDEX;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DISPLAY1_INDEX;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DISPLAY2_INDEX;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_QUERY_INDEX;

}
