// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class NoCopySpan {
    private final android.text.NoCopySpan real;

    public NoCopySpan(android.text.NoCopySpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.NoCopySpan wrap(android.text.NoCopySpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.NoCopySpan(real);
    }

    public android.text.NoCopySpan unwrap() {
        return real;
    }

    public static final class Concrete {
        private final android.text.NoCopySpan.Concrete real;

        public Concrete(android.text.NoCopySpan.Concrete real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.NoCopySpan.Concrete wrap(android.text.NoCopySpan.Concrete real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.NoCopySpan.Concrete(real);
        }

        public android.text.NoCopySpan.Concrete unwrap() {
            return real;
        }

        public Concrete() {
            this(new android.text.NoCopySpan.Concrete());
        }

    }
}
