// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TwoLineListItem {
    private final android.widget.TwoLineListItem real;

    public TwoLineListItem(android.widget.TwoLineListItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TwoLineListItem wrap(android.widget.TwoLineListItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TwoLineListItem(real);
    }

    public android.widget.TwoLineListItem unwrap() {
        return real;
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.unwrap()));
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.TextView getText1() {
        return com.micklab.dcg.wrapper.android.widget.TextView.wrap(real.getText1());
    }

    public com.micklab.dcg.wrapper.android.widget.TextView getText2() {
        return com.micklab.dcg.wrapper.android.widget.TextView.wrap(real.getText2());
    }

}
