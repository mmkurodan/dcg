// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ResourceCursorAdapter {
    private final android.widget.ResourceCursorAdapter real;

    public ResourceCursorAdapter(android.widget.ResourceCursorAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ResourceCursorAdapter wrap(android.widget.ResourceCursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ResourceCursorAdapter(real);
    }

    public android.widget.ResourceCursorAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.View newDropDownView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newDropDownView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View newView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void setDropDownViewResource(int arg0) {
        real.setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        real.setDropDownViewTheme(arg0);
    }

    public void setViewResource(int arg0) {
        real.setViewResource(arg0);
    }

}
