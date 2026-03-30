// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SectionIndexer {
    private final android.widget.SectionIndexer real;

    public SectionIndexer(android.widget.SectionIndexer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SectionIndexer wrap(android.widget.SectionIndexer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SectionIndexer(real);
    }

    public android.widget.SectionIndexer unwrap() {
        return real;
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

}
