// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AlphabetIndexer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlphabetIndexer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AlphabetIndexer wrap(android.widget.AlphabetIndexer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AlphabetIndexer(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AlphabetIndexer getReal() {
        return (android.widget.AlphabetIndexer) real;
    }

    public android.widget.AlphabetIndexer unwrap() {
        return getReal();
    }

    public AlphabetIndexer(com.micklab.dcg.wrapper.android.database.Cursor arg0, int arg1, java.lang.CharSequence arg2) {
        this(new android.widget.AlphabetIndexer(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getPositionForSection(int arg0) {
        return ((android.widget.AlphabetIndexer) real).getPositionForSection(arg0);
    }

    public int getSectionForPosition(int arg0) {
        return ((android.widget.AlphabetIndexer) real).getSectionForPosition(arg0);
    }

    public java.lang.Object[] getSections() {
        return ((android.widget.AlphabetIndexer) real).getSections();
    }

    public void onChanged() {
        ((android.widget.AlphabetIndexer) real).onChanged();
    }

    public void onInvalidated() {
        ((android.widget.AlphabetIndexer) real).onInvalidated();
    }

    public void setCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.widget.AlphabetIndexer) real).setCursor(arg0 == null ? null : arg0.getReal());
    }


}
