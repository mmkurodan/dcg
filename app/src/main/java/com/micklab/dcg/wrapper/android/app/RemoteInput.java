// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class RemoteInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.RemoteInput wrap(android.app.RemoteInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.RemoteInput(real, (__DcgwBridgeToken) null);
    }

    public android.app.RemoteInput getReal() {
        return (android.app.RemoteInput) real;
    }

    public android.app.RemoteInput unwrap() {
        return getReal();
    }

    public static void addResultsToIntent(android.app.RemoteInput[] arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        android.app.RemoteInput.addResultsToIntent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int describeContents() {
        return ((android.app.RemoteInput) real).describeContents();
    }

    public boolean getAllowFreeFormInput() {
        return ((android.app.RemoteInput) real).getAllowFreeFormInput();
    }

    public java.lang.CharSequence[] getChoices() {
        return ((android.app.RemoteInput) real).getChoices();
    }

    public int getEditChoicesBeforeSending() {
        return ((android.app.RemoteInput) real).getEditChoicesBeforeSending();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.RemoteInput) real).getExtras());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.app.RemoteInput) real).getLabel();
    }

    public java.lang.String getResultKey() {
        return ((android.app.RemoteInput) real).getResultKey();
    }

    public static com.micklab.dcg.wrapper.android.os.Bundle getResultsFromIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(android.app.RemoteInput.getResultsFromIntent(arg0 == null ? null : arg0.getReal()));
    }

    public static int getResultsSource(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return android.app.RemoteInput.getResultsSource(arg0 == null ? null : arg0.getReal());
    }

    public boolean isDataOnly() {
        return ((android.app.RemoteInput) real).isDataOnly();
    }

    public static void setResultsSource(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        android.app.RemoteInput.setResultsSource(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.RemoteInput) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = android.app.RemoteInput.EDIT_CHOICES_BEFORE_SENDING_AUTO;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = android.app.RemoteInput.EDIT_CHOICES_BEFORE_SENDING_DISABLED;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = android.app.RemoteInput.EDIT_CHOICES_BEFORE_SENDING_ENABLED;
    public static final java.lang.String EXTRA_RESULTS_DATA = android.app.RemoteInput.EXTRA_RESULTS_DATA;
    public static final java.lang.String RESULTS_CLIP_LABEL = android.app.RemoteInput.RESULTS_CLIP_LABEL;
    public static final int SOURCE_CHOICE = android.app.RemoteInput.SOURCE_CHOICE;
    public static final int SOURCE_FREE_FORM_INPUT = android.app.RemoteInput.SOURCE_FREE_FORM_INPUT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.RemoteInput.Builder wrap(android.app.RemoteInput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.RemoteInput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.RemoteInput.Builder getReal() {
            return (android.app.RemoteInput.Builder) real;
        }

        public android.app.RemoteInput.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.RemoteInput.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder addExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).addExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput build() {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.wrap(((android.app.RemoteInput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.RemoteInput.Builder) real).getExtras());
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder setAllowDataType(java.lang.String arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).setAllowDataType(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder setAllowFreeFormInput(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).setAllowFreeFormInput(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] arg0) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).setChoices(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder setEditChoicesBeforeSending(int arg0) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).setEditChoicesBeforeSending(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.RemoteInput.Builder setLabel(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.RemoteInput.Builder.wrap(((android.app.RemoteInput.Builder) real).setLabel(arg0));
        }

    }
}
