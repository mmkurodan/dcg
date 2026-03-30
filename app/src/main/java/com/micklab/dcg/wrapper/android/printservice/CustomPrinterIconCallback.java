// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class CustomPrinterIconCallback {
    private final android.printservice.CustomPrinterIconCallback real;

    public CustomPrinterIconCallback(android.printservice.CustomPrinterIconCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback wrap(android.printservice.CustomPrinterIconCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.CustomPrinterIconCallback(real);
    }

    public android.printservice.CustomPrinterIconCallback unwrap() {
        return real;
    }

    public boolean onCustomPrinterIconLoaded(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        return real.onCustomPrinterIconLoaded(arg0 == null ? null : arg0.unwrap());
    }

}
