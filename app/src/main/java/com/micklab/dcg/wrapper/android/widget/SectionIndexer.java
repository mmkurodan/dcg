// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SectionIndexer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SectionIndexer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SectionIndexer wrap(android.widget.SectionIndexer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SectionIndexer(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SectionIndexer getReal() {
        return (android.widget.SectionIndexer) real;
    }

    public android.widget.SectionIndexer unwrap() {
        return getReal();
    }

    public int getPositionForSection(int arg0) {
        return ((android.widget.SectionIndexer) real).getPositionForSection(arg0);
    }

    public int getSectionForPosition(int arg0) {
        return ((android.widget.SectionIndexer) real).getSectionForPosition(arg0);
    }

    public java.lang.Object[] getSections() {
        return ((android.widget.SectionIndexer) real).getSections();
    }

}
