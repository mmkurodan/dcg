// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityEventSource {
    private final android.view.accessibility.AccessibilityEventSource real;

    public AccessibilityEventSource(android.view.accessibility.AccessibilityEventSource real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEventSource wrap(android.view.accessibility.AccessibilityEventSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEventSource(real);
    }

    public android.view.accessibility.AccessibilityEventSource unwrap() {
        return real;
    }

    public void sendAccessibilityEvent(int arg0) {
        real.sendAccessibilityEvent(arg0);
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.unwrap());
    }

}
