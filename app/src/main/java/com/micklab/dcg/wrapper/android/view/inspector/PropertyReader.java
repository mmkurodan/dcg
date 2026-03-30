// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class PropertyReader {
    private final android.view.inspector.PropertyReader real;

    public PropertyReader(android.view.inspector.PropertyReader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.PropertyReader wrap(android.view.inspector.PropertyReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyReader(real);
    }

    public android.view.inspector.PropertyReader unwrap() {
        return real;
    }

    public void readBoolean(int arg0, boolean arg1) {
        real.readBoolean(arg0, arg1);
    }

    public void readByte(int arg0, byte arg1) {
        real.readByte(arg0, arg1);
    }

    public void readChar(int arg0, char arg1) {
        real.readChar(arg0, arg1);
    }

    public void readColor(int arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1) {
        real.readColor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void readColor(int arg0, long arg1) {
        real.readColor(arg0, arg1);
    }

    public void readColor(int arg0, int arg1) {
        real.readColor(arg0, arg1);
    }

    public void readDouble(int arg0, double arg1) {
        real.readDouble(arg0, arg1);
    }

    public void readFloat(int arg0, float arg1) {
        real.readFloat(arg0, arg1);
    }

    public void readGravity(int arg0, int arg1) {
        real.readGravity(arg0, arg1);
    }

    public void readInt(int arg0, int arg1) {
        real.readInt(arg0, arg1);
    }

    public void readIntEnum(int arg0, int arg1) {
        real.readIntEnum(arg0, arg1);
    }

    public void readIntFlag(int arg0, int arg1) {
        real.readIntFlag(arg0, arg1);
    }

    public void readLong(int arg0, long arg1) {
        real.readLong(arg0, arg1);
    }

    public void readObject(int arg0, java.lang.Object arg1) {
        real.readObject(arg0, arg1);
    }

    public void readResourceId(int arg0, int arg1) {
        real.readResourceId(arg0, arg1);
    }

    public void readShort(int arg0, short arg1) {
        real.readShort(arg0, arg1);
    }

    public static final class PropertyTypeMismatchException {
        private final android.view.inspector.PropertyReader.PropertyTypeMismatchException real;

        public PropertyTypeMismatchException(android.view.inspector.PropertyReader.PropertyTypeMismatchException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.PropertyReader.PropertyTypeMismatchException wrap(android.view.inspector.PropertyReader.PropertyTypeMismatchException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.PropertyReader.PropertyTypeMismatchException(real);
        }

        public android.view.inspector.PropertyReader.PropertyTypeMismatchException unwrap() {
            return real;
        }

        public PropertyTypeMismatchException(int arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.view.inspector.PropertyReader.PropertyTypeMismatchException(arg0, arg1, arg2));
        }

        public PropertyTypeMismatchException(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
            this(new android.view.inspector.PropertyReader.PropertyTypeMismatchException(arg0, arg1, arg2, arg3));
        }

    }
}
