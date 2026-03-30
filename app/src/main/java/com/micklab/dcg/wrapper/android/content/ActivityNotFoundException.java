// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ActivityNotFoundException {
    private final android.content.ActivityNotFoundException real;

    public ActivityNotFoundException(android.content.ActivityNotFoundException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ActivityNotFoundException wrap(android.content.ActivityNotFoundException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ActivityNotFoundException(real);
    }

    public android.content.ActivityNotFoundException unwrap() {
        return real;
    }

    public ActivityNotFoundException() {
        this(new android.content.ActivityNotFoundException());
    }

    public ActivityNotFoundException(java.lang.String arg0) {
        this(new android.content.ActivityNotFoundException(arg0));
    }

}
