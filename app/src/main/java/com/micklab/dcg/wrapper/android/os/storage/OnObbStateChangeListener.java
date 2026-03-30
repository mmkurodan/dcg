// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.storage;

public final class OnObbStateChangeListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnObbStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener wrap(android.os.storage.OnObbStateChangeListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener(real, (__DcgwBridgeToken) null);
    }

    public android.os.storage.OnObbStateChangeListener getReal() {
        return (android.os.storage.OnObbStateChangeListener) real;
    }

    public android.os.storage.OnObbStateChangeListener unwrap() {
        return getReal();
    }

    public void onObbStateChange(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.OnObbStateChangeListener#onObbStateChange(java.lang.String,int)");
    }


}
