// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSInvalidStateException {
    private final android.renderscript.RSInvalidStateException real;

    public RSInvalidStateException(android.renderscript.RSInvalidStateException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSInvalidStateException wrap(android.renderscript.RSInvalidStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSInvalidStateException(real);
    }

    public android.renderscript.RSInvalidStateException unwrap() {
        return real;
    }

    public RSInvalidStateException(java.lang.String arg0) {
        this(new android.renderscript.RSInvalidStateException(arg0));
    }

}
