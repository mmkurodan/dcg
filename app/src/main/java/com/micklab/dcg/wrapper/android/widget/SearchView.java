// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SearchView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SearchView wrap(android.widget.SearchView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SearchView getReal() {
        return (android.widget.SearchView) real;
    }

    public android.widget.SearchView unwrap() {
        return getReal();
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void clearFocus() {
        ((android.widget.SearchView) real).clearFocus();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.SearchView) real).getAccessibilityClassName();
    }

    public int getImeOptions() {
        return ((android.widget.SearchView) real).getImeOptions();
    }

    public int getInputType() {
        return ((android.widget.SearchView) real).getInputType();
    }

    public int getMaxWidth() {
        return ((android.widget.SearchView) real).getMaxWidth();
    }

    public java.lang.CharSequence getQuery() {
        return ((android.widget.SearchView) real).getQuery();
    }

    public java.lang.CharSequence getQueryHint() {
        return ((android.widget.SearchView) real).getQueryHint();
    }

    public com.micklab.dcg.wrapper.android.widget.CursorAdapter getSuggestionsAdapter() {
        return com.micklab.dcg.wrapper.android.widget.CursorAdapter.wrap(((android.widget.SearchView) real).getSuggestionsAdapter());
    }

    public boolean isIconfiedByDefault() {
        return ((android.widget.SearchView) real).isIconfiedByDefault();
    }

    public boolean isIconified() {
        return ((android.widget.SearchView) real).isIconified();
    }

    public boolean isIconifiedByDefault() {
        return ((android.widget.SearchView) real).isIconifiedByDefault();
    }

    public boolean isQueryRefinementEnabled() {
        return ((android.widget.SearchView) real).isQueryRefinementEnabled();
    }

    public boolean isSubmitButtonEnabled() {
        return ((android.widget.SearchView) real).isSubmitButtonEnabled();
    }

    public void onActionViewCollapsed() {
        ((android.widget.SearchView) real).onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        ((android.widget.SearchView) real).onActionViewExpanded();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.SearchView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.widget.SearchView) real).onWindowFocusChanged(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.widget.SearchView) real).requestFocus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setIconified(boolean arg0) {
        ((android.widget.SearchView) real).setIconified(arg0);
    }

    public void setIconifiedByDefault(boolean arg0) {
        ((android.widget.SearchView) real).setIconifiedByDefault(arg0);
    }

    public void setImeOptions(int arg0) {
        ((android.widget.SearchView) real).setImeOptions(arg0);
    }

    public void setInputType(int arg0) {
        ((android.widget.SearchView) real).setInputType(arg0);
    }

    public void setMaxWidth(int arg0) {
        ((android.widget.SearchView) real).setMaxWidth(arg0);
    }

    public void setOnCloseListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener arg0) {
        ((android.widget.SearchView) real).setOnCloseListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnQueryTextFocusChangeListener(com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener arg0) {
        ((android.widget.SearchView) real).setOnQueryTextFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnQueryTextListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener arg0) {
        ((android.widget.SearchView) real).setOnQueryTextListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSearchClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.SearchView) real).setOnSearchClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSuggestionListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener arg0) {
        ((android.widget.SearchView) real).setOnSuggestionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setQuery(java.lang.CharSequence arg0, boolean arg1) {
        ((android.widget.SearchView) real).setQuery(arg0, arg1);
    }

    public void setQueryHint(java.lang.CharSequence arg0) {
        ((android.widget.SearchView) real).setQueryHint(arg0);
    }

    public void setQueryRefinementEnabled(boolean arg0) {
        ((android.widget.SearchView) real).setQueryRefinementEnabled(arg0);
    }

    public void setSearchableInfo(com.micklab.dcg.wrapper.android.app.SearchableInfo arg0) {
        ((android.widget.SearchView) real).setSearchableInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setSubmitButtonEnabled(boolean arg0) {
        ((android.widget.SearchView) real).setSubmitButtonEnabled(arg0);
    }

    public void setSuggestionsAdapter(com.micklab.dcg.wrapper.android.widget.CursorAdapter arg0) {
        ((android.widget.SearchView) real).setSuggestionsAdapter(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnCloseListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCloseListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener wrap(android.widget.SearchView.OnCloseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SearchView.OnCloseListener getReal() {
            return (android.widget.SearchView.OnCloseListener) real;
        }

        public android.widget.SearchView.OnCloseListener unwrap() {
            return getReal();
        }

        public boolean onClose() {
            return ((android.widget.SearchView.OnCloseListener) real).onClose();
        }

    }
    public static final class OnQueryTextListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnQueryTextListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener wrap(android.widget.SearchView.OnQueryTextListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SearchView.OnQueryTextListener getReal() {
            return (android.widget.SearchView.OnQueryTextListener) real;
        }

        public android.widget.SearchView.OnQueryTextListener unwrap() {
            return getReal();
        }

        public boolean onQueryTextChange(java.lang.String arg0) {
            return ((android.widget.SearchView.OnQueryTextListener) real).onQueryTextChange(arg0);
        }

        public boolean onQueryTextSubmit(java.lang.String arg0) {
            return ((android.widget.SearchView.OnQueryTextListener) real).onQueryTextSubmit(arg0);
        }

    }
    public static final class OnSuggestionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSuggestionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener wrap(android.widget.SearchView.OnSuggestionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SearchView.OnSuggestionListener getReal() {
            return (android.widget.SearchView.OnSuggestionListener) real;
        }

        public android.widget.SearchView.OnSuggestionListener unwrap() {
            return getReal();
        }

        public boolean onSuggestionClick(int arg0) {
            return ((android.widget.SearchView.OnSuggestionListener) real).onSuggestionClick(arg0);
        }

        public boolean onSuggestionSelect(int arg0) {
            return ((android.widget.SearchView.OnSuggestionListener) real).onSuggestionSelect(arg0);
        }

    }
}
