// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfoEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmInfoEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfoEvent wrap(android.drm.DrmInfoEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfoEvent(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmInfoEvent getReal() {
        return (android.drm.DrmInfoEvent) real;
    }

    public android.drm.DrmInfoEvent unwrap() {
        return getReal();
    }

    public DrmInfoEvent(int arg0, int arg1, java.lang.String arg2) {
        this(new android.drm.DrmInfoEvent(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public DrmInfoEvent(int arg0, int arg1, java.lang.String arg2, java.util.HashMap arg3) {
        this(new android.drm.DrmInfoEvent(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = android.drm.DrmInfoEvent.TYPE_ACCOUNT_ALREADY_REGISTERED;
    public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = android.drm.DrmInfoEvent.TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT;
    public static final int TYPE_REMOVE_RIGHTS = android.drm.DrmInfoEvent.TYPE_REMOVE_RIGHTS;
    public static final int TYPE_RIGHTS_INSTALLED = android.drm.DrmInfoEvent.TYPE_RIGHTS_INSTALLED;
    public static final int TYPE_RIGHTS_REMOVED = android.drm.DrmInfoEvent.TYPE_RIGHTS_REMOVED;
    public static final int TYPE_WAIT_FOR_RIGHTS = android.drm.DrmInfoEvent.TYPE_WAIT_FOR_RIGHTS;

}
