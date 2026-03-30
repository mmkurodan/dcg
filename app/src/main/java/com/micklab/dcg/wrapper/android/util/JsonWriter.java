// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class JsonWriter {
    private final android.util.JsonWriter real;

    public JsonWriter(android.util.JsonWriter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.JsonWriter wrap(android.util.JsonWriter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.JsonWriter(real);
    }

    public android.util.JsonWriter unwrap() {
        return real;
    }

    public JsonWriter(java.io.Writer arg0) {
        this(new android.util.JsonWriter(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter beginArray() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.beginArray());
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter beginObject() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.beginObject());
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter endArray() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.endArray());
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter endObject() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.endObject());
    }

    public void flush() throws java.io.IOException {
        real.flush();
    }

    public boolean isLenient() {
        return real.isLenient();
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter name(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.name(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter nullValue() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.nullValue());
    }

    public void setIndent(java.lang.String arg0) {
        real.setIndent(arg0);
    }

    public void setLenient(boolean arg0) {
        real.setLenient(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(boolean arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(double arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(long arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(java.lang.Number arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(real.value(arg0));
    }

}
