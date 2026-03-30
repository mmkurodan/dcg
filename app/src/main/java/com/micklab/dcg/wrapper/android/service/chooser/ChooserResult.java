// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserResult {
    private final android.service.chooser.ChooserResult real;

    public ChooserResult(android.service.chooser.ChooserResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserResult wrap(android.service.chooser.ChooserResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserResult(real);
    }

    public android.service.chooser.ChooserResult unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getSelectedComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getSelectedComponent());
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isShortcut() {
        return real.isShortcut();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CHOOSER_RESULT_COPY = android.service.chooser.ChooserResult.CHOOSER_RESULT_COPY;
    public static final int CHOOSER_RESULT_EDIT = android.service.chooser.ChooserResult.CHOOSER_RESULT_EDIT;
    public static final int CHOOSER_RESULT_SELECTED_COMPONENT = android.service.chooser.ChooserResult.CHOOSER_RESULT_SELECTED_COMPONENT;
    public static final int CHOOSER_RESULT_UNKNOWN = android.service.chooser.ChooserResult.CHOOSER_RESULT_UNKNOWN;

}
