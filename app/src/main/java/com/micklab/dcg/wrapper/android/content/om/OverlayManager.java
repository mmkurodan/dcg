// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverlayManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManager wrap(android.content.om.OverlayManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayManager(real, (__DcgwBridgeToken) null);
    }

    public android.content.om.OverlayManager getReal() {
        return (android.content.om.OverlayManager) real;
    }

    public android.content.om.OverlayManager unwrap() {
        return getReal();
    }

    public void commit(com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction arg0) {
        ((android.content.om.OverlayManager) real).commit(arg0 == null ? null : arg0.getReal());
    }

}
