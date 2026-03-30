// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class PropertyMapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PropertyMapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper wrap(android.view.inspector.PropertyMapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.PropertyMapper getReal() {
        return (android.view.inspector.PropertyMapper) real;
    }

    public android.view.inspector.PropertyMapper unwrap() {
        return getReal();
    }

    public int mapBoolean(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapBoolean(arg0, arg1);
    }

    public int mapByte(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapByte(arg0, arg1);
    }

    public int mapChar(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapChar(arg0, arg1);
    }

    public int mapColor(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapColor(arg0, arg1);
    }

    public int mapDouble(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapDouble(arg0, arg1);
    }

    public int mapFloat(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapFloat(arg0, arg1);
    }

    public int mapGravity(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapGravity(arg0, arg1);
    }

    public int mapInt(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapInt(arg0, arg1);
    }

    public int mapLong(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapLong(arg0, arg1);
    }

    public int mapObject(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapObject(arg0, arg1);
    }

    public int mapResourceId(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapResourceId(arg0, arg1);
    }

    public int mapShort(java.lang.String arg0, int arg1) {
        return ((android.view.inspector.PropertyMapper) real).mapShort(arg0, arg1);
    }

    public static final class PropertyConflictException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PropertyConflictException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper.PropertyConflictException wrap(android.view.inspector.PropertyMapper.PropertyConflictException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper.PropertyConflictException(real, (__DcgwBridgeToken) null);
        }

        public android.view.inspector.PropertyMapper.PropertyConflictException getReal() {
            return (android.view.inspector.PropertyMapper.PropertyConflictException) real;
        }

        public android.view.inspector.PropertyMapper.PropertyConflictException unwrap() {
            return getReal();
        }

        public PropertyConflictException(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.view.inspector.PropertyMapper.PropertyConflictException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
}
