// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ConditionVariable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConditionVariable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ConditionVariable wrap(android.os.ConditionVariable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ConditionVariable(real, (__DcgwBridgeToken) null);
    }

    public android.os.ConditionVariable getReal() {
        return (android.os.ConditionVariable) real;
    }

    public android.os.ConditionVariable unwrap() {
        return getReal();
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
