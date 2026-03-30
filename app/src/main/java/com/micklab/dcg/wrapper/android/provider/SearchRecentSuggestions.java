// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SearchRecentSuggestions {
    private final android.provider.SearchRecentSuggestions real;

    public SearchRecentSuggestions(android.provider.SearchRecentSuggestions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SearchRecentSuggestions wrap(android.provider.SearchRecentSuggestions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SearchRecentSuggestions(real);
    }

    public android.provider.SearchRecentSuggestions unwrap() {
        return real;
    }

    public SearchRecentSuggestions(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2) {
        this(new android.provider.SearchRecentSuggestions(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void clearHistory() {
        real.clearHistory();
    }

    public void saveRecentQuery(java.lang.String arg0, java.lang.String arg1) {
        real.saveRecentQuery(arg0, arg1);
    }

    public static final java.lang.String[] QUERIES_PROJECTION_1LINE = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_1LINE;
    public static final java.lang.String[] QUERIES_PROJECTION_2LINE = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_2LINE;
    public static final int QUERIES_PROJECTION_DATE_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DATE_INDEX;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DISPLAY1_INDEX;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_DISPLAY2_INDEX;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = android.provider.SearchRecentSuggestions.QUERIES_PROJECTION_QUERY_INDEX;

}
