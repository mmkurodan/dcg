// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ResourceCursorAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResourceCursorAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ResourceCursorAdapter wrap(android.widget.ResourceCursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ResourceCursorAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ResourceCursorAdapter getReal() {
        return (android.widget.ResourceCursorAdapter) real;
    }

    public android.widget.ResourceCursorAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View newDropDownView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ResourceCursorAdapter) real).newDropDownView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View newView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ResourceCursorAdapter) real).newView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void setDropDownViewResource(int arg0) {
        ((android.widget.ResourceCursorAdapter) real).setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.widget.ResourceCursorAdapter) real).setDropDownViewTheme(arg0 == null ? null : arg0.getReal());
    }

    public void setViewResource(int arg0) {
        ((android.widget.ResourceCursorAdapter) real).setViewResource(arg0);
    }

}
