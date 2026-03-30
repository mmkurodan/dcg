// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class TimedText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimedText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.TimedText wrap(android.media.TimedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.TimedText(real, (__DcgwBridgeToken) null);
    }

    public android.media.TimedText getReal() {
        return (android.media.TimedText) real;
    }

    public android.media.TimedText unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.media.TimedText) real).getBounds());
    }

    public java.lang.String getText() {
        return ((android.media.TimedText) real).getText();
    }

}
