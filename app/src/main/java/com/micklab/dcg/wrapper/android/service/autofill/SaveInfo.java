// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SaveInfo {
    private final android.service.autofill.SaveInfo real;

    public SaveInfo(android.service.autofill.SaveInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SaveInfo wrap(android.service.autofill.SaveInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveInfo(real);
    }

    public android.service.autofill.SaveInfo unwrap() {
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

    public static final int FLAG_DELAY_SAVE = android.service.autofill.SaveInfo.FLAG_DELAY_SAVE;
    public static final int FLAG_DONT_SAVE_ON_FINISH = android.service.autofill.SaveInfo.FLAG_DONT_SAVE_ON_FINISH;
    public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = android.service.autofill.SaveInfo.FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE;
    public static final int NEGATIVE_BUTTON_STYLE_CANCEL = android.service.autofill.SaveInfo.NEGATIVE_BUTTON_STYLE_CANCEL;
    public static final int NEGATIVE_BUTTON_STYLE_NEVER = android.service.autofill.SaveInfo.NEGATIVE_BUTTON_STYLE_NEVER;
    public static final int NEGATIVE_BUTTON_STYLE_REJECT = android.service.autofill.SaveInfo.NEGATIVE_BUTTON_STYLE_REJECT;
    public static final int POSITIVE_BUTTON_STYLE_CONTINUE = android.service.autofill.SaveInfo.POSITIVE_BUTTON_STYLE_CONTINUE;
    public static final int POSITIVE_BUTTON_STYLE_SAVE = android.service.autofill.SaveInfo.POSITIVE_BUTTON_STYLE_SAVE;
    public static final int SAVE_DATA_TYPE_ADDRESS = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_ADDRESS;
    public static final int SAVE_DATA_TYPE_CREDIT_CARD = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_CREDIT_CARD;
    public static final int SAVE_DATA_TYPE_DEBIT_CARD = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_DEBIT_CARD;
    public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_EMAIL_ADDRESS;
    public static final int SAVE_DATA_TYPE_GENERIC = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_GENERIC;
    public static final int SAVE_DATA_TYPE_GENERIC_CARD = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_GENERIC_CARD;
    public static final int SAVE_DATA_TYPE_PASSWORD = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_PASSWORD;
    public static final int SAVE_DATA_TYPE_PAYMENT_CARD = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_PAYMENT_CARD;
    public static final int SAVE_DATA_TYPE_USERNAME = android.service.autofill.SaveInfo.SAVE_DATA_TYPE_USERNAME;

    public static final class Builder {
        private final android.service.autofill.SaveInfo.Builder real;

        public Builder(android.service.autofill.SaveInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder wrap(android.service.autofill.SaveInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder(real);
        }

        public android.service.autofill.SaveInfo.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.service.autofill.SaveInfo.Builder(arg0));
        }

        public Builder(int arg0, android.view.autofill.AutofillId[] arg1) {
            this(new android.service.autofill.SaveInfo.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder addSanitizer(com.micklab.dcg.wrapper.android.service.autofill.Sanitizer arg0, android.view.autofill.AutofillId... arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.addSanitizer(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo build() {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setCustomDescription(com.micklab.dcg.wrapper.android.service.autofill.CustomDescription arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setCustomDescription(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setNegativeAction(int arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setNegativeAction(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setOptionalIds(android.view.autofill.AutofillId[] arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setOptionalIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setPositiveAction(int arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setPositiveAction(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setTriggerId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setTriggerId(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder setValidator(com.micklab.dcg.wrapper.android.service.autofill.Validator arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.SaveInfo.Builder.wrap(real.setValidator(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
