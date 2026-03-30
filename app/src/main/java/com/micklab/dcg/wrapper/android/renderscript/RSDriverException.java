// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSDriverException {
    private final android.renderscript.RSDriverException real;

    public RSDriverException(android.renderscript.RSDriverException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSDriverException wrap(android.renderscript.RSDriverException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSDriverException(real);
    }

    public android.renderscript.RSDriverException unwrap() {
        return real;
    }

    public RSDriverException(java.lang.String arg0) {
        this(new android.renderscript.RSDriverException(arg0));
    }

}
