// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class MessageQueue {
    private final android.os.MessageQueue real;

    public MessageQueue(android.os.MessageQueue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.MessageQueue wrap(android.os.MessageQueue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.MessageQueue(real);
    }

    public android.os.MessageQueue unwrap() {
        return real;
    }

    public void addIdleHandler(com.micklab.dcg.wrapper.android.os.MessageQueue.IdleHandler arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue#addIdleHandler(android.os.MessageQueue$IdleHandler)");
    }

    public void addOnFileDescriptorEventListener(java.io.FileDescriptor arg0, int arg1, com.micklab.dcg.wrapper.android.os.MessageQueue.OnFileDescriptorEventListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue#addOnFileDescriptorEventListener(java.io.FileDescriptor,int,android.os.MessageQueue$OnFileDescriptorEventListener)");
    }

    public boolean isIdle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue#isIdle()");
    }

    public void removeIdleHandler(com.micklab.dcg.wrapper.android.os.MessageQueue.IdleHandler arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue#removeIdleHandler(android.os.MessageQueue$IdleHandler)");
    }

    public void removeOnFileDescriptorEventListener(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue#removeOnFileDescriptorEventListener(java.io.FileDescriptor)");
    }

    public static final class IdleHandler {
        private final android.os.MessageQueue.IdleHandler real;

        public IdleHandler(android.os.MessageQueue.IdleHandler real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.MessageQueue.IdleHandler wrap(android.os.MessageQueue.IdleHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.MessageQueue.IdleHandler(real);
        }

        public android.os.MessageQueue.IdleHandler unwrap() {
            return real;
        }

        public boolean queueIdle() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue$IdleHandler#queueIdle()");
        }

    }
    public static final class OnFileDescriptorEventListener {
        private final android.os.MessageQueue.OnFileDescriptorEventListener real;

        public OnFileDescriptorEventListener(android.os.MessageQueue.OnFileDescriptorEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.MessageQueue.OnFileDescriptorEventListener wrap(android.os.MessageQueue.OnFileDescriptorEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.MessageQueue.OnFileDescriptorEventListener(real);
        }

        public android.os.MessageQueue.OnFileDescriptorEventListener unwrap() {
            return real;
        }

        public int onFileDescriptorEvents(java.io.FileDescriptor arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MessageQueue$OnFileDescriptorEventListener#onFileDescriptorEvents(java.io.FileDescriptor,int)");
        }


    }
}
