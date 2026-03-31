// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ExpandableListView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExpandableListView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ExpandableListView wrap(android.widget.ExpandableListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ExpandableListView getReal() {
        return (android.widget.ExpandableListView) real;
    }

    public android.widget.ExpandableListView unwrap() {
        return getReal();
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ExpandableListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ExpandableListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean collapseGroup(int arg0) {
        return ((android.widget.ExpandableListView) real).collapseGroup(arg0);
    }

    public boolean expandGroup(int arg0) {
        return ((android.widget.ExpandableListView) real).expandGroup(arg0);
    }

    public boolean expandGroup(int arg0, boolean arg1) {
        return ((android.widget.ExpandableListView) real).expandGroup(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ExpandableListView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.ExpandableListView) real).getAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter getExpandableListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter.wrap(((android.widget.ExpandableListView) real).getExpandableListAdapter());
    }

    public long getExpandableListPosition(int arg0) {
        return ((android.widget.ExpandableListView) real).getExpandableListPosition(arg0);
    }

    public int getFlatListPosition(long arg0) {
        return ((android.widget.ExpandableListView) real).getFlatListPosition(arg0);
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
        return ((android.widget.ExpandableListView) real).getSelectedId();
    }

    public long getSelectedPosition() {
        return ((android.widget.ExpandableListView) real).getSelectedPosition();
    }

    public boolean isGroupExpanded(int arg0) {
        return ((android.widget.ExpandableListView) real).isGroupExpanded(arg0);
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        ((android.widget.ExpandableListView) real).onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.ExpandableListView) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.ExpandableListView) real).onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.ExpandableListView) real).onSaveInstanceState());
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return ((android.widget.ExpandableListView) real).performItemClick(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.widget.ExpandableListView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter arg0) {
        ((android.widget.ExpandableListView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setChildDivider(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ExpandableListView) real).setChildDivider(arg0 == null ? null : arg0.getReal());
    }

    public void setChildIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ExpandableListView) real).setChildIndicator(arg0 == null ? null : arg0.getReal());
    }

    public void setChildIndicatorBounds(int arg0, int arg1) {
        ((android.widget.ExpandableListView) real).setChildIndicatorBounds(arg0, arg1);
    }

    public void setChildIndicatorBoundsRelative(int arg0, int arg1) {
        ((android.widget.ExpandableListView) real).setChildIndicatorBoundsRelative(arg0, arg1);
    }

    public void setGroupIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ExpandableListView) real).setGroupIndicator(arg0 == null ? null : arg0.getReal());
    }

    public void setIndicatorBounds(int arg0, int arg1) {
        ((android.widget.ExpandableListView) real).setIndicatorBounds(arg0, arg1);
    }

    public void setIndicatorBoundsRelative(int arg0, int arg1) {
        ((android.widget.ExpandableListView) real).setIndicatorBoundsRelative(arg0, arg1);
    }

    public void setOnChildClickListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener arg0) {
        ((android.widget.ExpandableListView) real).setOnChildClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnGroupClickListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener arg0) {
        ((android.widget.ExpandableListView) real).setOnGroupClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnGroupCollapseListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener arg0) {
        ((android.widget.ExpandableListView) real).setOnGroupCollapseListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnGroupExpandListener(com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener arg0) {
        ((android.widget.ExpandableListView) real).setOnGroupExpandListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        ((android.widget.ExpandableListView) real).setOnItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setSelectedChild(int arg0, int arg1, boolean arg2) {
        return ((android.widget.ExpandableListView) real).setSelectedChild(arg0, arg1, arg2);
    }

    public void setSelectedGroup(int arg0) {
        ((android.widget.ExpandableListView) real).setSelectedGroup(arg0);
    }

    public static final int CHILD_INDICATOR_INHERIT = android.widget.ExpandableListView.CHILD_INDICATOR_INHERIT;
    public static final int PACKED_POSITION_TYPE_CHILD = android.widget.ExpandableListView.PACKED_POSITION_TYPE_CHILD;
    public static final int PACKED_POSITION_TYPE_GROUP = android.widget.ExpandableListView.PACKED_POSITION_TYPE_GROUP;
    public static final int PACKED_POSITION_TYPE_NULL = android.widget.ExpandableListView.PACKED_POSITION_TYPE_NULL;
    public static final long PACKED_POSITION_VALUE_NULL = android.widget.ExpandableListView.PACKED_POSITION_VALUE_NULL;

    public static final class ExpandableListContextMenuInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExpandableListContextMenuInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.ExpandableListContextMenuInfo wrap(android.widget.ExpandableListView.ExpandableListContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.ExpandableListContextMenuInfo(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ExpandableListView.ExpandableListContextMenuInfo getReal() {
            return (android.widget.ExpandableListView.ExpandableListContextMenuInfo) real;
        }

        public android.widget.ExpandableListView.ExpandableListContextMenuInfo unwrap() {
            return getReal();
        }

        public ExpandableListContextMenuInfo(com.micklab.dcg.wrapper.android.view.View arg0, long arg1, long arg2) {
            this(new android.widget.ExpandableListView.ExpandableListContextMenuInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }


    }
    public static final class OnChildClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnChildClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener wrap(android.widget.ExpandableListView.OnChildClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnChildClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ExpandableListView.OnChildClickListener getReal() {
            return (android.widget.ExpandableListView.OnChildClickListener) real;
        }

        public android.widget.ExpandableListView.OnChildClickListener unwrap() {
            return getReal();
        }

        public boolean onChildClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, long arg4) {
            return ((android.widget.ExpandableListView.OnChildClickListener) real).onChildClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
        }

    }
    public static final class OnGroupClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGroupClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener wrap(android.widget.ExpandableListView.OnGroupClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ExpandableListView.OnGroupClickListener getReal() {
            return (android.widget.ExpandableListView.OnGroupClickListener) real;
        }

        public android.widget.ExpandableListView.OnGroupClickListener unwrap() {
            return getReal();
        }

        public boolean onGroupClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, long arg3) {
            return ((android.widget.ExpandableListView.OnGroupClickListener) real).onGroupClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

    }
    public static final class OnGroupCollapseListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGroupCollapseListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener wrap(android.widget.ExpandableListView.OnGroupCollapseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupCollapseListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ExpandableListView.OnGroupCollapseListener getReal() {
            return (android.widget.ExpandableListView.OnGroupCollapseListener) real;
        }

        public android.widget.ExpandableListView.OnGroupCollapseListener unwrap() {
            return getReal();
        }

        public void onGroupCollapse(int arg0) {
            ((android.widget.ExpandableListView.OnGroupCollapseListener) real).onGroupCollapse(arg0);
        }

    }
    public static final class OnGroupExpandListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGroupExpandListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener wrap(android.widget.ExpandableListView.OnGroupExpandListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListView.OnGroupExpandListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ExpandableListView.OnGroupExpandListener getReal() {
            return (android.widget.ExpandableListView.OnGroupExpandListener) real;
        }

        public android.widget.ExpandableListView.OnGroupExpandListener unwrap() {
            return getReal();
        }

        public void onGroupExpand(int arg0) {
            ((android.widget.ExpandableListView.OnGroupExpandListener) real).onGroupExpand(arg0);
        }

    }
}
