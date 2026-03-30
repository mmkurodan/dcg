// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrinterDiscoverySession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrinterDiscoverySession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrinterDiscoverySession wrap(android.printservice.PrinterDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrinterDiscoverySession(real, (__DcgwBridgeToken) null);
    }

    public android.printservice.PrinterDiscoverySession getReal() {
        return (android.printservice.PrinterDiscoverySession) real;
    }

    public android.printservice.PrinterDiscoverySession unwrap() {
        return getReal();
    }

    public boolean isDestroyed() {
        return ((android.printservice.PrinterDiscoverySession) real).isDestroyed();
    }

    public boolean isPrinterDiscoveryStarted() {
        return ((android.printservice.PrinterDiscoverySession) real).isPrinterDiscoveryStarted();
    }

    public void onDestroy() {
        ((android.printservice.PrinterDiscoverySession) real).onDestroy();
    }

    public void onRequestCustomPrinterIcon(com.micklab.dcg.wrapper.android.print.PrinterId arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback arg2) {
        ((android.printservice.PrinterDiscoverySession) real).onRequestCustomPrinterIcon(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onStartPrinterStateTracking(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
        ((android.printservice.PrinterDiscoverySession) real).onStartPrinterStateTracking(arg0 == null ? null : arg0.getReal());
    }

    public void onStopPrinterDiscovery() {
        ((android.printservice.PrinterDiscoverySession) real).onStopPrinterDiscovery();
    }

    public void onStopPrinterStateTracking(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
        ((android.printservice.PrinterDiscoverySession) real).onStopPrinterStateTracking(arg0 == null ? null : arg0.getReal());
    }

}
