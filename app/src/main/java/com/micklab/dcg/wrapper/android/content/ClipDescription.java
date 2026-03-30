// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ClipDescription {
    private final android.content.ClipDescription real;

    public ClipDescription(android.content.ClipDescription real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ClipDescription wrap(android.content.ClipDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipDescription(real);
    }

    public android.content.ClipDescription unwrap() {
        return real;
    }

    public ClipDescription(com.micklab.dcg.wrapper.android.content.ClipDescription arg0) {
        this(new android.content.ClipDescription(arg0 == null ? null : arg0.unwrap()));
    }

    public ClipDescription(java.lang.CharSequence arg0, java.lang.String[] arg1) {
        this(new android.content.ClipDescription(arg0, arg1));
    }

    public static boolean compareMimeTypes(java.lang.String arg0, java.lang.String arg1) {
        return android.content.ClipDescription.compareMimeTypes(arg0, arg1);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String[] filterMimeTypes(java.lang.String arg0) {
        return real.filterMimeTypes(arg0);
    }

    public int getClassificationStatus() {
        return real.getClassificationStatus();
    }

    public float getConfidenceScore(java.lang.String arg0) {
        return real.getConfidenceScore(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getExtras());
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public java.lang.String getMimeType(int arg0) {
        return real.getMimeType(arg0);
    }

    public int getMimeTypeCount() {
        return real.getMimeTypeCount();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public boolean hasMimeType(java.lang.String arg0) {
        return real.hasMimeType(arg0);
    }

    public boolean isStyledText() {
        return real.isStyledText();
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        real.setExtras(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CLASSIFICATION_COMPLETE = android.content.ClipDescription.CLASSIFICATION_COMPLETE;
    public static final int CLASSIFICATION_NOT_COMPLETE = android.content.ClipDescription.CLASSIFICATION_NOT_COMPLETE;
    public static final int CLASSIFICATION_NOT_PERFORMED = android.content.ClipDescription.CLASSIFICATION_NOT_PERFORMED;
    public static final java.lang.String EXTRA_IS_REMOTE_DEVICE = android.content.ClipDescription.EXTRA_IS_REMOTE_DEVICE;
    public static final java.lang.String EXTRA_IS_SENSITIVE = android.content.ClipDescription.EXTRA_IS_SENSITIVE;
    public static final java.lang.String MIMETYPE_TEXT_HTML = android.content.ClipDescription.MIMETYPE_TEXT_HTML;
    public static final java.lang.String MIMETYPE_TEXT_INTENT = android.content.ClipDescription.MIMETYPE_TEXT_INTENT;
    public static final java.lang.String MIMETYPE_TEXT_PLAIN = android.content.ClipDescription.MIMETYPE_TEXT_PLAIN;
    public static final java.lang.String MIMETYPE_TEXT_URILIST = android.content.ClipDescription.MIMETYPE_TEXT_URILIST;
    public static final java.lang.String MIMETYPE_UNKNOWN = android.content.ClipDescription.MIMETYPE_UNKNOWN;

}
