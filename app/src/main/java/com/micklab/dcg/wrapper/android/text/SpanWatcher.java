// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpanWatcher {
    private final android.text.SpanWatcher real;

    public SpanWatcher(android.text.SpanWatcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpanWatcher wrap(android.text.SpanWatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpanWatcher(real);
    }

    public android.text.SpanWatcher unwrap() {
        return real;
    }

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanAdded(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        real.onSpanChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanRemoved(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

}
