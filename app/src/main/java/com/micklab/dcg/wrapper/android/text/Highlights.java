// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Highlights {
    private final android.text.Highlights real;

    public Highlights(android.text.Highlights real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Highlights wrap(android.text.Highlights real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Highlights(real);
    }

    public android.text.Highlights unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(real.getPaint(arg0));
    }

    public int[] getRanges(int arg0) {
        return real.getRanges(arg0);
    }

    public int getSize() {
        return real.getSize();
    }

    public static final class Builder {
        private final android.text.Highlights.Builder real;

        public Builder(android.text.Highlights.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Highlights.Builder wrap(android.text.Highlights.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Highlights.Builder(real);
        }

        public android.text.Highlights.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.text.Highlights.Builder());
        }

        public com.micklab.dcg.wrapper.android.text.Highlights.Builder addRange(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.text.Highlights.Builder.wrap(real.addRange(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.text.Highlights.Builder addRanges(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int... arg1) {
            return com.micklab.dcg.wrapper.android.text.Highlights.Builder.wrap(real.addRanges(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.text.Highlights build() {
            return com.micklab.dcg.wrapper.android.text.Highlights.wrap(real.build());
        }

    }
}
