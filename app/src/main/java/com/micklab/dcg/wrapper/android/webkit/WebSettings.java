// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebSettings {
    private final android.webkit.WebSettings real;

    public WebSettings(android.webkit.WebSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebSettings wrap(android.webkit.WebSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings(real);
    }

    public android.webkit.WebSettings unwrap() {
        return real;
    }

    public boolean enableSmoothTransition() {
        return real.enableSmoothTransition();
    }

    public boolean getAllowContentAccess() {
        return real.getAllowContentAccess();
    }

    public boolean getAllowFileAccess() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#getAllowFileAccess()");
    }

    public boolean getAllowFileAccessFromFileURLs() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#getAllowFileAccessFromFileURLs()");
    }

    public boolean getAllowUniversalAccessFromFileURLs() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#getAllowUniversalAccessFromFileURLs()");
    }

    public boolean getBlockNetworkImage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#getBlockNetworkImage()");
    }

    public boolean getBlockNetworkLoads() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#getBlockNetworkLoads()");
    }

    public boolean getBuiltInZoomControls() {
        return real.getBuiltInZoomControls();
    }

    public int getCacheMode() {
        return real.getCacheMode();
    }

    public java.lang.String getCursiveFontFamily() {
        return real.getCursiveFontFamily();
    }

    public boolean getDatabaseEnabled() {
        return real.getDatabaseEnabled();
    }

    public java.lang.String getDatabasePath() {
        return real.getDatabasePath();
    }

    public int getDefaultFixedFontSize() {
        return real.getDefaultFixedFontSize();
    }

    public int getDefaultFontSize() {
        return real.getDefaultFontSize();
    }

    public java.lang.String getDefaultTextEncodingName() {
        return real.getDefaultTextEncodingName();
    }

    public static java.lang.String getDefaultUserAgent(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.webkit.WebSettings.getDefaultUserAgent(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity getDefaultZoom() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity.wrap(real.getDefaultZoom());
    }

    public int getDisabledActionModeMenuItems() {
        return real.getDisabledActionModeMenuItems();
    }

    public boolean getDisplayZoomControls() {
        return real.getDisplayZoomControls();
    }

    public boolean getDomStorageEnabled() {
        return real.getDomStorageEnabled();
    }

    public java.lang.String getFantasyFontFamily() {
        return real.getFantasyFontFamily();
    }

    public java.lang.String getFixedFontFamily() {
        return real.getFixedFontFamily();
    }

    public int getForceDark() {
        return real.getForceDark();
    }

    public boolean getJavaScriptCanOpenWindowsAutomatically() {
        return real.getJavaScriptCanOpenWindowsAutomatically();
    }

    public boolean getJavaScriptEnabled() {
        return real.getJavaScriptEnabled();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm getLayoutAlgorithm() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(real.getLayoutAlgorithm());
    }

    public boolean getLightTouchEnabled() {
        return real.getLightTouchEnabled();
    }

    public boolean getLoadWithOverviewMode() {
        return real.getLoadWithOverviewMode();
    }

    public boolean getLoadsImagesAutomatically() {
        return real.getLoadsImagesAutomatically();
    }

    public boolean getMediaPlaybackRequiresUserGesture() {
        return real.getMediaPlaybackRequiresUserGesture();
    }

    public int getMinimumFontSize() {
        return real.getMinimumFontSize();
    }

    public int getMinimumLogicalFontSize() {
        return real.getMinimumLogicalFontSize();
    }

    public int getMixedContentMode() {
        return real.getMixedContentMode();
    }

    public boolean getOffscreenPreRaster() {
        return real.getOffscreenPreRaster();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState getPluginState() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState.wrap(real.getPluginState());
    }

    public boolean getSafeBrowsingEnabled() {
        return real.getSafeBrowsingEnabled();
    }

    public java.lang.String getSansSerifFontFamily() {
        return real.getSansSerifFontFamily();
    }

    public boolean getSaveFormData() {
        return real.getSaveFormData();
    }

    public boolean getSavePassword() {
        return real.getSavePassword();
    }

    public java.lang.String getSerifFontFamily() {
        return real.getSerifFontFamily();
    }

    public java.lang.String getStandardFontFamily() {
        return real.getStandardFontFamily();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize getTextSize() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(real.getTextSize());
    }

    public int getTextZoom() {
        return real.getTextZoom();
    }

    public boolean getUseWideViewPort() {
        return real.getUseWideViewPort();
    }

    public java.lang.String getUserAgentString() {
        return real.getUserAgentString();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return real.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean arg0) {
        real.setAlgorithmicDarkeningAllowed(arg0);
    }

    public void setAllowContentAccess(boolean arg0) {
        real.setAllowContentAccess(arg0);
    }

    public void setAllowFileAccess(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#setAllowFileAccess(boolean)");
    }

    public void setAllowFileAccessFromFileURLs(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#setAllowFileAccessFromFileURLs(boolean)");
    }

    public void setAllowUniversalAccessFromFileURLs(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#setAllowUniversalAccessFromFileURLs(boolean)");
    }

    public void setBlockNetworkImage(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#setBlockNetworkImage(boolean)");
    }

    public void setBlockNetworkLoads(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebSettings#setBlockNetworkLoads(boolean)");
    }

    public void setBuiltInZoomControls(boolean arg0) {
        real.setBuiltInZoomControls(arg0);
    }

    public void setCacheMode(int arg0) {
        real.setCacheMode(arg0);
    }

    public void setCursiveFontFamily(java.lang.String arg0) {
        real.setCursiveFontFamily(arg0);
    }

    public void setDatabaseEnabled(boolean arg0) {
        real.setDatabaseEnabled(arg0);
    }

    public void setDatabasePath(java.lang.String arg0) {
        real.setDatabasePath(arg0);
    }

    public void setDefaultFixedFontSize(int arg0) {
        real.setDefaultFixedFontSize(arg0);
    }

    public void setDefaultFontSize(int arg0) {
        real.setDefaultFontSize(arg0);
    }

    public void setDefaultTextEncodingName(java.lang.String arg0) {
        real.setDefaultTextEncodingName(arg0);
    }

    public void setDefaultZoom(com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity arg0) {
        real.setDefaultZoom(arg0 == null ? null : arg0.unwrap());
    }

    public void setDisabledActionModeMenuItems(int arg0) {
        real.setDisabledActionModeMenuItems(arg0);
    }

    public void setDisplayZoomControls(boolean arg0) {
        real.setDisplayZoomControls(arg0);
    }

    public void setDomStorageEnabled(boolean arg0) {
        real.setDomStorageEnabled(arg0);
    }

    public void setEnableSmoothTransition(boolean arg0) {
        real.setEnableSmoothTransition(arg0);
    }

    public void setFantasyFontFamily(java.lang.String arg0) {
        real.setFantasyFontFamily(arg0);
    }

    public void setFixedFontFamily(java.lang.String arg0) {
        real.setFixedFontFamily(arg0);
    }

    public void setForceDark(int arg0) {
        real.setForceDark(arg0);
    }

    public void setGeolocationDatabasePath(java.lang.String arg0) {
        real.setGeolocationDatabasePath(arg0);
    }

    public void setGeolocationEnabled(boolean arg0) {
        real.setGeolocationEnabled(arg0);
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean arg0) {
        real.setJavaScriptCanOpenWindowsAutomatically(arg0);
    }

    public void setJavaScriptEnabled(boolean arg0) {
        real.setJavaScriptEnabled(arg0);
    }

    public void setLayoutAlgorithm(com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm arg0) {
        real.setLayoutAlgorithm(arg0 == null ? null : arg0.unwrap());
    }

    public void setLightTouchEnabled(boolean arg0) {
        real.setLightTouchEnabled(arg0);
    }

    public void setLoadWithOverviewMode(boolean arg0) {
        real.setLoadWithOverviewMode(arg0);
    }

    public void setLoadsImagesAutomatically(boolean arg0) {
        real.setLoadsImagesAutomatically(arg0);
    }

    public void setMediaPlaybackRequiresUserGesture(boolean arg0) {
        real.setMediaPlaybackRequiresUserGesture(arg0);
    }

    public void setMinimumFontSize(int arg0) {
        real.setMinimumFontSize(arg0);
    }

    public void setMinimumLogicalFontSize(int arg0) {
        real.setMinimumLogicalFontSize(arg0);
    }

    public void setMixedContentMode(int arg0) {
        real.setMixedContentMode(arg0);
    }

    public void setNeedInitialFocus(boolean arg0) {
        real.setNeedInitialFocus(arg0);
    }

    public void setOffscreenPreRaster(boolean arg0) {
        real.setOffscreenPreRaster(arg0);
    }

    public void setPluginState(com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState arg0) {
        real.setPluginState(arg0 == null ? null : arg0.unwrap());
    }

    public void setRenderPriority(com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority arg0) {
        real.setRenderPriority(arg0 == null ? null : arg0.unwrap());
    }

    public void setSafeBrowsingEnabled(boolean arg0) {
        real.setSafeBrowsingEnabled(arg0);
    }

    public void setSansSerifFontFamily(java.lang.String arg0) {
        real.setSansSerifFontFamily(arg0);
    }

    public void setSaveFormData(boolean arg0) {
        real.setSaveFormData(arg0);
    }

    public void setSavePassword(boolean arg0) {
        real.setSavePassword(arg0);
    }

    public void setSerifFontFamily(java.lang.String arg0) {
        real.setSerifFontFamily(arg0);
    }

    public void setStandardFontFamily(java.lang.String arg0) {
        real.setStandardFontFamily(arg0);
    }

    public void setSupportMultipleWindows(boolean arg0) {
        real.setSupportMultipleWindows(arg0);
    }

    public void setSupportZoom(boolean arg0) {
        real.setSupportZoom(arg0);
    }

    public void setTextSize(com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize arg0) {
        real.setTextSize(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextZoom(int arg0) {
        real.setTextZoom(arg0);
    }

    public void setUseWideViewPort(boolean arg0) {
        real.setUseWideViewPort(arg0);
    }

    public void setUserAgentString(java.lang.String arg0) {
        real.setUserAgentString(arg0);
    }

    public boolean supportMultipleWindows() {
        return real.supportMultipleWindows();
    }

    public boolean supportZoom() {
        return real.supportZoom();
    }

    public static final int FORCE_DARK_AUTO = android.webkit.WebSettings.FORCE_DARK_AUTO;
    public static final int FORCE_DARK_OFF = android.webkit.WebSettings.FORCE_DARK_OFF;
    public static final int FORCE_DARK_ON = android.webkit.WebSettings.FORCE_DARK_ON;
    public static final int LOAD_CACHE_ONLY = android.webkit.WebSettings.LOAD_CACHE_ONLY;
    public static final int LOAD_DEFAULT = android.webkit.WebSettings.LOAD_DEFAULT;
    public static final int LOAD_NORMAL = android.webkit.WebSettings.LOAD_NORMAL;
    public static final int LOAD_NO_CACHE = android.webkit.WebSettings.LOAD_NO_CACHE;
    public static final int MENU_ITEM_NONE = android.webkit.WebSettings.MENU_ITEM_NONE;
    public static final int MENU_ITEM_PROCESS_TEXT = android.webkit.WebSettings.MENU_ITEM_PROCESS_TEXT;
    public static final int MENU_ITEM_SHARE = android.webkit.WebSettings.MENU_ITEM_SHARE;
    public static final int MENU_ITEM_WEB_SEARCH = android.webkit.WebSettings.MENU_ITEM_WEB_SEARCH;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = android.webkit.WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE;
    public static final int MIXED_CONTENT_NEVER_ALLOW = android.webkit.WebSettings.MIXED_CONTENT_NEVER_ALLOW;

    public static final class LayoutAlgorithm {
        private final android.webkit.WebSettings.LayoutAlgorithm real;

        public LayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm wrap(android.webkit.WebSettings.LayoutAlgorithm real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm(real);
        }

        public android.webkit.WebSettings.LayoutAlgorithm unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(android.webkit.WebSettings.LayoutAlgorithm.valueOf(arg0));
        }

        public static android.webkit.WebSettings.LayoutAlgorithm[] values() {
            return android.webkit.WebSettings.LayoutAlgorithm.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm NARROW_COLUMNS = com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm NORMAL = com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm SINGLE_COLUMN = com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm TEXT_AUTOSIZING = com.micklab.dcg.wrapper.android.webkit.WebSettings.LayoutAlgorithm.wrap(android.webkit.WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);

    }
    public static final class PluginState {
        private final android.webkit.WebSettings.PluginState real;

        public PluginState(android.webkit.WebSettings.PluginState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState wrap(android.webkit.WebSettings.PluginState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState(real);
        }

        public android.webkit.WebSettings.PluginState unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState.wrap(android.webkit.WebSettings.PluginState.valueOf(arg0));
        }

        public static android.webkit.WebSettings.PluginState[] values() {
            return android.webkit.WebSettings.PluginState.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState OFF = com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState.wrap(android.webkit.WebSettings.PluginState.OFF);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState ON = com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState.wrap(android.webkit.WebSettings.PluginState.ON);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState ON_DEMAND = com.micklab.dcg.wrapper.android.webkit.WebSettings.PluginState.wrap(android.webkit.WebSettings.PluginState.ON_DEMAND);

    }
    public static final class RenderPriority {
        private final android.webkit.WebSettings.RenderPriority real;

        public RenderPriority(android.webkit.WebSettings.RenderPriority real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority wrap(android.webkit.WebSettings.RenderPriority real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority(real);
        }

        public android.webkit.WebSettings.RenderPriority unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority.wrap(android.webkit.WebSettings.RenderPriority.valueOf(arg0));
        }

        public static android.webkit.WebSettings.RenderPriority[] values() {
            return android.webkit.WebSettings.RenderPriority.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority HIGH = com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority.wrap(android.webkit.WebSettings.RenderPriority.HIGH);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority LOW = com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority.wrap(android.webkit.WebSettings.RenderPriority.LOW);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority NORMAL = com.micklab.dcg.wrapper.android.webkit.WebSettings.RenderPriority.wrap(android.webkit.WebSettings.RenderPriority.NORMAL);

    }
    public static final class TextSize {
        private final android.webkit.WebSettings.TextSize real;

        public TextSize(android.webkit.WebSettings.TextSize real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize wrap(android.webkit.WebSettings.TextSize real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize(real);
        }

        public android.webkit.WebSettings.TextSize unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.valueOf(arg0));
        }

        public static android.webkit.WebSettings.TextSize[] values() {
            return android.webkit.WebSettings.TextSize.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize LARGER = com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.LARGER);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize LARGEST = com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.LARGEST);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize NORMAL = com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.NORMAL);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize SMALLER = com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.SMALLER);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize SMALLEST = com.micklab.dcg.wrapper.android.webkit.WebSettings.TextSize.wrap(android.webkit.WebSettings.TextSize.SMALLEST);

    }
    public static final class ZoomDensity {
        private final android.webkit.WebSettings.ZoomDensity real;

        public ZoomDensity(android.webkit.WebSettings.ZoomDensity real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity wrap(android.webkit.WebSettings.ZoomDensity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity(real);
        }

        public android.webkit.WebSettings.ZoomDensity unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity.wrap(android.webkit.WebSettings.ZoomDensity.valueOf(arg0));
        }

        public static android.webkit.WebSettings.ZoomDensity[] values() {
            return android.webkit.WebSettings.ZoomDensity.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity CLOSE = com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity.wrap(android.webkit.WebSettings.ZoomDensity.CLOSE);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity FAR = com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity.wrap(android.webkit.WebSettings.ZoomDensity.FAR);
        public static final com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity MEDIUM = com.micklab.dcg.wrapper.android.webkit.WebSettings.ZoomDensity.wrap(android.webkit.WebSettings.ZoomDensity.MEDIUM);

    }
}
