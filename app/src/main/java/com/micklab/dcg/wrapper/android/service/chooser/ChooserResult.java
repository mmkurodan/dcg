// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChooserResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserResult wrap(android.service.chooser.ChooserResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserResult(real, (__DcgwBridgeToken) null);
    }

    public android.service.chooser.ChooserResult getReal() {
        return (android.service.chooser.ChooserResult) real;
    }

    public android.service.chooser.ChooserResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.chooser.ChooserResult) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.chooser.ChooserResult) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getSelectedComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.service.chooser.ChooserResult) real).getSelectedComponent());
    }

    public int getType() {
        return ((android.service.chooser.ChooserResult) real).getType();
    }

    public int hashCode() {
        return ((android.service.chooser.ChooserResult) real).hashCode();
    }

    public boolean isShortcut() {
        return ((android.service.chooser.ChooserResult) real).isShortcut();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.chooser.ChooserResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CHOOSER_RESULT_COPY = android.service.chooser.ChooserResult.CHOOSER_RESULT_COPY;
    public static final int CHOOSER_RESULT_EDIT = android.service.chooser.ChooserResult.CHOOSER_RESULT_EDIT;
    public static final int CHOOSER_RESULT_SELECTED_COMPONENT = android.service.chooser.ChooserResult.CHOOSER_RESULT_SELECTED_COMPONENT;
    public static final int CHOOSER_RESULT_UNKNOWN = android.service.chooser.ChooserResult.CHOOSER_RESULT_UNKNOWN;

}
