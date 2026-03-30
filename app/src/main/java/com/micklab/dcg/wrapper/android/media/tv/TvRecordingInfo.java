// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvRecordingInfo {
    private final android.media.tv.TvRecordingInfo real;

    public TvRecordingInfo(android.media.tv.TvRecordingInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo wrap(android.media.tv.TvRecordingInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo(real);
    }

    public android.media.tv.TvRecordingInfo unwrap() {
        return real;
    }

    public TvRecordingInfo(java.lang.String arg0, long arg1, long arg2, int arg3, java.lang.String arg4, java.lang.String arg5, long arg6, long arg7, com.micklab.dcg.wrapper.android.net.Uri arg8, com.micklab.dcg.wrapper.android.net.Uri arg9, java.util.List arg10, com.micklab.dcg.wrapper.android.net.Uri arg11, long arg12, long arg13) {
        this(new android.media.tv.TvRecordingInfo(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap(), arg9 == null ? null : arg9.unwrap(), arg10, arg11 == null ? null : arg11.unwrap(), arg12, arg13));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getChannelUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getChannelUri());
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public long getEndPaddingMillis() {
        return real.getEndPaddingMillis();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getProgramUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getProgramUri());
    }

    public long getRecordingDurationMillis() {
        return real.getRecordingDurationMillis();
    }

    public java.lang.String getRecordingId() {
        return real.getRecordingId();
    }

    public long getRecordingStartTimeMillis() {
        return real.getRecordingStartTimeMillis();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRecordingUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getRecordingUri());
    }

    public int getRepeatDays() {
        return real.getRepeatDays();
    }

    public long getScheduledDurationMillis() {
        return real.getScheduledDurationMillis();
    }

    public long getScheduledStartTimeMillis() {
        return real.getScheduledStartTimeMillis();
    }

    public long getStartPaddingMillis() {
        return real.getStartPaddingMillis();
    }

    public void setDescription(java.lang.String arg0) {
        real.setDescription(arg0);
    }

    public void setName(java.lang.String arg0) {
        real.setName(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FRIDAY = android.media.tv.TvRecordingInfo.FRIDAY;
    public static final int MONDAY = android.media.tv.TvRecordingInfo.MONDAY;
    public static final int RECORDING_ALL = android.media.tv.TvRecordingInfo.RECORDING_ALL;
    public static final int RECORDING_IN_PROGRESS = android.media.tv.TvRecordingInfo.RECORDING_IN_PROGRESS;
    public static final int RECORDING_SCHEDULED = android.media.tv.TvRecordingInfo.RECORDING_SCHEDULED;
    public static final int SATURDAY = android.media.tv.TvRecordingInfo.SATURDAY;
    public static final int SUNDAY = android.media.tv.TvRecordingInfo.SUNDAY;
    public static final int THURSDAY = android.media.tv.TvRecordingInfo.THURSDAY;
    public static final int TUESDAY = android.media.tv.TvRecordingInfo.TUESDAY;
    public static final int WEDNESDAY = android.media.tv.TvRecordingInfo.WEDNESDAY;

}
