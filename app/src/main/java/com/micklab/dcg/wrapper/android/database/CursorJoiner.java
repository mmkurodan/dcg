// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CursorJoiner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorJoiner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CursorJoiner wrap(android.database.CursorJoiner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorJoiner(real, (__DcgwBridgeToken) null);
    }

    public android.database.CursorJoiner getReal() {
        return (android.database.CursorJoiner) real;
    }

    public android.database.CursorJoiner unwrap() {
        return getReal();
    }

    public CursorJoiner(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2, java.lang.String[] arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner#android.database.CursorJoiner(android.database.Cursor,[Ljava.lang.String;,android.database.Cursor,[Ljava.lang.String;)");
    }

    public boolean hasNext() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner#hasNext()");
    }

    public com.micklab.dcg.wrapper.android.database.CursorJoiner.Result next() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner#next()");
    }

    public void remove() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner#remove()");
    }

    public static final class Result {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Result(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.database.CursorJoiner.Result wrap(android.database.CursorJoiner.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorJoiner.Result(real, (__DcgwBridgeToken) null);
        }

        public android.database.CursorJoiner.Result getReal() {
            return (android.database.CursorJoiner.Result) real;
        }

        public android.database.CursorJoiner.Result unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.database.CursorJoiner.Result valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner$Result#valueOf(java.lang.String)");
        }

        public static android.database.CursorJoiner.Result[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner$Result#values()");
        }


    }
}
