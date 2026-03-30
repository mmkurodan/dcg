// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.storage;

public final class OnObbStateChangeListener {
    private final android.os.storage.OnObbStateChangeListener real;

    public OnObbStateChangeListener(android.os.storage.OnObbStateChangeListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener wrap(android.os.storage.OnObbStateChangeListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener(real);
    }

    public android.os.storage.OnObbStateChangeListener unwrap() {
        return real;
    }

    public void onObbStateChange(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.OnObbStateChangeListener#onObbStateChange(java.lang.String,int)");
    }


}
