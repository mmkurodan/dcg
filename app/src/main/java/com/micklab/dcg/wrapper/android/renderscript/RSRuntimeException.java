// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSRuntimeException {
    private final android.renderscript.RSRuntimeException real;

    public RSRuntimeException(android.renderscript.RSRuntimeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSRuntimeException wrap(android.renderscript.RSRuntimeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSRuntimeException(real);
    }

    public android.renderscript.RSRuntimeException unwrap() {
        return real;
    }

    public RSRuntimeException(java.lang.String arg0) {
        this(new android.renderscript.RSRuntimeException(arg0));
    }

}
