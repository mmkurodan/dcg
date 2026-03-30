// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Conferenceable {
    private final android.telecom.Conferenceable real;

    public Conferenceable(android.telecom.Conferenceable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conferenceable wrap(android.telecom.Conferenceable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Conferenceable(real);
    }

    public android.telecom.Conferenceable unwrap() {
        return real;
    }

}
