// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class CheckBoxPreference {
    private final android.preference.CheckBoxPreference real;

    public CheckBoxPreference(android.preference.CheckBoxPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.CheckBoxPreference wrap(android.preference.CheckBoxPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.CheckBoxPreference(real);
    }

    public android.preference.CheckBoxPreference unwrap() {
        return real;
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.unwrap()));
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

}
