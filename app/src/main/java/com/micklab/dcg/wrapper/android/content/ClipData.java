// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ClipData {
    private final android.content.ClipData real;

    public ClipData(android.content.ClipData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData wrap(android.content.ClipData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData(real);
    }

    public android.content.ClipData unwrap() {
        return real;
    }

    public ClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        this(new android.content.ClipData(arg0 == null ? null : arg0.unwrap()));
    }

    public ClipData(com.micklab.dcg.wrapper.android.content.ClipDescription arg0, com.micklab.dcg.wrapper.android.content.ClipData.Item arg1) {
        this(new android.content.ClipData(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ClipData(java.lang.CharSequence arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.content.ClipData.Item arg2) {
        this(new android.content.ClipData(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void addItem(com.micklab.dcg.wrapper.android.content.ClipData.Item arg0) {
        real.addItem(arg0 == null ? null : arg0.unwrap());
    }

    public void addItem(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.ClipData.Item arg1) {
        real.addItem(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(real.getDescription());
    }

    public com.micklab.dcg.wrapper.android.content.ClipData.Item getItemAt(int arg0) {
        return com.micklab.dcg.wrapper.android.content.ClipData.Item.wrap(real.getItemAt(arg0));
    }

    public int getItemCount() {
        return real.getItemCount();
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newHtmlText(java.lang.CharSequence arg0, java.lang.CharSequence arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newHtmlText(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newIntent(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newIntent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newPlainText(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newPlainText(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newRawUri(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newRawUri(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.ClipData newUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(android.content.ClipData.newUri(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Item {
        private final android.content.ClipData.Item real;

        public Item(android.content.ClipData.Item real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ClipData.Item wrap(android.content.ClipData.Item real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData.Item(real);
        }

        public android.content.ClipData.Item unwrap() {
            return real;
        }

        public Item(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.content.ClipData.Item(arg0 == null ? null : arg0.unwrap()));
        }

        public Item(java.lang.CharSequence arg0) {
            this(new android.content.ClipData.Item(arg0));
        }

        public Item(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            this(new android.content.ClipData.Item(arg0 == null ? null : arg0.unwrap()));
        }

        public Item(java.lang.CharSequence arg0, java.lang.String arg1) {
            this(new android.content.ClipData.Item(arg0, arg1));
        }

        public Item(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
            this(new android.content.ClipData.Item(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public Item(java.lang.CharSequence arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.net.Uri arg3) {
            this(new android.content.ClipData.Item(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
        }

        public java.lang.String coerceToHtmlText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return real.coerceToHtmlText(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence coerceToStyledText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return real.coerceToStyledText(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence coerceToText(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return real.coerceToText(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String getHtmlText() {
            return real.getHtmlText();
        }

        public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
        }

        public com.micklab.dcg.wrapper.android.content.IntentSender getIntentSender() {
            return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(real.getIntentSender());
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks getTextLinks() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.wrap(real.getTextLinks());
        }

        public com.micklab.dcg.wrapper.android.net.Uri getUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final class Builder {
            private final android.content.ClipData.Item.Builder real;

            public Builder(android.content.ClipData.Item.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder wrap(android.content.ClipData.Item.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder(real);
            }

            public android.content.ClipData.Item.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.content.ClipData.Item.Builder());
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item build() {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setHtmlText(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(real.setHtmlText(arg0));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(real.setIntent(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(real.setIntentSender(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setText(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(real.setText(arg0));
            }

            public com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder setUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
                return com.micklab.dcg.wrapper.android.content.ClipData.Item.Builder.wrap(real.setUri(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
