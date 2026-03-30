// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListAdapter {
    private final android.widget.ListAdapter real;

    public ListAdapter(android.widget.ListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListAdapter wrap(android.widget.ListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListAdapter(real);
    }

    public android.widget.ListAdapter unwrap() {
        return real;
    }

    public boolean areAllItemsEnabled() {
        return real.areAllItemsEnabled();
    }

    public boolean isEnabled(int arg0) {
        return real.isEnabled(arg0);
    }

}
