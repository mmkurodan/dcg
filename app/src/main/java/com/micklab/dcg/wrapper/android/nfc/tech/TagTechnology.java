// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class TagTechnology {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TagTechnology(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.TagTechnology wrap(android.nfc.tech.TagTechnology real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.TagTechnology(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.TagTechnology getReal() {
        return (android.nfc.tech.TagTechnology) real;
    }

    public android.nfc.tech.TagTechnology unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.TagTechnology) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.TagTechnology) real).connect();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.TagTechnology) real).getTag());
    }

    public boolean isConnected() {
        return ((android.nfc.tech.TagTechnology) real).isConnected();
    }

}
