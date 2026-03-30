// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintManager {
    private final android.print.PrintManager real;

    public PrintManager(android.print.PrintManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintManager wrap(android.print.PrintManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintManager(real);
    }

    public android.print.PrintManager unwrap() {
        return real;
    }

    public boolean isPrintServiceEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isPrintServiceEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJob print(java.lang.String arg0, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter arg1, com.micklab.dcg.wrapper.android.print.PrintAttributes arg2) {
        return com.micklab.dcg.wrapper.android.print.PrintJob.wrap(real.print(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

}
