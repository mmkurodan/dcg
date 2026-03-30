// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SurfaceSyncGroup {
    private final android.window.SurfaceSyncGroup real;

    public SurfaceSyncGroup(android.window.SurfaceSyncGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SurfaceSyncGroup wrap(android.window.SurfaceSyncGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SurfaceSyncGroup(real);
    }

    public android.window.SurfaceSyncGroup unwrap() {
        return real;
    }

    public SurfaceSyncGroup(java.lang.String arg0) {
        this(new android.window.SurfaceSyncGroup(arg0));
    }

    public boolean add(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0, java.lang.Runnable arg1) {
        return real.add(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean add(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl arg0, java.lang.Runnable arg1) {
        return real.add(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addTransaction(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        real.addTransaction(arg0 == null ? null : arg0.unwrap());
    }

    public void markSyncReady() {
        real.markSyncReady();
    }

}
