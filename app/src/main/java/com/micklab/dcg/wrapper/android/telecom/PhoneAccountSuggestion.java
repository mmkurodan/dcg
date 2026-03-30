// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class PhoneAccountSuggestion {
    private final android.telecom.PhoneAccountSuggestion real;

    public PhoneAccountSuggestion(android.telecom.PhoneAccountSuggestion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.PhoneAccountSuggestion wrap(android.telecom.PhoneAccountSuggestion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.PhoneAccountSuggestion(real);
    }

    public android.telecom.PhoneAccountSuggestion unwrap() {
        return real;
    }

    public PhoneAccountSuggestion(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, int arg1, boolean arg2) {
        this(new android.telecom.PhoneAccountSuggestion(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getPhoneAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(real.getPhoneAccountHandle());
    }

    public int getReason() {
        return real.getReason();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean shouldAutoSelect() {
        return real.shouldAutoSelect();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int REASON_FREQUENT = android.telecom.PhoneAccountSuggestion.REASON_FREQUENT;
    public static final int REASON_INTRA_CARRIER = android.telecom.PhoneAccountSuggestion.REASON_INTRA_CARRIER;
    public static final int REASON_NONE = android.telecom.PhoneAccountSuggestion.REASON_NONE;
    public static final int REASON_OTHER = android.telecom.PhoneAccountSuggestion.REASON_OTHER;
    public static final int REASON_USER_SET = android.telecom.PhoneAccountSuggestion.REASON_USER_SET;

}
