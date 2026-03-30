// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassification {
    private final android.view.textclassifier.TextClassification real;

    public TextClassification(android.view.textclassifier.TextClassification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification wrap(android.view.textclassifier.TextClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification(real);
    }

    public android.view.textclassifier.TextClassification unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getConfidenceScore(java.lang.String arg0) {
        return real.getConfidenceScore(arg0);
    }

    public java.lang.String getEntity(int arg0) {
        return real.getEntity(arg0);
    }

    public int getEntityCount() {
        return real.getEntityCount();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIcon());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnClickListener getOnClickListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnClickListener.wrap(real.getOnClickListener());
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.textclassifier.TextClassification.Builder real;

        public Builder(android.view.textclassifier.TextClassification.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder wrap(android.view.textclassifier.TextClassification.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder(real);
        }

        public android.view.textclassifier.TextClassification.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.textclassifier.TextClassification.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder addAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.addAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setEntityType(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setEntityType(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setLabel(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setLabel(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setOnClickListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(real.setText(arg0));
        }

    }
    public static final class Request {
        private final android.view.textclassifier.TextClassification.Request real;

        public Request(android.view.textclassifier.TextClassification.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request wrap(android.view.textclassifier.TextClassification.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request(real);
        }

        public android.view.textclassifier.TextClassification.Request unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return real.getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getDefaultLocales() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getDefaultLocales());
        }

        public int getEndIndex() {
            return real.getEndIndex();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return real.getReferenceTime();
        }

        public int getStartIndex() {
            return real.getStartIndex();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.view.textclassifier.TextClassification.Request.Builder real;

            public Builder(android.view.textclassifier.TextClassification.Request.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder wrap(android.view.textclassifier.TextClassification.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder(real);
            }

            public android.view.textclassifier.TextClassification.Request.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.CharSequence arg0, int arg1, int arg2) {
                this(new android.view.textclassifier.TextClassification.Request.Builder(arg0, arg1, arg2));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(real.setDefaultLocales(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(real.setReferenceTime(arg0));
            }

        }
    }
}
