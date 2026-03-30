// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class ParcelableSpan {
    private final android.text.ParcelableSpan real;

    public ParcelableSpan(android.text.ParcelableSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.ParcelableSpan wrap(android.text.ParcelableSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.ParcelableSpan(real);
    }

    public android.text.ParcelableSpan unwrap() {
        return real;
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

}
