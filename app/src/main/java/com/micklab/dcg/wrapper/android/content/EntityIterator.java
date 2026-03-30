// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class EntityIterator {
    private final android.content.EntityIterator real;

    public EntityIterator(android.content.EntityIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.EntityIterator wrap(android.content.EntityIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.EntityIterator(real);
    }

    public android.content.EntityIterator unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public void reset() {
        real.reset();
    }

}
