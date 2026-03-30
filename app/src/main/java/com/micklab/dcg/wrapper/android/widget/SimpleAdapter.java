// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleAdapter {
    private final android.widget.SimpleAdapter real;

    public SimpleAdapter(android.widget.SimpleAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleAdapter wrap(android.widget.SimpleAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleAdapter(real);
    }

    public android.widget.SimpleAdapter unwrap() {
        return real;
    }

    public SimpleAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, java.lang.String[] arg3, int[] arg4) {
        this(new android.widget.SimpleAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDropDownView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return real.getDropDownViewTheme();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

    public java.lang.Object getItem(int arg0) {
        return real.getItem(arg0);
    }

    public long getItemId(int arg0) {
        return real.getItemId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder.wrap(real.getViewBinder());
    }

    public void setDropDownViewResource(int arg0) {
        real.setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        real.setDropDownViewTheme(arg0);
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder arg0) {
        real.setViewBinder(arg0 == null ? null : arg0.unwrap());
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, int arg1) {
        real.setViewImage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, java.lang.String arg1) {
        real.setViewImage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        real.setViewText(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final class ViewBinder {
        private final android.widget.SimpleAdapter.ViewBinder real;

        public ViewBinder(android.widget.SimpleAdapter.ViewBinder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder wrap(android.widget.SimpleAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder(real);
        }

        public android.widget.SimpleAdapter.ViewBinder unwrap() {
            return real;
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, java.lang.String arg2) {
            return real.setViewValue(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
