// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ConditionVariable {
    private final android.os.ConditionVariable real;

    public ConditionVariable(android.os.ConditionVariable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ConditionVariable wrap(android.os.ConditionVariable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ConditionVariable(real);
    }

    public android.os.ConditionVariable unwrap() {
        return real;
    }

    public ConditionVariable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#android.os.ConditionVariable()");
    }

    public ConditionVariable(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#android.os.ConditionVariable(boolean)");
    }

    public void block() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#block()");
    }

    public boolean block(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#block(long)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#close()");
    }

    public void open() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ConditionVariable#open()");
    }

}
