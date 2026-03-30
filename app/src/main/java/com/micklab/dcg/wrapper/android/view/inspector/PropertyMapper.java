// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class PropertyMapper {
    private final android.view.inspector.PropertyMapper real;

    public PropertyMapper(android.view.inspector.PropertyMapper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper wrap(android.view.inspector.PropertyMapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper(real);
    }

    public android.view.inspector.PropertyMapper unwrap() {
        return real;
    }

    public int mapBoolean(java.lang.String arg0, int arg1) {
        return real.mapBoolean(arg0, arg1);
    }

    public int mapByte(java.lang.String arg0, int arg1) {
        return real.mapByte(arg0, arg1);
    }

    public int mapChar(java.lang.String arg0, int arg1) {
        return real.mapChar(arg0, arg1);
    }

    public int mapColor(java.lang.String arg0, int arg1) {
        return real.mapColor(arg0, arg1);
    }

    public int mapDouble(java.lang.String arg0, int arg1) {
        return real.mapDouble(arg0, arg1);
    }

    public int mapFloat(java.lang.String arg0, int arg1) {
        return real.mapFloat(arg0, arg1);
    }

    public int mapGravity(java.lang.String arg0, int arg1) {
        return real.mapGravity(arg0, arg1);
    }

    public int mapInt(java.lang.String arg0, int arg1) {
        return real.mapInt(arg0, arg1);
    }

    public int mapLong(java.lang.String arg0, int arg1) {
        return real.mapLong(arg0, arg1);
    }

    public int mapObject(java.lang.String arg0, int arg1) {
        return real.mapObject(arg0, arg1);
    }

    public int mapResourceId(java.lang.String arg0, int arg1) {
        return real.mapResourceId(arg0, arg1);
    }

    public int mapShort(java.lang.String arg0, int arg1) {
        return real.mapShort(arg0, arg1);
    }

    public static final class PropertyConflictException {
        private final android.view.inspector.PropertyMapper.PropertyConflictException real;

        public PropertyConflictException(android.view.inspector.PropertyMapper.PropertyConflictException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper.PropertyConflictException wrap(android.view.inspector.PropertyMapper.PropertyConflictException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper.PropertyConflictException(real);
        }

        public android.view.inspector.PropertyMapper.PropertyConflictException unwrap() {
            return real;
        }

        public PropertyConflictException(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.view.inspector.PropertyMapper.PropertyConflictException(arg0, arg1, arg2));
        }

    }
}
