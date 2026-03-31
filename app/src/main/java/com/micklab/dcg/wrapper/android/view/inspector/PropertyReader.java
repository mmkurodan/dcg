// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class PropertyReader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PropertyReader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.PropertyReader wrap(android.view.inspector.PropertyReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyReader(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.PropertyReader getReal() {
        return (android.view.inspector.PropertyReader) real;
    }

    public android.view.inspector.PropertyReader unwrap() {
        return getReal();
    }

    public void readBoolean(int arg0, boolean arg1) {
        ((android.view.inspector.PropertyReader) real).readBoolean(arg0, arg1);
    }

    public void readByte(int arg0, byte arg1) {
        ((android.view.inspector.PropertyReader) real).readByte(arg0, arg1);
    }

    public void readChar(int arg0, char arg1) {
        ((android.view.inspector.PropertyReader) real).readChar(arg0, arg1);
    }

    public void readColor(int arg0, long arg1) {
        ((android.view.inspector.PropertyReader) real).readColor(arg0, arg1);
    }

    public void readColor(int arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1) {
        ((android.view.inspector.PropertyReader) real).readColor(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void readColor(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readColor(arg0, arg1);
    }

    public void readDouble(int arg0, double arg1) {
        ((android.view.inspector.PropertyReader) real).readDouble(arg0, arg1);
    }

    public void readFloat(int arg0, float arg1) {
        ((android.view.inspector.PropertyReader) real).readFloat(arg0, arg1);
    }

    public void readGravity(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readGravity(arg0, arg1);
    }

    public void readInt(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readInt(arg0, arg1);
    }

    public void readIntEnum(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readIntEnum(arg0, arg1);
    }

    public void readIntFlag(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readIntFlag(arg0, arg1);
    }

    public void readLong(int arg0, long arg1) {
        ((android.view.inspector.PropertyReader) real).readLong(arg0, arg1);
    }

    public void readObject(int arg0, java.lang.Object arg1) {
        ((android.view.inspector.PropertyReader) real).readObject(arg0, arg1);
    }

    public void readResourceId(int arg0, int arg1) {
        ((android.view.inspector.PropertyReader) real).readResourceId(arg0, arg1);
    }

    public void readShort(int arg0, short arg1) {
        ((android.view.inspector.PropertyReader) real).readShort(arg0, arg1);
    }

    public static final class PropertyTypeMismatchException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PropertyTypeMismatchException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.PropertyReader.PropertyTypeMismatchException wrap(android.view.inspector.PropertyReader.PropertyTypeMismatchException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyReader.PropertyTypeMismatchException(real, (__DcgwBridgeToken) null);
        }

        public android.view.inspector.PropertyReader.PropertyTypeMismatchException getReal() {
            return (android.view.inspector.PropertyReader.PropertyTypeMismatchException) real;
        }

        public android.view.inspector.PropertyReader.PropertyTypeMismatchException unwrap() {
            return getReal();
        }

        public PropertyTypeMismatchException(int arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.view.inspector.PropertyReader.PropertyTypeMismatchException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public PropertyTypeMismatchException(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
            this(new android.view.inspector.PropertyReader.PropertyTypeMismatchException(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

    }
}
