// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentViewWithMoreOptionsButton {
    private final android.hardware.biometrics.PromptContentViewWithMoreOptionsButton real;

    public PromptContentViewWithMoreOptionsButton(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton wrap(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton(real);
    }

    public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener getMoreOptionsButtonListener() {
        return com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener.wrap(real.getMoreOptionsButtonListener());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder real;

        public Builder(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder wrap(android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder(real);
        }

        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setMoreOptionsButtonListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder.wrap(real.setMoreOptionsButtonListener(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
}
