// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class RecoverySystem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecoverySystem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.RecoverySystem wrap(android.os.RecoverySystem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.RecoverySystem(real, (__DcgwBridgeToken) null);
    }

    public android.os.RecoverySystem getReal() {
        return (android.os.RecoverySystem) real;
    }

    public android.os.RecoverySystem unwrap() {
        return getReal();
    }

    public static void installPackage(com.micklab.dcg.wrapper.android.content.Context arg0, java.io.File arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RecoverySystem#installPackage(android.content.Context,java.io.File)");
    }

    public static void rebootWipeCache(com.micklab.dcg.wrapper.android.content.Context arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RecoverySystem#rebootWipeCache(android.content.Context)");
    }

    public static void rebootWipeUserData(com.micklab.dcg.wrapper.android.content.Context arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RecoverySystem#rebootWipeUserData(android.content.Context)");
    }

    public static void verifyPackage(java.io.File arg0, com.micklab.dcg.wrapper.android.os.RecoverySystem.ProgressListener arg1, java.io.File arg2) throws java.security.GeneralSecurityException, java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RecoverySystem#verifyPackage(java.io.File,android.os.RecoverySystem$ProgressListener,java.io.File)");
    }

    public static final class ProgressListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProgressListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.RecoverySystem.ProgressListener wrap(android.os.RecoverySystem.ProgressListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.RecoverySystem.ProgressListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.RecoverySystem.ProgressListener getReal() {
            return (android.os.RecoverySystem.ProgressListener) real;
        }

        public android.os.RecoverySystem.ProgressListener unwrap() {
            return getReal();
        }

        public void onProgress(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RecoverySystem$ProgressListener#onProgress(int)");
        }

    }
}
