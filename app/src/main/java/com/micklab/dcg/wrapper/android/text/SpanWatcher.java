// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpanWatcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpanWatcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpanWatcher wrap(android.text.SpanWatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpanWatcher(real, (__DcgwBridgeToken) null);
    }

    public android.text.SpanWatcher getReal() {
        return (android.text.SpanWatcher) real;
    }

    public android.text.SpanWatcher unwrap() {
        return getReal();
    }

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.SpanWatcher) real).onSpanAdded(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.text.SpanWatcher) real).onSpanChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.SpanWatcher) real).onSpanRemoved(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

}
