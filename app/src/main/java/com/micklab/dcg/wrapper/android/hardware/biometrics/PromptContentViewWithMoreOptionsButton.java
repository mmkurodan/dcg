// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentViewWithMoreOptionsButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptContentViewWithMoreOptionsButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton wrap(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton getReal() {
        return (android.hardware.biometrics.PromptContentViewWithMoreOptionsButton) real;
    }

    public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton) real).describeContents();
    }

    public java.lang.String getDescription() {
        return ((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton) real).getDescription();
    }

    public com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener getMoreOptionsButtonListener() {
        return com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener.wrap(((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton) real).getMoreOptionsButtonListener());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder wrap(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder getReal() {
            return (android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder) real;
        }

        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.wrap(((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder.wrap(((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setMoreOptionsButtonListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder.wrap(((android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder) real).setMoreOptionsButtonListener(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
}
