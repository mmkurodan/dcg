// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityNodeProvider {
    private final android.view.accessibility.AccessibilityNodeProvider real;

    public AccessibilityNodeProvider(android.view.accessibility.AccessibilityNodeProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider wrap(android.view.accessibility.AccessibilityNodeProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider(real);
    }

    public android.view.accessibility.AccessibilityNodeProvider unwrap() {
        return real;
    }

    public void addExtraDataToAccessibilityNodeInfo(int arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.addExtraDataToAccessibilityNodeInfo(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.createAccessibilityNodeInfo(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.findFocus(arg0));
    }

    public boolean performAction(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.performAction(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final int HOST_VIEW_ID = android.view.accessibility.AccessibilityNodeProvider.HOST_VIEW_ID;

}
