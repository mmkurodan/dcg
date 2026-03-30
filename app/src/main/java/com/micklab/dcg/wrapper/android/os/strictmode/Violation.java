// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class Violation {
    private final android.os.strictmode.Violation real;

    public Violation(android.os.strictmode.Violation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.Violation wrap(android.os.strictmode.Violation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.Violation(real);
    }

    public android.os.strictmode.Violation unwrap() {
        return real;
    }

    public java.lang.Throwable fillInStackTrace() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.Violation#fillInStackTrace()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.Violation#hashCode()");
    }

    public java.lang.Throwable initCause(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.Violation#initCause(java.lang.Throwable)");
    }

    public void setStackTrace(java.lang.StackTraceElement[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.Violation#setStackTrace([Ljava.lang.StackTraceElement;)");
    }

}
