// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleCursorTreeAdapter {
    private final android.widget.SimpleCursorTreeAdapter real;

    public SimpleCursorTreeAdapter(android.widget.SimpleCursorTreeAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter wrap(android.widget.SimpleCursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter(real);
    }

    public android.widget.SimpleCursorTreeAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder.wrap(real.getViewBinder());
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder arg0) {
        real.setViewBinder(arg0 == null ? null : arg0.unwrap());
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        real.setViewText(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final class ViewBinder {
        private final android.widget.SimpleCursorTreeAdapter.ViewBinder real;

        public ViewBinder(android.widget.SimpleCursorTreeAdapter.ViewBinder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder wrap(android.widget.SimpleCursorTreeAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorTreeAdapter.ViewBinder(real);
        }

        public android.widget.SimpleCursorTreeAdapter.ViewBinder unwrap() {
            return real;
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, int arg2) {
            return real.setViewValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

    }
}
