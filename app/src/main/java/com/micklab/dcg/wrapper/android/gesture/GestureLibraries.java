// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureLibraries {
    private final android.gesture.GestureLibraries real;

    public GestureLibraries(android.gesture.GestureLibraries real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibraries wrap(android.gesture.GestureLibraries real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureLibraries(real);
    }

    public android.gesture.GestureLibraries unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary fromFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.gesture.GestureLibraries#fromFile(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary fromFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.gesture.GestureLibraries#fromFile(java.io.File)");
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary fromFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.gesture.GestureLibraries#fromFileDescriptor(android.os.ParcelFileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary fromPrivateFile(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.gesture.GestureLibraries#fromPrivateFile(android.content.Context,java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary fromRawResource(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.gesture.GestureLibrary.wrap(android.gesture.GestureLibraries.fromRawResource(arg0 == null ? null : arg0.unwrap(), arg1));
    }

}
