// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrintDocument {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintDocument(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrintDocument wrap(android.printservice.PrintDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrintDocument(real, (__DcgwBridgeToken) null);
    }

    public android.printservice.PrintDocument getReal() {
        return (android.printservice.PrintDocument) real;
    }

    public android.printservice.PrintDocument unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getData() {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.printservice.PrintDocument) real).getData());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.wrap(((android.printservice.PrintDocument) real).getInfo());
    }

}
