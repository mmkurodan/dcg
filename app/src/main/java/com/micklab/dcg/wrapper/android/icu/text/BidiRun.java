// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class BidiRun {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BidiRun(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BidiRun wrap(android.icu.text.BidiRun real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.BidiRun(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.BidiRun getReal() {
        return (android.icu.text.BidiRun) real;
    }

    public android.icu.text.BidiRun unwrap() {
        return getReal();
    }

    public byte getDirection() {
        return ((android.icu.text.BidiRun) real).getDirection();
    }

    public byte getEmbeddingLevel() {
        return ((android.icu.text.BidiRun) real).getEmbeddingLevel();
    }

    public int getLength() {
        return ((android.icu.text.BidiRun) real).getLength();
    }

    public int getLimit() {
        return ((android.icu.text.BidiRun) real).getLimit();
    }

    public int getStart() {
        return ((android.icu.text.BidiRun) real).getStart();
    }

    public boolean isEvenRun() {
        return ((android.icu.text.BidiRun) real).isEvenRun();
    }

    public boolean isOddRun() {
        return ((android.icu.text.BidiRun) real).isOddRun();
    }

    public java.lang.String toString() {
        return ((android.icu.text.BidiRun) real).toString();
    }

}
