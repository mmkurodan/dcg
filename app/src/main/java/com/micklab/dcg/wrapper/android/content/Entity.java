// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Entity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Entity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Entity wrap(android.content.Entity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Entity(real, (__DcgwBridgeToken) null);
    }

    public android.content.Entity getReal() {
        return (android.content.Entity) real;
    }

    public android.content.Entity unwrap() {
        return getReal();
    }

    public Entity(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        this(new android.content.Entity(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void addSubValue(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        ((android.content.Entity) real).addSubValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getEntityValues() {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.content.Entity) real).getEntityValues());
    }

    public java.lang.String toString() {
        return ((android.content.Entity) real).toString();
    }

    public static final class NamedContentValues {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NamedContentValues(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Entity.NamedContentValues wrap(android.content.Entity.NamedContentValues real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Entity.NamedContentValues(real, (__DcgwBridgeToken) null);
        }

        public android.content.Entity.NamedContentValues getReal() {
            return (android.content.Entity.NamedContentValues) real;
        }

        public android.content.Entity.NamedContentValues unwrap() {
            return getReal();
        }

        public NamedContentValues(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
            this(new android.content.Entity.NamedContentValues(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }


    }
}
