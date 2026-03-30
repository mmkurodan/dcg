// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Entity {
    private final android.content.Entity real;

    public Entity(android.content.Entity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Entity wrap(android.content.Entity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Entity(real);
    }

    public android.content.Entity unwrap() {
        return real;
    }

    public Entity(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        this(new android.content.Entity(arg0 == null ? null : arg0.unwrap()));
    }

    public void addSubValue(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        real.addSubValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getEntityValues() {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getEntityValues());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class NamedContentValues {
        private final android.content.Entity.NamedContentValues real;

        public NamedContentValues(android.content.Entity.NamedContentValues real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Entity.NamedContentValues wrap(android.content.Entity.NamedContentValues real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Entity.NamedContentValues(real);
        }

        public android.content.Entity.NamedContentValues unwrap() {
            return real;
        }

        public NamedContentValues(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
            this(new android.content.Entity.NamedContentValues(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }


    }
}
