// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleCursorAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleCursorAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter wrap(android.widget.SimpleCursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SimpleCursorAdapter getReal() {
        return (android.widget.SimpleCursorAdapter) real;
    }

    public android.widget.SimpleCursorAdapter unwrap() {
        return getReal();
    }

    public SimpleCursorAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2, java.lang.String[] arg3, int[] arg4) {
        this(new android.widget.SimpleCursorAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4), (__DcgwBridgeToken) null);
    }

    public SimpleCursorAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2, java.lang.String[] arg3, int[] arg4, int arg5) {
        this(new android.widget.SimpleCursorAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public void bindView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2) {
        ((android.widget.SimpleCursorAdapter) real).bindView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void changeCursorAndColumns(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String[] arg1, int[] arg2) {
        ((android.widget.SimpleCursorAdapter) real).changeCursorAndColumns(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return ((android.widget.SimpleCursorAdapter) real).convertToString(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter.wrap(((android.widget.SimpleCursorAdapter) real).getCursorToStringConverter());
    }

    public int getStringConversionColumn() {
        return ((android.widget.SimpleCursorAdapter) real).getStringConversionColumn();
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder.wrap(((android.widget.SimpleCursorAdapter) real).getViewBinder());
    }

    public void setCursorToStringConverter(com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter arg0) {
        ((android.widget.SimpleCursorAdapter) real).setCursorToStringConverter(arg0 == null ? null : arg0.getReal());
    }

    public void setStringConversionColumn(int arg0) {
        ((android.widget.SimpleCursorAdapter) real).setStringConversionColumn(arg0);
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder arg0) {
        ((android.widget.SimpleCursorAdapter) real).setViewBinder(arg0 == null ? null : arg0.getReal());
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, java.lang.String arg1) {
        ((android.widget.SimpleCursorAdapter) real).setViewImage(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        ((android.widget.SimpleCursorAdapter) real).setViewText(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor swapCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.SimpleCursorAdapter) real).swapCursor(arg0 == null ? null : arg0.getReal()));
    }

    public static final class CursorToStringConverter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CursorToStringConverter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter wrap(android.widget.SimpleCursorAdapter.CursorToStringConverter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SimpleCursorAdapter.CursorToStringConverter getReal() {
            return (android.widget.SimpleCursorAdapter.CursorToStringConverter) real;
        }

        public android.widget.SimpleCursorAdapter.CursorToStringConverter unwrap() {
            return getReal();
        }

        public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return ((android.widget.SimpleCursorAdapter.CursorToStringConverter) real).convertToString(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class ViewBinder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ViewBinder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder wrap(android.widget.SimpleCursorAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SimpleCursorAdapter.ViewBinder getReal() {
            return (android.widget.SimpleCursorAdapter.ViewBinder) real;
        }

        public android.widget.SimpleCursorAdapter.ViewBinder unwrap() {
            return getReal();
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, int arg2) {
            return ((android.widget.SimpleCursorAdapter.ViewBinder) real).setViewValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

    }
}
