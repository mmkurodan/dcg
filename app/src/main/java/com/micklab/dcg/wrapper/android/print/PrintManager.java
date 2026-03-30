// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintManager wrap(android.print.PrintManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintManager(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintManager getReal() {
        return (android.print.PrintManager) real;
    }

    public android.print.PrintManager unwrap() {
        return getReal();
    }

    public boolean isPrintServiceEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return ((android.print.PrintManager) real).isPrintServiceEnabled(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJob print(java.lang.String arg0, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter arg1, com.micklab.dcg.wrapper.android.print.PrintAttributes arg2) {
        return com.micklab.dcg.wrapper.android.print.PrintJob.wrap(((android.print.PrintManager) real).print(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

}
