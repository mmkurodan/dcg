// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class VirtualViewFillInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VirtualViewFillInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo wrap(android.view.autofill.VirtualViewFillInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.autofill.VirtualViewFillInfo getReal() {
        return (android.view.autofill.VirtualViewFillInfo) real;
    }

    public android.view.autofill.VirtualViewFillInfo unwrap() {
        return getReal();
    }

    public java.lang.String[] getAutofillHints() {
        return ((android.view.autofill.VirtualViewFillInfo) real).getAutofillHints();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder wrap(android.view.autofill.VirtualViewFillInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.autofill.VirtualViewFillInfo.Builder getReal() {
            return (android.view.autofill.VirtualViewFillInfo.Builder) real;
        }

        public android.view.autofill.VirtualViewFillInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.autofill.VirtualViewFillInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo build() {
            return com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.wrap(((android.view.autofill.VirtualViewFillInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder setAutofillHints(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.view.autofill.VirtualViewFillInfo.Builder.wrap(((android.view.autofill.VirtualViewFillInfo.Builder) real).setAutofillHints(arg0));
        }

    }
}
