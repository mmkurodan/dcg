// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class FocusFinder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FocusFinder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.FocusFinder wrap(android.view.FocusFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.FocusFinder(real, (__DcgwBridgeToken) null);
    }

    public android.view.FocusFinder getReal() {
        return (android.view.FocusFinder) real;
    }

    public android.view.FocusFinder unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View findNearestTouchable(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, int arg1, int arg2, int arg3, int[] arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.FocusFinder) real).findNearestTouchable(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.view.View findNextFocus(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.FocusFinder) real).findNextFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View findNextFocusFromRect(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.FocusFinder) real).findNextFocusFromRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View findNextKeyboardNavigationCluster(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.FocusFinder) real).findNextKeyboardNavigationCluster(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.view.FocusFinder getInstance() {
        return com.micklab.dcg.wrapper.android.view.FocusFinder.wrap(android.view.FocusFinder.getInstance());
    }

}
