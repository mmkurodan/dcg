// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class BidiRun {
    private final android.icu.text.BidiRun real;

    public BidiRun(android.icu.text.BidiRun real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BidiRun wrap(android.icu.text.BidiRun real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.BidiRun(real);
    }

    public android.icu.text.BidiRun unwrap() {
        return real;
    }

    public byte getDirection() {
        return real.getDirection();
    }

    public byte getEmbeddingLevel() {
        return real.getEmbeddingLevel();
    }

    public int getLength() {
        return real.getLength();
    }

    public int getLimit() {
        return real.getLimit();
    }

    public int getStart() {
        return real.getStart();
    }

    public boolean isEvenRun() {
        return real.isEvenRun();
    }

    public boolean isOddRun() {
        return real.isOddRun();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
