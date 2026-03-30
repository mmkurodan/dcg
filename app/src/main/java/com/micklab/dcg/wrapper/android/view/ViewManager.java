// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewManager {
    private final android.view.ViewManager real;

    public ViewManager(android.view.ViewManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewManager wrap(android.view.ViewManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewManager(real);
    }

    public android.view.ViewManager unwrap() {
        return real;
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.removeView(arg0 == null ? null : arg0.unwrap());
    }

    public void updateViewLayout(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.updateViewLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

}
