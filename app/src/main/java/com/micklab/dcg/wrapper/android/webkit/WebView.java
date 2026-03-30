// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebView {
    private final android.webkit.WebView real;

    public WebView(android.webkit.WebView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebView wrap(android.webkit.WebView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView(real);
    }

    public android.webkit.WebView unwrap() {
        return real;
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.unwrap()));
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, boolean arg3) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addJavascriptInterface(java.lang.Object arg0, java.lang.String arg1) {
        real.addJavascriptInterface(arg0, arg1);
    }

    public boolean canGoBack() {
        return real.canGoBack();
    }

    public boolean canGoBackOrForward(int arg0) {
        return real.canGoBackOrForward(arg0);
    }

    public boolean canGoForward() {
        return real.canGoForward();
    }

    public boolean canZoomIn() {
        return real.canZoomIn();
    }

    public boolean canZoomOut() {
        return real.canZoomOut();
    }

    public com.micklab.dcg.wrapper.android.graphics.Picture capturePicture() {
        return com.micklab.dcg.wrapper.android.graphics.Picture.wrap(real.capturePicture());
    }

    public void clearCache(boolean arg0) {
        real.clearCache(arg0);
    }

    public static void clearClientCertPreferences(java.lang.Runnable arg0) {
        android.webkit.WebView.clearClientCertPreferences(arg0);
    }

    public void clearFormData() {
        real.clearFormData();
    }

    public void clearHistory() {
        real.clearHistory();
    }

    public void clearMatches() {
        real.clearMatches();
    }

    public void clearSslPreferences() {
        real.clearSslPreferences();
    }

    public void clearView() {
        real.clearView();
    }

    public void computeScroll() {
        real.computeScroll();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList copyBackForwardList() {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(real.copyBackForwardList());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter createPrintDocumentAdapter() {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.wrap(real.createPrintDocumentAdapter());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.wrap(real.createPrintDocumentAdapter(arg0));
    }

    public android.webkit.WebMessagePort[] createWebMessageChannel() {
        return real.createWebMessageChannel();
    }

    public void destroy() {
        real.destroy();
    }

    public static void disableWebView() {
        android.webkit.WebView.disableWebView();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void documentHasImages(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.documentHasImages(arg0 == null ? null : arg0.unwrap());
    }

    public static void enableSlowWholeDocumentDraw() {
        android.webkit.WebView.enableSlowWholeDocumentDraw();
    }

    public static java.lang.String findAddress(java.lang.String arg0) {
        return android.webkit.WebView.findAddress(arg0);
    }

    public int findAll(java.lang.String arg0) {
        return real.findAll(arg0);
    }

    public void findAllAsync(java.lang.String arg0) {
        real.findAllAsync(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.findFocus());
    }

    public void findNext(boolean arg0) {
        real.findNext(arg0);
    }

    public void flingScroll(int arg0, int arg1) {
        real.flingScroll(arg0, arg1);
    }

    public void freeMemory() {
        real.freeMemory();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(real.getAccessibilityNodeProvider());
    }

    public com.micklab.dcg.wrapper.android.net.http.SslCertificate getCertificate() {
        return com.micklab.dcg.wrapper.android.net.http.SslCertificate.wrap(real.getCertificate());
    }

    public int getContentHeight() {
        return real.getContentHeight();
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PackageInfo getCurrentWebViewPackage() {
        return com.micklab.dcg.wrapper.android.content.pm.PackageInfo.wrap(android.webkit.WebView.getCurrentWebViewPackage());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFavicon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFavicon());
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(real.getHandler());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult getHitTestResult() {
        return com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult.wrap(real.getHitTestResult());
    }

    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1) {
        return real.getHttpAuthUsernamePassword(arg0, arg1);
    }

    public java.lang.String getOriginalUrl() {
        return real.getOriginalUrl();
    }

    public int getProgress() {
        return real.getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        return real.getRendererPriorityWaivedWhenNotVisible();
    }

    public int getRendererRequestedPriority() {
        return real.getRendererRequestedPriority();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.webkit.WebView.getSafeBrowsingPrivacyPolicyUrl());
    }

    public float getScale() {
        return real.getScale();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings getSettings() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.wrap(real.getSettings());
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(real.getTextClassifier());
    }

    public java.lang.String getTitle() {
        return real.getTitle();
    }

    public java.lang.String getUrl() {
        return real.getUrl();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebChromeClient getWebChromeClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebChromeClient.wrap(real.getWebChromeClient());
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebView#getWebViewClassLoader()");
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewClient getWebViewClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewClient.wrap(real.getWebViewClient());
    }

    public com.micklab.dcg.wrapper.android.os.Looper getWebViewLooper() {
        return com.micklab.dcg.wrapper.android.os.Looper.wrap(real.getWebViewLooper());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess getWebViewRenderProcess() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess.wrap(real.getWebViewRenderProcess());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient.wrap(real.getWebViewRenderProcessClient());
    }

    public void goBack() {
        real.goBack();
    }

    public void goBackOrForward(int arg0) {
        real.goBackOrForward(arg0);
    }

    public void goForward() {
        real.goForward();
    }

    public void invokeZoomPicker() {
        real.invokeZoomPicker();
    }

    public boolean isPrivateBrowsingEnabled() {
        return real.isPrivateBrowsingEnabled();
    }

    public boolean isVisibleToUserForAutofill(int arg0) {
        return real.isVisibleToUserForAutofill(arg0);
    }

    public void loadData(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        real.loadData(arg0, arg1, arg2);
    }

    public void loadDataWithBaseURL(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        real.loadDataWithBaseURL(arg0, arg1, arg2, arg3, arg4);
    }

    public void loadUrl(java.lang.String arg0) {
        real.loadUrl(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.onApplyWindowInsets(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onCheckIsTextEditor() {
        return real.onCheckIsTextEditor();
    }

    public void onChildViewAdded(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.onChildViewAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onChildViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.onChildViewRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.onCreateInputConnection(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return real.onDragEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onFinishTemporaryDetach() {
        real.onFinishTemporaryDetach();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onGlobalFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.onGlobalFocusChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onPause() {
        real.onPause();
    }

    public void onProvideAutofillVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideAutofillVirtualStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideContentCaptureStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onProvideVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.onProvideVirtualStructure(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void onResume() {
        real.onResume();
    }

    public void onStartTemporaryDetach() {
        real.onStartTemporaryDetach();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public boolean overlayHorizontalScrollbar() {
        return real.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return real.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean arg0) {
        return real.pageDown(arg0);
    }

    public boolean pageUp(boolean arg0) {
        return real.pageUp(arg0);
    }

    public void pauseTimers() {
        real.pauseTimers();
    }

    public boolean performLongClick() {
        return real.performLongClick();
    }

    public void postUrl(java.lang.String arg0, byte[] arg1) {
        real.postUrl(arg0, arg1);
    }

    public void postVisualStateCallback(long arg0, com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback arg1) {
        real.postVisualStateCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void postWebMessage(com.micklab.dcg.wrapper.android.webkit.WebMessage arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.postWebMessage(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void reload() {
        real.reload();
    }

    public void removeJavascriptInterface(java.lang.String arg0) {
        real.removeJavascriptInterface(arg0);
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return real.requestChildRectangleOnScreen(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.requestFocus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void requestFocusNodeHref(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.requestFocusNodeHref(arg0 == null ? null : arg0.unwrap());
    }

    public void requestImageRef(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.requestImageRef(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList restoreState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(real.restoreState(arg0 == null ? null : arg0.unwrap()));
    }

    public void resumeTimers() {
        real.resumeTimers();
    }

    public void savePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        real.savePassword(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList saveState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(real.saveState(arg0 == null ? null : arg0.unwrap()));
    }

    public void saveWebArchive(java.lang.String arg0) {
        real.saveWebArchive(arg0);
    }

    public void setBackgroundColor(int arg0) {
        real.setBackgroundColor(arg0);
    }

    public void setCertificate(com.micklab.dcg.wrapper.android.net.http.SslCertificate arg0) {
        real.setCertificate(arg0 == null ? null : arg0.unwrap());
    }

    public static void setDataDirectorySuffix(java.lang.String arg0) {
        android.webkit.WebView.setDataDirectorySuffix(arg0);
    }

    public void setDownloadListener(com.micklab.dcg.wrapper.android.webkit.DownloadListener arg0) {
        real.setDownloadListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setFindListener(com.micklab.dcg.wrapper.android.webkit.WebView.FindListener arg0) {
        real.setFindListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setHorizontalScrollbarOverlay(boolean arg0) {
        real.setHorizontalScrollbarOverlay(arg0);
    }

    public void setHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        real.setHttpAuthUsernamePassword(arg0, arg1, arg2, arg3);
    }

    public void setInitialScale(int arg0) {
        real.setInitialScale(arg0);
    }

    public void setLayerType(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.setLayerType(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
        real.setLayoutParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setMapTrackballToArrowKeys(boolean arg0) {
        real.setMapTrackballToArrowKeys(arg0);
    }

    public void setNetworkAvailable(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebView#setNetworkAvailable(boolean)");
    }

    public void setOverScrollMode(int arg0) {
        real.setOverScrollMode(arg0);
    }

    public void setPictureListener(com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener arg0) {
        real.setPictureListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRendererPriorityPolicy(int arg0, boolean arg1) {
        real.setRendererPriorityPolicy(arg0, arg1);
    }

    public void setScrollBarStyle(int arg0) {
        real.setScrollBarStyle(arg0);
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        real.setTextClassifier(arg0 == null ? null : arg0.unwrap());
    }

    public void setVerticalScrollbarOverlay(boolean arg0) {
        real.setVerticalScrollbarOverlay(arg0);
    }

    public void setWebChromeClient(com.micklab.dcg.wrapper.android.webkit.WebChromeClient arg0) {
        real.setWebChromeClient(arg0 == null ? null : arg0.unwrap());
    }

    public static void setWebContentsDebuggingEnabled(boolean arg0) {
        android.webkit.WebView.setWebContentsDebuggingEnabled(arg0);
    }

    public void setWebViewClient(com.micklab.dcg.wrapper.android.webkit.WebViewClient arg0) {
        real.setWebViewClient(arg0 == null ? null : arg0.unwrap());
    }

    public void setWebViewRenderProcessClient(com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient arg0) {
        real.setWebViewRenderProcessClient(arg0 == null ? null : arg0.unwrap());
    }

    public void setWebViewRenderProcessClient(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient arg1) {
        real.setWebViewRenderProcessClient(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public boolean showFindDialog(java.lang.String arg0, boolean arg1) {
        return real.showFindDialog(arg0, arg1);
    }

    public void stopLoading() {
        real.stopLoading();
    }

    public void zoomBy(float arg0) {
        real.zoomBy(arg0);
    }

    public boolean zoomIn() {
        return real.zoomIn();
    }

    public boolean zoomOut() {
        return real.zoomOut();
    }

    public static final int RENDERER_PRIORITY_BOUND = android.webkit.WebView.RENDERER_PRIORITY_BOUND;
    public static final int RENDERER_PRIORITY_IMPORTANT = android.webkit.WebView.RENDERER_PRIORITY_IMPORTANT;
    public static final int RENDERER_PRIORITY_WAIVED = android.webkit.WebView.RENDERER_PRIORITY_WAIVED;
    public static final java.lang.String SCHEME_GEO = android.webkit.WebView.SCHEME_GEO;
    public static final java.lang.String SCHEME_MAILTO = android.webkit.WebView.SCHEME_MAILTO;
    public static final java.lang.String SCHEME_TEL = android.webkit.WebView.SCHEME_TEL;

    public static final class FindListener {
        private final android.webkit.WebView.FindListener real;

        public FindListener(android.webkit.WebView.FindListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.FindListener wrap(android.webkit.WebView.FindListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.FindListener(real);
        }

        public android.webkit.WebView.FindListener unwrap() {
            return real;
        }

        public void onFindResultReceived(int arg0, int arg1, boolean arg2) {
            real.onFindResultReceived(arg0, arg1, arg2);
        }

    }
    public static final class HitTestResult {
        private final android.webkit.WebView.HitTestResult real;

        public HitTestResult(android.webkit.WebView.HitTestResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult wrap(android.webkit.WebView.HitTestResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult(real);
        }

        public android.webkit.WebView.HitTestResult unwrap() {
            return real;
        }

        public java.lang.String getExtra() {
            return real.getExtra();
        }

        public int getType() {
            return real.getType();
        }

        public static final int ANCHOR_TYPE = android.webkit.WebView.HitTestResult.ANCHOR_TYPE;
        public static final int EDIT_TEXT_TYPE = android.webkit.WebView.HitTestResult.EDIT_TEXT_TYPE;
        public static final int EMAIL_TYPE = android.webkit.WebView.HitTestResult.EMAIL_TYPE;
        public static final int GEO_TYPE = android.webkit.WebView.HitTestResult.GEO_TYPE;
        public static final int IMAGE_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.IMAGE_ANCHOR_TYPE;
        public static final int IMAGE_TYPE = android.webkit.WebView.HitTestResult.IMAGE_TYPE;
        public static final int PHONE_TYPE = android.webkit.WebView.HitTestResult.PHONE_TYPE;
        public static final int SRC_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.SRC_ANCHOR_TYPE;
        public static final int SRC_IMAGE_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE;
        public static final int UNKNOWN_TYPE = android.webkit.WebView.HitTestResult.UNKNOWN_TYPE;

    }
    public static final class PictureListener {
        private final android.webkit.WebView.PictureListener real;

        public PictureListener(android.webkit.WebView.PictureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener wrap(android.webkit.WebView.PictureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener(real);
        }

        public android.webkit.WebView.PictureListener unwrap() {
            return real;
        }

        public void onNewPicture(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.graphics.Picture arg1) {
            real.onNewPicture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class VisualStateCallback {
        private final android.webkit.WebView.VisualStateCallback real;

        public VisualStateCallback(android.webkit.WebView.VisualStateCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback wrap(android.webkit.WebView.VisualStateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback(real);
        }

        public android.webkit.WebView.VisualStateCallback unwrap() {
            return real;
        }

        public void onComplete(long arg0) {
            real.onComplete(arg0);
        }

    }
}
