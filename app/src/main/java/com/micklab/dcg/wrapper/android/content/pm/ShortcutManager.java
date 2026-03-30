// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class ShortcutManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ShortcutManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.ShortcutManager wrap(android.content.pm.ShortcutManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.ShortcutManager(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.ShortcutManager getReal() {
        return (android.content.pm.ShortcutManager) real;
    }

    public android.content.pm.ShortcutManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createShortcutResultIntent(com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#createShortcutResultIntent(android.content.pm.ShortcutInfo)");
    }

    public int getIconMaxHeight() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#getIconMaxHeight()");
    }

    public int getIconMaxWidth() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#getIconMaxWidth()");
    }

    public int getMaxShortcutCountPerActivity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#getMaxShortcutCountPerActivity()");
    }

    public boolean isRateLimitingActive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#isRateLimitingActive()");
    }

    public boolean isRequestPinShortcutSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#isRequestPinShortcutSupported()");
    }

    public void pushDynamicShortcut(com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#pushDynamicShortcut(android.content.pm.ShortcutInfo)");
    }

    public void removeAllDynamicShortcuts() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#removeAllDynamicShortcuts()");
    }

    public void reportShortcutUsed(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#reportShortcutUsed(java.lang.String)");
    }

    public boolean requestPinShortcut(com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ShortcutManager#requestPinShortcut(android.content.pm.ShortcutInfo,android.content.IntentSender)");
    }


}
