// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ResourceCursorTreeAdapter {
    private final android.widget.ResourceCursorTreeAdapter real;

    public ResourceCursorTreeAdapter(android.widget.ResourceCursorTreeAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ResourceCursorTreeAdapter wrap(android.widget.ResourceCursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ResourceCursorTreeAdapter(real);
    }

    public android.widget.ResourceCursorTreeAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.View newChildView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newChildView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View newGroupView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newGroupView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

}
