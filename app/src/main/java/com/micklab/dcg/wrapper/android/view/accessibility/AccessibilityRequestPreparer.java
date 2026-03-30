// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityRequestPreparer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityRequestPreparer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer wrap(android.view.accessibility.AccessibilityRequestPreparer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityRequestPreparer getReal() {
        return (android.view.accessibility.AccessibilityRequestPreparer) real;
    }

    public android.view.accessibility.AccessibilityRequestPreparer unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.accessibility.AccessibilityRequestPreparer) real).getView());
    }

    public void onPrepareExtraData(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.Message arg3) {
        ((android.view.accessibility.AccessibilityRequestPreparer) real).onPrepareExtraData(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static final int REQUEST_TYPE_EXTRA_DATA = android.view.accessibility.AccessibilityRequestPreparer.REQUEST_TYPE_EXTRA_DATA;

}
