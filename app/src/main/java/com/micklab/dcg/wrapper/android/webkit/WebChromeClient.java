// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebChromeClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebChromeClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient wrap(android.webkit.WebChromeClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebChromeClient getReal() {
        return (android.webkit.WebChromeClient) real;
    }

    public android.webkit.WebChromeClient unwrap() {
        return getReal();
    }

    public WebChromeClient() {
        this(new android.webkit.WebChromeClient(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDefaultVideoPoster() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.webkit.WebChromeClient) real).getDefaultVideoPoster());
    }

    public com.micklab.dcg.wrapper.android.view.View getVideoLoadingProgressView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.webkit.WebChromeClient) real).getVideoLoadingProgressView());
    }

    public void onCloseWindow(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        ((android.webkit.WebChromeClient) real).onCloseWindow(arg0 == null ? null : arg0.getReal());
    }

    public boolean onConsoleMessage(com.micklab.dcg.wrapper.android.webkit.ConsoleMessage arg0) {
        return ((android.webkit.WebChromeClient) real).onConsoleMessage(arg0 == null ? null : arg0.getReal());
    }

    public void onConsoleMessage(java.lang.String arg0, int arg1, java.lang.String arg2) {
        ((android.webkit.WebChromeClient) real).onConsoleMessage(arg0, arg1, arg2);
    }

    public boolean onCreateWindow(com.micklab.dcg.wrapper.android.webkit.WebView arg0, boolean arg1, boolean arg2, com.micklab.dcg.wrapper.android.os.Message arg3) {
        return ((android.webkit.WebChromeClient) real).onCreateWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onExceededDatabaseQuota(java.lang.String arg0, java.lang.String arg1, long arg2, long arg3, long arg4, com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater arg5) {
        ((android.webkit.WebChromeClient) real).onExceededDatabaseQuota(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void onGeolocationPermissionsHidePrompt() {
        ((android.webkit.WebChromeClient) real).onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(java.lang.String arg0, com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback arg1) {
        ((android.webkit.WebChromeClient) real).onGeolocationPermissionsShowPrompt(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onHideCustomView() {
        ((android.webkit.WebChromeClient) real).onHideCustomView();
    }

    public boolean onJsAlert(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return ((android.webkit.WebChromeClient) real).onJsAlert(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onJsBeforeUnload(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return ((android.webkit.WebChromeClient) real).onJsBeforeUnload(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onJsConfirm(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return ((android.webkit.WebChromeClient) real).onJsConfirm(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onJsPrompt(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.webkit.JsPromptResult arg4) {
        return ((android.webkit.WebChromeClient) real).onJsPrompt(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean onJsTimeout() {
        return ((android.webkit.WebChromeClient) real).onJsTimeout();
    }

    public void onPermissionRequest(com.micklab.dcg.wrapper.android.webkit.PermissionRequest arg0) {
        ((android.webkit.WebChromeClient) real).onPermissionRequest(arg0 == null ? null : arg0.getReal());
    }

    public void onPermissionRequestCanceled(com.micklab.dcg.wrapper.android.webkit.PermissionRequest arg0) {
        ((android.webkit.WebChromeClient) real).onPermissionRequestCanceled(arg0 == null ? null : arg0.getReal());
    }

    public void onProgressChanged(com.micklab.dcg.wrapper.android.webkit.WebView arg0, int arg1) {
        ((android.webkit.WebChromeClient) real).onProgressChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onReceivedIcon(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        ((android.webkit.WebChromeClient) real).onReceivedIcon(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onReceivedTitle(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        ((android.webkit.WebChromeClient) real).onReceivedTitle(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onReceivedTouchIconUrl(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, boolean arg2) {
        ((android.webkit.WebChromeClient) real).onReceivedTouchIconUrl(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onRequestFocus(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        ((android.webkit.WebChromeClient) real).onRequestFocus(arg0 == null ? null : arg0.getReal());
    }

    public void onShowCustomView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback arg1) {
        ((android.webkit.WebChromeClient) real).onShowCustomView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onShowCustomView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback arg2) {
        ((android.webkit.WebChromeClient) real).onShowCustomView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static final class CustomViewCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CustomViewCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback wrap(android.webkit.WebChromeClient.CustomViewCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebChromeClient.CustomViewCallback getReal() {
            return (android.webkit.WebChromeClient.CustomViewCallback) real;
        }

        public android.webkit.WebChromeClient.CustomViewCallback unwrap() {
            return getReal();
        }

        public void onCustomViewHidden() {
            ((android.webkit.WebChromeClient.CustomViewCallback) real).onCustomViewHidden();
        }

    }
    public static final class FileChooserParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FileChooserParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient.FileChooserParams wrap(android.webkit.WebChromeClient.FileChooserParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient.FileChooserParams(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebChromeClient.FileChooserParams getReal() {
            return (android.webkit.WebChromeClient.FileChooserParams) real;
        }

        public android.webkit.WebChromeClient.FileChooserParams unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.content.Intent createIntent() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.webkit.WebChromeClient.FileChooserParams) real).createIntent());
        }

        public java.lang.String[] getAcceptTypes() {
            return ((android.webkit.WebChromeClient.FileChooserParams) real).getAcceptTypes();
        }

        public java.lang.String getFilenameHint() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebChromeClient$FileChooserParams#getFilenameHint()");
        }

        public int getMode() {
            return ((android.webkit.WebChromeClient.FileChooserParams) real).getMode();
        }

        public java.lang.CharSequence getTitle() {
            return ((android.webkit.WebChromeClient.FileChooserParams) real).getTitle();
        }

        public boolean isCaptureEnabled() {
            return ((android.webkit.WebChromeClient.FileChooserParams) real).isCaptureEnabled();
        }

        public static android.net.Uri[] parseResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            return android.webkit.WebChromeClient.FileChooserParams.parseResult(arg0, arg1 == null ? null : arg1.getReal());
        }

        public static final int MODE_OPEN = android.webkit.WebChromeClient.FileChooserParams.MODE_OPEN;
        public static final int MODE_OPEN_MULTIPLE = android.webkit.WebChromeClient.FileChooserParams.MODE_OPEN_MULTIPLE;
        public static final int MODE_SAVE = android.webkit.WebChromeClient.FileChooserParams.MODE_SAVE;

    }
}
