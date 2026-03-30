// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleCursorAdapter {
    private final android.widget.SimpleCursorAdapter real;

    public SimpleCursorAdapter(android.widget.SimpleCursorAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter wrap(android.widget.SimpleCursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter(real);
    }

    public android.widget.SimpleCursorAdapter unwrap() {
        return real;
    }

    public SimpleCursorAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2, java.lang.String[] arg3, int[] arg4) {
        this(new android.widget.SimpleCursorAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4));
    }

    public SimpleCursorAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2, java.lang.String[] arg3, int[] arg4, int arg5) {
        this(new android.widget.SimpleCursorAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5));
    }

    public void bindView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2) {
        real.bindView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void changeCursorAndColumns(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String[] arg1, int[] arg2) {
        real.changeCursorAndColumns(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return real.convertToString(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter.wrap(real.getCursorToStringConverter());
    }

    public int getStringConversionColumn() {
        return real.getStringConversionColumn();
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder.wrap(real.getViewBinder());
    }

    public void setCursorToStringConverter(com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter arg0) {
        real.setCursorToStringConverter(arg0 == null ? null : arg0.unwrap());
    }

    public void setStringConversionColumn(int arg0) {
        real.setStringConversionColumn(arg0);
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder arg0) {
        real.setViewBinder(arg0 == null ? null : arg0.unwrap());
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, java.lang.String arg1) {
        real.setViewImage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        real.setViewText(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor swapCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.swapCursor(arg0 == null ? null : arg0.unwrap()));
    }

    public static final class CursorToStringConverter {
        private final android.widget.SimpleCursorAdapter.CursorToStringConverter real;

        public CursorToStringConverter(android.widget.SimpleCursorAdapter.CursorToStringConverter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter wrap(android.widget.SimpleCursorAdapter.CursorToStringConverter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.CursorToStringConverter(real);
        }

        public android.widget.SimpleCursorAdapter.CursorToStringConverter unwrap() {
            return real;
        }

        public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return real.convertToString(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class ViewBinder {
        private final android.widget.SimpleCursorAdapter.ViewBinder real;

        public ViewBinder(android.widget.SimpleCursorAdapter.ViewBinder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder wrap(android.widget.SimpleCursorAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleCursorAdapter.ViewBinder(real);
        }

        public android.widget.SimpleCursorAdapter.ViewBinder unwrap() {
            return real;
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, int arg2) {
            return real.setViewValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

    }
}
