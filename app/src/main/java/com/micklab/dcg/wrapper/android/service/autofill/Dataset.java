// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Dataset {
    private final android.service.autofill.Dataset real;

    public Dataset(android.service.autofill.Dataset real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Dataset wrap(android.service.autofill.Dataset real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Dataset(real);
    }

    public android.service.autofill.Dataset unwrap() {
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


    public static final class Builder {
        private final android.service.autofill.Dataset.Builder real;

        public Builder(android.service.autofill.Dataset.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder wrap(android.service.autofill.Dataset.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder(real);
        }

        public android.service.autofill.Dataset.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.autofill.Dataset.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.service.autofill.Presentations arg0) {
            this(new android.service.autofill.Dataset.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            this(new android.service.autofill.Dataset.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setAuthentication(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setAuthentication(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setField(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.autofill.Field arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setField(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setField(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.service.autofill.Field arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setField(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setFieldForAllHints(com.micklab.dcg.wrapper.android.service.autofill.Field arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setFieldForAllHints(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setInlinePresentation(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setInlinePresentation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg5) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap()));
        }

    }
}
