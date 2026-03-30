// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollFeedbackProvider {
    private final android.view.ScrollFeedbackProvider real;

    public ScrollFeedbackProvider(android.view.ScrollFeedbackProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider wrap(android.view.ScrollFeedbackProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider(real);
    }

    public android.view.ScrollFeedbackProvider unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider createProvider(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ScrollFeedbackProvider.wrap(android.view.ScrollFeedbackProvider.createProvider(arg0 == null ? null : arg0.unwrap()));
    }

    public void onScrollLimit(int arg0, int arg1, int arg2, boolean arg3) {
        real.onScrollLimit(arg0, arg1, arg2, arg3);
    }

    public void onScrollProgress(int arg0, int arg1, int arg2, int arg3) {
        real.onScrollProgress(arg0, arg1, arg2, arg3);
    }

    public void onSnapToItem(int arg0, int arg1, int arg2) {
        real.onSnapToItem(arg0, arg1, arg2);
    }

}
