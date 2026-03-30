// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationPrompt {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfirmationPrompt(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationPrompt wrap(android.security.ConfirmationPrompt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationPrompt(real, (__DcgwBridgeToken) null);
    }

    public android.security.ConfirmationPrompt getReal() {
        return (android.security.ConfirmationPrompt) real;
    }

    public android.security.ConfirmationPrompt unwrap() {
        return getReal();
    }

    public void cancelPrompt() {
        ((android.security.ConfirmationPrompt) real).cancelPrompt();
    }

    public static boolean isSupported(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.security.ConfirmationPrompt.isSupported(arg0 == null ? null : arg0.getReal());
    }

    public void presentPrompt(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.security.ConfirmationCallback arg1) throws android.security.ConfirmationAlreadyPresentingException, android.security.ConfirmationNotAvailableException {
        ((android.security.ConfirmationPrompt) real).presentPrompt(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder wrap(android.security.ConfirmationPrompt.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.ConfirmationPrompt.Builder getReal() {
            return (android.security.ConfirmationPrompt.Builder) real;
        }

        public android.security.ConfirmationPrompt.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.ConfirmationPrompt.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt build() {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.wrap(((android.security.ConfirmationPrompt.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder setExtraData(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder.wrap(((android.security.ConfirmationPrompt.Builder) real).setExtraData(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder setPromptText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder.wrap(((android.security.ConfirmationPrompt.Builder) real).setPromptText(arg0));
        }

    }
}
