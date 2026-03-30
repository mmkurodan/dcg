// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class VirtualViewFillInfo {
    private final android.view.autofill.VirtualViewFillInfo real;

    public VirtualViewFillInfo(android.view.autofill.VirtualViewFillInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo wrap(android.view.autofill.VirtualViewFillInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo(real);
    }

    public android.view.autofill.VirtualViewFillInfo unwrap() {
        return real;
    }

    public java.lang.String[] getAutofillHints() {
        return real.getAutofillHints();
    }

    public static final class Builder {
        private final android.view.autofill.VirtualViewFillInfo.Builder real;

        public Builder(android.view.autofill.VirtualViewFillInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder wrap(android.view.autofill.VirtualViewFillInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder(real);
        }

        public android.view.autofill.VirtualViewFillInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.autofill.VirtualViewFillInfo.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo build() {
            return com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder setAutofillHints(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder.wrap(real.setAutofillHints(arg0));
        }

    }
}
