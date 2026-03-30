// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ToneGenerator {
    private final android.media.ToneGenerator real;

    public ToneGenerator(android.media.ToneGenerator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ToneGenerator wrap(android.media.ToneGenerator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ToneGenerator(real);
    }

    public android.media.ToneGenerator unwrap() {
        return real;
    }

    public ToneGenerator(int arg0, int arg1) {
        this(new android.media.ToneGenerator(arg0, arg1));
    }

    public int getAudioSessionId() {
        return real.getAudioSessionId();
    }

    public void release() {
        real.release();
    }

    public boolean startTone(int arg0) {
        return real.startTone(arg0);
    }

    public boolean startTone(int arg0, int arg1) {
        return real.startTone(arg0, arg1);
    }

    public void stopTone() {
        real.stopTone();
    }

    public static final int MAX_VOLUME = android.media.ToneGenerator.MAX_VOLUME;
    public static final int MIN_VOLUME = android.media.ToneGenerator.MIN_VOLUME;
    public static final int TONE_CDMA_ABBR_ALERT = android.media.ToneGenerator.TONE_CDMA_ABBR_ALERT;
    public static final int TONE_CDMA_ABBR_INTERCEPT = android.media.ToneGenerator.TONE_CDMA_ABBR_INTERCEPT;
    public static final int TONE_CDMA_ABBR_REORDER = android.media.ToneGenerator.TONE_CDMA_ABBR_REORDER;
    public static final int TONE_CDMA_ALERT_AUTOREDIAL_LITE = android.media.ToneGenerator.TONE_CDMA_ALERT_AUTOREDIAL_LITE;
    public static final int TONE_CDMA_ALERT_CALL_GUARD = android.media.ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD;
    public static final int TONE_CDMA_ALERT_INCALL_LITE = android.media.ToneGenerator.TONE_CDMA_ALERT_INCALL_LITE;
    public static final int TONE_CDMA_ANSWER = android.media.ToneGenerator.TONE_CDMA_ANSWER;
    public static final int TONE_CDMA_CALLDROP_LITE = android.media.ToneGenerator.TONE_CDMA_CALLDROP_LITE;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_INTERGROUP = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_INTERGROUP;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_NORMAL = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_NORMAL;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_PAT3 = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT3;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_PAT5 = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT5;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_PAT6 = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT6;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_PAT7 = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT7;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_PING_RING = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PING_RING;
    public static final int TONE_CDMA_CALL_SIGNAL_ISDN_SP_PRI = android.media.ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_SP_PRI;
    public static final int TONE_CDMA_CONFIRM = android.media.ToneGenerator.TONE_CDMA_CONFIRM;
    public static final int TONE_CDMA_DIAL_TONE_LITE = android.media.ToneGenerator.TONE_CDMA_DIAL_TONE_LITE;
    public static final int TONE_CDMA_EMERGENCY_RINGBACK = android.media.ToneGenerator.TONE_CDMA_EMERGENCY_RINGBACK;
    public static final int TONE_CDMA_HIGH_L = android.media.ToneGenerator.TONE_CDMA_HIGH_L;
    public static final int TONE_CDMA_HIGH_PBX_L = android.media.ToneGenerator.TONE_CDMA_HIGH_PBX_L;
    public static final int TONE_CDMA_HIGH_PBX_SLS = android.media.ToneGenerator.TONE_CDMA_HIGH_PBX_SLS;
    public static final int TONE_CDMA_HIGH_PBX_SS = android.media.ToneGenerator.TONE_CDMA_HIGH_PBX_SS;
    public static final int TONE_CDMA_HIGH_PBX_SSL = android.media.ToneGenerator.TONE_CDMA_HIGH_PBX_SSL;
    public static final int TONE_CDMA_HIGH_PBX_S_X4 = android.media.ToneGenerator.TONE_CDMA_HIGH_PBX_S_X4;
    public static final int TONE_CDMA_HIGH_SLS = android.media.ToneGenerator.TONE_CDMA_HIGH_SLS;
    public static final int TONE_CDMA_HIGH_SS = android.media.ToneGenerator.TONE_CDMA_HIGH_SS;
    public static final int TONE_CDMA_HIGH_SSL = android.media.ToneGenerator.TONE_CDMA_HIGH_SSL;
    public static final int TONE_CDMA_HIGH_SS_2 = android.media.ToneGenerator.TONE_CDMA_HIGH_SS_2;
    public static final int TONE_CDMA_HIGH_S_X4 = android.media.ToneGenerator.TONE_CDMA_HIGH_S_X4;
    public static final int TONE_CDMA_INTERCEPT = android.media.ToneGenerator.TONE_CDMA_INTERCEPT;
    public static final int TONE_CDMA_KEYPAD_VOLUME_KEY_LITE = android.media.ToneGenerator.TONE_CDMA_KEYPAD_VOLUME_KEY_LITE;
    public static final int TONE_CDMA_LOW_L = android.media.ToneGenerator.TONE_CDMA_LOW_L;
    public static final int TONE_CDMA_LOW_PBX_L = android.media.ToneGenerator.TONE_CDMA_LOW_PBX_L;
    public static final int TONE_CDMA_LOW_PBX_SLS = android.media.ToneGenerator.TONE_CDMA_LOW_PBX_SLS;
    public static final int TONE_CDMA_LOW_PBX_SS = android.media.ToneGenerator.TONE_CDMA_LOW_PBX_SS;
    public static final int TONE_CDMA_LOW_PBX_SSL = android.media.ToneGenerator.TONE_CDMA_LOW_PBX_SSL;
    public static final int TONE_CDMA_LOW_PBX_S_X4 = android.media.ToneGenerator.TONE_CDMA_LOW_PBX_S_X4;
    public static final int TONE_CDMA_LOW_SLS = android.media.ToneGenerator.TONE_CDMA_LOW_SLS;
    public static final int TONE_CDMA_LOW_SS = android.media.ToneGenerator.TONE_CDMA_LOW_SS;
    public static final int TONE_CDMA_LOW_SSL = android.media.ToneGenerator.TONE_CDMA_LOW_SSL;
    public static final int TONE_CDMA_LOW_SS_2 = android.media.ToneGenerator.TONE_CDMA_LOW_SS_2;
    public static final int TONE_CDMA_LOW_S_X4 = android.media.ToneGenerator.TONE_CDMA_LOW_S_X4;
    public static final int TONE_CDMA_MED_L = android.media.ToneGenerator.TONE_CDMA_MED_L;
    public static final int TONE_CDMA_MED_PBX_L = android.media.ToneGenerator.TONE_CDMA_MED_PBX_L;
    public static final int TONE_CDMA_MED_PBX_SLS = android.media.ToneGenerator.TONE_CDMA_MED_PBX_SLS;
    public static final int TONE_CDMA_MED_PBX_SS = android.media.ToneGenerator.TONE_CDMA_MED_PBX_SS;
    public static final int TONE_CDMA_MED_PBX_SSL = android.media.ToneGenerator.TONE_CDMA_MED_PBX_SSL;
    public static final int TONE_CDMA_MED_PBX_S_X4 = android.media.ToneGenerator.TONE_CDMA_MED_PBX_S_X4;
    public static final int TONE_CDMA_MED_SLS = android.media.ToneGenerator.TONE_CDMA_MED_SLS;
    public static final int TONE_CDMA_MED_SS = android.media.ToneGenerator.TONE_CDMA_MED_SS;
    public static final int TONE_CDMA_MED_SSL = android.media.ToneGenerator.TONE_CDMA_MED_SSL;
    public static final int TONE_CDMA_MED_SS_2 = android.media.ToneGenerator.TONE_CDMA_MED_SS_2;
    public static final int TONE_CDMA_MED_S_X4 = android.media.ToneGenerator.TONE_CDMA_MED_S_X4;
    public static final int TONE_CDMA_ONE_MIN_BEEP = android.media.ToneGenerator.TONE_CDMA_ONE_MIN_BEEP;
    public static final int TONE_CDMA_PIP = android.media.ToneGenerator.TONE_CDMA_PIP;
    public static final int TONE_CDMA_PRESSHOLDKEY_LITE = android.media.ToneGenerator.TONE_CDMA_PRESSHOLDKEY_LITE;
    public static final int TONE_CDMA_REORDER = android.media.ToneGenerator.TONE_CDMA_REORDER;
    public static final int TONE_CDMA_SIGNAL_OFF = android.media.ToneGenerator.TONE_CDMA_SIGNAL_OFF;
    public static final int TONE_CDMA_SOFT_ERROR_LITE = android.media.ToneGenerator.TONE_CDMA_SOFT_ERROR_LITE;
    public static final int TONE_DTMF_0 = android.media.ToneGenerator.TONE_DTMF_0;
    public static final int TONE_DTMF_1 = android.media.ToneGenerator.TONE_DTMF_1;
    public static final int TONE_DTMF_2 = android.media.ToneGenerator.TONE_DTMF_2;
    public static final int TONE_DTMF_3 = android.media.ToneGenerator.TONE_DTMF_3;
    public static final int TONE_DTMF_4 = android.media.ToneGenerator.TONE_DTMF_4;
    public static final int TONE_DTMF_5 = android.media.ToneGenerator.TONE_DTMF_5;
    public static final int TONE_DTMF_6 = android.media.ToneGenerator.TONE_DTMF_6;
    public static final int TONE_DTMF_7 = android.media.ToneGenerator.TONE_DTMF_7;
    public static final int TONE_DTMF_8 = android.media.ToneGenerator.TONE_DTMF_8;
    public static final int TONE_DTMF_9 = android.media.ToneGenerator.TONE_DTMF_9;
    public static final int TONE_DTMF_A = android.media.ToneGenerator.TONE_DTMF_A;
    public static final int TONE_DTMF_B = android.media.ToneGenerator.TONE_DTMF_B;
    public static final int TONE_DTMF_C = android.media.ToneGenerator.TONE_DTMF_C;
    public static final int TONE_DTMF_D = android.media.ToneGenerator.TONE_DTMF_D;
    public static final int TONE_DTMF_P = android.media.ToneGenerator.TONE_DTMF_P;
    public static final int TONE_DTMF_S = android.media.ToneGenerator.TONE_DTMF_S;
    public static final int TONE_PROP_ACK = android.media.ToneGenerator.TONE_PROP_ACK;
    public static final int TONE_PROP_BEEP = android.media.ToneGenerator.TONE_PROP_BEEP;
    public static final int TONE_PROP_BEEP2 = android.media.ToneGenerator.TONE_PROP_BEEP2;
    public static final int TONE_PROP_NACK = android.media.ToneGenerator.TONE_PROP_NACK;
    public static final int TONE_PROP_PROMPT = android.media.ToneGenerator.TONE_PROP_PROMPT;
    public static final int TONE_SUP_BUSY = android.media.ToneGenerator.TONE_SUP_BUSY;
    public static final int TONE_SUP_CALL_WAITING = android.media.ToneGenerator.TONE_SUP_CALL_WAITING;
    public static final int TONE_SUP_CONFIRM = android.media.ToneGenerator.TONE_SUP_CONFIRM;
    public static final int TONE_SUP_CONGESTION = android.media.ToneGenerator.TONE_SUP_CONGESTION;
    public static final int TONE_SUP_CONGESTION_ABBREV = android.media.ToneGenerator.TONE_SUP_CONGESTION_ABBREV;
    public static final int TONE_SUP_DIAL = android.media.ToneGenerator.TONE_SUP_DIAL;
    public static final int TONE_SUP_ERROR = android.media.ToneGenerator.TONE_SUP_ERROR;
    public static final int TONE_SUP_INTERCEPT = android.media.ToneGenerator.TONE_SUP_INTERCEPT;
    public static final int TONE_SUP_INTERCEPT_ABBREV = android.media.ToneGenerator.TONE_SUP_INTERCEPT_ABBREV;
    public static final int TONE_SUP_PIP = android.media.ToneGenerator.TONE_SUP_PIP;
    public static final int TONE_SUP_RADIO_ACK = android.media.ToneGenerator.TONE_SUP_RADIO_ACK;
    public static final int TONE_SUP_RADIO_NOTAVAIL = android.media.ToneGenerator.TONE_SUP_RADIO_NOTAVAIL;
    public static final int TONE_SUP_RINGTONE = android.media.ToneGenerator.TONE_SUP_RINGTONE;

}
