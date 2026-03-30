// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Filterable {
    private final android.widget.Filterable real;

    public Filterable(android.widget.Filterable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Filterable wrap(android.widget.Filterable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filterable(real);
    }

    public android.widget.Filterable unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

}
