// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextSelection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextSelection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection wrap(android.view.textclassifier.TextSelection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextSelection getReal() {
        return (android.view.textclassifier.TextSelection) real;
    }

    public android.view.textclassifier.TextSelection unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextSelection) real).describeContents();
    }

    public float getConfidenceScore(java.lang.String arg0) {
        return ((android.view.textclassifier.TextSelection) real).getConfidenceScore(arg0);
    }

    public java.lang.String getEntity(int arg0) {
        return ((android.view.textclassifier.TextSelection) real).getEntity(arg0);
    }

    public int getEntityCount() {
        return ((android.view.textclassifier.TextSelection) real).getEntityCount();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextSelection) real).getExtras());
    }

    public java.lang.String getId() {
        return ((android.view.textclassifier.TextSelection) real).getId();
    }

    public int getSelectionEndIndex() {
        return ((android.view.textclassifier.TextSelection) real).getSelectionEndIndex();
    }

    public int getSelectionStartIndex() {
        return ((android.view.textclassifier.TextSelection) real).getSelectionStartIndex();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification getTextClassification() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(((android.view.textclassifier.TextSelection) real).getTextClassification());
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextSelection) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextSelection) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder wrap(android.view.textclassifier.TextSelection.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextSelection.Builder getReal() {
            return (android.view.textclassifier.TextSelection.Builder) real;
        }

        public android.view.textclassifier.TextSelection.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1) {
            this(new android.view.textclassifier.TextSelection.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.wrap(((android.view.textclassifier.TextSelection.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(((android.view.textclassifier.TextSelection.Builder) real).setEntityType(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(((android.view.textclassifier.TextSelection.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(((android.view.textclassifier.TextSelection.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder setTextClassification(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Builder.wrap(((android.view.textclassifier.TextSelection.Builder) real).setTextClassification(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request wrap(android.view.textclassifier.TextSelection.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextSelection.Request getReal() {
            return (android.view.textclassifier.TextSelection.Request) real;
        }

        public android.view.textclassifier.TextSelection.Request unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextSelection.Request) real).describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return ((android.view.textclassifier.TextSelection.Request) real).getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getDefaultLocales() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.textclassifier.TextSelection.Request) real).getDefaultLocales());
        }

        public int getEndIndex() {
            return ((android.view.textclassifier.TextSelection.Request) real).getEndIndex();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextSelection.Request) real).getExtras());
        }

        public int getStartIndex() {
            return ((android.view.textclassifier.TextSelection.Request) real).getStartIndex();
        }

        public java.lang.CharSequence getText() {
            return ((android.view.textclassifier.TextSelection.Request) real).getText();
        }

        public boolean shouldIncludeTextClassification() {
            return ((android.view.textclassifier.TextSelection.Request) real).shouldIncludeTextClassification();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextSelection.Request) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder wrap(android.view.textclassifier.TextSelection.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.TextSelection.Request.Builder getReal() {
                return (android.view.textclassifier.TextSelection.Request.Builder) real;
            }

            public android.view.textclassifier.TextSelection.Request.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.CharSequence arg0, int arg1, int arg2) {
                this(new android.view.textclassifier.TextSelection.Request.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.wrap(((android.view.textclassifier.TextSelection.Request.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(((android.view.textclassifier.TextSelection.Request.Builder) real).setDefaultLocales(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(((android.view.textclassifier.TextSelection.Request.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder setIncludeTextClassification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request.Builder.wrap(((android.view.textclassifier.TextSelection.Request.Builder) real).setIncludeTextClassification(arg0));
            }

        }
    }
}
