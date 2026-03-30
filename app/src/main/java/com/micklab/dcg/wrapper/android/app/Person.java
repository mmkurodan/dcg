// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Person {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Person(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Person wrap(android.app.Person real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Person(real, (__DcgwBridgeToken) null);
    }

    public android.app.Person getReal() {
        return (android.app.Person) real;
    }

    public android.app.Person unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.Person) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.Person) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.Person) real).getIcon());
    }

    public java.lang.String getKey() {
        return ((android.app.Person) real).getKey();
    }

    public java.lang.CharSequence getName() {
        return ((android.app.Person) real).getName();
    }

    public java.lang.String getUri() {
        return ((android.app.Person) real).getUri();
    }

    public int hashCode() {
        return ((android.app.Person) real).hashCode();
    }

    public boolean isBot() {
        return ((android.app.Person) real).isBot();
    }

    public boolean isImportant() {
        return ((android.app.Person) real).isImportant();
    }

    public com.micklab.dcg.wrapper.android.app.Person.Builder toBuilder() {
        return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person) real).toBuilder());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.Person) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Person.Builder wrap(android.app.Person.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Person.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.Person.Builder getReal() {
            return (android.app.Person.Builder) real;
        }

        public android.app.Person.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.Person.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Person build() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(((android.app.Person.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setBot(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setBot(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setImportant(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setImportant(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(((android.app.Person.Builder) real).setUri(arg0));
        }

    }
}
