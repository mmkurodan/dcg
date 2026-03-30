// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ThemedSpinnerAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ThemedSpinnerAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ThemedSpinnerAdapter wrap(android.widget.ThemedSpinnerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ThemedSpinnerAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ThemedSpinnerAdapter getReal() {
        return (android.widget.ThemedSpinnerAdapter) real;
    }

    public android.widget.ThemedSpinnerAdapter unwrap() {
        return getReal();
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return ((android.widget.ThemedSpinnerAdapter) real).getDropDownViewTheme();
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        ((android.widget.ThemedSpinnerAdapter) real).setDropDownViewTheme(arg0);
    }

}
