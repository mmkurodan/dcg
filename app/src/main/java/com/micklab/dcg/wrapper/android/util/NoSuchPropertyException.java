// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class NoSuchPropertyException {
    private final android.util.NoSuchPropertyException real;

    public NoSuchPropertyException(android.util.NoSuchPropertyException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.NoSuchPropertyException wrap(android.util.NoSuchPropertyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.NoSuchPropertyException(real);
    }

    public android.util.NoSuchPropertyException unwrap() {
        return real;
    }

    public NoSuchPropertyException(java.lang.String arg0) {
        this(new android.util.NoSuchPropertyException(arg0));
    }

}
