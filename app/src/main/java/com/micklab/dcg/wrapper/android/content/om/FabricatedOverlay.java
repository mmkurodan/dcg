// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.om;

public final class FabricatedOverlay {
    private final android.content.om.FabricatedOverlay real;

    public FabricatedOverlay(android.content.om.FabricatedOverlay real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay wrap(android.content.om.FabricatedOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.om.FabricatedOverlay(real);
    }

    public android.content.om.FabricatedOverlay unwrap() {
        return real;
    }

    public FabricatedOverlay(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.om.FabricatedOverlay(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier getIdentifier() {
        return com.micklab.dcg.wrapper.android.content.om.OverlayIdentifier.wrap(real.getIdentifier());
    }

    public void setNinePatchResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, java.lang.String arg2) {
        real.setNinePatchResourceValue(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg1, java.lang.String arg2) {
        real.setResourceValue(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, java.lang.String arg2) {
        real.setResourceValue(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void setResourceValue(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        real.setResourceValue(arg0, arg1, arg2, arg3);
    }

    public void setResourceValue(java.lang.String arg0, int arg1, int arg2, java.lang.String arg3) {
        real.setResourceValue(arg0, arg1, arg2, arg3);
    }

    public void setTargetOverlayable(java.lang.String arg0) {
        real.setTargetOverlayable(arg0);
    }

}
