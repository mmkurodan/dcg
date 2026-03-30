// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class FreezePeriod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FreezePeriod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.FreezePeriod wrap(android.app.admin.FreezePeriod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FreezePeriod(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.FreezePeriod getReal() {
        return (android.app.admin.FreezePeriod) real;
    }

    public android.app.admin.FreezePeriod unwrap() {
        return getReal();
    }

    public FreezePeriod(java.time.MonthDay arg0, java.time.MonthDay arg1) {
        this(new android.app.admin.FreezePeriod(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public java.time.MonthDay getEnd() {
        return ((android.app.admin.FreezePeriod) real).getEnd();
    }

    public java.time.MonthDay getStart() {
        return ((android.app.admin.FreezePeriod) real).getStart();
    }

    public java.lang.String toString() {
        return ((android.app.admin.FreezePeriod) real).toString();
    }

}
