// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserTarget {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChooserTarget(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserTarget wrap(android.service.chooser.ChooserTarget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserTarget(real, (__DcgwBridgeToken) null);
    }

    public android.service.chooser.ChooserTarget getReal() {
        return (android.service.chooser.ChooserTarget) real;
    }

    public android.service.chooser.ChooserTarget unwrap() {
        return getReal();
    }

    public ChooserTarget(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1, float arg2, com.micklab.dcg.wrapper.android.content.ComponentName arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        this(new android.service.chooser.ChooserTarget(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.chooser.ChooserTarget) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.service.chooser.ChooserTarget) real).getComponentName());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.chooser.ChooserTarget) real).getIcon());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getIntentExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.chooser.ChooserTarget) real).getIntentExtras());
    }

    public float getScore() {
        return ((android.service.chooser.ChooserTarget) real).getScore();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.service.chooser.ChooserTarget) real).getTitle();
    }

    public java.lang.String toString() {
        return ((android.service.chooser.ChooserTarget) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.chooser.ChooserTarget) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
