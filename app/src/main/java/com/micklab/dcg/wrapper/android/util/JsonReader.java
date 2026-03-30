// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class JsonReader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JsonReader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.JsonReader wrap(android.util.JsonReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.JsonReader(real, (__DcgwBridgeToken) null);
    }

    public android.util.JsonReader getReal() {
        return (android.util.JsonReader) real;
    }

    public android.util.JsonReader unwrap() {
        return getReal();
    }

    public JsonReader(java.io.Reader arg0) {
        this(new android.util.JsonReader(arg0), (__DcgwBridgeToken) null);
    }

    public void beginArray() throws java.io.IOException {
        ((android.util.JsonReader) real).beginArray();
    }

    public void beginObject() throws java.io.IOException {
        ((android.util.JsonReader) real).beginObject();
    }

    public void close() throws java.io.IOException {
        ((android.util.JsonReader) real).close();
    }

    public void endArray() throws java.io.IOException {
        ((android.util.JsonReader) real).endArray();
    }

    public void endObject() throws java.io.IOException {
        ((android.util.JsonReader) real).endObject();
    }

    public boolean hasNext() throws java.io.IOException {
        return ((android.util.JsonReader) real).hasNext();
    }

    public boolean isLenient() {
        return ((android.util.JsonReader) real).isLenient();
    }

    public boolean nextBoolean() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextBoolean();
    }

    public double nextDouble() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextDouble();
    }

    public int nextInt() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextInt();
    }

    public long nextLong() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextLong();
    }

    public java.lang.String nextName() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextName();
    }

    public void nextNull() throws java.io.IOException {
        ((android.util.JsonReader) real).nextNull();
    }

    public java.lang.String nextString() throws java.io.IOException {
        return ((android.util.JsonReader) real).nextString();
    }

    public com.micklab.dcg.wrapper.android.util.JsonToken peek() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonToken.wrap(((android.util.JsonReader) real).peek());
    }

    public void setLenient(boolean arg0) {
        ((android.util.JsonReader) real).setLenient(arg0);
    }

    public void skipValue() throws java.io.IOException {
        ((android.util.JsonReader) real).skipValue();
    }

    public java.lang.String toString() {
        return ((android.util.JsonReader) real).toString();
    }

}
