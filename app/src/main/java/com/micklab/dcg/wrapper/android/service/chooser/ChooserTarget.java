// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserTarget {
    private final android.service.chooser.ChooserTarget real;

    public ChooserTarget(android.service.chooser.ChooserTarget real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserTarget wrap(android.service.chooser.ChooserTarget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserTarget(real);
    }

    public android.service.chooser.ChooserTarget unwrap() {
        return real;
    }

    public ChooserTarget(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1, float arg2, com.micklab.dcg.wrapper.android.content.ComponentName arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        this(new android.service.chooser.ChooserTarget(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponentName());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getIntentExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getIntentExtras());
    }

    public float getScore() {
        return real.getScore();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
