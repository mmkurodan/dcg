// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ClipData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClipData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData wrap(android.content.ClipData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData(real, (__DcgwBridgeToken) null);
    }

    public android.content.ClipData getReal() {
        return (android.content.ClipData) real;
    }

    public android.content.ClipData unwrap() {
        return getReal();
    }

    public ClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        this(new android.content.ClipData(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ClipData(com.micklab.dcg.wrapper.android.content.ClipDescription arg0, com.micklab.dcg.wrapper.android.content.ClipData.Item arg1) {
        this(new android.content.ClipData(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ClipData(java.lang.CharSequence arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.content.ClipData.Item arg2) {
        this(new android.content.ClipData(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public void addItem(com.micklab.dcg.wrapper.android.content.ClipData.Item arg0) {
        ((android.content.ClipData) real).addItem(arg0 == null ? null : arg0.getReal());
    }

    public void addItem(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.ClipData.Item arg1) {
        ((android.content.ClipData) real).addItem(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int describeContents() {
        return ((android.content.ClipData) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(((android.content.ClipData) real).getDescription());
    }

    public com.micklab.dcg.wrapper.android.content.ClipData.Item getItemAt(int arg0) {
        return com.micklab.dcg.wrapper.android.content.ClipData.Item.wrap(((android.content.ClipData) real).getItemAt(arg0));
    }

    public int getItemCount() {
        return ((android.content.ClipData) real).getItemCount();
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newHtmlText(java.lang.CharSequence arg0, java.lang.CharSequence arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newHtmlText(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newIntent(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newIntent(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newPlainText(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newPlainText(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newRawUri(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newRawUri(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newUri(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String toString() {
        return ((android.content.ClipData) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.ClipData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Item {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Item(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ClipData.Item wrap(android.content.ClipData.Item real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData.Item(real, (__DcgwBridgeToken) null);
        }

        public android.content.ClipData.Item getReal() {
            return (android.content.ClipData.Item) real;
        }

        public android.content.ClipData.Item unwrap() {
            return getReal();
        }

        public Item(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.content.ClipData.Item(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Item(java.lang.CharSequence arg0) {
            this(new android.content.ClipData.Item(arg0), (__DcgwBridgeToken) null);
        }

        public Item(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            this(new android.content.ClipData.Item(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Item(java.lang.CharSequence arg0, java.lang.String arg1) {
            this(new android.content.ClipData.Item(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public Item(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
            this(new android.content.ClipData.Item(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public Item(java.lang.CharSequence arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.net.Uri arg3) {
            this(new android.content.ClipData.Item(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public java.lang.String coerceToHtmlText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return ((android.content.ClipData.Item) real).coerceToHtmlText(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence coerceToStyledText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return ((android.content.ClipData.Item) real).coerceToStyledText(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence coerceToText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return ((android.content.ClipData.Item) real).coerceToText(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.String getHtmlText() {
            return ((android.content.ClipData.Item) real).getHtmlText();
        }

        public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.ClipData.Item) real).getIntent());
        }

        public com.micklab.dcg.wrapper.android.content.IntentSender getIntentSender() {
            return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.content.ClipData.Item) real).getIntentSender());
        }

        public java.lang.CharSequence getText() {
            return ((android.content.ClipData.Item) real).getText();
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks getTextLinks() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.wrap(((android.content.ClipData.Item) real).getTextLinks());
        }

        public com.micklab.dcg.wrapper.android.net.Uri getUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ClipData.Item) real).getUri());
        }

        public java.lang.String toString() {
            return ((android.content.ClipData.Item) real).toString();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder wrap(android.content.ClipData.Item.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.content.ClipData.Item.Builder getReal() {
                return (android.content.ClipData.Item.Builder) real;
            }

            public android.content.ClipData.Item.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.content.ClipData.Item.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item build() {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.wrap(((android.content.ClipData.Item.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setHtmlText(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(((android.content.ClipData.Item.Builder) real).setHtmlText(arg0));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(((android.content.ClipData.Item.Builder) real).setIntent(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(((android.content.ClipData.Item.Builder) real).setIntentSender(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setText(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(((android.content.ClipData.Item.Builder) real).setText(arg0));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(((android.content.ClipData.Item.Builder) real).setUri(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
