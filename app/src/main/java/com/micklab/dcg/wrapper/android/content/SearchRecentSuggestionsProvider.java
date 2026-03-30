// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SearchRecentSuggestionsProvider {
    private final android.content.SearchRecentSuggestionsProvider real;

    public SearchRecentSuggestionsProvider(android.content.SearchRecentSuggestionsProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SearchRecentSuggestionsProvider wrap(android.content.SearchRecentSuggestionsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SearchRecentSuggestionsProvider(real);
    }

    public android.content.SearchRecentSuggestionsProvider unwrap() {
        return real;
    }

    public SearchRecentSuggestionsProvider() {
        this(new android.content.SearchRecentSuggestionsProvider());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getType(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public boolean onCreate() {
        return real.onCreate();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static final int DATABASE_MODE_2LINES = android.content.SearchRecentSuggestionsProvider.DATABASE_MODE_2LINES;
    public static final int DATABASE_MODE_QUERIES = android.content.SearchRecentSuggestionsProvider.DATABASE_MODE_QUERIES;

}
