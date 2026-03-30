// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CursorJoiner {
    private final android.database.CursorJoiner real;

    public CursorJoiner(android.database.CursorJoiner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CursorJoiner wrap(android.database.CursorJoiner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorJoiner(real);
    }

    public android.database.CursorJoiner unwrap() {
        return real;
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
        private final android.database.CursorJoiner.Result real;

        public Result(android.database.CursorJoiner.Result real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.database.CursorJoiner.Result wrap(android.database.CursorJoiner.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorJoiner.Result(real);
        }

        public android.database.CursorJoiner.Result unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.database.CursorJoiner.Result valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner$Result#valueOf(java.lang.String)");
        }

        public static android.database.CursorJoiner.Result[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorJoiner$Result#values()");
        }


    }
}
