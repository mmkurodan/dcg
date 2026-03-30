// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class AllocationAdapter {
    private final android.renderscript.AllocationAdapter real;

    public AllocationAdapter(android.renderscript.AllocationAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter wrap(android.renderscript.AllocationAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter(real);
    }

    public android.renderscript.AllocationAdapter unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter create1D(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter.wrap(android.renderscript.AllocationAdapter.create1D(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter create2D(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter.wrap(android.renderscript.AllocationAdapter.create2D(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter createTyped(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, com.micklab.dcg.wrapper.android.renderscript.Type arg2) {
        return com.micklab.dcg.wrapper.android.renderscript.AllocationAdapter.wrap(android.renderscript.AllocationAdapter.createTyped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void resize(int arg0) {
        real.resize(arg0);
    }

    public void setFace(com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace arg0) {
        real.setFace(arg0 == null ? null : arg0.unwrap());
    }

    public void setLOD(int arg0) {
        real.setLOD(arg0);
    }

    public void setX(int arg0) {
        real.setX(arg0);
    }

    public void setY(int arg0) {
        real.setY(arg0);
    }

    public void setZ(int arg0) {
        real.setZ(arg0);
    }

}
