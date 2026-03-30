// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class NotProvisionedException {
    private final android.media.NotProvisionedException real;

    public NotProvisionedException(android.media.NotProvisionedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.NotProvisionedException wrap(android.media.NotProvisionedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.NotProvisionedException(real);
    }

    public android.media.NotProvisionedException unwrap() {
        return real;
    }

    public NotProvisionedException(java.lang.String arg0) {
        this(new android.media.NotProvisionedException(arg0));
    }

}
