// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64DataException {
    private final android.util.Base64DataException real;

    public Base64DataException(android.util.Base64DataException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64DataException wrap(android.util.Base64DataException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64DataException(real);
    }

    public android.util.Base64DataException unwrap() {
        return real;
    }

    public Base64DataException(java.lang.String arg0) {
        this(new android.util.Base64DataException(arg0));
    }

}
