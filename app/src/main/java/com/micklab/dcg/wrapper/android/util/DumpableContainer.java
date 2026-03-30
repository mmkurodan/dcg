// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class DumpableContainer {
    private final android.util.DumpableContainer real;

    public DumpableContainer(android.util.DumpableContainer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.DumpableContainer wrap(android.util.DumpableContainer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.DumpableContainer(real);
    }

    public android.util.DumpableContainer unwrap() {
        return real;
    }

    public boolean addDumpable(com.micklab.dcg.wrapper.android.util.Dumpable arg0) {
        return real.addDumpable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeDumpable(com.micklab.dcg.wrapper.android.util.Dumpable arg0) {
        return real.removeDumpable(arg0 == null ? null : arg0.unwrap());
    }

}
