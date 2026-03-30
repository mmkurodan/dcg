// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterView {
    private final android.widget.AdapterView real;

    public AdapterView(android.widget.AdapterView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterView wrap(android.widget.AdapterView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView(real);
    }

    public android.widget.AdapterView unwrap() {
        return real;
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addView(arg0 == null ? null : arg0.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.Adapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.Adapter.wrap(real.getAdapter());
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getEmptyView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getEmptyView());
    }

    public int getFirstVisiblePosition() {
        return real.getFirstVisiblePosition();
    }

    public java.lang.Object getItemAtPosition(int arg0) {
        return real.getItemAtPosition(arg0);
    }

    public long getItemIdAtPosition(int arg0) {
        return real.getItemIdAtPosition(arg0);
    }

    public int getLastVisiblePosition() {
        return real.getLastVisiblePosition();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getOnItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(real.getOnItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener.wrap(real.getOnItemLongClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(real.getOnItemSelectedListener());
    }

    public int getPositionForView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.getPositionForView(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.Object getSelectedItem() {
        return real.getSelectedItem();
    }

    public long getSelectedItemId() {
        return real.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return real.getSelectedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getSelectedView());
    }

    public void onProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideAutofillStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return real.performItemClick(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void removeAllViews() {
        real.removeAllViews();
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.removeView(arg0 == null ? null : arg0.unwrap());
    }

    public void removeViewAt(int arg0) {
        real.removeViewAt(arg0);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setEmptyView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setEmptyView(arg0 == null ? null : arg0.unwrap());
    }

    public void setFocusable(int arg0) {
        real.setFocusable(arg0);
    }

    public void setFocusableInTouchMode(boolean arg0) {
        real.setFocusableInTouchMode(arg0);
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        real.setOnItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemLongClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener arg0) {
        real.setOnItemLongClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        real.setOnItemSelectedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public static final int INVALID_POSITION = android.widget.AdapterView.INVALID_POSITION;
    public static final long INVALID_ROW_ID = android.widget.AdapterView.INVALID_ROW_ID;
    public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = android.widget.AdapterView.ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
    public static final int ITEM_VIEW_TYPE_IGNORE = android.widget.AdapterView.ITEM_VIEW_TYPE_IGNORE;

    public static final class AdapterContextMenuInfo {
        private final android.widget.AdapterView.AdapterContextMenuInfo real;

        public AdapterContextMenuInfo(android.widget.AdapterView.AdapterContextMenuInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.AdapterContextMenuInfo wrap(android.widget.AdapterView.AdapterContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.AdapterContextMenuInfo(real);
        }

        public android.widget.AdapterView.AdapterContextMenuInfo unwrap() {
            return real;
        }

        public AdapterContextMenuInfo(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
            this(new android.widget.AdapterView.AdapterContextMenuInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }


    }
    public static final class OnItemClickListener {
        private final android.widget.AdapterView.OnItemClickListener real;

        public OnItemClickListener(android.widget.AdapterView.OnItemClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener wrap(android.widget.AdapterView.OnItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener(real);
        }

        public android.widget.AdapterView.OnItemClickListener unwrap() {
            return real;
        }

    }
    public static final class OnItemLongClickListener {
        private final android.widget.AdapterView.OnItemLongClickListener real;

        public OnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener wrap(android.widget.AdapterView.OnItemLongClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemLongClickListener(real);
        }

        public android.widget.AdapterView.OnItemLongClickListener unwrap() {
            return real;
        }

    }
    public static final class OnItemSelectedListener {
        private final android.widget.AdapterView.OnItemSelectedListener real;

        public OnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener wrap(android.widget.AdapterView.OnItemSelectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener(real);
        }

        public android.widget.AdapterView.OnItemSelectedListener unwrap() {
            return real;
        }

    }
}
