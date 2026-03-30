// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TimingLogger {
    private final android.util.TimingLogger real;

    public TimingLogger(android.util.TimingLogger real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TimingLogger wrap(android.util.TimingLogger real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TimingLogger(real);
    }

    public android.util.TimingLogger unwrap() {
        return real;
    }

    public TimingLogger(java.lang.String arg0, java.lang.String arg1) {
        this(new android.util.TimingLogger(arg0, arg1));
    }

    public void addSplit(java.lang.String arg0) {
        real.addSplit(arg0);
    }

    public void dumpToLog() {
        real.dumpToLog();
    }

    public void reset() {
        real.reset();
    }

    public void reset(java.lang.String arg0, java.lang.String arg1) {
        real.reset(arg0, arg1);
    }

}
