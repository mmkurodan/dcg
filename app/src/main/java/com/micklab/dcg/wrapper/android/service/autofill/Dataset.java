// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Dataset {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Dataset(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Dataset wrap(android.service.autofill.Dataset real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Dataset(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Dataset getReal() {
        return (android.service.autofill.Dataset) real;
    }

    public android.service.autofill.Dataset unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.Dataset) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.Dataset) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.Dataset) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder wrap(android.service.autofill.Dataset.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.Dataset.Builder getReal() {
            return (android.service.autofill.Dataset.Builder) real;
        }

        public android.service.autofill.Dataset.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.autofill.Dataset.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.service.autofill.Presentations arg0) {
            this(new android.service.autofill.Dataset.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            this(new android.service.autofill.Dataset.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.wrap(((android.service.autofill.Dataset.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setAuthentication(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setAuthentication(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setField(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.autofill.Field arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setField(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setField(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.service.autofill.Field arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setField(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setFieldForAllHints(com.micklab.dcg.wrapper.android.service.autofill.Field arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setFieldForAllHints(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setInlinePresentation(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setInlinePresentation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg1, java.util.regex.Pattern arg2, com.micklab.dcg.wrapper.android.widget.RemoteViews arg3, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg4, com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg5) {
            return com.micklab.dcg.wrapper.android.service.autofill.Dataset.Builder.wrap(((android.service.autofill.Dataset.Builder) real).setValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal()));
        }

    }
}
