// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Process {
    private final android.os.Process real;

    public Process(android.os.Process real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Process wrap(android.os.Process real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Process(real);
    }

    public android.os.Process unwrap() {
        return real;
    }

    public Process() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#android.os.Process()");
    }

    public static int getAppUidForSdkSandboxUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getAppUidForSdkSandboxUid(int)");
    }

    public static long getElapsedCpuTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getElapsedCpuTime()");
    }

    public static int[] getExclusiveCores() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getExclusiveCores()");
    }

    public static int getGidForName(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getGidForName(java.lang.String)");
    }

    public static int getSdkSandboxUidForAppUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getSdkSandboxUidForAppUid(int)");
    }

    public static long getStartElapsedRealtime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getStartElapsedRealtime()");
    }

    public static long getStartRequestedElapsedRealtime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getStartRequestedElapsedRealtime()");
    }

    public static long getStartRequestedUptimeMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getStartRequestedUptimeMillis()");
    }

    public static long getStartUptimeMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getStartUptimeMillis()");
    }

    public static int getThreadPriority(int arg0) throws java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getThreadPriority(int)");
    }

    public static int getUidForName(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#getUidForName(java.lang.String)");
    }

    public static boolean is64Bit() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#is64Bit()");
    }

    public static boolean isApplicationUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#isApplicationUid(int)");
    }

    public static boolean isIsolated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#isIsolated()");
    }

    public static boolean isIsolatedUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#isIsolatedUid(int)");
    }

    public static boolean isSdkSandbox() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#isSdkSandbox()");
    }

    public static boolean isSdkSandboxUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#isSdkSandboxUid(int)");
    }

    public static void killProcess(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#killProcess(int)");
    }

    public static int myPid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#myPid()");
    }

    public static java.lang.String myProcessName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#myProcessName()");
    }

    public static int myTid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#myTid()");
    }

    public static int myUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#myUid()");
    }

    public static com.micklab.dcg.wrapper.android.os.UserHandle myUserHandle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#myUserHandle()");
    }

    public static void sendSignal(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#sendSignal(int,int)");
    }

    public static void setThreadPriority(int arg0) throws java.lang.IllegalArgumentException, java.lang.SecurityException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#setThreadPriority(int)");
    }

    public static void setThreadPriority(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.SecurityException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#setThreadPriority(int,int)");
    }

    public static boolean supportsProcesses() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Process#supportsProcesses()");
    }


}
