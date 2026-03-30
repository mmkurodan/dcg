// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SearchRecentSuggestionsProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchRecentSuggestionsProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SearchRecentSuggestionsProvider wrap(android.content.SearchRecentSuggestionsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SearchRecentSuggestionsProvider(real, (__DcgwBridgeToken) null);
    }

    public android.content.SearchRecentSuggestionsProvider getReal() {
        return (android.content.SearchRecentSuggestionsProvider) real;
    }

    public android.content.SearchRecentSuggestionsProvider unwrap() {
        return getReal();
    }

    public SearchRecentSuggestionsProvider() {
        this(new android.content.SearchRecentSuggestionsProvider(), (__DcgwBridgeToken) null);
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return ((android.content.SearchRecentSuggestionsProvider) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.SearchRecentSuggestionsProvider) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.SearchRecentSuggestionsProvider) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public boolean onCreate() {
        return ((android.content.SearchRecentSuggestionsProvider) real).onCreate();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.SearchRecentSuggestionsProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return ((android.content.SearchRecentSuggestionsProvider) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static final int DATABASE_MODE_2LINES = android.content.SearchRecentSuggestionsProvider.DATABASE_MODE_2LINES;
    public static final int DATABASE_MODE_QUERIES = android.content.SearchRecentSuggestionsProvider.DATABASE_MODE_QUERIES;

}
