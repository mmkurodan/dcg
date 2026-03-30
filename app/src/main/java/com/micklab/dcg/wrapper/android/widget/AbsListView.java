// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsListView {
    private final android.widget.AbsListView real;

    public AbsListView(android.widget.AbsListView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsListView wrap(android.widget.AbsListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView(real);
    }

    public android.widget.AbsListView unwrap() {
        return real;
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        real.afterTextChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public boolean canScrollList(int arg0) {
        return real.canScrollList(arg0);
    }

    public boolean checkInputConnectionProxy(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.checkInputConnectionProxy(arg0 == null ? null : arg0.unwrap());
    }

    public void clearChoices() {
        real.clearChoices();
    }

    public void clearTextFilter() {
        real.clearTextFilter();
    }

    public void deferNotifyDataSetChanged() {
        real.deferNotifyDataSetChanged();
    }

    public void dispatchDrawableHotspotChanged(float arg0, float arg1) {
        real.dispatchDrawableHotspotChanged(arg0, arg1);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void fling(int arg0) {
        real.fling(arg0);
    }

    public com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getBottomEdgeEffectColor() {
        return real.getBottomEdgeEffectColor();
    }

    public int getCacheColorHint() {
        return real.getCacheColorHint();
    }

    public int getCheckedItemCount() {
        return real.getCheckedItemCount();
    }

    public long[] getCheckedItemIds() {
        return real.getCheckedItemIds();
    }

    public int getCheckedItemPosition() {
        return real.getCheckedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.util.SparseBooleanArray getCheckedItemPositions() {
        return com.micklab.dcg.wrapper.android.util.SparseBooleanArray.wrap(real.getCheckedItemPositions());
    }

    public int getChoiceMode() {
        return real.getChoiceMode();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getFocusedRect(arg0 == null ? null : arg0.unwrap());
    }

    public int getListPaddingBottom() {
        return real.getListPaddingBottom();
    }

    public int getListPaddingLeft() {
        return real.getListPaddingLeft();
    }

    public int getListPaddingRight() {
        return real.getListPaddingRight();
    }

    public int getListPaddingTop() {
        return real.getListPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getSelectedView());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getSelector() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getSelector());
    }

    public int getSolidColor() {
        return real.getSolidColor();
    }

    public java.lang.CharSequence getTextFilter() {
        return real.getTextFilter();
    }

    public int getTopEdgeEffectColor() {
        return real.getTopEdgeEffectColor();
    }

    public int getTranscriptMode() {
        return real.getTranscriptMode();
    }

    public int getVerticalScrollbarWidth() {
        return real.getVerticalScrollbarWidth();
    }

    public boolean hasTextFilter() {
        return real.hasTextFilter();
    }

    public void invalidateViews() {
        real.invalidateViews();
    }

    public boolean isDrawSelectorOnTop() {
        return real.isDrawSelectorOnTop();
    }

    public boolean isFastScrollAlwaysVisible() {
        return real.isFastScrollAlwaysVisible();
    }

    public boolean isFastScrollEnabled() {
        return real.isFastScrollEnabled();
    }

    public boolean isItemChecked(int arg0) {
        return real.isItemChecked(arg0);
    }

    public boolean isScrollingCacheEnabled() {
        return real.isScrollingCacheEnabled();
    }

    public boolean isSelectedChildViewEnabled() {
        return real.isSelectedChildViewEnabled();
    }

    public boolean isSmoothScrollbarEnabled() {
        return real.isSmoothScrollbarEnabled();
    }

    public boolean isStackFromBottom() {
        return real.isStackFromBottom();
    }

    public boolean isTextFilterEnabled() {
        return real.isTextFilterEnabled();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onCancelPendingInputEvents() {
        real.onCancelPendingInputEvents();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.onCreateInputConnection(arg0 == null ? null : arg0.unwrap()));
    }

    public void onFilterComplete(int arg0) {
        real.onFilterComplete(arg0);
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onGlobalLayout() {
        real.onGlobalLayout();
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        real.onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onInterceptHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return real.onNestedFling(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.onNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.onNestedScrollAccepted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideContentCaptureStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean onRemoteAdapterConnected() {
        return real.onRemoteAdapterConnected();
    }

    public void onRemoteAdapterDisconnected() {
        real.onRemoteAdapterDisconnected();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
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

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return real.onStartNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.onTextChanged(arg0, arg1, arg2, arg3);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onTouchModeChanged(boolean arg0) {
        real.onTouchModeChanged(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return real.performItemClick(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public int pointToPosition(int arg0, int arg1) {
        return real.pointToPosition(arg0, arg1);
    }

    public long pointToRowId(int arg0, int arg1) {
        return real.pointToRowId(arg0, arg1);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        real.requestDisallowInterceptTouchEvent(arg0);
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void scrollListBy(int arg0) {
        real.scrollListBy(arg0);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setBottomEdgeEffectColor(int arg0) {
        real.setBottomEdgeEffectColor(arg0);
    }

    public void setCacheColorHint(int arg0) {
        real.setCacheColorHint(arg0);
    }

    public void setChoiceMode(int arg0) {
        real.setChoiceMode(arg0);
    }

    public void setDrawSelectorOnTop(boolean arg0) {
        real.setDrawSelectorOnTop(arg0);
    }

    public void setEdgeEffectColor(int arg0) {
        real.setEdgeEffectColor(arg0);
    }

    public void setFastScrollAlwaysVisible(boolean arg0) {
        real.setFastScrollAlwaysVisible(arg0);
    }

    public void setFastScrollEnabled(boolean arg0) {
        real.setFastScrollEnabled(arg0);
    }

    public void setFastScrollStyle(int arg0) {
        real.setFastScrollStyle(arg0);
    }

    public void setFilterText(java.lang.String arg0) {
        real.setFilterText(arg0);
    }

    public void setFriction(float arg0) {
        real.setFriction(arg0);
    }

    public void setItemChecked(int arg0, boolean arg1) {
        real.setItemChecked(arg0, arg1);
    }

    public void setMultiChoiceModeListener(com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener arg0) {
        real.setMultiChoiceModeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnScrollListener(com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener arg0) {
        real.setOnScrollListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRecyclerListener(com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener arg0) {
        real.setRecyclerListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setRemoteViewsAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setScrollBarStyle(int arg0) {
        real.setScrollBarStyle(arg0);
    }

    public void setScrollIndicators(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.setScrollIndicators(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setScrollingCacheEnabled(boolean arg0) {
        real.setScrollingCacheEnabled(arg0);
    }

    public void setSelectedChildViewEnabled(boolean arg0) {
        real.setSelectedChildViewEnabled(arg0);
    }

    public void setSelectionFromTop(int arg0, int arg1) {
        real.setSelectionFromTop(arg0, arg1);
    }

    public void setSelector(int arg0) {
        real.setSelector(arg0);
    }

    public void setSelector(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setSelector(arg0 == null ? null : arg0.unwrap());
    }

    public void setSmoothScrollbarEnabled(boolean arg0) {
        real.setSmoothScrollbarEnabled(arg0);
    }

    public void setStackFromBottom(boolean arg0) {
        real.setStackFromBottom(arg0);
    }

    public void setTextFilterEnabled(boolean arg0) {
        real.setTextFilterEnabled(arg0);
    }

    public void setTopEdgeEffectColor(int arg0) {
        real.setTopEdgeEffectColor(arg0);
    }

    public void setTranscriptMode(int arg0) {
        real.setTranscriptMode(arg0);
    }

    public void setVelocityScale(float arg0) {
        real.setVelocityScale(arg0);
    }

    public void setVerticalScrollbarPosition(int arg0) {
        real.setVerticalScrollbarPosition(arg0);
    }

    public boolean showContextMenu() {
        return real.showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return real.showContextMenu(arg0, arg1);
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void smoothScrollBy(int arg0, int arg1) {
        real.smoothScrollBy(arg0, arg1);
    }

    public void smoothScrollToPosition(int arg0) {
        real.smoothScrollToPosition(arg0);
    }

    public void smoothScrollToPosition(int arg0, int arg1) {
        real.smoothScrollToPosition(arg0, arg1);
    }

    public void smoothScrollToPositionFromTop(int arg0, int arg1) {
        real.smoothScrollToPositionFromTop(arg0, arg1);
    }

    public void smoothScrollToPositionFromTop(int arg0, int arg1, int arg2) {
        real.smoothScrollToPositionFromTop(arg0, arg1, arg2);
    }

    public boolean verifyDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return real.verifyDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public static final int CHOICE_MODE_MULTIPLE = android.widget.AbsListView.CHOICE_MODE_MULTIPLE;
    public static final int CHOICE_MODE_MULTIPLE_MODAL = android.widget.AbsListView.CHOICE_MODE_MULTIPLE_MODAL;
    public static final int CHOICE_MODE_NONE = android.widget.AbsListView.CHOICE_MODE_NONE;
    public static final int CHOICE_MODE_SINGLE = android.widget.AbsListView.CHOICE_MODE_SINGLE;
    public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = android.widget.AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL;
    public static final int TRANSCRIPT_MODE_DISABLED = android.widget.AbsListView.TRANSCRIPT_MODE_DISABLED;
    public static final int TRANSCRIPT_MODE_NORMAL = android.widget.AbsListView.TRANSCRIPT_MODE_NORMAL;

    public static final class LayoutParams {
        private final android.widget.AbsListView.LayoutParams real;

        public LayoutParams(android.widget.AbsListView.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams wrap(android.widget.AbsListView.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams(real);
        }

        public android.widget.AbsListView.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.AbsListView.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.AbsListView.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.AbsListView.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.widget.AbsListView.LayoutParams(arg0, arg1, arg2));
        }

    }
    public static final class MultiChoiceModeListener {
        private final android.widget.AbsListView.MultiChoiceModeListener real;

        public MultiChoiceModeListener(android.widget.AbsListView.MultiChoiceModeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener wrap(android.widget.AbsListView.MultiChoiceModeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener(real);
        }

        public android.widget.AbsListView.MultiChoiceModeListener unwrap() {
            return real;
        }

        public void onItemCheckedStateChanged(com.micklab.dcg.wrapper.android.view.ActionMode arg0, int arg1, long arg2, boolean arg3) {
            real.onItemCheckedStateChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
    public static final class OnScrollListener {
        private final android.widget.AbsListView.OnScrollListener real;

        public OnScrollListener(android.widget.AbsListView.OnScrollListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener wrap(android.widget.AbsListView.OnScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener(real);
        }

        public android.widget.AbsListView.OnScrollListener unwrap() {
            return real;
        }

        public void onScroll(com.micklab.dcg.wrapper.android.widget.AbsListView arg0, int arg1, int arg2, int arg3) {
            real.onScroll(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public void onScrollStateChanged(com.micklab.dcg.wrapper.android.widget.AbsListView arg0, int arg1) {
            real.onScrollStateChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int SCROLL_STATE_FLING = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_FLING;
        public static final int SCROLL_STATE_IDLE = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE;
        public static final int SCROLL_STATE_TOUCH_SCROLL = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;

    }
    public static final class RecyclerListener {
        private final android.widget.AbsListView.RecyclerListener real;

        public RecyclerListener(android.widget.AbsListView.RecyclerListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener wrap(android.widget.AbsListView.RecyclerListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener(real);
        }

        public android.widget.AbsListView.RecyclerListener unwrap() {
            return real;
        }

        public void onMovedToScrapHeap(com.micklab.dcg.wrapper.android.view.View arg0) {
            real.onMovedToScrapHeap(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class SelectionBoundsAdjuster {
        private final android.widget.AbsListView.SelectionBoundsAdjuster real;

        public SelectionBoundsAdjuster(android.widget.AbsListView.SelectionBoundsAdjuster real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.SelectionBoundsAdjuster wrap(android.widget.AbsListView.SelectionBoundsAdjuster real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.SelectionBoundsAdjuster(real);
        }

        public android.widget.AbsListView.SelectionBoundsAdjuster unwrap() {
            return real;
        }

        public void adjustListItemSelectionBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            real.adjustListItemSelectionBounds(arg0 == null ? null : arg0.unwrap());
        }

    }
}
