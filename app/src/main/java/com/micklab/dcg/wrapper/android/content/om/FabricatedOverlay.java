// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class FabricatedOverlay {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FabricatedOverlay(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay wrap(android.content.om.FabricatedOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay(real, (__DcgwBridgeToken) null);
    }

    public android.content.om.FabricatedOverlay getReal() {
        return (android.content.om.FabricatedOverlay) real;
    }

    public android.content.om.FabricatedOverlay unwrap() {
        return getReal();
    }

    public FabricatedOverlay(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.om.FabricatedOverlay(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier getIdentifier() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier.wrap(((android.content.om.FabricatedOverlay) real).getIdentifier());
    }

    public void setNinePatchResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, java.lang.String arg2) {
        ((android.content.om.FabricatedOverlay) real).setNinePatchResourceValue(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, java.lang.String arg2) {
        ((android.content.om.FabricatedOverlay) real).setResourceValue(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg1, java.lang.String arg2) {
        ((android.content.om.FabricatedOverlay) real).setResourceValue(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.content.om.FabricatedOverlay) real).setResourceValue(arg0, arg1, arg2, arg3);
    }

    public void setResourceValue(java.lang.String arg0, int arg1, int arg2, java.lang.String arg3) {
        ((android.content.om.FabricatedOverlay) real).setResourceValue(arg0, arg1, arg2, arg3);
    }

    public void setTargetOverlayable(java.lang.String arg0) {
        ((android.content.om.FabricatedOverlay) real).setTargetOverlayable(arg0);
    }

}
