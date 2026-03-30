// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LocalActivityManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalActivityManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LocalActivityManager wrap(android.app.LocalActivityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LocalActivityManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.LocalActivityManager getReal() {
        return (android.app.LocalActivityManager) real;
    }

    public android.app.LocalActivityManager unwrap() {
        return getReal();
    }

    public LocalActivityManager(com.micklab.dcg.wrapper.android.app.Activity arg0, boolean arg1) {
        this(new android.app.LocalActivityManager(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.Window destroyActivity(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.app.LocalActivityManager) real).destroyActivity(arg0, arg1));
    }

    public void dispatchCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.LocalActivityManager) real).dispatchCreate(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDestroy(boolean arg0) {
        ((android.app.LocalActivityManager) real).dispatchDestroy(arg0);
    }

    public void dispatchPause(boolean arg0) {
        ((android.app.LocalActivityManager) real).dispatchPause(arg0);
    }

    public void dispatchResume() {
        ((android.app.LocalActivityManager) real).dispatchResume();
    }

    public void dispatchStop() {
        ((android.app.LocalActivityManager) real).dispatchStop();
    }

    public com.micklab.dcg.wrapper.android.app.Activity getActivity(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.LocalActivityManager) real).getActivity(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.Activity getCurrentActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.LocalActivityManager) real).getCurrentActivity());
    }

    public java.lang.String getCurrentId() {
        return ((android.app.LocalActivityManager) real).getCurrentId();
    }

    public void removeAllActivities() {
        ((android.app.LocalActivityManager) real).removeAllActivities();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle saveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.LocalActivityManager) real).saveInstanceState());
    }

    public com.micklab.dcg.wrapper.android.view.Window startActivity(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.app.LocalActivityManager) real).startActivity(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
