// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatabase {
    private final android.database.sqlite.SQLiteDatabase real;

    public SQLiteDatabase(android.database.sqlite.SQLiteDatabase real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase wrap(android.database.sqlite.SQLiteDatabase real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase(real);
    }

    public android.database.sqlite.SQLiteDatabase unwrap() {
        return real;
    }

    public void beginTransaction() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransaction()");
    }

    public void beginTransactionNonExclusive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransactionNonExclusive()");
    }

    public void beginTransactionReadOnly() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransactionReadOnly()");
    }

    public void beginTransactionWithListener(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener)");
    }

    public void beginTransactionWithListenerNonExclusive(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener)");
    }

    public void beginTransactionWithListenerReadOnly(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#beginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener)");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteStatement compileStatement(java.lang.String arg0) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#compileStatement(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase create(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#create(android.database.sqlite.SQLiteDatabase$CursorFactory)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase createInMemory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#createInMemory(android.database.sqlite.SQLiteDatabase$OpenParams)");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteRawStatement createRawStatement(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#createRawStatement(java.lang.String)");
    }

    public int delete(java.lang.String arg0, java.lang.String arg1, java.lang.String[] arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#delete(java.lang.String,java.lang.String,[Ljava.lang.String;)");
    }

    public static boolean deleteDatabase(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#deleteDatabase(java.io.File)");
    }

    public void disableWriteAheadLogging() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#disableWriteAheadLogging()");
    }

    public boolean enableWriteAheadLogging() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#enableWriteAheadLogging()");
    }

    public void endTransaction() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#endTransaction()");
    }

    public void execPerConnectionSQL(java.lang.String arg0, java.lang.Object[] arg1) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#execPerConnectionSQL(java.lang.String,[Ljava.lang.Object;)");
    }

    public void execSQL(java.lang.String arg0) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#execSQL(java.lang.String)");
    }

    public void execSQL(java.lang.String arg0, java.lang.Object[] arg1) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#execSQL(java.lang.String,[Ljava.lang.Object;)");
    }

    public static java.lang.String findEditTable(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#findEditTable(java.lang.String)");
    }

    public long getLastChangedRowCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getLastChangedRowCount()");
    }

    public long getLastInsertRowId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getLastInsertRowId()");
    }

    public long getMaximumSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getMaximumSize()");
    }

    public long getPageSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getPageSize()");
    }

    public java.lang.String getPath() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getPath()");
    }

    public long getTotalChangedRowCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getTotalChangedRowCount()");
    }

    public int getVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#getVersion()");
    }

    public boolean inTransaction() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#inTransaction()");
    }

    public long insert(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ContentValues arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#insert(java.lang.String,java.lang.String,android.content.ContentValues)");
    }

    public long insertOrThrow(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ContentValues arg2) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#insertOrThrow(java.lang.String,java.lang.String,android.content.ContentValues)");
    }

    public long insertWithOnConflict(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ContentValues arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#insertWithOnConflict(java.lang.String,java.lang.String,android.content.ContentValues,int)");
    }

    public boolean isDatabaseIntegrityOk() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isDatabaseIntegrityOk()");
    }

    public boolean isDbLockedByCurrentThread() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isDbLockedByCurrentThread()");
    }

    public boolean isDbLockedByOtherThreads() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isDbLockedByOtherThreads()");
    }

    public boolean isOpen() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isOpen()");
    }

    public boolean isReadOnly() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isReadOnly()");
    }

    public boolean isWriteAheadLoggingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#isWriteAheadLoggingEnabled()");
    }

    public void markTableSyncable(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#markTableSyncable(java.lang.String,java.lang.String)");
    }

    public void markTableSyncable(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#markTableSyncable(java.lang.String,java.lang.String,java.lang.String)");
    }

    public boolean needUpgrade(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#needUpgrade(int)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openDatabase(java.io.File arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openDatabase(java.io.File,android.database.sqlite.SQLiteDatabase$OpenParams)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openDatabase(java.lang.String,android.database.sqlite.SQLiteDatabase$CursorFactory,int)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg1, int arg2, com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openDatabase(java.lang.String,android.database.sqlite.SQLiteDatabase$CursorFactory,int,android.database.DatabaseErrorHandler)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openOrCreateDatabase(java.lang.String,android.database.sqlite.SQLiteDatabase$CursorFactory)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.io.File arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openOrCreateDatabase(java.io.File,android.database.sqlite.SQLiteDatabase$CursorFactory)");
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg1, com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#openOrCreateDatabase(java.lang.String,android.database.sqlite.SQLiteDatabase$CursorFactory,android.database.DatabaseErrorHandler)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(java.lang.String arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#query(java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(java.lang.String arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#query(java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(boolean arg0, java.lang.String arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String[] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#query(boolean,java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(boolean arg0, java.lang.String arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String[] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, com.micklab.dcg.wrapper.android.os.CancellationSignal arg9) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#query(boolean,java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryWithFactory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0, boolean arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String[] arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#queryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory,boolean,java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryWithFactory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0, boolean arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String[] arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, com.micklab.dcg.wrapper.android.os.CancellationSignal arg10) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#queryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory,boolean,java.lang.String,[Ljava.lang.String;,java.lang.String,[Ljava.lang.String;,java.lang.String,java.lang.String,java.lang.String,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor rawQuery(java.lang.String arg0, java.lang.String[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#rawQuery(java.lang.String,[Ljava.lang.String;)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor rawQuery(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#rawQuery(java.lang.String,[Ljava.lang.String;,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor rawQueryWithFactory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0, java.lang.String arg1, java.lang.String[] arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#rawQueryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory,java.lang.String,[Ljava.lang.String;,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor rawQueryWithFactory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0, java.lang.String arg1, java.lang.String[] arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.CancellationSignal arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#rawQueryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory,java.lang.String,[Ljava.lang.String;,java.lang.String,android.os.CancellationSignal)");
    }

    public static int releaseMemory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#releaseMemory()");
    }

    public long replace(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ContentValues arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#replace(java.lang.String,java.lang.String,android.content.ContentValues)");
    }

    public long replaceOrThrow(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ContentValues arg2) throws android.database.SQLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#replaceOrThrow(java.lang.String,java.lang.String,android.content.ContentValues)");
    }

    public void setForeignKeyConstraintsEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setForeignKeyConstraintsEnabled(boolean)");
    }

    public void setLocale(java.util.Locale arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setLocale(java.util.Locale)");
    }

    public void setLockingEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setLockingEnabled(boolean)");
    }

    public void setMaxSqlCacheSize(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setMaxSqlCacheSize(int)");
    }

    public long setMaximumSize(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setMaximumSize(long)");
    }

    public void setPageSize(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setPageSize(long)");
    }

    public void setTransactionSuccessful() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setTransactionSuccessful()");
    }

    public void setVersion(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#setVersion(int)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#toString()");
    }

    public int update(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#update(java.lang.String,android.content.ContentValues,java.lang.String,[Ljava.lang.String;)");
    }

    public int updateWithOnConflict(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3, int arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#updateWithOnConflict(java.lang.String,android.content.ContentValues,java.lang.String,[Ljava.lang.String;,int)");
    }

    public void validateSql(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#validateSql(java.lang.String,android.os.CancellationSignal)");
    }

    public boolean yieldIfContended() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#yieldIfContended()");
    }

    public boolean yieldIfContendedSafely() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#yieldIfContendedSafely()");
    }

    public boolean yieldIfContendedSafely(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase#yieldIfContendedSafely(long)");
    }


    public static final class CursorFactory {
        private final android.database.sqlite.SQLiteDatabase.CursorFactory real;

        public CursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory wrap(android.database.sqlite.SQLiteDatabase.CursorFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory(real);
        }

        public android.database.sqlite.SQLiteDatabase.CursorFactory unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.database.Cursor newCursor(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$CursorFactory#newCursor(android.database.sqlite.SQLiteDatabase,android.database.sqlite.SQLiteCursorDriver,java.lang.String,android.database.sqlite.SQLiteQuery)");
        }

    }
    public static final class OpenParams {
        private final android.database.sqlite.SQLiteDatabase.OpenParams real;

        public OpenParams(android.database.sqlite.SQLiteDatabase.OpenParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams wrap(android.database.sqlite.SQLiteDatabase.OpenParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams(real);
        }

        public android.database.sqlite.SQLiteDatabase.OpenParams unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory getCursorFactory() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getCursorFactory()");
        }

        public com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler getErrorHandler() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getErrorHandler()");
        }

        public long getIdleConnectionTimeout() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getIdleConnectionTimeout()");
        }

        public java.lang.String getJournalMode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getJournalMode()");
        }

        public int getLookasideSlotCount() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getLookasideSlotCount()");
        }

        public int getLookasideSlotSize() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getLookasideSlotSize()");
        }

        public int getOpenFlags() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getOpenFlags()");
        }

        public java.lang.String getSynchronousMode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams#getSynchronousMode()");
        }

        public static final class Builder {
            private final android.database.sqlite.SQLiteDatabase.OpenParams.Builder real;

            public Builder(android.database.sqlite.SQLiteDatabase.OpenParams.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder wrap(android.database.sqlite.SQLiteDatabase.OpenParams.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder(real);
            }

            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder unwrap() {
                return real;
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#android.database.sqlite.SQLiteDatabase$OpenParams$Builder()");
            }

            public Builder(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#android.database.sqlite.SQLiteDatabase$OpenParams$Builder(android.database.sqlite.SQLiteDatabase$OpenParams)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder addOpenFlags(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#addOpenFlags(int)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder removeOpenFlags(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#removeOpenFlags(int)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setCursorFactory(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setCursorFactory(android.database.sqlite.SQLiteDatabase$CursorFactory)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setErrorHandler(com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setErrorHandler(android.database.DatabaseErrorHandler)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setIdleConnectionTimeout(long arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setIdleConnectionTimeout(long)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setJournalMode(java.lang.String arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setJournalMode(java.lang.String)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setLookasideConfig(int arg0, int arg1) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setLookasideConfig(int,int)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setOpenFlags(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setOpenFlags(int)");
            }

            public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams.Builder setSynchronousMode(java.lang.String arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabase$OpenParams$Builder#setSynchronousMode(java.lang.String)");
            }

        }
    }
}
