// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ResourceCursorTreeAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResourceCursorTreeAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ResourceCursorTreeAdapter wrap(android.widget.ResourceCursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ResourceCursorTreeAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ResourceCursorTreeAdapter getReal() {
        return (android.widget.ResourceCursorTreeAdapter) real;
    }

    public android.widget.ResourceCursorTreeAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View newChildView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ResourceCursorTreeAdapter) real).newChildView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View newGroupView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ResourceCursorTreeAdapter) real).newGroupView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

}
