// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Highlights {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Highlights(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Highlights wrap(android.text.Highlights real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Highlights(real, (__DcgwBridgeToken) null);
    }

    public android.text.Highlights getReal() {
        return (android.text.Highlights) real;
    }

    public android.text.Highlights unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(((android.text.Highlights) real).getPaint(arg0));
    }

    public int[] getRanges(int arg0) {
        return ((android.text.Highlights) real).getRanges(arg0);
    }

    public int getSize() {
        return ((android.text.Highlights) real).getSize();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Highlights.Builder wrap(android.text.Highlights.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Highlights.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.text.Highlights.Builder getReal() {
            return (android.text.Highlights.Builder) real;
        }

        public android.text.Highlights.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.text.Highlights.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.text.Highlights.Builder addRange(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.text.Highlights.Builder.wrap(((android.text.Highlights.Builder) real).addRange(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.text.Highlights.Builder addRanges(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int... arg1) {
            return com.micklab.dcg.wrapper.android.text.Highlights.Builder.wrap(((android.text.Highlights.Builder) real).addRanges(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.text.Highlights build() {
            return com.micklab.dcg.wrapper.android.text.Highlights.wrap(((android.text.Highlights.Builder) real).build());
        }

    }
}
