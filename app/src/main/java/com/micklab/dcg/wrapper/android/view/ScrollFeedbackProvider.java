// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollFeedbackProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollFeedbackProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider wrap(android.view.ScrollFeedbackProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider(real, (__DcgwBridgeToken) null);
    }

    public android.view.ScrollFeedbackProvider getReal() {
        return (android.view.ScrollFeedbackProvider) real;
    }

    public android.view.ScrollFeedbackProvider unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider createProvider(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider.wrap(android.view.ScrollFeedbackProvider.createProvider(arg0 == null ? null : arg0.getReal()));
    }

    public void onScrollLimit(int arg0, int arg1, int arg2, boolean arg3) {
        ((android.view.ScrollFeedbackProvider) real).onScrollLimit(arg0, arg1, arg2, arg3);
    }

    public void onScrollProgress(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.ScrollFeedbackProvider) real).onScrollProgress(arg0, arg1, arg2, arg3);
    }

    public void onSnapToItem(int arg0, int arg1, int arg2) {
        ((android.view.ScrollFeedbackProvider) real).onSnapToItem(arg0, arg1, arg2);
    }

}
