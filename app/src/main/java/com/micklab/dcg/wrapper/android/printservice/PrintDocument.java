// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrintDocument {
    private final android.printservice.PrintDocument real;

    public PrintDocument(android.printservice.PrintDocument real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrintDocument wrap(android.printservice.PrintDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrintDocument(real);
    }

    public android.printservice.PrintDocument unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getData() {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.getData());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.wrap(real.getInfo());
    }

}
