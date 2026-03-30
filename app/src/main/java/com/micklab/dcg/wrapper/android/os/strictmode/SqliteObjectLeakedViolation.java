// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class SqliteObjectLeakedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SqliteObjectLeakedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.SqliteObjectLeakedViolation wrap(android.os.strictmode.SqliteObjectLeakedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.SqliteObjectLeakedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.SqliteObjectLeakedViolation getReal() {
        return (android.os.strictmode.SqliteObjectLeakedViolation) real;
    }

    public android.os.strictmode.SqliteObjectLeakedViolation unwrap() {
        return getReal();
    }

}
