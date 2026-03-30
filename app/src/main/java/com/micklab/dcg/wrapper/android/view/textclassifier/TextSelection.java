// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextSelection {
    private final android.view.textclassifier.TextSelection real;

    public TextSelection(android.view.textclassifier.TextSelection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection wrap(android.view.textclassifier.TextSelection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection(real);
    }

    public android.view.textclassifier.TextSelection unwrap() {
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

    public java.lang.String getId() {
        return real.getId();
    }

    public int getSelectionEndIndex() {
        return real.getSelectionEndIndex();
    }

    public int getSelectionStartIndex() {
        return real.getSelectionStartIndex();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification getTextClassification() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(real.getTextClassification());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.textclassifier.TextSelection.Builder real;

        public Builder(android.view.textclassifier.TextSelection.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder wrap(android.view.textclassifier.TextSelection.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder(real);
        }

        public android.view.textclassifier.TextSelection.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1) {
            this(new android.view.textclassifier.TextSelection.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(real.setEntityType(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setTextClassification(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(real.setTextClassification(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class Request {
        private final android.view.textclassifier.TextSelection.Request real;

        public Request(android.view.textclassifier.TextSelection.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request wrap(android.view.textclassifier.TextSelection.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request(real);
        }

        public android.view.textclassifier.TextSelection.Request unwrap() {
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

        public int getStartIndex() {
            return real.getStartIndex();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public boolean shouldIncludeTextClassification() {
            return real.shouldIncludeTextClassification();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.view.textclassifier.TextSelection.Request.Builder real;

            public Builder(android.view.textclassifier.TextSelection.Request.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder wrap(android.view.textclassifier.TextSelection.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder(real);
            }

            public android.view.textclassifier.TextSelection.Request.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.CharSequence arg0, int arg1, int arg2) {
                this(new android.view.textclassifier.TextSelection.Request.Builder(arg0, arg1, arg2));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(real.setDefaultLocales(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setIncludeTextClassification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(real.setIncludeTextClassification(arg0));
            }

        }
    }
}
