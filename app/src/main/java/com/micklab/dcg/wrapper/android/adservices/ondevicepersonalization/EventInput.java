// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventInput {
    private final android.adservices.ondevicepersonalization.EventInput real;

    public EventInput(android.adservices.ondevicepersonalization.EventInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventInput wrap(android.adservices.ondevicepersonalization.EventInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventInput(real);
    }

    public android.adservices.ondevicepersonalization.EventInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getParameters() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getParameters());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(real.getRequestLogRecord());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
