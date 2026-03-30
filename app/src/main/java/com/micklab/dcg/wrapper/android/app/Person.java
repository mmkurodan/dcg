// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Person {
    private final android.app.Person real;

    public Person(android.app.Person real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Person wrap(android.app.Person real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Person(real);
    }

    public android.app.Person unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public java.lang.CharSequence getName() {
        return real.getName();
    }

    public java.lang.String getUri() {
        return real.getUri();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBot() {
        return real.isBot();
    }

    public boolean isImportant() {
        return real.isImportant();
    }

    public com.micklab.dcg.wrapper.android.app.Person.Builder toBuilder() {
        return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.toBuilder());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.Person.Builder real;

        public Builder(android.app.Person.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Person.Builder wrap(android.app.Person.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Person.Builder(real);
        }

        public android.app.Person.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.Person.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.Person build() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setBot(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setBot(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setImportant(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setImportant(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Person.Builder setUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Person.Builder.wrap(real.setUri(arg0));
        }

    }
}
