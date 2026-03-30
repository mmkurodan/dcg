// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class TagTechnology {
    private final android.nfc.tech.TagTechnology real;

    public TagTechnology(android.nfc.tech.TagTechnology real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.TagTechnology wrap(android.nfc.tech.TagTechnology real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.TagTechnology(real);
    }

    public android.nfc.tech.TagTechnology unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public boolean isConnected() {
        return real.isConnected();
    }

}
