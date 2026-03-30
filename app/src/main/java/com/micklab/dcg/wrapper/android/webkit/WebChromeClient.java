// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebChromeClient {
    private final android.webkit.WebChromeClient real;

    public WebChromeClient(android.webkit.WebChromeClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient wrap(android.webkit.WebChromeClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient(real);
    }

    public android.webkit.WebChromeClient unwrap() {
        return real;
    }

    public WebChromeClient() {
        this(new android.webkit.WebChromeClient());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDefaultVideoPoster() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getDefaultVideoPoster());
    }

    public com.micklab.dcg.wrapper.android.view.View getVideoLoadingProgressView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getVideoLoadingProgressView());
    }

    public void onCloseWindow(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        real.onCloseWindow(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onConsoleMessage(com.micklab.dcg.wrapper.android.webkit.ConsoleMessage arg0) {
        return real.onConsoleMessage(arg0 == null ? null : arg0.unwrap());
    }

    public void onConsoleMessage(java.lang.String arg0, int arg1, java.lang.String arg2) {
        real.onConsoleMessage(arg0, arg1, arg2);
    }

    public boolean onCreateWindow(com.micklab.dcg.wrapper.android.webkit.WebView arg0, boolean arg1, boolean arg2, com.micklab.dcg.wrapper.android.os.Message arg3) {
        return real.onCreateWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onExceededDatabaseQuota(java.lang.String arg0, java.lang.String arg1, long arg2, long arg3, long arg4, com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater arg5) {
        real.onExceededDatabaseQuota(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void onGeolocationPermissionsHidePrompt() {
        real.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(java.lang.String arg0, com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback arg1) {
        real.onGeolocationPermissionsShowPrompt(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onHideCustomView() {
        real.onHideCustomView();
    }

    public boolean onJsAlert(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return real.onJsAlert(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onJsBeforeUnload(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return real.onJsBeforeUnload(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onJsConfirm(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.webkit.JsResult arg3) {
        return real.onJsConfirm(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onJsPrompt(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.webkit.JsPromptResult arg4) {
        return real.onJsPrompt(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public boolean onJsTimeout() {
        return real.onJsTimeout();
    }

    public void onPermissionRequest(com.micklab.dcg.wrapper.android.webkit.PermissionRequest arg0) {
        real.onPermissionRequest(arg0 == null ? null : arg0.unwrap());
    }

    public void onPermissionRequestCanceled(com.micklab.dcg.wrapper.android.webkit.PermissionRequest arg0) {
        real.onPermissionRequestCanceled(arg0 == null ? null : arg0.unwrap());
    }

    public void onProgressChanged(com.micklab.dcg.wrapper.android.webkit.WebView arg0, int arg1) {
        real.onProgressChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onReceivedIcon(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        real.onReceivedIcon(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onReceivedTitle(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        real.onReceivedTitle(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onReceivedTouchIconUrl(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, boolean arg2) {
        real.onReceivedTouchIconUrl(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onRequestFocus(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        real.onRequestFocus(arg0 == null ? null : arg0.unwrap());
    }

    public void onShowCustomView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback arg1) {
        real.onShowCustomView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onShowCustomView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback arg2) {
        real.onShowCustomView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final class CustomViewCallback {
        private final android.webkit.WebChromeClient.CustomViewCallback real;

        public CustomViewCallback(android.webkit.WebChromeClient.CustomViewCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback wrap(android.webkit.WebChromeClient.CustomViewCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient.CustomViewCallback(real);
        }

        public android.webkit.WebChromeClient.CustomViewCallback unwrap() {
            return real;
        }

        public void onCustomViewHidden() {
            real.onCustomViewHidden();
        }

    }
    public static final class FileChooserParams {
        private final android.webkit.WebChromeClient.FileChooserParams real;

        public FileChooserParams(android.webkit.WebChromeClient.FileChooserParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebChromeClient.FileChooserParams wrap(android.webkit.WebChromeClient.FileChooserParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebChromeClient.FileChooserParams(real);
        }

        public android.webkit.WebChromeClient.FileChooserParams unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.content.Intent createIntent() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createIntent());
        }

        public java.lang.String[] getAcceptTypes() {
            return real.getAcceptTypes();
        }

        public java.lang.String getFilenameHint() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebChromeClient$FileChooserParams#getFilenameHint()");
        }

        public int getMode() {
            return real.getMode();
        }

        public java.lang.CharSequence getTitle() {
            return real.getTitle();
        }

        public boolean isCaptureEnabled() {
            return real.isCaptureEnabled();
        }

        public static android.net.Uri[] parseResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            return android.webkit.WebChromeClient.FileChooserParams.parseResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public static final int MODE_OPEN = android.webkit.WebChromeClient.FileChooserParams.MODE_OPEN;
        public static final int MODE_OPEN_MULTIPLE = android.webkit.WebChromeClient.FileChooserParams.MODE_OPEN_MULTIPLE;
        public static final int MODE_SAVE = android.webkit.WebChromeClient.FileChooserParams.MODE_SAVE;

    }
}
