// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class ConversationActions {
    private final android.view.textclassifier.ConversationActions real;

    public ConversationActions(android.view.textclassifier.ConversationActions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions wrap(android.view.textclassifier.ConversationActions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions(real);
    }

    public android.view.textclassifier.ConversationActions unwrap() {
        return real;
    }

    public ConversationActions(java.util.List arg0, java.lang.String arg1) {
        this(new android.view.textclassifier.ConversationActions(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Message {
        private final android.view.textclassifier.ConversationActions.Message real;

        public Message(android.view.textclassifier.ConversationActions.Message real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message wrap(android.view.textclassifier.ConversationActions.Message real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message(real);
        }

        public android.view.textclassifier.ConversationActions.Message unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.app.Person getAuthor() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(real.getAuthor());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return real.getReferenceTime();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.app.Person PERSON_USER_OTHERS = com.micklab.dcg.wrapper.android.app.Person.wrap(android.view.textclassifier.ConversationActions.Message.PERSON_USER_OTHERS);
        public static final com.micklab.dcg.wrapper.android.app.Person PERSON_USER_SELF = com.micklab.dcg.wrapper.android.app.Person.wrap(android.view.textclassifier.ConversationActions.Message.PERSON_USER_SELF);

        public static final class Builder {
            private final android.view.textclassifier.ConversationActions.Message.Builder real;

            public Builder(android.view.textclassifier.ConversationActions.Message.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder wrap(android.view.textclassifier.ConversationActions.Message.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder(real);
            }

            public android.view.textclassifier.ConversationActions.Message.Builder unwrap() {
                return real;
            }

            public Builder(com.micklab.dcg.wrapper.android.app.Person arg0) {
                this(new android.view.textclassifier.ConversationActions.Message.Builder(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(real.setReferenceTime(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setText(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(real.setText(arg0));
            }

        }
    }
    public static final class Request {
        private final android.view.textclassifier.ConversationActions.Request real;

        public Request(android.view.textclassifier.ConversationActions.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request wrap(android.view.textclassifier.ConversationActions.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request(real);
        }

        public android.view.textclassifier.ConversationActions.Request unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return real.getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public int getMaxSuggestions() {
            return real.getMaxSuggestions();
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig getTypeConfig() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.wrap(real.getTypeConfig());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final java.lang.String HINT_FOR_IN_APP = android.view.textclassifier.ConversationActions.Request.HINT_FOR_IN_APP;
        public static final java.lang.String HINT_FOR_NOTIFICATION = android.view.textclassifier.ConversationActions.Request.HINT_FOR_NOTIFICATION;

        public static final class Builder {
            private final android.view.textclassifier.ConversationActions.Request.Builder real;

            public Builder(android.view.textclassifier.ConversationActions.Request.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder wrap(android.view.textclassifier.ConversationActions.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder(real);
            }

            public android.view.textclassifier.ConversationActions.Request.Builder unwrap() {
                return real;
            }

            public Builder(java.util.List arg0) {
                this(new android.view.textclassifier.ConversationActions.Request.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setMaxSuggestions(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(real.setMaxSuggestions(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setTypeConfig(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(real.setTypeConfig(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
