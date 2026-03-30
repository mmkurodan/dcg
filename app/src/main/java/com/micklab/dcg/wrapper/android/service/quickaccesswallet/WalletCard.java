// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quickaccesswallet;

public final class WalletCard {
    private final android.service.quickaccesswallet.WalletCard real;

    public WalletCard(android.service.quickaccesswallet.WalletCard real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard wrap(android.service.quickaccesswallet.WalletCard real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard(real);
    }

    public android.service.quickaccesswallet.WalletCard unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getCardIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getCardIcon());
    }

    public java.lang.String getCardId() {
        return real.getCardId();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getCardImage() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getCardImage());
    }

    public java.lang.CharSequence getCardLabel() {
        return real.getCardLabel();
    }

    public int getCardType() {
        return real.getCardType();
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getNonPaymentCardSecondaryImage() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getNonPaymentCardSecondaryImage());
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getPendingIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getPendingIntent());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CARD_TYPE_NON_PAYMENT = android.service.quickaccesswallet.WalletCard.CARD_TYPE_NON_PAYMENT;
    public static final int CARD_TYPE_PAYMENT = android.service.quickaccesswallet.WalletCard.CARD_TYPE_PAYMENT;
    public static final int CARD_TYPE_UNKNOWN = android.service.quickaccesswallet.WalletCard.CARD_TYPE_UNKNOWN;

    public static final class Builder {
        private final android.service.quickaccesswallet.WalletCard.Builder real;

        public Builder(android.service.quickaccesswallet.WalletCard.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder wrap(android.service.quickaccesswallet.WalletCard.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder(real);
        }

        public android.service.quickaccesswallet.WalletCard.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
            this(new android.service.quickaccesswallet.WalletCard.Builder(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public Builder(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2, java.lang.CharSequence arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
            this(new android.service.quickaccesswallet.WalletCard.Builder(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard build() {
            return com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder setCardIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder.wrap(real.setCardIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder setCardLabel(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder.wrap(real.setCardLabel(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder setNonPaymentCardSecondaryImage(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.quickaccesswallet.WalletCard.Builder.wrap(real.setNonPaymentCardSecondaryImage(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
