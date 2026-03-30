// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ThemedSpinnerAdapter {
    private final android.widget.ThemedSpinnerAdapter real;

    public ThemedSpinnerAdapter(android.widget.ThemedSpinnerAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ThemedSpinnerAdapter wrap(android.widget.ThemedSpinnerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ThemedSpinnerAdapter(real);
    }

    public android.widget.ThemedSpinnerAdapter unwrap() {
        return real;
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return real.getDropDownViewTheme();
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        real.setDropDownViewTheme(arg0);
    }

}
