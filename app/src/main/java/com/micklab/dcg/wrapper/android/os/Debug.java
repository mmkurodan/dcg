// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Debug {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Debug(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Debug wrap(android.os.Debug real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Debug(real, (__DcgwBridgeToken) null);
    }

    public android.os.Debug getReal() {
        return (android.os.Debug) real;
    }

    public android.os.Debug unwrap() {
        return getReal();
    }

    public static void attachJvmtiAgent(java.lang.String arg0, java.lang.String arg1, java.lang.ClassLoader arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#attachJvmtiAgent(java.lang.String,java.lang.String,java.lang.ClassLoader)");
    }

    public static void changeDebugPort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#changeDebugPort(int)");
    }

    public static void dumpHprofData(java.lang.String arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#dumpHprofData(java.lang.String)");
    }

    public static boolean dumpService(java.lang.String arg0, java.io.FileDescriptor arg1, java.lang.String[] arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#dumpService(java.lang.String,java.io.FileDescriptor,[Ljava.lang.String;)");
    }

    public static void enableEmulatorTraceOutput() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#enableEmulatorTraceOutput()");
    }

    public static int getBinderDeathObjectCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getBinderDeathObjectCount()");
    }

    public static int getBinderLocalObjectCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getBinderLocalObjectCount()");
    }

    public static int getBinderProxyObjectCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getBinderProxyObjectCount()");
    }

    public static int getBinderReceivedTransactions() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getBinderReceivedTransactions()");
    }

    public static int getBinderSentTransactions() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getBinderSentTransactions()");
    }

    public static int getGlobalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalAllocCount()");
    }

    public static int getGlobalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalAllocSize()");
    }

    public static int getGlobalClassInitCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalClassInitCount()");
    }

    public static int getGlobalClassInitTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalClassInitTime()");
    }

    public static int getGlobalExternalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalExternalAllocCount()");
    }

    public static int getGlobalExternalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalExternalAllocSize()");
    }

    public static int getGlobalExternalFreedCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalExternalFreedCount()");
    }

    public static int getGlobalExternalFreedSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalExternalFreedSize()");
    }

    public static int getGlobalFreedCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalFreedCount()");
    }

    public static int getGlobalFreedSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalFreedSize()");
    }

    public static int getGlobalGcInvocationCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getGlobalGcInvocationCount()");
    }

    public static int getLoadedClassCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getLoadedClassCount()");
    }

    public static void getMemoryInfo(com.micklab.dcg.wrapper.android.os.Debug.MemoryInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getMemoryInfo(android.os.Debug$MemoryInfo)");
    }

    public static long getNativeHeapAllocatedSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getNativeHeapAllocatedSize()");
    }

    public static long getNativeHeapFreeSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getNativeHeapFreeSize()");
    }

    public static long getNativeHeapSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getNativeHeapSize()");
    }

    public static long getPss() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getPss()");
    }

    public static long getRss() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getRss()");
    }

    public static java.lang.String getRuntimeStat(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getRuntimeStat(java.lang.String)");
    }

    public static int getThreadAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getThreadAllocCount()");
    }

    public static int getThreadAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getThreadAllocSize()");
    }

    public static int getThreadExternalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getThreadExternalAllocCount()");
    }

    public static int getThreadExternalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getThreadExternalAllocSize()");
    }

    public static int getThreadGcInvocationCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#getThreadGcInvocationCount()");
    }

    public static boolean isDebuggerConnected() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#isDebuggerConnected()");
    }

    public static void printLoadedClasses(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#printLoadedClasses(int)");
    }

    public static void resetAllCounts() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetAllCounts()");
    }

    public static void resetGlobalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalAllocCount()");
    }

    public static void resetGlobalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalAllocSize()");
    }

    public static void resetGlobalClassInitCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalClassInitCount()");
    }

    public static void resetGlobalClassInitTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalClassInitTime()");
    }

    public static void resetGlobalExternalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalExternalAllocCount()");
    }

    public static void resetGlobalExternalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalExternalAllocSize()");
    }

    public static void resetGlobalExternalFreedCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalExternalFreedCount()");
    }

    public static void resetGlobalExternalFreedSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalExternalFreedSize()");
    }

    public static void resetGlobalFreedCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalFreedCount()");
    }

    public static void resetGlobalFreedSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalFreedSize()");
    }

    public static void resetGlobalGcInvocationCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetGlobalGcInvocationCount()");
    }

    public static void resetThreadAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetThreadAllocCount()");
    }

    public static void resetThreadAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetThreadAllocSize()");
    }

    public static void resetThreadExternalAllocCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetThreadExternalAllocCount()");
    }

    public static void resetThreadExternalAllocSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetThreadExternalAllocSize()");
    }

    public static void resetThreadGcInvocationCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#resetThreadGcInvocationCount()");
    }

    public static int setAllocationLimit(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#setAllocationLimit(int)");
    }

    public static int setGlobalAllocationLimit(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#setGlobalAllocationLimit(int)");
    }

    public static void startAllocCounting() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startAllocCounting()");
    }

    public static void startMethodTracing() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startMethodTracing()");
    }

    public static void startMethodTracing(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startMethodTracing(java.lang.String)");
    }

    public static void startMethodTracing(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startMethodTracing(java.lang.String,int)");
    }

    public static void startMethodTracing(java.lang.String arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startMethodTracing(java.lang.String,int,int)");
    }

    public static void startMethodTracingSampling(java.lang.String arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startMethodTracingSampling(java.lang.String,int,int)");
    }

    public static void startNativeTracing() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#startNativeTracing()");
    }

    public static void stopAllocCounting() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#stopAllocCounting()");
    }

    public static void stopMethodTracing() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#stopMethodTracing()");
    }

    public static void stopNativeTracing() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#stopNativeTracing()");
    }

    public static long threadCpuTimeNanos() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#threadCpuTimeNanos()");
    }

    public static void waitForDebugger() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#waitForDebugger()");
    }

    public static boolean waitingForDebugger() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug#waitingForDebugger()");
    }


    public static final class InstructionCount {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InstructionCount(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Debug.InstructionCount wrap(android.os.Debug.InstructionCount real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Debug.InstructionCount(real, (__DcgwBridgeToken) null);
        }

        public android.os.Debug.InstructionCount getReal() {
            return (android.os.Debug.InstructionCount) real;
        }

        public android.os.Debug.InstructionCount unwrap() {
            return getReal();
        }

        public InstructionCount() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$InstructionCount#android.os.Debug$InstructionCount()");
        }

        public boolean collect() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$InstructionCount#collect()");
        }

        public int globalMethodInvocations() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$InstructionCount#globalMethodInvocations()");
        }

        public int globalTotal() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$InstructionCount#globalTotal()");
        }

        public boolean resetAndStart() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$InstructionCount#resetAndStart()");
        }

    }
    public static final class MemoryInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MemoryInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Debug.MemoryInfo wrap(android.os.Debug.MemoryInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Debug.MemoryInfo(real, (__DcgwBridgeToken) null);
        }

        public android.os.Debug.MemoryInfo getReal() {
            return (android.os.Debug.MemoryInfo) real;
        }

        public android.os.Debug.MemoryInfo unwrap() {
            return getReal();
        }

        public MemoryInfo() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#android.os.Debug$MemoryInfo()");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#describeContents()");
        }

        public java.lang.String getMemoryStat(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getMemoryStat(java.lang.String)");
        }

        public int getTotalPrivateClean() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalPrivateClean()");
        }

        public int getTotalPrivateDirty() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalPrivateDirty()");
        }

        public int getTotalPss() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalPss()");
        }

        public int getTotalSharedClean() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalSharedClean()");
        }

        public int getTotalSharedDirty() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalSharedDirty()");
        }

        public int getTotalSwappablePss() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#getTotalSwappablePss()");
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#readFromParcel(android.os.Parcel)");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Debug$MemoryInfo#writeToParcel(android.os.Parcel,int)");
        }


    }
}
