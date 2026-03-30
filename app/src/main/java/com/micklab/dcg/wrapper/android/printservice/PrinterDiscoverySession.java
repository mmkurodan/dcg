// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrinterDiscoverySession {
    private final android.printservice.PrinterDiscoverySession real;

    public PrinterDiscoverySession(android.printservice.PrinterDiscoverySession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrinterDiscoverySession wrap(android.printservice.PrinterDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrinterDiscoverySession(real);
    }

    public android.printservice.PrinterDiscoverySession unwrap() {
        return real;
    }

    public boolean isDestroyed() {
        return real.isDestroyed();
    }

    public boolean isPrinterDiscoveryStarted() {
        return real.isPrinterDiscoveryStarted();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onRequestCustomPrinterIcon(com.micklab.dcg.wrapper.android.print.PrinterId arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback arg2) {
        real.onRequestCustomPrinterIcon(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onStartPrinterStateTracking(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
        real.onStartPrinterStateTracking(arg0 == null ? null : arg0.unwrap());
    }

    public void onStopPrinterDiscovery() {
        real.onStopPrinterDiscovery();
    }

    public void onStopPrinterStateTracking(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
        real.onStopPrinterStateTracking(arg0 == null ? null : arg0.unwrap());
    }

}
