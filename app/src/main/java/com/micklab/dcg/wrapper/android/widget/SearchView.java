// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SearchView {
    private final android.widget.SearchView real;

    public SearchView(android.widget.SearchView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SearchView wrap(android.widget.SearchView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView(real);
    }

    public android.widget.SearchView unwrap() {
        return real;
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.unwrap()));
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public SearchView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SearchView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void clearFocus() {
        real.clearFocus();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getImeOptions() {
        return real.getImeOptions();
    }

    public int getInputType() {
        return real.getInputType();
    }

    public int getMaxWidth() {
        return real.getMaxWidth();
    }

    public java.lang.CharSequence getQuery() {
        return real.getQuery();
    }

    public java.lang.CharSequence getQueryHint() {
        return real.getQueryHint();
    }

    public com.micklab.dcg.wrapper.android.widget.CursorAdapter getSuggestionsAdapter() {
        return com.micklab.dcg.wrapper.android.widget.CursorAdapter.wrap(real.getSuggestionsAdapter());
    }

    public boolean isIconfiedByDefault() {
        return real.isIconfiedByDefault();
    }

    public boolean isIconified() {
        return real.isIconified();
    }

    public boolean isIconifiedByDefault() {
        return real.isIconifiedByDefault();
    }

    public boolean isQueryRefinementEnabled() {
        return real.isQueryRefinementEnabled();
    }

    public boolean isSubmitButtonEnabled() {
        return real.isSubmitButtonEnabled();
    }

    public void onActionViewCollapsed() {
        real.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        real.onActionViewExpanded();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.requestFocus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setIconified(boolean arg0) {
        real.setIconified(arg0);
    }

    public void setIconifiedByDefault(boolean arg0) {
        real.setIconifiedByDefault(arg0);
    }

    public void setImeOptions(int arg0) {
        real.setImeOptions(arg0);
    }

    public void setInputType(int arg0) {
        real.setInputType(arg0);
    }

    public void setMaxWidth(int arg0) {
        real.setMaxWidth(arg0);
    }

    public void setOnCloseListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener arg0) {
        real.setOnCloseListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnQueryTextFocusChangeListener(com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener arg0) {
        real.setOnQueryTextFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnQueryTextListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener arg0) {
        real.setOnQueryTextListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSearchClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnSearchClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSuggestionListener(com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener arg0) {
        real.setOnSuggestionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setQuery(java.lang.CharSequence arg0, boolean arg1) {
        real.setQuery(arg0, arg1);
    }

    public void setQueryHint(java.lang.CharSequence arg0) {
        real.setQueryHint(arg0);
    }

    public void setQueryRefinementEnabled(boolean arg0) {
        real.setQueryRefinementEnabled(arg0);
    }

    public void setSearchableInfo(com.micklab.dcg.wrapper.android.app.SearchableInfo arg0) {
        real.setSearchableInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setSubmitButtonEnabled(boolean arg0) {
        real.setSubmitButtonEnabled(arg0);
    }

    public void setSuggestionsAdapter(com.micklab.dcg.wrapper.android.widget.CursorAdapter arg0) {
        real.setSuggestionsAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnCloseListener {
        private final android.widget.SearchView.OnCloseListener real;

        public OnCloseListener(android.widget.SearchView.OnCloseListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener wrap(android.widget.SearchView.OnCloseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnCloseListener(real);
        }

        public android.widget.SearchView.OnCloseListener unwrap() {
            return real;
        }

        public boolean onClose() {
            return real.onClose();
        }

    }
    public static final class OnQueryTextListener {
        private final android.widget.SearchView.OnQueryTextListener real;

        public OnQueryTextListener(android.widget.SearchView.OnQueryTextListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener wrap(android.widget.SearchView.OnQueryTextListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnQueryTextListener(real);
        }

        public android.widget.SearchView.OnQueryTextListener unwrap() {
            return real;
        }

        public boolean onQueryTextChange(java.lang.String arg0) {
            return real.onQueryTextChange(arg0);
        }

        public boolean onQueryTextSubmit(java.lang.String arg0) {
            return real.onQueryTextSubmit(arg0);
        }

    }
    public static final class OnSuggestionListener {
        private final android.widget.SearchView.OnSuggestionListener real;

        public OnSuggestionListener(android.widget.SearchView.OnSuggestionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener wrap(android.widget.SearchView.OnSuggestionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SearchView.OnSuggestionListener(real);
        }

        public android.widget.SearchView.OnSuggestionListener unwrap() {
            return real;
        }

        public boolean onSuggestionClick(int arg0) {
            return real.onSuggestionClick(arg0);
        }

        public boolean onSuggestionSelect(int arg0) {
            return real.onSuggestionSelect(arg0);
        }

    }
}
