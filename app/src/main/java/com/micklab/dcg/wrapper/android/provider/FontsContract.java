// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class FontsContract {
    private final android.provider.FontsContract real;

    public FontsContract(android.provider.FontsContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.FontsContract wrap(android.provider.FontsContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract(real);
    }

    public android.provider.FontsContract unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface buildTypeface(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, android.provider.FontsContract.FontInfo[] arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.provider.FontsContract.buildTypeface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult fetchFonts(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.provider.FontRequest arg2) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult.wrap(android.provider.FontsContract.fetchFonts(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static void requestFonts(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.provider.FontRequest arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3, com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback arg4) {
        android.provider.FontsContract.requestFonts(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public static final class Columns {
        private final android.provider.FontsContract.Columns real;

        public Columns(android.provider.FontsContract.Columns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.Columns wrap(android.provider.FontsContract.Columns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.Columns(real);
        }

        public android.provider.FontsContract.Columns unwrap() {
            return real;
        }

        public static final java.lang.String ITALIC = android.provider.FontsContract.Columns.ITALIC;
        public static final java.lang.String RESULT_CODE = android.provider.FontsContract.Columns.RESULT_CODE;
        public static final int RESULT_CODE_FONT_NOT_FOUND = android.provider.FontsContract.Columns.RESULT_CODE_FONT_NOT_FOUND;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = android.provider.FontsContract.Columns.RESULT_CODE_FONT_UNAVAILABLE;
        public static final int RESULT_CODE_MALFORMED_QUERY = android.provider.FontsContract.Columns.RESULT_CODE_MALFORMED_QUERY;
        public static final int RESULT_CODE_OK = android.provider.FontsContract.Columns.RESULT_CODE_OK;
        public static final java.lang.String TTC_INDEX = android.provider.FontsContract.Columns.TTC_INDEX;
        public static final java.lang.String VARIATION_SETTINGS = android.provider.FontsContract.Columns.VARIATION_SETTINGS;
        public static final java.lang.String WEIGHT = android.provider.FontsContract.Columns.WEIGHT;

    }
    public static final class FontFamilyResult {
        private final android.provider.FontsContract.FontFamilyResult real;

        public FontFamilyResult(android.provider.FontsContract.FontFamilyResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult wrap(android.provider.FontsContract.FontFamilyResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult(real);
        }

        public android.provider.FontsContract.FontFamilyResult unwrap() {
            return real;
        }

        public android.provider.FontsContract.FontInfo[] getFonts() {
            return real.getFonts();
        }

        public int getStatusCode() {
            return real.getStatusCode();
        }

        public static final int STATUS_OK = android.provider.FontsContract.FontFamilyResult.STATUS_OK;
        public static final int STATUS_REJECTED = android.provider.FontsContract.FontFamilyResult.STATUS_REJECTED;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = android.provider.FontsContract.FontFamilyResult.STATUS_UNEXPECTED_DATA_PROVIDED;
        public static final int STATUS_WRONG_CERTIFICATES = android.provider.FontsContract.FontFamilyResult.STATUS_WRONG_CERTIFICATES;

    }
    public static final class FontInfo {
        private final android.provider.FontsContract.FontInfo real;

        public FontInfo(android.provider.FontsContract.FontInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontInfo wrap(android.provider.FontsContract.FontInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontInfo(real);
        }

        public android.provider.FontsContract.FontInfo unwrap() {
            return real;
        }

        public android.graphics.fonts.FontVariationAxis[] getAxes() {
            return real.getAxes();
        }

        public int getResultCode() {
            return real.getResultCode();
        }

        public int getTtcIndex() {
            return real.getTtcIndex();
        }

        public com.micklab.dcg.wrapper.android.net.Uri getUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
        }

        public int getWeight() {
            return real.getWeight();
        }

        public boolean isItalic() {
            return real.isItalic();
        }

    }
    public static final class FontRequestCallback {
        private final android.provider.FontsContract.FontRequestCallback real;

        public FontRequestCallback(android.provider.FontsContract.FontRequestCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback wrap(android.provider.FontsContract.FontRequestCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback(real);
        }

        public android.provider.FontsContract.FontRequestCallback unwrap() {
            return real;
        }

        public FontRequestCallback() {
            this(new android.provider.FontsContract.FontRequestCallback());
        }

        public void onTypefaceRequestFailed(int arg0) {
            real.onTypefaceRequestFailed(arg0);
        }

        public void onTypefaceRetrieved(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
            real.onTypefaceRetrieved(arg0 == null ? null : arg0.unwrap());
        }

        public static final int FAIL_REASON_FONT_LOAD_ERROR = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR;
        public static final int FAIL_REASON_FONT_NOT_FOUND = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_NOT_FOUND;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_UNAVAILABLE;
        public static final int FAIL_REASON_MALFORMED_QUERY = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_MALFORMED_QUERY;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_PROVIDER_NOT_FOUND;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_WRONG_CERTIFICATES;

    }
}
