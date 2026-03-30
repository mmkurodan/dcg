// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptVerticalListContentView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptVerticalListContentView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView wrap(android.hardware.biometrics.PromptVerticalListContentView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptVerticalListContentView getReal() {
        return (android.hardware.biometrics.PromptVerticalListContentView) real;
    }

    public android.hardware.biometrics.PromptVerticalListContentView unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.biometrics.PromptVerticalListContentView) real).describeContents();
    }

    public java.lang.String getDescription() {
        return ((android.hardware.biometrics.PromptVerticalListContentView) real).getDescription();
    }

    public static int getMaxEachItemCharacterNumber() {
        return android.hardware.biometrics.PromptVerticalListContentView.getMaxEachItemCharacterNumber();
    }

    public static int getMaxItemCount() {
        return android.hardware.biometrics.PromptVerticalListContentView.getMaxItemCount();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.biometrics.PromptVerticalListContentView) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder wrap(android.hardware.biometrics.PromptVerticalListContentView.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.PromptVerticalListContentView.Builder getReal() {
            return (android.hardware.biometrics.PromptVerticalListContentView.Builder) real;
        }

        public android.hardware.biometrics.PromptVerticalListContentView.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.biometrics.PromptVerticalListContentView.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(((android.hardware.biometrics.PromptVerticalListContentView.Builder) real).addListItem(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(((android.hardware.biometrics.PromptVerticalListContentView.Builder) real).addListItem(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.wrap(((android.hardware.biometrics.PromptVerticalListContentView.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(((android.hardware.biometrics.PromptVerticalListContentView.Builder) real).setDescription(arg0));
        }

    }
}
