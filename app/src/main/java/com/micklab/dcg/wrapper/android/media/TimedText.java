// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class TimedText {
    private final android.media.TimedText real;

    public TimedText(android.media.TimedText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.TimedText wrap(android.media.TimedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.TimedText(real);
    }

    public android.media.TimedText unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBounds());
    }

    public java.lang.String getText() {
        return real.getText();
    }

}
