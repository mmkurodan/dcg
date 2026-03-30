// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class RingtonePreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RingtonePreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.RingtonePreference wrap(android.preference.RingtonePreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.RingtonePreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.RingtonePreference getReal() {
        return (android.preference.RingtonePreference) real;
    }

    public android.preference.RingtonePreference unwrap() {
        return getReal();
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public RingtonePreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.RingtonePreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int getRingtoneType() {
        return ((android.preference.RingtonePreference) real).getRingtoneType();
    }

    public boolean getShowDefault() {
        return ((android.preference.RingtonePreference) real).getShowDefault();
    }

    public boolean getShowSilent() {
        return ((android.preference.RingtonePreference) real).getShowSilent();
    }

    public boolean onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        return ((android.preference.RingtonePreference) real).onActivityResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setRingtoneType(int arg0) {
        ((android.preference.RingtonePreference) real).setRingtoneType(arg0);
    }

    public void setShowDefault(boolean arg0) {
        ((android.preference.RingtonePreference) real).setShowDefault(arg0);
    }

    public void setShowSilent(boolean arg0) {
        ((android.preference.RingtonePreference) real).setShowSilent(arg0);
    }

}
