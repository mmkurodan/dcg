// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class AsyncTask {
    private final android.os.AsyncTask real;

    public AsyncTask(android.os.AsyncTask real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.AsyncTask wrap(android.os.AsyncTask real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.AsyncTask(real);
    }

    public android.os.AsyncTask unwrap() {
        return real;
    }

    public boolean cancel(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#cancel(boolean)");
    }

    public static void execute(java.lang.Runnable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#execute(java.lang.Runnable)");
    }

    public java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#get()");
    }

    public java.lang.Object get(long arg0, java.util.concurrent.TimeUnit arg1) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#get(long,java.util.concurrent.TimeUnit)");
    }

    public com.micklab.dcg.wrapper.android.os.AsyncTask.Status getStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#getStatus()");
    }

    public boolean isCancelled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask#isCancelled()");
    }


    public static final class Status {
        private final android.os.AsyncTask.Status real;

        public Status(android.os.AsyncTask.Status real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.AsyncTask.Status wrap(android.os.AsyncTask.Status real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.AsyncTask.Status(real);
        }

        public android.os.AsyncTask.Status unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.os.AsyncTask.Status valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask$Status#valueOf(java.lang.String)");
        }

        public static android.os.AsyncTask.Status[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.AsyncTask$Status#values()");
        }


    }
}
