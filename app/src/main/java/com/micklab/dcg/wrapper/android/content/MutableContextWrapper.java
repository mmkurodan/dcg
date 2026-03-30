// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class MutableContextWrapper {
    private final android.content.MutableContextWrapper real;

    public MutableContextWrapper(android.content.MutableContextWrapper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.MutableContextWrapper wrap(android.content.MutableContextWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.MutableContextWrapper(real);
    }

    public android.content.MutableContextWrapper unwrap() {
        return real;
    }

    public MutableContextWrapper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.MutableContextWrapper(arg0 == null ? null : arg0.unwrap()));
    }

    public void setBaseContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.setBaseContext(arg0 == null ? null : arg0.unwrap());
    }

}
