// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextView wrap(android.widget.TextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TextView getReal() {
        return (android.widget.TextView) real;
    }

    public android.widget.TextView unwrap() {
        return getReal();
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.widget.TextView) real).addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void addTextChangedListener(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.TextView) real).addTextChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void append(java.lang.CharSequence arg0) {
        ((android.widget.TextView) real).append(arg0);
    }

    public void append(java.lang.CharSequence arg0, int arg1, int arg2) {
        ((android.widget.TextView) real).append(arg0, arg1, arg2);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.TextView) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void beginBatchEdit() {
        ((android.widget.TextView) real).beginBatchEdit();
    }

    public boolean bringPointIntoView(int arg0) {
        return ((android.widget.TextView) real).bringPointIntoView(arg0);
    }

    public boolean bringPointIntoView(int arg0, boolean arg1) {
        return ((android.widget.TextView) real).bringPointIntoView(arg0, arg1);
    }

    public void cancelLongPress() {
        ((android.widget.TextView) real).cancelLongPress();
    }

    public void clearComposingText() {
        ((android.widget.TextView) real).clearComposingText();
    }

    public void computeScroll() {
        ((android.widget.TextView) real).computeScroll();
    }

    public void debug(int arg0) {
        ((android.widget.TextView) real).debug(arg0);
    }

    public boolean didTouchFocusSelect() {
        return ((android.widget.TextView) real).didTouchFocusSelect();
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        ((android.widget.TextView) real).drawableHotspotChanged(arg0, arg1);
    }

    public void endBatchEdit() {
        ((android.widget.TextView) real).endBatchEdit();
    }

    public boolean extractText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        return ((android.widget.TextView) real).extractText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TextView) real).getAccessibilityClassName();
    }

    public int getAutoLinkMask() {
        return ((android.widget.TextView) real).getAutoLinkMask();
    }

    public int getAutoSizeMaxTextSize() {
        return ((android.widget.TextView) real).getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return ((android.widget.TextView) real).getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return ((android.widget.TextView) real).getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return ((android.widget.TextView) real).getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return ((android.widget.TextView) real).getAutoSizeTextType();
    }

    public java.lang.String[] getAutofillHints() {
        return ((android.widget.TextView) real).getAutofillHints();
    }

    public int getAutofillType() {
        return ((android.widget.TextView) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.TextView) real).getAutofillValue());
    }

    public int getBaseline() {
        return ((android.widget.TextView) real).getBaseline();
    }

    public int getBreakStrategy() {
        return ((android.widget.TextView) real).getBreakStrategy();
    }

    public int getCompoundDrawablePadding() {
        return ((android.widget.TextView) real).getCompoundDrawablePadding();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getCompoundDrawableTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.TextView) real).getCompoundDrawableTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCompoundDrawableTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.TextView) real).getCompoundDrawableTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.widget.TextView) real).getCompoundDrawableTintMode());
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawables() {
        return ((android.widget.TextView) real).getCompoundDrawables();
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() {
        return ((android.widget.TextView) real).getCompoundDrawablesRelative();
    }

    public int getCompoundPaddingBottom() {
        return ((android.widget.TextView) real).getCompoundPaddingBottom();
    }

    public int getCompoundPaddingEnd() {
        return ((android.widget.TextView) real).getCompoundPaddingEnd();
    }

    public int getCompoundPaddingLeft() {
        return ((android.widget.TextView) real).getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return ((android.widget.TextView) real).getCompoundPaddingRight();
    }

    public int getCompoundPaddingStart() {
        return ((android.widget.TextView) real).getCompoundPaddingStart();
    }

    public int getCompoundPaddingTop() {
        return ((android.widget.TextView) real).getCompoundPaddingTop();
    }

    public int getCurrentHintTextColor() {
        return ((android.widget.TextView) real).getCurrentHintTextColor();
    }

    public int getCurrentTextColor() {
        return ((android.widget.TextView) real).getCurrentTextColor();
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode.Callback getCustomInsertionActionModeCallback() {
        return com.micklab.dcg.wrapper.android.view.ActionMode.Callback.wrap(((android.widget.TextView) real).getCustomInsertionActionModeCallback());
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.micklab.dcg.wrapper.android.view.ActionMode.Callback.wrap(((android.widget.TextView) real).getCustomSelectionActionModeCallback());
    }

    public com.micklab.dcg.wrapper.android.text.Editable getEditableText() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.widget.TextView) real).getEditableText());
    }

    public com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt getEllipsize() {
        return com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(((android.widget.TextView) real).getEllipsize());
    }

    public java.lang.CharSequence getError() {
        return ((android.widget.TextView) real).getError();
    }

    public int getExtendedPaddingBottom() {
        return ((android.widget.TextView) real).getExtendedPaddingBottom();
    }

    public int getExtendedPaddingTop() {
        return ((android.widget.TextView) real).getExtendedPaddingTop();
    }

    public android.text.InputFilter[] getFilters() {
        return ((android.widget.TextView) real).getFilters();
    }

    public int getFirstBaselineToTopHeight() {
        return ((android.widget.TextView) real).getFirstBaselineToTopHeight();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.widget.TextView) real).getFocusedRect(arg0 == null ? null : arg0.getReal());
    }

    public int getFocusedSearchResultHighlightColor() {
        return ((android.widget.TextView) real).getFocusedSearchResultHighlightColor();
    }

    public int getFocusedSearchResultIndex() {
        return ((android.widget.TextView) real).getFocusedSearchResultIndex();
    }

    public java.lang.String getFontFeatureSettings() {
        return ((android.widget.TextView) real).getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return ((android.widget.TextView) real).getFontVariationSettings();
    }

    public boolean getFreezesText() {
        return ((android.widget.TextView) real).getFreezesText();
    }

    public int getGravity() {
        return ((android.widget.TextView) real).getGravity();
    }

    public int getHighlightColor() {
        return ((android.widget.TextView) real).getHighlightColor();
    }

    public com.micklab.dcg.wrapper.android.text.Highlights getHighlights() {
        return com.micklab.dcg.wrapper.android.text.Highlights.wrap(((android.widget.TextView) real).getHighlights());
    }

    public java.lang.CharSequence getHint() {
        return ((android.widget.TextView) real).getHint();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getHintTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.TextView) real).getHintTextColors());
    }

    public int getHyphenationFrequency() {
        return ((android.widget.TextView) real).getHyphenationFrequency();
    }

    public int getImeActionId() {
        return ((android.widget.TextView) real).getImeActionId();
    }

    public java.lang.CharSequence getImeActionLabel() {
        return ((android.widget.TextView) real).getImeActionLabel();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getImeHintLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.widget.TextView) real).getImeHintLocales());
    }

    public int getImeOptions() {
        return ((android.widget.TextView) real).getImeOptions();
    }

    public boolean getIncludeFontPadding() {
        return ((android.widget.TextView) real).getIncludeFontPadding();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getInputExtras(boolean arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.widget.TextView) real).getInputExtras(arg0));
    }

    public int getInputType() {
        return ((android.widget.TextView) real).getInputType();
    }

    public int getJustificationMode() {
        return ((android.widget.TextView) real).getJustificationMode();
    }

    public com.micklab.dcg.wrapper.android.text.method.KeyListener getKeyListener() {
        return com.micklab.dcg.wrapper.android.text.method.KeyListener.wrap(((android.widget.TextView) real).getKeyListener());
    }

    public int getLastBaselineToBottomHeight() {
        return ((android.widget.TextView) real).getLastBaselineToBottomHeight();
    }

    public com.micklab.dcg.wrapper.android.text.Layout getLayout() {
        return com.micklab.dcg.wrapper.android.text.Layout.wrap(((android.widget.TextView) real).getLayout());
    }

    public float getLetterSpacing() {
        return ((android.widget.TextView) real).getLetterSpacing();
    }

    public int getLineBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.widget.TextView) real).getLineBounds(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int getLineBreakStyle() {
        return ((android.widget.TextView) real).getLineBreakStyle();
    }

    public int getLineBreakWordStyle() {
        return ((android.widget.TextView) real).getLineBreakWordStyle();
    }

    public int getLineCount() {
        return ((android.widget.TextView) real).getLineCount();
    }

    public int getLineHeight() {
        return ((android.widget.TextView) real).getLineHeight();
    }

    public float getLineSpacingExtra() {
        return ((android.widget.TextView) real).getLineSpacingExtra();
    }

    public float getLineSpacingMultiplier() {
        return ((android.widget.TextView) real).getLineSpacingMultiplier();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getLinkTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.TextView) real).getLinkTextColors());
    }

    public boolean getLinksClickable() {
        return ((android.widget.TextView) real).getLinksClickable();
    }

    public int getMarqueeRepeatLimit() {
        return ((android.widget.TextView) real).getMarqueeRepeatLimit();
    }

    public int getMaxEms() {
        return ((android.widget.TextView) real).getMaxEms();
    }

    public int getMaxHeight() {
        return ((android.widget.TextView) real).getMaxHeight();
    }

    public int getMaxLines() {
        return ((android.widget.TextView) real).getMaxLines();
    }

    public int getMaxWidth() {
        return ((android.widget.TextView) real).getMaxWidth();
    }

    public int getMinEms() {
        return ((android.widget.TextView) real).getMinEms();
    }

    public int getMinHeight() {
        return ((android.widget.TextView) real).getMinHeight();
    }

    public int getMinLines() {
        return ((android.widget.TextView) real).getMinLines();
    }

    public int getMinWidth() {
        return ((android.widget.TextView) real).getMinWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getMinimumFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(((android.widget.TextView) real).getMinimumFontMetrics());
    }

    public com.micklab.dcg.wrapper.android.text.method.MovementMethod getMovementMethod() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(((android.widget.TextView) real).getMovementMethod());
    }

    public int getOffsetForPosition(float arg0, float arg1) {
        return ((android.widget.TextView) real).getOffsetForPosition(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.text.TextPaint getPaint() {
        return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(((android.widget.TextView) real).getPaint());
    }

    public int getPaintFlags() {
        return ((android.widget.TextView) real).getPaintFlags();
    }

    public java.lang.String getPrivateImeOptions() {
        return ((android.widget.TextView) real).getPrivateImeOptions();
    }

    public int getSearchResultHighlightColor() {
        return ((android.widget.TextView) real).getSearchResultHighlightColor();
    }

    public int[] getSearchResultHighlights() {
        return ((android.widget.TextView) real).getSearchResultHighlights();
    }

    public int getSelectionEnd() {
        return ((android.widget.TextView) real).getSelectionEnd();
    }

    public int getSelectionStart() {
        return ((android.widget.TextView) real).getSelectionStart();
    }

    public int getShadowColor() {
        return ((android.widget.TextView) real).getShadowColor();
    }

    public float getShadowDx() {
        return ((android.widget.TextView) real).getShadowDx();
    }

    public float getShadowDy() {
        return ((android.widget.TextView) real).getShadowDy();
    }

    public float getShadowRadius() {
        return ((android.widget.TextView) real).getShadowRadius();
    }

    public boolean getShiftDrawingOffsetForStartOverhang() {
        return ((android.widget.TextView) real).getShiftDrawingOffsetForStartOverhang();
    }

    public boolean getShowSoftInputOnFocus() {
        return ((android.widget.TextView) real).getShowSoftInputOnFocus();
    }

    public java.lang.CharSequence getText() {
        return ((android.widget.TextView) real).getText();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(((android.widget.TextView) real).getTextClassifier());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.TextView) real).getTextColors());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextCursorDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TextView) real).getTextCursorDrawable());
    }

    public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirectionHeuristic() {
        return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(((android.widget.TextView) real).getTextDirectionHeuristic());
    }

    public java.util.Locale getTextLocale() {
        return ((android.widget.TextView) real).getTextLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.widget.TextView) real).getTextLocales());
    }

    public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params getTextMetricsParams() {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(((android.widget.TextView) real).getTextMetricsParams());
    }

    public float getTextScaleX() {
        return ((android.widget.TextView) real).getTextScaleX();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandle() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TextView) real).getTextSelectHandle());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandleLeft() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TextView) real).getTextSelectHandleLeft());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandleRight() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TextView) real).getTextSelectHandleRight());
    }

    public float getTextSize() {
        return ((android.widget.TextView) real).getTextSize();
    }

    public int getTextSizeUnit() {
        return ((android.widget.TextView) real).getTextSizeUnit();
    }

    public int getTotalPaddingBottom() {
        return ((android.widget.TextView) real).getTotalPaddingBottom();
    }

    public int getTotalPaddingEnd() {
        return ((android.widget.TextView) real).getTotalPaddingEnd();
    }

    public int getTotalPaddingLeft() {
        return ((android.widget.TextView) real).getTotalPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return ((android.widget.TextView) real).getTotalPaddingRight();
    }

    public int getTotalPaddingStart() {
        return ((android.widget.TextView) real).getTotalPaddingStart();
    }

    public int getTotalPaddingTop() {
        return ((android.widget.TextView) real).getTotalPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.text.method.TransformationMethod getTransformationMethod() {
        return com.micklab.dcg.wrapper.android.text.method.TransformationMethod.wrap(((android.widget.TextView) real).getTransformationMethod());
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.widget.TextView) real).getTypeface());
    }

    public android.text.style.URLSpan[] getUrls() {
        return ((android.widget.TextView) real).getUrls();
    }

    public boolean getUseBoundsForWidth() {
        return ((android.widget.TextView) real).getUseBoundsForWidth();
    }

    public boolean hasOverlappingRendering() {
        return ((android.widget.TextView) real).hasOverlappingRendering();
    }

    public boolean hasSelection() {
        return ((android.widget.TextView) real).hasSelection();
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TextView) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isAllCaps() {
        return ((android.widget.TextView) real).isAllCaps();
    }

    public boolean isAutoHandwritingEnabled() {
        return ((android.widget.TextView) real).isAutoHandwritingEnabled();
    }

    public boolean isCursorVisible() {
        return ((android.widget.TextView) real).isCursorVisible();
    }

    public boolean isElegantTextHeight() {
        return ((android.widget.TextView) real).isElegantTextHeight();
    }

    public boolean isFallbackLineSpacing() {
        return ((android.widget.TextView) real).isFallbackLineSpacing();
    }

    public boolean isHorizontallyScrollable() {
        return ((android.widget.TextView) real).isHorizontallyScrollable();
    }

    public boolean isInputMethodTarget() {
        return ((android.widget.TextView) real).isInputMethodTarget();
    }

    public boolean isLocalePreferredLineHeightForMinimumUsed() {
        return ((android.widget.TextView) real).isLocalePreferredLineHeightForMinimumUsed();
    }

    public boolean isSingleLine() {
        return ((android.widget.TextView) real).isSingleLine();
    }

    public boolean isSuggestionsEnabled() {
        return ((android.widget.TextView) real).isSuggestionsEnabled();
    }

    public boolean isTextSelectable() {
        return ((android.widget.TextView) real).isTextSelectable();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.widget.TextView) real).jumpDrawablesToCurrentState();
    }

    public int length() {
        return ((android.widget.TextView) real).length();
    }

    public boolean moveCursorToVisibleOffset() {
        return ((android.widget.TextView) real).moveCursorToVisibleOffset();
    }

    public void onBeginBatchEdit() {
        ((android.widget.TextView) real).onBeginBatchEdit();
    }

    public boolean onCheckIsTextEditor() {
        return ((android.widget.TextView) real).onCheckIsTextEditor();
    }

    public void onCommitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        ((android.widget.TextView) real).onCommitCompletion(arg0 == null ? null : arg0.getReal());
    }

    public void onCommitCorrection(com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo arg0) {
        ((android.widget.TextView) real).onCommitCorrection(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.widget.TextView) real).onCreateInputConnection(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return ((android.widget.TextView) real).onDragEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onEditorAction(int arg0) {
        ((android.widget.TextView) real).onEditorAction(arg0);
    }

    public void onEndBatchEdit() {
        ((android.widget.TextView) real).onEndBatchEdit();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.TextView) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.TextView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.widget.TextView) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.TextView) real).onKeyPreIme(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.TextView) real).onKeyShortcut(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.TextView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onPreDraw() {
        return ((android.widget.TextView) real).onPreDraw();
    }

    public boolean onPrivateIMECommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.widget.TextView) real).onPrivateIMECommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(((android.widget.TextView) real).onReceiveContent(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.widget.TextView) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.TextView) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.TextView) real).onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.TextView) real).onSaveInstanceState());
    }

    public void onScreenStateChanged(int arg0) {
        ((android.widget.TextView) real).onScreenStateChanged(arg0);
    }

    public boolean onTextContextMenuItem(int arg0) {
        return ((android.widget.TextView) real).onTextContextMenuItem(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.TextView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.TextView) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onVisibilityAggregated(boolean arg0) {
        ((android.widget.TextView) real).onVisibilityAggregated(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.widget.TextView) real).onWindowFocusChanged(arg0);
    }

    public boolean performLongClick() {
        return ((android.widget.TextView) real).performLongClick();
    }

    public void removeTextChangedListener(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.TextView) real).removeTextChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.widget.TextView) real).sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.getReal());
    }

    public void setAllCaps(boolean arg0) {
        ((android.widget.TextView) real).setAllCaps(arg0);
    }

    public void setAutoLinkMask(int arg0) {
        ((android.widget.TextView) real).setAutoLinkMask(arg0);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.TextView) real).setAutoSizeTextTypeUniformWithConfiguration(arg0, arg1, arg2, arg3);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arg0, int arg1) {
        ((android.widget.TextView) real).setAutoSizeTextTypeUniformWithPresetSizes(arg0, arg1);
    }

    public void setAutoSizeTextTypeWithDefaults(int arg0) {
        ((android.widget.TextView) real).setAutoSizeTextTypeWithDefaults(arg0);
    }

    public void setBreakStrategy(int arg0) {
        ((android.widget.TextView) real).setBreakStrategy(arg0);
    }

    public void setCompoundDrawablePadding(int arg0) {
        ((android.widget.TextView) real).setCompoundDrawablePadding(arg0);
    }

    public void setCompoundDrawableTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.TextView) real).setCompoundDrawableTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setCompoundDrawableTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.TextView) real).setCompoundDrawableTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setCompoundDrawableTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.widget.TextView) real).setCompoundDrawableTintMode(arg0 == null ? null : arg0.getReal());
    }

    public void setCompoundDrawables(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        ((android.widget.TextView) real).setCompoundDrawables(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setCompoundDrawablesRelative(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        ((android.widget.TextView) real).setCompoundDrawablesRelative(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.TextView) real).setCompoundDrawablesRelativeWithIntrinsicBounds(arg0, arg1, arg2, arg3);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        ((android.widget.TextView) real).setCompoundDrawablesRelativeWithIntrinsicBounds(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.TextView) real).setCompoundDrawablesWithIntrinsicBounds(arg0, arg1, arg2, arg3);
    }

    public void setCompoundDrawablesWithIntrinsicBounds(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        ((android.widget.TextView) real).setCompoundDrawablesWithIntrinsicBounds(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setCursorVisible(boolean arg0) {
        ((android.widget.TextView) real).setCursorVisible(arg0);
    }

    public void setCustomInsertionActionModeCallback(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        ((android.widget.TextView) real).setCustomInsertionActionModeCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setCustomSelectionActionModeCallback(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        ((android.widget.TextView) real).setCustomSelectionActionModeCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setEditableFactory(com.micklab.dcg.wrapper.android.text.Editable.Factory arg0) {
        ((android.widget.TextView) real).setEditableFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setElegantTextHeight(boolean arg0) {
        ((android.widget.TextView) real).setElegantTextHeight(arg0);
    }

    public void setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
        ((android.widget.TextView) real).setEllipsize(arg0 == null ? null : arg0.getReal());
    }

    public void setEms(int arg0) {
        ((android.widget.TextView) real).setEms(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.TextView) real).setEnabled(arg0);
    }

    public void setError(java.lang.CharSequence arg0) {
        ((android.widget.TextView) real).setError(arg0);
    }

    public void setError(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.widget.TextView) real).setError(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg0) {
        ((android.widget.TextView) real).setExtractedText(arg0 == null ? null : arg0.getReal());
    }

    public void setFallbackLineSpacing(boolean arg0) {
        ((android.widget.TextView) real).setFallbackLineSpacing(arg0);
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        ((android.widget.TextView) real).setFilters(arg0);
    }

    public void setFirstBaselineToTopHeight(int arg0) {
        ((android.widget.TextView) real).setFirstBaselineToTopHeight(arg0);
    }

    public void setFocusedSearchResultHighlightColor(int arg0) {
        ((android.widget.TextView) real).setFocusedSearchResultHighlightColor(arg0);
    }

    public void setFocusedSearchResultIndex(int arg0) {
        ((android.widget.TextView) real).setFocusedSearchResultIndex(arg0);
    }

    public void setFontFeatureSettings(java.lang.String arg0) {
        ((android.widget.TextView) real).setFontFeatureSettings(arg0);
    }

    public boolean setFontVariationSettings(java.lang.String arg0) {
        return ((android.widget.TextView) real).setFontVariationSettings(arg0);
    }

    public void setFreezesText(boolean arg0) {
        ((android.widget.TextView) real).setFreezesText(arg0);
    }

    public void setGravity(int arg0) {
        ((android.widget.TextView) real).setGravity(arg0);
    }

    public void setHeight(int arg0) {
        ((android.widget.TextView) real).setHeight(arg0);
    }

    public void setHighlightColor(int arg0) {
        ((android.widget.TextView) real).setHighlightColor(arg0);
    }

    public void setHighlights(com.micklab.dcg.wrapper.android.text.Highlights arg0) {
        ((android.widget.TextView) real).setHighlights(arg0 == null ? null : arg0.getReal());
    }

    public void setHint(java.lang.CharSequence arg0) {
        ((android.widget.TextView) real).setHint(arg0);
    }

    public void setHint(int arg0) {
        ((android.widget.TextView) real).setHint(arg0);
    }

    public void setHintTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.TextView) real).setHintTextColor(arg0 == null ? null : arg0.getReal());
    }

    public void setHintTextColor(int arg0) {
        ((android.widget.TextView) real).setHintTextColor(arg0);
    }

    public void setHorizontallyScrolling(boolean arg0) {
        ((android.widget.TextView) real).setHorizontallyScrolling(arg0);
    }

    public void setHyphenationFrequency(int arg0) {
        ((android.widget.TextView) real).setHyphenationFrequency(arg0);
    }

    public void setImeActionLabel(java.lang.CharSequence arg0, int arg1) {
        ((android.widget.TextView) real).setImeActionLabel(arg0, arg1);
    }

    public void setImeHintLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        ((android.widget.TextView) real).setImeHintLocales(arg0 == null ? null : arg0.getReal());
    }

    public void setImeOptions(int arg0) {
        ((android.widget.TextView) real).setImeOptions(arg0);
    }

    public void setIncludeFontPadding(boolean arg0) {
        ((android.widget.TextView) real).setIncludeFontPadding(arg0);
    }

    public void setInputExtras(int arg0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.widget.TextView) real).setInputExtras(arg0);
    }

    public void setInputType(int arg0) {
        ((android.widget.TextView) real).setInputType(arg0);
    }

    public void setJustificationMode(int arg0) {
        ((android.widget.TextView) real).setJustificationMode(arg0);
    }

    public void setKeyListener(com.micklab.dcg.wrapper.android.text.method.KeyListener arg0) {
        ((android.widget.TextView) real).setKeyListener(arg0 == null ? null : arg0.getReal());
    }

    public void setLastBaselineToBottomHeight(int arg0) {
        ((android.widget.TextView) real).setLastBaselineToBottomHeight(arg0);
    }

    public void setLetterSpacing(float arg0) {
        ((android.widget.TextView) real).setLetterSpacing(arg0);
    }

    public void setLineBreakStyle(int arg0) {
        ((android.widget.TextView) real).setLineBreakStyle(arg0);
    }

    public void setLineBreakWordStyle(int arg0) {
        ((android.widget.TextView) real).setLineBreakWordStyle(arg0);
    }

    public void setLineHeight(int arg0) {
        ((android.widget.TextView) real).setLineHeight(arg0);
    }

    public void setLineHeight(int arg0, float arg1) {
        ((android.widget.TextView) real).setLineHeight(arg0, arg1);
    }

    public void setLineSpacing(float arg0, float arg1) {
        ((android.widget.TextView) real).setLineSpacing(arg0, arg1);
    }

    public void setLines(int arg0) {
        ((android.widget.TextView) real).setLines(arg0);
    }

    public void setLinkTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.TextView) real).setLinkTextColor(arg0 == null ? null : arg0.getReal());
    }

    public void setLinkTextColor(int arg0) {
        ((android.widget.TextView) real).setLinkTextColor(arg0);
    }

    public void setLinksClickable(boolean arg0) {
        ((android.widget.TextView) real).setLinksClickable(arg0);
    }

    public void setLocalePreferredLineHeightForMinimumUsed(boolean arg0) {
        ((android.widget.TextView) real).setLocalePreferredLineHeightForMinimumUsed(arg0);
    }

    public void setMarqueeRepeatLimit(int arg0) {
        ((android.widget.TextView) real).setMarqueeRepeatLimit(arg0);
    }

    public void setMaxEms(int arg0) {
        ((android.widget.TextView) real).setMaxEms(arg0);
    }

    public void setMaxHeight(int arg0) {
        ((android.widget.TextView) real).setMaxHeight(arg0);
    }

    public void setMaxLines(int arg0) {
        ((android.widget.TextView) real).setMaxLines(arg0);
    }

    public void setMaxWidth(int arg0) {
        ((android.widget.TextView) real).setMaxWidth(arg0);
    }

    public void setMinEms(int arg0) {
        ((android.widget.TextView) real).setMinEms(arg0);
    }

    public void setMinHeight(int arg0) {
        ((android.widget.TextView) real).setMinHeight(arg0);
    }

    public void setMinLines(int arg0) {
        ((android.widget.TextView) real).setMinLines(arg0);
    }

    public void setMinWidth(int arg0) {
        ((android.widget.TextView) real).setMinWidth(arg0);
    }

    public void setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        ((android.widget.TextView) real).setMinimumFontMetrics(arg0 == null ? null : arg0.getReal());
    }

    public void setMovementMethod(com.micklab.dcg.wrapper.android.text.method.MovementMethod arg0) {
        ((android.widget.TextView) real).setMovementMethod(arg0 == null ? null : arg0.getReal());
    }

    public void setOnEditorActionListener(com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener arg0) {
        ((android.widget.TextView) real).setOnEditorActionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.TextView) real).setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.TextView) real).setPaddingRelative(arg0, arg1, arg2, arg3);
    }

    public void setPaintFlags(int arg0) {
        ((android.widget.TextView) real).setPaintFlags(arg0);
    }

    public void setPrivateImeOptions(java.lang.String arg0) {
        ((android.widget.TextView) real).setPrivateImeOptions(arg0);
    }

    public void setRawInputType(int arg0) {
        ((android.widget.TextView) real).setRawInputType(arg0);
    }

    public void setScroller(com.micklab.dcg.wrapper.android.widget.Scroller arg0) {
        ((android.widget.TextView) real).setScroller(arg0 == null ? null : arg0.getReal());
    }

    public void setSearchResultHighlightColor(int arg0) {
        ((android.widget.TextView) real).setSearchResultHighlightColor(arg0);
    }

    public void setSearchResultHighlights(int... arg0) {
        ((android.widget.TextView) real).setSearchResultHighlights(arg0);
    }

    public void setSelectAllOnFocus(boolean arg0) {
        ((android.widget.TextView) real).setSelectAllOnFocus(arg0);
    }

    public void setSelected(boolean arg0) {
        ((android.widget.TextView) real).setSelected(arg0);
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, int arg3) {
        ((android.widget.TextView) real).setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setShiftDrawingOffsetForStartOverhang(boolean arg0) {
        ((android.widget.TextView) real).setShiftDrawingOffsetForStartOverhang(arg0);
    }

    public void setShowSoftInputOnFocus(boolean arg0) {
        ((android.widget.TextView) real).setShowSoftInputOnFocus(arg0);
    }

    public void setSingleLine() {
        ((android.widget.TextView) real).setSingleLine();
    }

    public void setSingleLine(boolean arg0) {
        ((android.widget.TextView) real).setSingleLine(arg0);
    }

    public void setSpannableFactory(com.micklab.dcg.wrapper.android.text.Spannable.Factory arg0) {
        ((android.widget.TextView) real).setSpannableFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setText(int arg0) {
        ((android.widget.TextView) real).setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.widget.TextView) real).setText(arg0);
    }

    public void setText(int arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        ((android.widget.TextView) real).setText(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setText(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        ((android.widget.TextView) real).setText(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setText(char[] arg0, int arg1, int arg2) {
        ((android.widget.TextView) real).setText(arg0, arg1, arg2);
    }

    public void setTextAppearance(int arg0) {
        ((android.widget.TextView) real).setTextAppearance(arg0);
    }

    public void setTextAppearance(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.TextView) real).setTextAppearance(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        ((android.widget.TextView) real).setTextClassifier(arg0 == null ? null : arg0.getReal());
    }

    public void setTextColor(int arg0) {
        ((android.widget.TextView) real).setTextColor(arg0);
    }

    public void setTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.TextView) real).setTextColor(arg0 == null ? null : arg0.getReal());
    }

    public void setTextCursorDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TextView) real).setTextCursorDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setTextCursorDrawable(int arg0) {
        ((android.widget.TextView) real).setTextCursorDrawable(arg0);
    }

    public void setTextIsSelectable(boolean arg0) {
        ((android.widget.TextView) real).setTextIsSelectable(arg0);
    }

    public void setTextKeepState(java.lang.CharSequence arg0) {
        ((android.widget.TextView) real).setTextKeepState(arg0);
    }

    public void setTextKeepState(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        ((android.widget.TextView) real).setTextKeepState(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTextLocale(java.util.Locale arg0) {
        ((android.widget.TextView) real).setTextLocale(arg0);
    }

    public void setTextLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        ((android.widget.TextView) real).setTextLocales(arg0 == null ? null : arg0.getReal());
    }

    public void setTextMetricsParams(com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg0) {
        ((android.widget.TextView) real).setTextMetricsParams(arg0 == null ? null : arg0.getReal());
    }

    public void setTextScaleX(float arg0) {
        ((android.widget.TextView) real).setTextScaleX(arg0);
    }

    public void setTextSelectHandle(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TextView) real).setTextSelectHandle(arg0 == null ? null : arg0.getReal());
    }

    public void setTextSelectHandle(int arg0) {
        ((android.widget.TextView) real).setTextSelectHandle(arg0);
    }

    public void setTextSelectHandleLeft(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TextView) real).setTextSelectHandleLeft(arg0 == null ? null : arg0.getReal());
    }

    public void setTextSelectHandleLeft(int arg0) {
        ((android.widget.TextView) real).setTextSelectHandleLeft(arg0);
    }

    public void setTextSelectHandleRight(int arg0) {
        ((android.widget.TextView) real).setTextSelectHandleRight(arg0);
    }

    public void setTextSelectHandleRight(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TextView) real).setTextSelectHandleRight(arg0 == null ? null : arg0.getReal());
    }

    public void setTextSize(float arg0) {
        ((android.widget.TextView) real).setTextSize(arg0);
    }

    public void setTextSize(int arg0, float arg1) {
        ((android.widget.TextView) real).setTextSize(arg0, arg1);
    }

    public void setTransformationMethod(com.micklab.dcg.wrapper.android.text.method.TransformationMethod arg0) {
        ((android.widget.TextView) real).setTransformationMethod(arg0 == null ? null : arg0.getReal());
    }

    public void setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        ((android.widget.TextView) real).setTypeface(arg0 == null ? null : arg0.getReal());
    }

    public void setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0, int arg1) {
        ((android.widget.TextView) real).setTypeface(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setUseBoundsForWidth(boolean arg0) {
        ((android.widget.TextView) real).setUseBoundsForWidth(arg0);
    }

    public void setWidth(int arg0) {
        ((android.widget.TextView) real).setWidth(arg0);
    }

    public boolean showContextMenu() {
        return ((android.widget.TextView) real).showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return ((android.widget.TextView) real).showContextMenu(arg0, arg1);
    }

    public static final int AUTO_SIZE_TEXT_TYPE_NONE = android.widget.TextView.AUTO_SIZE_TEXT_TYPE_NONE;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM;
    public static final int FOCUSED_SEARCH_RESULT_INDEX_NONE = android.widget.TextView.FOCUSED_SEARCH_RESULT_INDEX_NONE;

    public static final class BufferType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BufferType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.BufferType wrap(android.widget.TextView.BufferType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.BufferType(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TextView.BufferType getReal() {
            return (android.widget.TextView.BufferType) real;
        }

        public android.widget.TextView.BufferType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.BufferType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.widget.TextView.BufferType.wrap(android.widget.TextView.BufferType.valueOf(arg0));
        }

        public static android.widget.TextView.BufferType[] values() {
            return android.widget.TextView.BufferType.values();
        }

        public static final com.micklab.dcg.wrapper.android.widget.TextView.BufferType EDITABLE = com.micklab.dcg.wrapper.android.widget.TextView.BufferType.wrap(android.widget.TextView.BufferType.EDITABLE);
        public static final com.micklab.dcg.wrapper.android.widget.TextView.BufferType NORMAL = com.micklab.dcg.wrapper.android.widget.TextView.BufferType.wrap(android.widget.TextView.BufferType.NORMAL);
        public static final com.micklab.dcg.wrapper.android.widget.TextView.BufferType SPANNABLE = com.micklab.dcg.wrapper.android.widget.TextView.BufferType.wrap(android.widget.TextView.BufferType.SPANNABLE);

    }
    public static final class OnEditorActionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnEditorActionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener wrap(android.widget.TextView.OnEditorActionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TextView.OnEditorActionListener getReal() {
            return (android.widget.TextView.OnEditorActionListener) real;
        }

        public android.widget.TextView.OnEditorActionListener unwrap() {
            return getReal();
        }

        public boolean onEditorAction(com.micklab.dcg.wrapper.android.widget.TextView arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.widget.TextView.OnEditorActionListener) real).onEditorAction(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class SavedState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SavedState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.SavedState wrap(android.widget.TextView.SavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.SavedState(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TextView.SavedState getReal() {
            return (android.widget.TextView.SavedState) real;
        }

        public android.widget.TextView.SavedState unwrap() {
            return getReal();
        }

        public java.lang.String toString() {
            return ((android.widget.TextView.SavedState) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.widget.TextView.SavedState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
