// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class JsonReader {
    private final android.util.JsonReader real;

    public JsonReader(android.util.JsonReader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.JsonReader wrap(android.util.JsonReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.JsonReader(real);
    }

    public android.util.JsonReader unwrap() {
        return real;
    }

    public JsonReader(java.io.Reader arg0) {
        this(new android.util.JsonReader(arg0));
    }

    public void beginArray() throws java.io.IOException {
        real.beginArray();
    }

    public void beginObject() throws java.io.IOException {
        real.beginObject();
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void endArray() throws java.io.IOException {
        real.endArray();
    }

    public void endObject() throws java.io.IOException {
        real.endObject();
    }

    public boolean hasNext() throws java.io.IOException {
        return real.hasNext();
    }

    public boolean isLenient() {
        return real.isLenient();
    }

    public boolean nextBoolean() throws java.io.IOException {
        return real.nextBoolean();
    }

    public double nextDouble() throws java.io.IOException {
        return real.nextDouble();
    }

    public int nextInt() throws java.io.IOException {
        return real.nextInt();
    }

    public long nextLong() throws java.io.IOException {
        return real.nextLong();
    }

    public java.lang.String nextName() throws java.io.IOException {
        return real.nextName();
    }

    public void nextNull() throws java.io.IOException {
        real.nextNull();
    }

    public java.lang.String nextString() throws java.io.IOException {
        return real.nextString();
    }

    public com.micklab.dcg.wrapper.android.util.JsonToken peek() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonToken.wrap(real.peek());
    }

    public void setLenient(boolean arg0) {
        real.setLenient(arg0);
    }

    public void skipValue() throws java.io.IOException {
        real.skipValue();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
