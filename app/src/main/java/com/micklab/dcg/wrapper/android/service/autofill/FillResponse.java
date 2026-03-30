// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillResponse {
    private final android.service.autofill.FillResponse real;

    public FillResponse(android.service.autofill.FillResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillResponse wrap(android.service.autofill.FillResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillResponse(real);
    }

    public android.service.autofill.FillResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_DELAY_FILL = android.service.autofill.FillResponse.FLAG_DELAY_FILL;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = android.service.autofill.FillResponse.FLAG_DISABLE_ACTIVITY_ONLY;
    public static final int FLAG_TRACK_CONTEXT_COMMITED = android.service.autofill.FillResponse.FLAG_TRACK_CONTEXT_COMMITED;

    public static final class Builder {
        private final android.service.autofill.FillResponse.Builder real;

        public Builder(android.service.autofill.FillResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder wrap(android.service.autofill.FillResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder(real);
        }

        public android.service.autofill.FillResponse.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.autofill.FillResponse.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder addDataset(com.micklab.dcg.wrapper.android.service.autofill.Dataset arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.addDataset(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse build() {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder disableAutofill(long arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.disableAutofill(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.service.autofill.Presentations arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setAuthentication(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setAuthentication(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setAuthentication(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setAuthentication(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setClientState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setClientState(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setDialogHeader(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setDialogHeader(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setFieldClassificationIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFillDialogTriggerIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setFillDialogTriggerIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setFooter(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setFooter(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setHeader(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setHeader(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setIconResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setIconResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setIgnoredIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setPresentationCancelIds(int[] arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setPresentationCancelIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setSaveInfo(com.micklab.dcg.wrapper.android.service.autofill.SaveInfo arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setSaveInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setServiceDisplayNameResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setServiceDisplayNameResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setShowFillDialogIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setShowFillDialogIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setShowSaveDialogIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setShowSaveDialogIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder setUserData(com.micklab.dcg.wrapper.android.service.autofill.UserData arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.FillResponse.Builder.wrap(real.setUserData(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
