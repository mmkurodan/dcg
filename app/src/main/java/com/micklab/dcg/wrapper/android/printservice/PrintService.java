// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrintService {
    private final android.printservice.PrintService real;

    public PrintService(android.printservice.PrintService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrintService wrap(android.printservice.PrintService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrintService(real);
    }

    public android.printservice.PrintService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.print.PrinterId generatePrinterId(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.print.PrinterId.wrap(real.generatePrinterId(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String EXTRA_CAN_SELECT_PRINTER = android.printservice.PrintService.EXTRA_CAN_SELECT_PRINTER;
    public static final java.lang.String EXTRA_PRINTER_INFO = android.printservice.PrintService.EXTRA_PRINTER_INFO;
    public static final java.lang.String EXTRA_PRINT_DOCUMENT_INFO = android.printservice.PrintService.EXTRA_PRINT_DOCUMENT_INFO;
    public static final java.lang.String EXTRA_PRINT_JOB_INFO = android.printservice.PrintService.EXTRA_PRINT_JOB_INFO;
    public static final java.lang.String EXTRA_SELECT_PRINTER = android.printservice.PrintService.EXTRA_SELECT_PRINTER;
    public static final java.lang.String SERVICE_INTERFACE = android.printservice.PrintService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.printservice.PrintService.SERVICE_META_DATA;

}
