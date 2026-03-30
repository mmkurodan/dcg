// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AlphabetIndexer {
    private final android.widget.AlphabetIndexer real;

    public AlphabetIndexer(android.widget.AlphabetIndexer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AlphabetIndexer wrap(android.widget.AlphabetIndexer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AlphabetIndexer(real);
    }

    public android.widget.AlphabetIndexer unwrap() {
        return real;
    }

    public AlphabetIndexer(com.micklab.dcg.wrapper.android.database.Cursor arg0, int arg1, java.lang.CharSequence arg2) {
        this(new android.widget.AlphabetIndexer(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public int getPositionForSection(int arg0) {
        return real.getPositionForSection(arg0);
    }

    public int getSectionForPosition(int arg0) {
        return real.getSectionForPosition(arg0);
    }

    public java.lang.Object[] getSections() {
        return real.getSections();
    }

    public void onChanged() {
        real.onChanged();
    }

    public void onInvalidated() {
        real.onInvalidated();
    }

    public void setCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.setCursor(arg0 == null ? null : arg0.unwrap());
    }


}
