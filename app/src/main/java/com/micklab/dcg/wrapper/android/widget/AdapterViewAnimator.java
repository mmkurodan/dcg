// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterViewAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdapterViewAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterViewAnimator wrap(android.widget.AdapterViewAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterViewAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AdapterViewAnimator getReal() {
        return (android.widget.AdapterViewAnimator) real;
    }

    public android.widget.AdapterViewAnimator unwrap() {
        return getReal();
    }

    public void advance() {
        ((android.widget.AdapterViewAnimator) real).advance();
    }

    public void deferNotifyDataSetChanged() {
        ((android.widget.AdapterViewAnimator) real).deferNotifyDataSetChanged();
    }

    public void fyiWillBeAdvancedByHostKThx() {
        ((android.widget.AdapterViewAnimator) real).fyiWillBeAdvancedByHostKThx();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AdapterViewAnimator) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.Adapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.Adapter.wrap(((android.widget.AdapterViewAnimator) real).getAdapter());
    }

    public int getBaseline() {
        return ((android.widget.AdapterViewAnimator) real).getBaseline();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AdapterViewAnimator) real).getCurrentView());
    }

    public int getDisplayedChild() {
        return ((android.widget.AdapterViewAnimator) real).getDisplayedChild();
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator getInAnimation() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(((android.widget.AdapterViewAnimator) real).getInAnimation());
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator getOutAnimation() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(((android.widget.AdapterViewAnimator) real).getOutAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AdapterViewAnimator) real).getSelectedView());
    }

    public boolean onRemoteAdapterConnected() {
        return ((android.widget.AdapterViewAnimator) real).onRemoteAdapterConnected();
    }

    public void onRemoteAdapterDisconnected() {
        ((android.widget.AdapterViewAnimator) real).onRemoteAdapterDisconnected();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.AdapterViewAnimator) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.AdapterViewAnimator) real).onSaveInstanceState());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.AdapterViewAnimator) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        ((android.widget.AdapterViewAnimator) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setAnimateFirstView(boolean arg0) {
        ((android.widget.AdapterViewAnimator) real).setAnimateFirstView(arg0);
    }

    public void setDisplayedChild(int arg0) {
        ((android.widget.AdapterViewAnimator) real).setDisplayedChild(arg0);
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.animation.ObjectAnimator arg0) {
        ((android.widget.AdapterViewAnimator) real).setInAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.AdapterViewAnimator) real).setInAnimation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.animation.ObjectAnimator arg0) {
        ((android.widget.AdapterViewAnimator) real).setOutAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.AdapterViewAnimator) real).setOutAnimation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.widget.AdapterViewAnimator) real).setRemoteViewsAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.AdapterViewAnimator) real).setSelection(arg0);
    }

    public void showNext() {
        ((android.widget.AdapterViewAnimator) real).showNext();
    }

    public void showPrevious() {
        ((android.widget.AdapterViewAnimator) real).showPrevious();
    }

}
