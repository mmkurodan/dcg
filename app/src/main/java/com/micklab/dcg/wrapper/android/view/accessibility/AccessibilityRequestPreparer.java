// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityRequestPreparer {
    private final android.view.accessibility.AccessibilityRequestPreparer real;

    public AccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer wrap(android.view.accessibility.AccessibilityRequestPreparer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer(real);
    }

    public android.view.accessibility.AccessibilityRequestPreparer unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView());
    }

    public void onPrepareExtraData(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.Message arg3) {
        real.onPrepareExtraData(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public static final int REQUEST_TYPE_EXTRA_DATA = android.view.accessibility.AccessibilityRequestPreparer.REQUEST_TYPE_EXTRA_DATA;

}
