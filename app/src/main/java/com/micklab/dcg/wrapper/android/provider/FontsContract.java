// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class FontsContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FontsContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.FontsContract wrap(android.provider.FontsContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.FontsContract getReal() {
        return (android.provider.FontsContract) real;
    }

    public android.provider.FontsContract unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface buildTypeface(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, android.provider.FontsContract.FontInfo[] arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.provider.FontsContract.buildTypeface(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult fetchFonts(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, com.micklab.dcg.wrapper.android.provider.FontRequest arg2) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult.wrap(android.provider.FontsContract.fetchFonts(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static void requestFonts(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.provider.FontRequest arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3, com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback arg4) {
        android.provider.FontsContract.requestFonts(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public static final class Columns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Columns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.Columns wrap(android.provider.FontsContract.Columns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.Columns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.FontsContract.Columns getReal() {
            return (android.provider.FontsContract.Columns) real;
        }

        public android.provider.FontsContract.Columns unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FontFamilyResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult wrap(android.provider.FontsContract.FontFamilyResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontFamilyResult(real, (__DcgwBridgeToken) null);
        }

        public android.provider.FontsContract.FontFamilyResult getReal() {
            return (android.provider.FontsContract.FontFamilyResult) real;
        }

        public android.provider.FontsContract.FontFamilyResult unwrap() {
            return getReal();
        }

        public android.provider.FontsContract.FontInfo[] getFonts() {
            return ((android.provider.FontsContract.FontFamilyResult) real).getFonts();
        }

        public int getStatusCode() {
            return ((android.provider.FontsContract.FontFamilyResult) real).getStatusCode();
        }

        public static final int STATUS_OK = android.provider.FontsContract.FontFamilyResult.STATUS_OK;
        public static final int STATUS_REJECTED = android.provider.FontsContract.FontFamilyResult.STATUS_REJECTED;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = android.provider.FontsContract.FontFamilyResult.STATUS_UNEXPECTED_DATA_PROVIDED;
        public static final int STATUS_WRONG_CERTIFICATES = android.provider.FontsContract.FontFamilyResult.STATUS_WRONG_CERTIFICATES;

    }
    public static final class FontInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FontInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontInfo wrap(android.provider.FontsContract.FontInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontInfo(real, (__DcgwBridgeToken) null);
        }

        public android.provider.FontsContract.FontInfo getReal() {
            return (android.provider.FontsContract.FontInfo) real;
        }

        public android.provider.FontsContract.FontInfo unwrap() {
            return getReal();
        }

        public android.graphics.fonts.FontVariationAxis[] getAxes() {
            return ((android.provider.FontsContract.FontInfo) real).getAxes();
        }

        public int getResultCode() {
            return ((android.provider.FontsContract.FontInfo) real).getResultCode();
        }

        public int getTtcIndex() {
            return ((android.provider.FontsContract.FontInfo) real).getTtcIndex();
        }

        public com.micklab.dcg.wrapper.android.net.Uri getUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.provider.FontsContract.FontInfo) real).getUri());
        }

        public int getWeight() {
            return ((android.provider.FontsContract.FontInfo) real).getWeight();
        }

        public boolean isItalic() {
            return ((android.provider.FontsContract.FontInfo) real).isItalic();
        }

    }
    public static final class FontRequestCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FontRequestCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback wrap(android.provider.FontsContract.FontRequestCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontsContract.FontRequestCallback(real, (__DcgwBridgeToken) null);
        }

        public android.provider.FontsContract.FontRequestCallback getReal() {
            return (android.provider.FontsContract.FontRequestCallback) real;
        }

        public android.provider.FontsContract.FontRequestCallback unwrap() {
            return getReal();
        }

        public FontRequestCallback() {
            this(new android.provider.FontsContract.FontRequestCallback(), (__DcgwBridgeToken) null);
        }

        public void onTypefaceRequestFailed(int arg0) {
            ((android.provider.FontsContract.FontRequestCallback) real).onTypefaceRequestFailed(arg0);
        }

        public void onTypefaceRetrieved(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
            ((android.provider.FontsContract.FontRequestCallback) real).onTypefaceRetrieved(arg0 == null ? null : arg0.getReal());
        }

        public static final int FAIL_REASON_FONT_LOAD_ERROR = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR;
        public static final int FAIL_REASON_FONT_NOT_FOUND = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_NOT_FOUND;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_FONT_UNAVAILABLE;
        public static final int FAIL_REASON_MALFORMED_QUERY = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_MALFORMED_QUERY;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_PROVIDER_NOT_FOUND;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = android.provider.FontsContract.FontRequestCallback.FAIL_REASON_WRONG_CERTIFICATES;

    }
}
