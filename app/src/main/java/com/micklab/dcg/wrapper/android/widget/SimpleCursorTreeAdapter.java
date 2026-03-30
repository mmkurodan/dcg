// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleCursorTreeAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleCursorTreeAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter wrap(android.widget.SimpleCursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SimpleCursorTreeAdapter getReal() {
        return (android.widget.SimpleCursorTreeAdapter) real;
    }

    public android.widget.SimpleCursorTreeAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder.wrap(((android.widget.SimpleCursorTreeAdapter) real).getViewBinder());
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder arg0) {
        ((android.widget.SimpleCursorTreeAdapter) real).setViewBinder(arg0 == null ? null : arg0.getReal());
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        ((android.widget.SimpleCursorTreeAdapter) real).setViewText(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final class ViewBinder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ViewBinder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder wrap(android.widget.SimpleCursorTreeAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SimpleCursorTreeAdapter.ViewBinder getReal() {
            return (android.widget.SimpleCursorTreeAdapter.ViewBinder) real;
        }

        public android.widget.SimpleCursorTreeAdapter.ViewBinder unwrap() {
            return getReal();
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, int arg2) {
            return ((android.widget.SimpleCursorTreeAdapter.ViewBinder) real).setViewValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

    }
}
