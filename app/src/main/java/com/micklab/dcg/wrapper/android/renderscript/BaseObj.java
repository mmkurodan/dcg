// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class BaseObj {
    private final android.renderscript.BaseObj real;

    public BaseObj(android.renderscript.BaseObj real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.BaseObj wrap(android.renderscript.BaseObj real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.BaseObj(real);
    }

    public android.renderscript.BaseObj unwrap() {
        return real;
    }

    public void destroy() {
        real.destroy();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setName(java.lang.String arg0) {
        real.setName(arg0);
    }

}
