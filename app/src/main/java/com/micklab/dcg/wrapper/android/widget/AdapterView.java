// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdapterView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterView wrap(android.widget.AdapterView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AdapterView getReal() {
        return (android.widget.AdapterView) real;
    }

    public android.widget.AdapterView unwrap() {
        return getReal();
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.AdapterView) real).addView(arg0 == null ? null : arg0.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.widget.AdapterView) real).addView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.widget.AdapterView) real).addView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.AdapterView) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AdapterView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.Adapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.Adapter.wrap(((android.widget.AdapterView) real).getAdapter());
    }

    public int getCount() {
        return ((android.widget.AdapterView) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getEmptyView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AdapterView) real).getEmptyView());
    }

    public int getFirstVisiblePosition() {
        return ((android.widget.AdapterView) real).getFirstVisiblePosition();
    }

    public java.lang.Object getItemAtPosition(int arg0) {
        return ((android.widget.AdapterView) real).getItemAtPosition(arg0);
    }

    public long getItemIdAtPosition(int arg0) {
        return ((android.widget.AdapterView) real).getItemIdAtPosition(arg0);
    }

    public int getLastVisiblePosition() {
        return ((android.widget.AdapterView) real).getLastVisiblePosition();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getOnItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(((android.widget.AdapterView) real).getOnItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener.wrap(((android.widget.AdapterView) real).getOnItemLongClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(((android.widget.AdapterView) real).getOnItemSelectedListener());
    }

    public int getPositionForView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.AdapterView) real).getPositionForView(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.Object getSelectedItem() {
        return ((android.widget.AdapterView) real).getSelectedItem();
    }

    public long getSelectedItemId() {
        return ((android.widget.AdapterView) real).getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return ((android.widget.AdapterView) real).getSelectedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AdapterView) real).getSelectedView());
    }

    public void onProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.widget.AdapterView) real).onProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return ((android.widget.AdapterView) real).performItemClick(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void removeAllViews() {
        ((android.widget.AdapterView) real).removeAllViews();
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.AdapterView) real).removeView(arg0 == null ? null : arg0.getReal());
    }

    public void removeViewAt(int arg0) {
        ((android.widget.AdapterView) real).removeViewAt(arg0);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        ((android.widget.AdapterView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setEmptyView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.AdapterView) real).setEmptyView(arg0 == null ? null : arg0.getReal());
    }

    public void setFocusable(int arg0) {
        ((android.widget.AdapterView) real).setFocusable(arg0);
    }

    public void setFocusableInTouchMode(boolean arg0) {
        ((android.widget.AdapterView) real).setFocusableInTouchMode(arg0);
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.AdapterView) real).setOnClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        ((android.widget.AdapterView) real).setOnItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemLongClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener arg0) {
        ((android.widget.AdapterView) real).setOnItemLongClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        ((android.widget.AdapterView) real).setOnItemSelectedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.AdapterView) real).setSelection(arg0);
    }

    public static final int INVALID_POSITION = android.widget.AdapterView.INVALID_POSITION;
    public static final long INVALID_ROW_ID = android.widget.AdapterView.INVALID_ROW_ID;
    public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = android.widget.AdapterView.ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
    public static final int ITEM_VIEW_TYPE_IGNORE = android.widget.AdapterView.ITEM_VIEW_TYPE_IGNORE;

    public static final class AdapterContextMenuInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AdapterContextMenuInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.AdapterContextMenuInfo wrap(android.widget.AdapterView.AdapterContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.AdapterContextMenuInfo(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AdapterView.AdapterContextMenuInfo getReal() {
            return (android.widget.AdapterView.AdapterContextMenuInfo) real;
        }

        public android.widget.AdapterView.AdapterContextMenuInfo unwrap() {
            return getReal();
        }

        public AdapterContextMenuInfo(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
            this(new android.widget.AdapterView.AdapterContextMenuInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }


    }
    public static final class OnItemClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnItemClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener wrap(android.widget.AdapterView.OnItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AdapterView.OnItemClickListener getReal() {
            return (android.widget.AdapterView.OnItemClickListener) real;
        }

        public android.widget.AdapterView.OnItemClickListener unwrap() {
            return getReal();
        }

    }
    public static final class OnItemLongClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnItemLongClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener wrap(android.widget.AdapterView.OnItemLongClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AdapterView.OnItemLongClickListener getReal() {
            return (android.widget.AdapterView.OnItemLongClickListener) real;
        }

        public android.widget.AdapterView.OnItemLongClickListener unwrap() {
            return getReal();
        }

    }
    public static final class OnItemSelectedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnItemSelectedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener wrap(android.widget.AdapterView.OnItemSelectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AdapterView.OnItemSelectedListener getReal() {
            return (android.widget.AdapterView.OnItemSelectedListener) real;
        }

        public android.widget.AdapterView.OnItemSelectedListener unwrap() {
            return getReal();
        }

    }
}
