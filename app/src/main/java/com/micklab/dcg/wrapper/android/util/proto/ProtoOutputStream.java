// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util.proto;

public final class ProtoOutputStream {
    private final android.util.proto.ProtoOutputStream real;

    public ProtoOutputStream(android.util.proto.ProtoOutputStream real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.proto.ProtoOutputStream wrap(android.util.proto.ProtoOutputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.proto.ProtoOutputStream(real);
    }

    public android.util.proto.ProtoOutputStream unwrap() {
        return real;
    }

    public ProtoOutputStream() {
        this(new android.util.proto.ProtoOutputStream());
    }

    public ProtoOutputStream(java.io.OutputStream arg0) {
        this(new android.util.proto.ProtoOutputStream(arg0));
    }

    public ProtoOutputStream(int arg0) {
        this(new android.util.proto.ProtoOutputStream(arg0));
    }

    public static int checkFieldId(long arg0, long arg1) {
        return android.util.proto.ProtoOutputStream.checkFieldId(arg0, arg1);
    }

    public void dump(java.lang.String arg0) {
        real.dump(arg0);
    }

    public void end(long arg0) {
        real.end(arg0);
    }

    public void flush() {
        real.flush();
    }

    public byte[] getBytes() {
        return real.getBytes();
    }

    public static java.lang.String getFieldCountString(long arg0) {
        return android.util.proto.ProtoOutputStream.getFieldCountString(arg0);
    }

    public static java.lang.String getFieldIdString(long arg0) {
        return android.util.proto.ProtoOutputStream.getFieldIdString(arg0);
    }

    public static java.lang.String getFieldTypeString(long arg0) {
        return android.util.proto.ProtoOutputStream.getFieldTypeString(arg0);
    }

    public int getRawSize() {
        return real.getRawSize();
    }

    public static java.lang.String getWireTypeString(int arg0) {
        return android.util.proto.ProtoOutputStream.getWireTypeString(arg0);
    }

    public static long makeFieldId(int arg0, long arg1) {
        return android.util.proto.ProtoOutputStream.makeFieldId(arg0, arg1);
    }

    public static long makeToken(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        return android.util.proto.ProtoOutputStream.makeToken(arg0, arg1, arg2, arg3, arg4);
    }

    public long start(long arg0) {
        return real.start(arg0);
    }

    public static java.lang.String token2String(long arg0) {
        return android.util.proto.ProtoOutputStream.token2String(arg0);
    }

    public void write(long arg0, double arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, byte[] arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, java.lang.String arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, int arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, float arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, long arg1) {
        real.write(arg0, arg1);
    }

    public void write(long arg0, boolean arg1) {
        real.write(arg0, arg1);
    }

    public void writeTag(int arg0, int arg1) {
        real.writeTag(arg0, arg1);
    }

    public static final long FIELD_COUNT_MASK = android.util.proto.ProtoOutputStream.FIELD_COUNT_MASK;
    public static final long FIELD_COUNT_PACKED = android.util.proto.ProtoOutputStream.FIELD_COUNT_PACKED;
    public static final long FIELD_COUNT_REPEATED = android.util.proto.ProtoOutputStream.FIELD_COUNT_REPEATED;
    public static final int FIELD_COUNT_SHIFT = android.util.proto.ProtoOutputStream.FIELD_COUNT_SHIFT;
    public static final long FIELD_COUNT_SINGLE = android.util.proto.ProtoOutputStream.FIELD_COUNT_SINGLE;
    public static final long FIELD_COUNT_UNKNOWN = android.util.proto.ProtoOutputStream.FIELD_COUNT_UNKNOWN;
    public static final int FIELD_ID_SHIFT = android.util.proto.ProtoOutputStream.FIELD_ID_SHIFT;
    public static final long FIELD_TYPE_BOOL = android.util.proto.ProtoOutputStream.FIELD_TYPE_BOOL;
    public static final long FIELD_TYPE_BYTES = android.util.proto.ProtoOutputStream.FIELD_TYPE_BYTES;
    public static final long FIELD_TYPE_DOUBLE = android.util.proto.ProtoOutputStream.FIELD_TYPE_DOUBLE;
    public static final long FIELD_TYPE_ENUM = android.util.proto.ProtoOutputStream.FIELD_TYPE_ENUM;
    public static final long FIELD_TYPE_FIXED32 = android.util.proto.ProtoOutputStream.FIELD_TYPE_FIXED32;
    public static final long FIELD_TYPE_FIXED64 = android.util.proto.ProtoOutputStream.FIELD_TYPE_FIXED64;
    public static final long FIELD_TYPE_FLOAT = android.util.proto.ProtoOutputStream.FIELD_TYPE_FLOAT;
    public static final long FIELD_TYPE_INT32 = android.util.proto.ProtoOutputStream.FIELD_TYPE_INT32;
    public static final long FIELD_TYPE_INT64 = android.util.proto.ProtoOutputStream.FIELD_TYPE_INT64;
    public static final long FIELD_TYPE_MASK = android.util.proto.ProtoOutputStream.FIELD_TYPE_MASK;
    public static final long FIELD_TYPE_MESSAGE = android.util.proto.ProtoOutputStream.FIELD_TYPE_MESSAGE;
    public static final long FIELD_TYPE_SFIXED32 = android.util.proto.ProtoOutputStream.FIELD_TYPE_SFIXED32;
    public static final long FIELD_TYPE_SFIXED64 = android.util.proto.ProtoOutputStream.FIELD_TYPE_SFIXED64;
    public static final int FIELD_TYPE_SHIFT = android.util.proto.ProtoOutputStream.FIELD_TYPE_SHIFT;
    public static final long FIELD_TYPE_SINT32 = android.util.proto.ProtoOutputStream.FIELD_TYPE_SINT32;
    public static final long FIELD_TYPE_SINT64 = android.util.proto.ProtoOutputStream.FIELD_TYPE_SINT64;
    public static final long FIELD_TYPE_STRING = android.util.proto.ProtoOutputStream.FIELD_TYPE_STRING;
    public static final long FIELD_TYPE_UINT32 = android.util.proto.ProtoOutputStream.FIELD_TYPE_UINT32;
    public static final long FIELD_TYPE_UINT64 = android.util.proto.ProtoOutputStream.FIELD_TYPE_UINT64;
    public static final int WIRE_TYPE_END_GROUP = android.util.proto.ProtoOutputStream.WIRE_TYPE_END_GROUP;
    public static final int WIRE_TYPE_FIXED32 = android.util.proto.ProtoOutputStream.WIRE_TYPE_FIXED32;
    public static final int WIRE_TYPE_FIXED64 = android.util.proto.ProtoOutputStream.WIRE_TYPE_FIXED64;
    public static final int WIRE_TYPE_LENGTH_DELIMITED = android.util.proto.ProtoOutputStream.WIRE_TYPE_LENGTH_DELIMITED;
    public static final int WIRE_TYPE_MASK = android.util.proto.ProtoOutputStream.WIRE_TYPE_MASK;
    public static final int WIRE_TYPE_START_GROUP = android.util.proto.ProtoOutputStream.WIRE_TYPE_START_GROUP;
    public static final int WIRE_TYPE_VARINT = android.util.proto.ProtoOutputStream.WIRE_TYPE_VARINT;

}
