// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Space {
    private final android.widget.Space real;

    public Space(android.widget.Space real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Space wrap(android.widget.Space real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Space(real);
    }

    public android.widget.Space unwrap() {
        return real;
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Space(arg0 == null ? null : arg0.unwrap()));
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Space(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Space(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Space(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

}
