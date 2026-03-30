// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class IntFlagMapping {
    private final android.view.inspector.IntFlagMapping real;

    public IntFlagMapping(android.view.inspector.IntFlagMapping real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.IntFlagMapping wrap(android.view.inspector.IntFlagMapping real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.IntFlagMapping(real);
    }

    public android.view.inspector.IntFlagMapping unwrap() {
        return real;
    }

    public IntFlagMapping() {
        this(new android.view.inspector.IntFlagMapping());
    }

    public void add(int arg0, int arg1, java.lang.String arg2) {
        real.add(arg0, arg1, arg2);
    }

}
