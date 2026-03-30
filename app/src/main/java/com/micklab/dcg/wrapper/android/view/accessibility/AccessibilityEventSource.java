// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityEventSource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityEventSource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEventSource wrap(android.view.accessibility.AccessibilityEventSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEventSource(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityEventSource getReal() {
        return (android.view.accessibility.AccessibilityEventSource) real;
    }

    public android.view.accessibility.AccessibilityEventSource unwrap() {
        return getReal();
    }

    public void sendAccessibilityEvent(int arg0) {
        ((android.view.accessibility.AccessibilityEventSource) real).sendAccessibilityEvent(arg0);
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.view.accessibility.AccessibilityEventSource) real).sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.getReal());
    }

}
