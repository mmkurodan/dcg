// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class CustomPrinterIconCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CustomPrinterIconCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback wrap(android.printservice.CustomPrinterIconCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback(real, (__DcgwBridgeToken) null);
    }

    public android.printservice.CustomPrinterIconCallback getReal() {
        return (android.printservice.CustomPrinterIconCallback) real;
    }

    public android.printservice.CustomPrinterIconCallback unwrap() {
        return getReal();
    }

    public boolean onCustomPrinterIconLoaded(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        return ((android.printservice.CustomPrinterIconCallback) real).onCustomPrinterIconLoaded(arg0 == null ? null : arg0.getReal());
    }

}
