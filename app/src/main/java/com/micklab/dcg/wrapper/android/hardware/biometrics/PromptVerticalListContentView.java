// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptVerticalListContentView {
    private final android.hardware.biometrics.PromptVerticalListContentView real;

    public PromptVerticalListContentView(android.hardware.biometrics.PromptVerticalListContentView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView wrap(android.hardware.biometrics.PromptVerticalListContentView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView(real);
    }

    public android.hardware.biometrics.PromptVerticalListContentView unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public static int getMaxEachItemCharacterNumber() {
        return android.hardware.biometrics.PromptVerticalListContentView.getMaxEachItemCharacterNumber();
    }

    public static int getMaxItemCount() {
        return android.hardware.biometrics.PromptVerticalListContentView.getMaxItemCount();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.hardware.biometrics.PromptVerticalListContentView.Builder real;

        public Builder(android.hardware.biometrics.PromptVerticalListContentView.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder wrap(android.hardware.biometrics.PromptVerticalListContentView.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder(real);
        }

        public android.hardware.biometrics.PromptVerticalListContentView.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.biometrics.PromptVerticalListContentView.Builder());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(real.addListItem(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(real.addListItem(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptVerticalListContentView.Builder.wrap(real.setDescription(arg0));
        }

    }
}
