// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleAdapter wrap(android.widget.SimpleAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SimpleAdapter getReal() {
        return (android.widget.SimpleAdapter) real;
    }

    public android.widget.SimpleAdapter unwrap() {
        return getReal();
    }

    public SimpleAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, java.lang.String[] arg3, int[] arg4) {
        this(new android.widget.SimpleAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int getCount() {
        return ((android.widget.SimpleAdapter) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleAdapter) real).getDropDownView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return ((android.widget.SimpleAdapter) real).getDropDownViewTheme();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.SimpleAdapter) real).getFilter());
    }

    public java.lang.Object getItem(int arg0) {
        return ((android.widget.SimpleAdapter) real).getItem(arg0);
    }

    public long getItemId(int arg0) {
        return ((android.widget.SimpleAdapter) real).getItemId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleAdapter) real).getView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder getViewBinder() {
        return com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder.wrap(((android.widget.SimpleAdapter) real).getViewBinder());
    }

    public void setDropDownViewResource(int arg0) {
        ((android.widget.SimpleAdapter) real).setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        ((android.widget.SimpleAdapter) real).setDropDownViewTheme(arg0);
    }

    public void setViewBinder(com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder arg0) {
        ((android.widget.SimpleAdapter) real).setViewBinder(arg0 == null ? null : arg0.getReal());
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, java.lang.String arg1) {
        ((android.widget.SimpleAdapter) real).setViewImage(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setViewImage(com.micklab.dcg.wrapper.android.widget.ImageView arg0, int arg1) {
        ((android.widget.SimpleAdapter) real).setViewImage(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setViewText(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.lang.String arg1) {
        ((android.widget.SimpleAdapter) real).setViewText(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final class ViewBinder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ViewBinder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder wrap(android.widget.SimpleAdapter.ViewBinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleAdapter.ViewBinder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SimpleAdapter.ViewBinder getReal() {
            return (android.widget.SimpleAdapter.ViewBinder) real;
        }

        public android.widget.SimpleAdapter.ViewBinder unwrap() {
            return getReal();
        }

        public boolean setViewValue(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, java.lang.String arg2) {
            return ((android.widget.SimpleAdapter.ViewBinder) real).setViewValue(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
