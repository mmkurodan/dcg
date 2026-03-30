// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class RingtonePreference {
    private final android.preference.RingtonePreference real;

    public RingtonePreference(android.preference.RingtonePreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.RingtonePreference wrap(android.preference.RingtonePreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.RingtonePreference(real);
    }

    public android.preference.RingtonePreference unwrap() {
        return real;
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.unwrap()));
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int getRingtoneType() {
        return real.getRingtoneType();
    }

    public boolean getShowDefault() {
        return real.getShowDefault();
    }

    public boolean getShowSilent() {
        return real.getShowSilent();
    }

    public boolean onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        return real.onActivityResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setRingtoneType(int arg0) {
        real.setRingtoneType(arg0);
    }

    public void setShowDefault(boolean arg0) {
        real.setShowDefault(arg0);
    }

    public void setShowSilent(boolean arg0) {
        real.setShowSilent(arg0);
    }

}
