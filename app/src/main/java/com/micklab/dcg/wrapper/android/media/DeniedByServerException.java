// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class DeniedByServerException {
    private final android.media.DeniedByServerException real;

    public DeniedByServerException(android.media.DeniedByServerException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.DeniedByServerException wrap(android.media.DeniedByServerException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.DeniedByServerException(real);
    }

    public android.media.DeniedByServerException unwrap() {
        return real;
    }

    public DeniedByServerException(java.lang.String arg0) {
        this(new android.media.DeniedByServerException(arg0));
    }

}
