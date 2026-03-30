// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TwoLineListItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TwoLineListItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TwoLineListItem wrap(android.widget.TwoLineListItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TwoLineListItem(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TwoLineListItem getReal() {
        return (android.widget.TwoLineListItem) real;
    }

    public android.widget.TwoLineListItem unwrap() {
        return getReal();
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TwoLineListItem(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TwoLineListItem(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TwoLineListItem) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.TextView getText1() {
        return com.micklab.dcg.wrapper.android.widget.TextView.wrap(((android.widget.TwoLineListItem) real).getText1());
    }

    public com.micklab.dcg.wrapper.android.widget.TextView getText2() {
        return com.micklab.dcg.wrapper.android.widget.TextView.wrap(((android.widget.TwoLineListItem) real).getText2());
    }

}
