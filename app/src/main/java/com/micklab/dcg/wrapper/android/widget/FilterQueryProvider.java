// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class FilterQueryProvider {
    private final android.widget.FilterQueryProvider real;

    public FilterQueryProvider(android.widget.FilterQueryProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.FilterQueryProvider wrap(android.widget.FilterQueryProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FilterQueryProvider(real);
    }

    public android.widget.FilterQueryProvider unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQuery(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.runQuery(arg0));
    }

}
