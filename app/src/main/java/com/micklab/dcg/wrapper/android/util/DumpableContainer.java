// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class DumpableContainer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DumpableContainer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.DumpableContainer wrap(android.util.DumpableContainer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.DumpableContainer(real, (__DcgwBridgeToken) null);
    }

    public android.util.DumpableContainer getReal() {
        return (android.util.DumpableContainer) real;
    }

    public android.util.DumpableContainer unwrap() {
        return getReal();
    }

    public boolean addDumpable(com.micklab.dcg.wrapper.android.util.Dumpable arg0) {
        return ((android.util.DumpableContainer) real).addDumpable(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeDumpable(com.micklab.dcg.wrapper.android.util.Dumpable arg0) {
        return ((android.util.DumpableContainer) real).removeDumpable(arg0 == null ? null : arg0.getReal());
    }

}
