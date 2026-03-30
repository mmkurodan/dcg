// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsListView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbsListView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsListView wrap(android.widget.AbsListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AbsListView getReal() {
        return (android.widget.AbsListView) real;
    }

    public android.widget.AbsListView unwrap() {
        return getReal();
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        ((android.widget.AbsListView) real).afterTextChanged(arg0 == null ? null : arg0.getReal());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.widget.AbsListView) real).beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public boolean canScrollList(int arg0) {
        return ((android.widget.AbsListView) real).canScrollList(arg0);
    }

    public boolean checkInputConnectionProxy(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.AbsListView) real).checkInputConnectionProxy(arg0 == null ? null : arg0.getReal());
    }

    public void clearChoices() {
        ((android.widget.AbsListView) real).clearChoices();
    }

    public void clearTextFilter() {
        ((android.widget.AbsListView) real).clearTextFilter();
    }

    public void deferNotifyDataSetChanged() {
        ((android.widget.AbsListView) real).deferNotifyDataSetChanged();
    }

    public void dispatchDrawableHotspotChanged(float arg0, float arg1) {
        ((android.widget.AbsListView) real).dispatchDrawableHotspotChanged(arg0, arg1);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.widget.AbsListView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public void fling(int arg0) {
        ((android.widget.AbsListView) real).fling(arg0);
    }

    public com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams.wrap(((android.widget.AbsListView) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AbsListView) real).getAccessibilityClassName();
    }

    public int getBottomEdgeEffectColor() {
        return ((android.widget.AbsListView) real).getBottomEdgeEffectColor();
    }

    public int getCacheColorHint() {
        return ((android.widget.AbsListView) real).getCacheColorHint();
    }

    public int getCheckedItemCount() {
        return ((android.widget.AbsListView) real).getCheckedItemCount();
    }

    public long[] getCheckedItemIds() {
        return ((android.widget.AbsListView) real).getCheckedItemIds();
    }

    public int getCheckedItemPosition() {
        return ((android.widget.AbsListView) real).getCheckedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.util.SparseBooleanArray getCheckedItemPositions() {
        return com.micklab.dcg.wrapper.android.util.SparseBooleanArray.wrap(((android.widget.AbsListView) real).getCheckedItemPositions());
    }

    public int getChoiceMode() {
        return ((android.widget.AbsListView) real).getChoiceMode();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.widget.AbsListView) real).getFocusedRect(arg0 == null ? null : arg0.getReal());
    }

    public int getListPaddingBottom() {
        return ((android.widget.AbsListView) real).getListPaddingBottom();
    }

    public int getListPaddingLeft() {
        return ((android.widget.AbsListView) real).getListPaddingLeft();
    }

    public int getListPaddingRight() {
        return ((android.widget.AbsListView) real).getListPaddingRight();
    }

    public int getListPaddingTop() {
        return ((android.widget.AbsListView) real).getListPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AbsListView) real).getSelectedView());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getSelector() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.AbsListView) real).getSelector());
    }

    public int getSolidColor() {
        return ((android.widget.AbsListView) real).getSolidColor();
    }

    public java.lang.CharSequence getTextFilter() {
        return ((android.widget.AbsListView) real).getTextFilter();
    }

    public int getTopEdgeEffectColor() {
        return ((android.widget.AbsListView) real).getTopEdgeEffectColor();
    }

    public int getTranscriptMode() {
        return ((android.widget.AbsListView) real).getTranscriptMode();
    }

    public int getVerticalScrollbarWidth() {
        return ((android.widget.AbsListView) real).getVerticalScrollbarWidth();
    }

    public boolean hasTextFilter() {
        return ((android.widget.AbsListView) real).hasTextFilter();
    }

    public void invalidateViews() {
        ((android.widget.AbsListView) real).invalidateViews();
    }

    public boolean isDrawSelectorOnTop() {
        return ((android.widget.AbsListView) real).isDrawSelectorOnTop();
    }

    public boolean isFastScrollAlwaysVisible() {
        return ((android.widget.AbsListView) real).isFastScrollAlwaysVisible();
    }

    public boolean isFastScrollEnabled() {
        return ((android.widget.AbsListView) real).isFastScrollEnabled();
    }

    public boolean isItemChecked(int arg0) {
        return ((android.widget.AbsListView) real).isItemChecked(arg0);
    }

    public boolean isScrollingCacheEnabled() {
        return ((android.widget.AbsListView) real).isScrollingCacheEnabled();
    }

    public boolean isSelectedChildViewEnabled() {
        return ((android.widget.AbsListView) real).isSelectedChildViewEnabled();
    }

    public boolean isSmoothScrollbarEnabled() {
        return ((android.widget.AbsListView) real).isSmoothScrollbarEnabled();
    }

    public boolean isStackFromBottom() {
        return ((android.widget.AbsListView) real).isStackFromBottom();
    }

    public boolean isTextFilterEnabled() {
        return ((android.widget.AbsListView) real).isTextFilterEnabled();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.widget.AbsListView) real).jumpDrawablesToCurrentState();
    }

    public void onCancelPendingInputEvents() {
        ((android.widget.AbsListView) real).onCancelPendingInputEvents();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.widget.AbsListView) real).onCreateInputConnection(arg0 == null ? null : arg0.getReal()));
    }

    public void onFilterComplete(int arg0) {
        ((android.widget.AbsListView) real).onFilterComplete(arg0);
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.AbsListView) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onGlobalLayout() {
        ((android.widget.AbsListView) real).onGlobalLayout();
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        ((android.widget.AbsListView) real).onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onInterceptHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.AbsListView) real).onInterceptHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.AbsListView) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.AbsListView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.AbsListView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return ((android.widget.AbsListView) real).onNestedFling(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.AbsListView) real).onNestedScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.widget.AbsListView) real).onNestedScrollAccepted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.widget.AbsListView) real).onProvideContentCaptureStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean onRemoteAdapterConnected() {
        return ((android.widget.AbsListView) real).onRemoteAdapterConnected();
    }

    public void onRemoteAdapterDisconnected() {
        ((android.widget.AbsListView) real).onRemoteAdapterDisconnected();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.widget.AbsListView) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.AbsListView) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.AbsListView) real).onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.AbsListView) real).onSaveInstanceState());
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return ((android.widget.AbsListView) real).onStartNestedScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.widget.AbsListView) real).onTextChanged(arg0, arg1, arg2, arg3);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.AbsListView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onTouchModeChanged(boolean arg0) {
        ((android.widget.AbsListView) real).onTouchModeChanged(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.widget.AbsListView) real).onWindowFocusChanged(arg0);
    }

    public boolean performItemClick(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, long arg2) {
        return ((android.widget.AbsListView) real).performItemClick(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public int pointToPosition(int arg0, int arg1) {
        return ((android.widget.AbsListView) real).pointToPosition(arg0, arg1);
    }

    public long pointToRowId(int arg0, int arg1) {
        return ((android.widget.AbsListView) real).pointToRowId(arg0, arg1);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        ((android.widget.AbsListView) real).requestDisallowInterceptTouchEvent(arg0);
    }

    public void requestLayout() {
        ((android.widget.AbsListView) real).requestLayout();
    }

    public void scrollListBy(int arg0) {
        ((android.widget.AbsListView) real).scrollListBy(arg0);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.widget.AbsListView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setBottomEdgeEffectColor(int arg0) {
        ((android.widget.AbsListView) real).setBottomEdgeEffectColor(arg0);
    }

    public void setCacheColorHint(int arg0) {
        ((android.widget.AbsListView) real).setCacheColorHint(arg0);
    }

    public void setChoiceMode(int arg0) {
        ((android.widget.AbsListView) real).setChoiceMode(arg0);
    }

    public void setDrawSelectorOnTop(boolean arg0) {
        ((android.widget.AbsListView) real).setDrawSelectorOnTop(arg0);
    }

    public void setEdgeEffectColor(int arg0) {
        ((android.widget.AbsListView) real).setEdgeEffectColor(arg0);
    }

    public void setFastScrollAlwaysVisible(boolean arg0) {
        ((android.widget.AbsListView) real).setFastScrollAlwaysVisible(arg0);
    }

    public void setFastScrollEnabled(boolean arg0) {
        ((android.widget.AbsListView) real).setFastScrollEnabled(arg0);
    }

    public void setFastScrollStyle(int arg0) {
        ((android.widget.AbsListView) real).setFastScrollStyle(arg0);
    }

    public void setFilterText(java.lang.String arg0) {
        ((android.widget.AbsListView) real).setFilterText(arg0);
    }

    public void setFriction(float arg0) {
        ((android.widget.AbsListView) real).setFriction(arg0);
    }

    public void setItemChecked(int arg0, boolean arg1) {
        ((android.widget.AbsListView) real).setItemChecked(arg0, arg1);
    }

    public void setMultiChoiceModeListener(com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener arg0) {
        ((android.widget.AbsListView) real).setMultiChoiceModeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnScrollListener(com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener arg0) {
        ((android.widget.AbsListView) real).setOnScrollListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRecyclerListener(com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener arg0) {
        ((android.widget.AbsListView) real).setRecyclerListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.widget.AbsListView) real).setRemoteViewsAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setScrollBarStyle(int arg0) {
        ((android.widget.AbsListView) real).setScrollBarStyle(arg0);
    }

    public void setScrollIndicators(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.widget.AbsListView) real).setScrollIndicators(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setScrollingCacheEnabled(boolean arg0) {
        ((android.widget.AbsListView) real).setScrollingCacheEnabled(arg0);
    }

    public void setSelectedChildViewEnabled(boolean arg0) {
        ((android.widget.AbsListView) real).setSelectedChildViewEnabled(arg0);
    }

    public void setSelectionFromTop(int arg0, int arg1) {
        ((android.widget.AbsListView) real).setSelectionFromTop(arg0, arg1);
    }

    public void setSelector(int arg0) {
        ((android.widget.AbsListView) real).setSelector(arg0);
    }

    public void setSelector(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.AbsListView) real).setSelector(arg0 == null ? null : arg0.getReal());
    }

    public void setSmoothScrollbarEnabled(boolean arg0) {
        ((android.widget.AbsListView) real).setSmoothScrollbarEnabled(arg0);
    }

    public void setStackFromBottom(boolean arg0) {
        ((android.widget.AbsListView) real).setStackFromBottom(arg0);
    }

    public void setTextFilterEnabled(boolean arg0) {
        ((android.widget.AbsListView) real).setTextFilterEnabled(arg0);
    }

    public void setTopEdgeEffectColor(int arg0) {
        ((android.widget.AbsListView) real).setTopEdgeEffectColor(arg0);
    }

    public void setTranscriptMode(int arg0) {
        ((android.widget.AbsListView) real).setTranscriptMode(arg0);
    }

    public void setVelocityScale(float arg0) {
        ((android.widget.AbsListView) real).setVelocityScale(arg0);
    }

    public void setVerticalScrollbarPosition(int arg0) {
        ((android.widget.AbsListView) real).setVerticalScrollbarPosition(arg0);
    }

    public boolean showContextMenu() {
        return ((android.widget.AbsListView) real).showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return ((android.widget.AbsListView) real).showContextMenu(arg0, arg1);
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.AbsListView) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return ((android.widget.AbsListView) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void smoothScrollBy(int arg0, int arg1) {
        ((android.widget.AbsListView) real).smoothScrollBy(arg0, arg1);
    }

    public void smoothScrollToPosition(int arg0) {
        ((android.widget.AbsListView) real).smoothScrollToPosition(arg0);
    }

    public void smoothScrollToPosition(int arg0, int arg1) {
        ((android.widget.AbsListView) real).smoothScrollToPosition(arg0, arg1);
    }

    public void smoothScrollToPositionFromTop(int arg0, int arg1) {
        ((android.widget.AbsListView) real).smoothScrollToPositionFromTop(arg0, arg1);
    }

    public void smoothScrollToPositionFromTop(int arg0, int arg1, int arg2) {
        ((android.widget.AbsListView) real).smoothScrollToPositionFromTop(arg0, arg1, arg2);
    }

    public boolean verifyDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return ((android.widget.AbsListView) real).verifyDrawable(arg0 == null ? null : arg0.getReal());
    }

    public static final int CHOICE_MODE_MULTIPLE = android.widget.AbsListView.CHOICE_MODE_MULTIPLE;
    public static final int CHOICE_MODE_MULTIPLE_MODAL = android.widget.AbsListView.CHOICE_MODE_MULTIPLE_MODAL;
    public static final int CHOICE_MODE_NONE = android.widget.AbsListView.CHOICE_MODE_NONE;
    public static final int CHOICE_MODE_SINGLE = android.widget.AbsListView.CHOICE_MODE_SINGLE;
    public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = android.widget.AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL;
    public static final int TRANSCRIPT_MODE_DISABLED = android.widget.AbsListView.TRANSCRIPT_MODE_DISABLED;
    public static final int TRANSCRIPT_MODE_NORMAL = android.widget.AbsListView.TRANSCRIPT_MODE_NORMAL;

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams wrap(android.widget.AbsListView.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsListView.LayoutParams getReal() {
            return (android.widget.AbsListView.LayoutParams) real;
        }

        public android.widget.AbsListView.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.AbsListView.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.AbsListView.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.AbsListView.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.widget.AbsListView.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
    public static final class MultiChoiceModeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MultiChoiceModeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener wrap(android.widget.AbsListView.MultiChoiceModeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.MultiChoiceModeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsListView.MultiChoiceModeListener getReal() {
            return (android.widget.AbsListView.MultiChoiceModeListener) real;
        }

        public android.widget.AbsListView.MultiChoiceModeListener unwrap() {
            return getReal();
        }

        public void onItemCheckedStateChanged(com.micklab.dcg.wrapper.android.view.ActionMode arg0, int arg1, long arg2, boolean arg3) {
            ((android.widget.AbsListView.MultiChoiceModeListener) real).onItemCheckedStateChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
    public static final class OnScrollListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScrollListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener wrap(android.widget.AbsListView.OnScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.OnScrollListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsListView.OnScrollListener getReal() {
            return (android.widget.AbsListView.OnScrollListener) real;
        }

        public android.widget.AbsListView.OnScrollListener unwrap() {
            return getReal();
        }

        public void onScroll(com.micklab.dcg.wrapper.android.widget.AbsListView arg0, int arg1, int arg2, int arg3) {
            ((android.widget.AbsListView.OnScrollListener) real).onScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void onScrollStateChanged(com.micklab.dcg.wrapper.android.widget.AbsListView arg0, int arg1) {
            ((android.widget.AbsListView.OnScrollListener) real).onScrollStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int SCROLL_STATE_FLING = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_FLING;
        public static final int SCROLL_STATE_IDLE = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE;
        public static final int SCROLL_STATE_TOUCH_SCROLL = android.widget.AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;

    }
    public static final class RecyclerListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecyclerListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener wrap(android.widget.AbsListView.RecyclerListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.RecyclerListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsListView.RecyclerListener getReal() {
            return (android.widget.AbsListView.RecyclerListener) real;
        }

        public android.widget.AbsListView.RecyclerListener unwrap() {
            return getReal();
        }

        public void onMovedToScrapHeap(com.micklab.dcg.wrapper.android.view.View arg0) {
            ((android.widget.AbsListView.RecyclerListener) real).onMovedToScrapHeap(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class SelectionBoundsAdjuster {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SelectionBoundsAdjuster(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AbsListView.SelectionBoundsAdjuster wrap(android.widget.AbsListView.SelectionBoundsAdjuster real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsListView.SelectionBoundsAdjuster(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AbsListView.SelectionBoundsAdjuster getReal() {
            return (android.widget.AbsListView.SelectionBoundsAdjuster) real;
        }

        public android.widget.AbsListView.SelectionBoundsAdjuster unwrap() {
            return getReal();
        }

        public void adjustListItemSelectionBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            ((android.widget.AbsListView.SelectionBoundsAdjuster) real).adjustListItemSelectionBounds(arg0 == null ? null : arg0.getReal());
        }

    }
}
