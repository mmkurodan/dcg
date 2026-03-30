// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ExpandableListView {
    private final android.widget.ExpandableListView real;

    public ExpandableListView(android.widget.ExpandableListView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ExpandableListView wrap(android.widget.ExpandableListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView(real);
    }

    public android.widget.ExpandableListView unwrap() {
        return real;
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.unwrap()));
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public boolean collapseGroup(int arg0) {
        return real.collapseGroup(arg0);
    }

    public boolean expandGroup(int arg0) {
        return real.expandGroup(arg0);
    }

    public boolean expandGroup(int arg0, boolean arg1) {
        return real.expandGroup(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter getExpandableListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter.wrap(real.getExpandableListAdapter());
    }

    public long getExpandableListPosition(int arg0) {
        return real.getExpandableListPosition(arg0);
    }

    public int getFlatListPosition(long arg0) {
        return real.getFlatListPosition(arg0);
    }

    public static int getPackedPositionChild(long arg0) {
        return android.widget.ExpandableListView.getPackedPositionChild(arg0);
    }

    public static long getPackedPositionForChild(int arg0, int arg1) {
        return android.widget.ExpandableListView.getPackedPositionForChild(arg0, arg1);
    }

    public static long getPackedPositionForGroup(int arg0) {
        return android.widget.ExpandableListView.getPackedPositionForGroup(arg0);
    }

    public static int getPackedPositionGroup(long arg0) {
        return android.widget.ExpandableListView.getPackedPositionGroup(arg0);
    }

    public static int getPackedPositionType(long arg0) {
        return android.widget.ExpandableListView.getPackedPositionType(arg0);
    }

    public long getSelectedId() {
        return real.getSelectedId();
    }

    public long getSelectedPosition() {
        return real.getSelectedPosition();
    }

    public boolean isGroupExpanded(int arg0) {
        return real.isGroupExpanded(arg0);
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        real.onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return real.performItemClick(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setChildDivider(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setChildDivider(arg0 == null ? null : arg0.unwrap());
    }

    public void setChildIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setChildIndicator(arg0 == null ? null : arg0.unwrap());
    }

    public void setChildIndicatorBounds(int arg0, int arg1) {
        real.setChildIndicatorBounds(arg0, arg1);
    }

    public void setChildIndicatorBoundsRelative(int arg0, int arg1) {
        real.setChildIndicatorBoundsRelative(arg0, arg1);
    }

    public void setGroupIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setGroupIndicator(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndicatorBounds(int arg0, int arg1) {
        real.setIndicatorBounds(arg0, arg1);
    }

    public void setIndicatorBoundsRelative(int arg0, int arg1) {
        real.setIndicatorBoundsRelative(arg0, arg1);
    }

    public void setOnChildClickListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener arg0) {
        real.setOnChildClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnGroupClickListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener arg0) {
        real.setOnGroupClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnGroupCollapseListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener arg0) {
        real.setOnGroupCollapseListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnGroupExpandListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener arg0) {
        real.setOnGroupExpandListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        real.setOnItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setSelectedChild(int arg0, int arg1, boolean arg2) {
        return real.setSelectedChild(arg0, arg1, arg2);
    }

    public void setSelectedGroup(int arg0) {
        real.setSelectedGroup(arg0);
    }

    public static final int CHILD_INDICATOR_INHERIT = android.widget.ExpandableListView.CHILD_INDICATOR_INHERIT;
    public static final int PACKED_POSITION_TYPE_CHILD = android.widget.ExpandableListView.PACKED_POSITION_TYPE_CHILD;
    public static final int PACKED_POSITION_TYPE_GROUP = android.widget.ExpandableListView.PACKED_POSITION_TYPE_GROUP;
    public static final int PACKED_POSITION_TYPE_NULL = android.widget.ExpandableListView.PACKED_POSITION_TYPE_NULL;
    public static final long PACKED_POSITION_VALUE_NULL = android.widget.ExpandableListView.PACKED_POSITION_VALUE_NULL;

    public static final class ExpandableListContextMenuInfo {
        private final android.widget.ExpandableListView.ExpandableListContextMenuInfo real;

        public ExpandableListContextMenuInfo(android.widget.ExpandableListView.ExpandableListContextMenuInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.ExpandableListContextMenuInfo wrap(android.widget.ExpandableListView.ExpandableListContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.ExpandableListContextMenuInfo(real);
        }

        public android.widget.ExpandableListView.ExpandableListContextMenuInfo unwrap() {
            return real;
        }

        public ExpandableListContextMenuInfo(com.micklab.dcg.wrapper.android.view.View arg0, long arg1, long arg2) {
            this(new android.widget.ExpandableListView.ExpandableListContextMenuInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }


    }
    public static final class OnChildClickListener {
        private final android.widget.ExpandableListView.OnChildClickListener real;

        public OnChildClickListener(android.widget.ExpandableListView.OnChildClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener wrap(android.widget.ExpandableListView.OnChildClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener(real);
        }

        public android.widget.ExpandableListView.OnChildClickListener unwrap() {
            return real;
        }

        public boolean onChildClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, long arg4) {
            return real.onChildClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
        }

    }
    public static final class OnGroupClickListener {
        private final android.widget.ExpandableListView.OnGroupClickListener real;

        public OnGroupClickListener(android.widget.ExpandableListView.OnGroupClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener wrap(android.widget.ExpandableListView.OnGroupClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener(real);
        }

        public android.widget.ExpandableListView.OnGroupClickListener unwrap() {
            return real;
        }

        public boolean onGroupClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, long arg3) {
            return real.onGroupClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

    }
    public static final class OnGroupCollapseListener {
        private final android.widget.ExpandableListView.OnGroupCollapseListener real;

        public OnGroupCollapseListener(android.widget.ExpandableListView.OnGroupCollapseListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener wrap(android.widget.ExpandableListView.OnGroupCollapseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener(real);
        }

        public android.widget.ExpandableListView.OnGroupCollapseListener unwrap() {
            return real;
        }

        public void onGroupCollapse(int arg0) {
            real.onGroupCollapse(arg0);
        }

    }
    public static final class OnGroupExpandListener {
        private final android.widget.ExpandableListView.OnGroupExpandListener real;

        public OnGroupExpandListener(android.widget.ExpandableListView.OnGroupExpandListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener wrap(android.widget.ExpandableListView.OnGroupExpandListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener(real);
        }

        public android.widget.ExpandableListView.OnGroupExpandListener unwrap() {
            return real;
        }

        public void onGroupExpand(int arg0) {
            real.onGroupExpand(arg0);
        }

    }
}
