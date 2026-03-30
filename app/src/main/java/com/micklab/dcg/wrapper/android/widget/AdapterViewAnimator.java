// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterViewAnimator {
    private final android.widget.AdapterViewAnimator real;

    public AdapterViewAnimator(android.widget.AdapterViewAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterViewAnimator wrap(android.widget.AdapterViewAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterViewAnimator(real);
    }

    public android.widget.AdapterViewAnimator unwrap() {
        return real;
    }

    public void advance() {
        real.advance();
    }

    public void deferNotifyDataSetChanged() {
        real.deferNotifyDataSetChanged();
    }

    public void fyiWillBeAdvancedByHostKThx() {
        real.fyiWillBeAdvancedByHostKThx();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.Adapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.Adapter.wrap(real.getAdapter());
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentView());
    }

    public int getDisplayedChild() {
        return real.getDisplayedChild();
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator getInAnimation() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(real.getInAnimation());
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator getOutAnimation() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(real.getOutAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getSelectedView());
    }

    public boolean onRemoteAdapterConnected() {
        return real.onRemoteAdapterConnected();
    }

    public void onRemoteAdapterDisconnected() {
        real.onRemoteAdapterDisconnected();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimateFirstView(boolean arg0) {
        real.setAnimateFirstView(arg0);
    }

    public void setDisplayedChild(int arg0) {
        real.setDisplayedChild(arg0);
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.animation.ObjectAnimator arg0) {
        real.setInAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setInAnimation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.animation.ObjectAnimator arg0) {
        real.setOutAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setOutAnimation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setRemoteViewsAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void showNext() {
        real.showNext();
    }

    public void showPrevious() {
        real.showPrevious();
    }

}
