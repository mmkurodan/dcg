// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class OverlayManager {
    private final android.content.om.OverlayManager real;

    public OverlayManager(android.content.om.OverlayManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.OverlayManager wrap(android.content.om.OverlayManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.OverlayManager(real);
    }

    public android.content.om.OverlayManager unwrap() {
        return real;
    }

    public void commit(com.micklab.dcg.wrapper.android.content.om.OverlayManagerTransaction arg0) {
        real.commit(arg0 == null ? null : arg0.unwrap());
    }

}
