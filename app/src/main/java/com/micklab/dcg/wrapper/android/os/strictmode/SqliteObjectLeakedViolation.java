// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class SqliteObjectLeakedViolation {
    private final android.os.strictmode.SqliteObjectLeakedViolation real;

    public SqliteObjectLeakedViolation(android.os.strictmode.SqliteObjectLeakedViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.SqliteObjectLeakedViolation wrap(android.os.strictmode.SqliteObjectLeakedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.SqliteObjectLeakedViolation(real);
    }

    public android.os.strictmode.SqliteObjectLeakedViolation unwrap() {
        return real;
    }

}
