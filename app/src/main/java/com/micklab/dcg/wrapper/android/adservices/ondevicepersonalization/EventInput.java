// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventInput wrap(android.adservices.ondevicepersonalization.EventInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.EventInput getReal() {
        return (android.adservices.ondevicepersonalization.EventInput) real;
    }

    public android.adservices.ondevicepersonalization.EventInput unwrap() {
        return getReal();
    }

    public EventInput(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        this(new android.adservices.ondevicepersonalization.EventInput(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.EventInput) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getParameters() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.adservices.ondevicepersonalization.EventInput) real).getParameters());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(((android.adservices.ondevicepersonalization.EventInput) real).getRequestLogRecord());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.EventInput) real).hashCode();
    }

}
