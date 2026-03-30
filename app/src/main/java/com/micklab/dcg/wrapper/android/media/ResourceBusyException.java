// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ResourceBusyException {
    private final android.media.ResourceBusyException real;

    public ResourceBusyException(android.media.ResourceBusyException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ResourceBusyException wrap(android.media.ResourceBusyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ResourceBusyException(real);
    }

    public android.media.ResourceBusyException unwrap() {
        return real;
    }

    public ResourceBusyException(java.lang.String arg0) {
        this(new android.media.ResourceBusyException(arg0));
    }

}
