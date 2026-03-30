// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class JsonToken {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JsonToken(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.JsonToken wrap(android.util.JsonToken real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.JsonToken(real, (__DcgwBridgeToken) null);
    }

    public android.util.JsonToken getReal() {
        return (android.util.JsonToken) real;
    }

    public android.util.JsonToken unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.util.JsonToken valueOf(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.valueOf(arg0));
    }

    public static android.util.JsonToken[] values() {
        return android.util.JsonToken.values();
    }

    public static final com.micklab.dcg.wrapper.android.util.JsonToken BEGIN_ARRAY = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.BEGIN_ARRAY);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken BEGIN_OBJECT = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.BEGIN_OBJECT);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken BOOLEAN = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.BOOLEAN);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken END_ARRAY = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.END_ARRAY);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken END_DOCUMENT = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.END_DOCUMENT);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken END_OBJECT = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.END_OBJECT);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken NAME = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.NAME);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken NULL = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.NULL);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken NUMBER = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.NUMBER);
    public static final com.micklab.dcg.wrapper.android.util.JsonToken STRING = com.micklab.dcg.wrapper.android.util.JsonToken.wrap(android.util.JsonToken.STRING);

}
