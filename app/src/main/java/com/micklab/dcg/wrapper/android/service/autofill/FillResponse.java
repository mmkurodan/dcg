// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FillResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillResponse wrap(android.service.autofill.FillResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillResponse(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FillResponse getReal() {
        return (android.service.autofill.FillResponse) real;
    }

    public android.service.autofill.FillResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.FillResponse) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.FillResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.FillResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_DELAY_FILL = android.service.autofill.FillResponse.FLAG_DELAY_FILL;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = android.service.autofill.FillResponse.FLAG_DISABLE_ACTIVITY_ONLY;
    public static final int FLAG_TRACK_CONTEXT_COMMITED = android.service.autofill.FillResponse.FLAG_TRACK_CONTEXT_COMMITED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder wrap(android.service.autofill.FillResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.FillResponse.Builder getReal() {
            return (android.service.autofill.FillResponse.Builder) real;
        }

        public android.service.autofill.FillResponse.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.autofill.FillResponse.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder addDataset(com.micklab.dcg.wrapper.android.service.autofill.Dataset arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).addDataset(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse build() {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.wrap(((android.service.autofill.FillResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder disableAutofill(long arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).disableAutofill(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setAuthentication(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.service.autofill.Presentations arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setAuthentication(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setAuthentication(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setAuthentication(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setClientState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setClientState(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setDialogHeader(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setDialogHeader(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setFieldClassificationIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFillDialogTriggerIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setFillDialogTriggerIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFooter(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setFooter(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setHeader(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setHeader(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setIconResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setIconResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setIgnoredIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setPresentationCancelIds(int[] arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setPresentationCancelIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setSaveInfo(com.micklab.dcg.wrapper.android.service.autofill.SaveInfo arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setSaveInfo(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setServiceDisplayNameResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setServiceDisplayNameResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setShowFillDialogIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setShowFillDialogIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setShowSaveDialogIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setShowSaveDialogIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setUserData(com.micklab.dcg.wrapper.android.service.autofill.UserData arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(((android.service.autofill.FillResponse.Builder) real).setUserData(arg0 == null ? null : arg0.getReal()));
        }

    }
}
