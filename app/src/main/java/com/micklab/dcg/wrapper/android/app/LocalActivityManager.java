// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LocalActivityManager {
    private final android.app.LocalActivityManager real;

    public LocalActivityManager(android.app.LocalActivityManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LocalActivityManager wrap(android.app.LocalActivityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LocalActivityManager(real);
    }

    public android.app.LocalActivityManager unwrap() {
        return real;
    }

    public LocalActivityManager(com.micklab.dcg.wrapper.android.app.Activity arg0, boolean arg1) {
        this(new android.app.LocalActivityManager(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.view.Window destroyActivity(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.destroyActivity(arg0, arg1));
    }

    public void dispatchCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.dispatchCreate(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchDestroy(boolean arg0) {
        real.dispatchDestroy(arg0);
    }

    public void dispatchPause(boolean arg0) {
        real.dispatchPause(arg0);
    }

    public void dispatchResume() {
        real.dispatchResume();
    }

    public void dispatchStop() {
        real.dispatchStop();
    }

    public com.micklab.dcg.wrapper.android.app.Activity getActivity(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getActivity(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.Activity getCurrentActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getCurrentActivity());
    }

    public java.lang.String getCurrentId() {
        return real.getCurrentId();
    }

    public void removeAllActivities() {
        real.removeAllActivities();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle saveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.saveInstanceState());
    }

    public com.micklab.dcg.wrapper.android.view.Window startActivity(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.startActivity(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
