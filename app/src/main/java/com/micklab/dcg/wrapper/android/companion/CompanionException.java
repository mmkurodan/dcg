// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class CompanionException {
    private final android.companion.CompanionException real;

    public CompanionException(android.companion.CompanionException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.CompanionException wrap(android.companion.CompanionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionException(real);
    }

    public android.companion.CompanionException unwrap() {
        return real;
    }

}
