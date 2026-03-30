// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class FreezePeriod {
    private final android.app.admin.FreezePeriod real;

    public FreezePeriod(android.app.admin.FreezePeriod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.FreezePeriod wrap(android.app.admin.FreezePeriod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FreezePeriod(real);
    }

    public android.app.admin.FreezePeriod unwrap() {
        return real;
    }

    public FreezePeriod(java.time.MonthDay arg0, java.time.MonthDay arg1) {
        this(new android.app.admin.FreezePeriod(arg0, arg1));
    }

    public java.time.MonthDay getEnd() {
        return real.getEnd();
    }

    public java.time.MonthDay getStart() {
        return real.getStart();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
