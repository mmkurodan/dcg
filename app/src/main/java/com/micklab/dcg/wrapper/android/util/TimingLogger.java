// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TimingLogger {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimingLogger(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TimingLogger wrap(android.util.TimingLogger real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TimingLogger(real, (__DcgwBridgeToken) null);
    }

    public android.util.TimingLogger getReal() {
        return (android.util.TimingLogger) real;
    }

    public android.util.TimingLogger unwrap() {
        return getReal();
    }

    public TimingLogger(java.lang.String arg0, java.lang.String arg1) {
        this(new android.util.TimingLogger(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void addSplit(java.lang.String arg0) {
        ((android.util.TimingLogger) real).addSplit(arg0);
    }

    public void dumpToLog() {
        ((android.util.TimingLogger) real).dumpToLog();
    }

    public void reset() {
        ((android.util.TimingLogger) real).reset();
    }

    public void reset(java.lang.String arg0, java.lang.String arg1) {
        ((android.util.TimingLogger) real).reset(arg0, arg1);
    }

}
