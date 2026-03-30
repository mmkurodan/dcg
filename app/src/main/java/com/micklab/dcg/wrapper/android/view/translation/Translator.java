// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class Translator {
    private final android.view.translation.Translator real;

    public Translator(android.view.translation.Translator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.Translator wrap(android.view.translation.Translator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.Translator(real);
    }

    public android.view.translation.Translator unwrap() {
        return real;
    }

    public void destroy() {
        real.destroy();
    }

    public boolean isDestroyed() {
        return real.isDestroyed();
    }

}
