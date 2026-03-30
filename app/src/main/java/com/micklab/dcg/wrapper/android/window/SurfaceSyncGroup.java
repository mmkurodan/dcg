// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SurfaceSyncGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceSyncGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SurfaceSyncGroup wrap(android.window.SurfaceSyncGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SurfaceSyncGroup(real, (__DcgwBridgeToken) null);
    }

    public android.window.SurfaceSyncGroup getReal() {
        return (android.window.SurfaceSyncGroup) real;
    }

    public android.window.SurfaceSyncGroup unwrap() {
        return getReal();
    }

    public SurfaceSyncGroup(java.lang.String arg0) {
        this(new android.window.SurfaceSyncGroup(arg0), (__DcgwBridgeToken) null);
    }

    public boolean add(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0, java.lang.Runnable arg1) {
        return ((android.window.SurfaceSyncGroup) real).add(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean add(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl arg0, java.lang.Runnable arg1) {
        return ((android.window.SurfaceSyncGroup) real).add(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addTransaction(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        ((android.window.SurfaceSyncGroup) real).addTransaction(arg0 == null ? null : arg0.getReal());
    }

    public void markSyncReady() {
        ((android.window.SurfaceSyncGroup) real).markSyncReady();
    }

}
