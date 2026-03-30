// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationPrompt {
    private final android.security.ConfirmationPrompt real;

    public ConfirmationPrompt(android.security.ConfirmationPrompt real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationPrompt wrap(android.security.ConfirmationPrompt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationPrompt(real);
    }

    public android.security.ConfirmationPrompt unwrap() {
        return real;
    }

    public void cancelPrompt() {
        real.cancelPrompt();
    }

    public static boolean isSupported(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.security.ConfirmationPrompt.isSupported(arg0 == null ? null : arg0.unwrap());
    }

    public void presentPrompt(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.security.ConfirmationCallback arg1) throws android.security.ConfirmationAlreadyPresentingException, android.security.ConfirmationNotAvailableException {
        real.presentPrompt(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final class Builder {
        private final android.security.ConfirmationPrompt.Builder real;

        public Builder(android.security.ConfirmationPrompt.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder wrap(android.security.ConfirmationPrompt.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder(real);
        }

        public android.security.ConfirmationPrompt.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.ConfirmationPrompt.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt build() {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder setExtraData(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder.wrap(real.setExtraData(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder setPromptText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.security.ConfirmationPrompt.Builder.wrap(real.setPromptText(arg0));
        }

    }
}
