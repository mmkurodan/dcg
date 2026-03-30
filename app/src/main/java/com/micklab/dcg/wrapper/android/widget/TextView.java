// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextView {
    private final android.widget.TextView real;

    public TextView(android.widget.TextView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextView wrap(android.widget.TextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView(real);
    }

    public android.widget.TextView unwrap() {
        return real;
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.unwrap()));
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void addTextChangedListener(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.addTextChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void append(java.lang.CharSequence arg0) {
        real.append(arg0);
    }

    public void append(java.lang.CharSequence arg0, int arg1, int arg2) {
        real.append(arg0, arg1, arg2);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public void beginBatchEdit() {
        real.beginBatchEdit();
    }

    public boolean bringPointIntoView(int arg0) {
        return real.bringPointIntoView(arg0);
    }

    public boolean bringPointIntoView(int arg0, boolean arg1) {
        return real.bringPointIntoView(arg0, arg1);
    }

    public void cancelLongPress() {
        real.cancelLongPress();
    }

    public void clearComposingText() {
        real.clearComposingText();
    }

    public void computeScroll() {
        real.computeScroll();
    }

    public void debug(int arg0) {
        real.debug(arg0);
    }

    public boolean didTouchFocusSelect() {
        return real.didTouchFocusSelect();
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public void endBatchEdit() {
        real.endBatchEdit();
    }

    public boolean extractText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        return real.extractText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getAutoLinkMask() {
        return real.getAutoLinkMask();
    }

    public int getAutoSizeMaxTextSize() {
        return real.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return real.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return real.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return real.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return real.getAutoSizeTextType();
    }

    public java.lang.String[] getAutofillHints() {
        return real.getAutofillHints();
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public int getBreakStrategy() {
        return real.getBreakStrategy();
    }

    public int getCompoundDrawablePadding() {
        return real.getCompoundDrawablePadding();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getCompoundDrawableTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getCompoundDrawableTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCompoundDrawableTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getCompoundDrawableTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getCompoundDrawableTintMode());
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawables() {
        return real.getCompoundDrawables();
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() {
        return real.getCompoundDrawablesRelative();
    }

    public int getCompoundPaddingBottom() {
        return real.getCompoundPaddingBottom();
    }

    public int getCompoundPaddingEnd() {
        return real.getCompoundPaddingEnd();
    }

    public int getCompoundPaddingLeft() {
        return real.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return real.getCompoundPaddingRight();
    }

    public int getCompoundPaddingStart() {
        return real.getCompoundPaddingStart();
    }

    public int getCompoundPaddingTop() {
        return real.getCompoundPaddingTop();
    }

    public int getCurrentHintTextColor() {
        return real.getCurrentHintTextColor();
    }

    public int getCurrentTextColor() {
        return real.getCurrentTextColor();
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode.Callback getCustomInsertionActionModeCallback() {
        return com.micklab.dcg.wrapper.android.view.ActionMode.Callback.wrap(real.getCustomInsertionActionModeCallback());
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.micklab.dcg.wrapper.android.view.ActionMode.Callback.wrap(real.getCustomSelectionActionModeCallback());
    }

    public com.micklab.dcg.wrapper.android.text.Editable getEditableText() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.getEditableText());
    }

    public com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt getEllipsize() {
        return com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(real.getEllipsize());
    }

    public java.lang.CharSequence getError() {
        return real.getError();
    }

    public int getExtendedPaddingBottom() {
        return real.getExtendedPaddingBottom();
    }

    public int getExtendedPaddingTop() {
        return real.getExtendedPaddingTop();
    }

    public android.text.InputFilter[] getFilters() {
        return real.getFilters();
    }

    public int getFirstBaselineToTopHeight() {
        return real.getFirstBaselineToTopHeight();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getFocusedRect(arg0 == null ? null : arg0.unwrap());
    }

    public int getFocusedSearchResultHighlightColor() {
        return real.getFocusedSearchResultHighlightColor();
    }

    public int getFocusedSearchResultIndex() {
        return real.getFocusedSearchResultIndex();
    }

    public java.lang.String getFontFeatureSettings() {
        return real.getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return real.getFontVariationSettings();
    }

    public boolean getFreezesText() {
        return real.getFreezesText();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public int getHighlightColor() {
        return real.getHighlightColor();
    }

    public com.micklab.dcg.wrapper.android.text.Highlights getHighlights() {
        return com.micklab.dcg.wrapper.android.text.Highlights.wrap(real.getHighlights());
    }

    public java.lang.CharSequence getHint() {
        return real.getHint();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getHintTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getHintTextColors());
    }

    public int getHyphenationFrequency() {
        return real.getHyphenationFrequency();
    }

    public int getImeActionId() {
        return real.getImeActionId();
    }

    public java.lang.CharSequence getImeActionLabel() {
        return real.getImeActionLabel();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getImeHintLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getImeHintLocales());
    }

    public int getImeOptions() {
        return real.getImeOptions();
    }

    public boolean getIncludeFontPadding() {
        return real.getIncludeFontPadding();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getInputExtras(boolean arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getInputExtras(arg0));
    }

    public int getInputType() {
        return real.getInputType();
    }

    public int getJustificationMode() {
        return real.getJustificationMode();
    }

    public com.micklab.dcg.wrapper.android.text.method.KeyListener getKeyListener() {
        return com.micklab.dcg.wrapper.android.text.method.KeyListener.wrap(real.getKeyListener());
    }

    public int getLastBaselineToBottomHeight() {
        return real.getLastBaselineToBottomHeight();
    }

    public com.micklab.dcg.wrapper.android.text.Layout getLayout() {
        return com.micklab.dcg.wrapper.android.text.Layout.wrap(real.getLayout());
    }

    public float getLetterSpacing() {
        return real.getLetterSpacing();
    }

    public int getLineBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.getLineBounds(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getLineBreakStyle() {
        return real.getLineBreakStyle();
    }

    public int getLineBreakWordStyle() {
        return real.getLineBreakWordStyle();
    }

    public int getLineCount() {
        return real.getLineCount();
    }

    public int getLineHeight() {
        return real.getLineHeight();
    }

    public float getLineSpacingExtra() {
        return real.getLineSpacingExtra();
    }

    public float getLineSpacingMultiplier() {
        return real.getLineSpacingMultiplier();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getLinkTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getLinkTextColors());
    }

    public boolean getLinksClickable() {
        return real.getLinksClickable();
    }

    public int getMarqueeRepeatLimit() {
        return real.getMarqueeRepeatLimit();
    }

    public int getMaxEms() {
        return real.getMaxEms();
    }

    public int getMaxHeight() {
        return real.getMaxHeight();
    }

    public int getMaxLines() {
        return real.getMaxLines();
    }

    public int getMaxWidth() {
        return real.getMaxWidth();
    }

    public int getMinEms() {
        return real.getMinEms();
    }

    public int getMinHeight() {
        return real.getMinHeight();
    }

    public int getMinLines() {
        return real.getMinLines();
    }

    public int getMinWidth() {
        return real.getMinWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getMinimumFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(real.getMinimumFontMetrics());
    }

    public com.micklab.dcg.wrapper.android.text.method.MovementMethod getMovementMethod() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(real.getMovementMethod());
    }

    public int getOffsetForPosition(float arg0, float arg1) {
        return real.getOffsetForPosition(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.text.TextPaint getPaint() {
        return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(real.getPaint());
    }

    public int getPaintFlags() {
        return real.getPaintFlags();
    }

    public java.lang.String getPrivateImeOptions() {
        return real.getPrivateImeOptions();
    }

    public int getSearchResultHighlightColor() {
        return real.getSearchResultHighlightColor();
    }

    public int[] getSearchResultHighlights() {
        return real.getSearchResultHighlights();
    }

    public int getSelectionEnd() {
        return real.getSelectionEnd();
    }

    public int getSelectionStart() {
        return real.getSelectionStart();
    }

    public int getShadowColor() {
        return real.getShadowColor();
    }

    public float getShadowDx() {
        return real.getShadowDx();
    }

    public float getShadowDy() {
        return real.getShadowDy();
    }

    public float getShadowRadius() {
        return real.getShadowRadius();
    }

    public boolean getShiftDrawingOffsetForStartOverhang() {
        return real.getShiftDrawingOffsetForStartOverhang();
    }

    public boolean getShowSoftInputOnFocus() {
        return real.getShowSoftInputOnFocus();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(real.getTextClassifier());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTextColors() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getTextColors());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextCursorDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTextCursorDrawable());
    }

    public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirectionHeuristic() {
        return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(real.getTextDirectionHeuristic());
    }

    public java.util.Locale getTextLocale() {
        return real.getTextLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getTextLocales());
    }

    public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params getTextMetricsParams() {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(real.getTextMetricsParams());
    }

    public float getTextScaleX() {
        return real.getTextScaleX();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandle() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTextSelectHandle());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandleLeft() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTextSelectHandleLeft());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTextSelectHandleRight() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTextSelectHandleRight());
    }

    public float getTextSize() {
        return real.getTextSize();
    }

    public int getTextSizeUnit() {
        return real.getTextSizeUnit();
    }

    public int getTotalPaddingBottom() {
        return real.getTotalPaddingBottom();
    }

    public int getTotalPaddingEnd() {
        return real.getTotalPaddingEnd();
    }

    public int getTotalPaddingLeft() {
        return real.getTotalPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return real.getTotalPaddingRight();
    }

    public int getTotalPaddingStart() {
        return real.getTotalPaddingStart();
    }

    public int getTotalPaddingTop() {
        return real.getTotalPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.text.method.TransformationMethod getTransformationMethod() {
        return com.micklab.dcg.wrapper.android.text.method.TransformationMethod.wrap(real.getTransformationMethod());
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getTypeface());
    }

    public android.text.style.URLSpan[] getUrls() {
        return real.getUrls();
    }

    public boolean getUseBoundsForWidth() {
        return real.getUseBoundsForWidth();
    }

    public boolean hasOverlappingRendering() {
        return real.hasOverlappingRendering();
    }

    public boolean hasSelection() {
        return real.hasSelection();
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAllCaps() {
        return real.isAllCaps();
    }

    public boolean isAutoHandwritingEnabled() {
        return real.isAutoHandwritingEnabled();
    }

    public boolean isCursorVisible() {
        return real.isCursorVisible();
    }

    public boolean isElegantTextHeight() {
        return real.isElegantTextHeight();
    }

    public boolean isFallbackLineSpacing() {
        return real.isFallbackLineSpacing();
    }

    public boolean isHorizontallyScrollable() {
        return real.isHorizontallyScrollable();
    }

    public boolean isInputMethodTarget() {
        return real.isInputMethodTarget();
    }

    public boolean isLocalePreferredLineHeightForMinimumUsed() {
        return real.isLocalePreferredLineHeightForMinimumUsed();
    }

    public boolean isSingleLine() {
        return real.isSingleLine();
    }

    public boolean isSuggestionsEnabled() {
        return real.isSuggestionsEnabled();
    }

    public boolean isTextSelectable() {
        return real.isTextSelectable();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public int length() {
        return real.length();
    }

    public boolean moveCursorToVisibleOffset() {
        return real.moveCursorToVisibleOffset();
    }

    public void onBeginBatchEdit() {
        real.onBeginBatchEdit();
    }

    public boolean onCheckIsTextEditor() {
        return real.onCheckIsTextEditor();
    }

    public void onCommitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        real.onCommitCompletion(arg0 == null ? null : arg0.unwrap());
    }

    public void onCommitCorrection(com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo arg0) {
        real.onCommitCorrection(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.onCreateInputConnection(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return real.onDragEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onEditorAction(int arg0) {
        real.onEditorAction(arg0);
    }

    public void onEndBatchEdit() {
        real.onEndBatchEdit();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyPreIme(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyShortcut(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onPreDraw() {
        return real.onPreDraw();
    }

    public boolean onPrivateIMECommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.onPrivateIMECommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(real.onReceiveContent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public void onScreenStateChanged(int arg0) {
        real.onScreenStateChanged(arg0);
    }

    public boolean onTextContextMenuItem(int arg0) {
        return real.onTextContextMenuItem(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onVisibilityAggregated(boolean arg0) {
        real.onVisibilityAggregated(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public boolean performLongClick() {
        return real.performLongClick();
    }

    public void removeTextChangedListener(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.removeTextChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.unwrap());
    }

    public void setAllCaps(boolean arg0) {
        real.setAllCaps(arg0);
    }

    public void setAutoLinkMask(int arg0) {
        real.setAutoLinkMask(arg0);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int arg0, int arg1, int arg2, int arg3) {
        real.setAutoSizeTextTypeUniformWithConfiguration(arg0, arg1, arg2, arg3);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arg0, int arg1) {
        real.setAutoSizeTextTypeUniformWithPresetSizes(arg0, arg1);
    }

    public void setAutoSizeTextTypeWithDefaults(int arg0) {
        real.setAutoSizeTextTypeWithDefaults(arg0);
    }

    public void setBreakStrategy(int arg0) {
        real.setBreakStrategy(arg0);
    }

    public void setCompoundDrawablePadding(int arg0) {
        real.setCompoundDrawablePadding(arg0);
    }

    public void setCompoundDrawableTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setCompoundDrawableTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setCompoundDrawableTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setCompoundDrawableTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setCompoundDrawableTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setCompoundDrawableTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setCompoundDrawables(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        real.setCompoundDrawables(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setCompoundDrawablesRelative(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        real.setCompoundDrawablesRelative(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setCompoundDrawablesRelativeWithIntrinsicBounds(arg0, arg1, arg2, arg3);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        real.setCompoundDrawablesRelativeWithIntrinsicBounds(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setCompoundDrawablesWithIntrinsicBounds(arg0, arg1, arg2, arg3);
    }

    public void setCompoundDrawablesWithIntrinsicBounds(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg3) {
        real.setCompoundDrawablesWithIntrinsicBounds(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setCursorVisible(boolean arg0) {
        real.setCursorVisible(arg0);
    }

    public void setCustomInsertionActionModeCallback(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        real.setCustomInsertionActionModeCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setCustomSelectionActionModeCallback(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        real.setCustomSelectionActionModeCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setEditableFactory(com.micklab.dcg.wrapper.android.text.Editable.Factory arg0) {
        real.setEditableFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setElegantTextHeight(boolean arg0) {
        real.setElegantTextHeight(arg0);
    }

    public void setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
        real.setEllipsize(arg0 == null ? null : arg0.unwrap());
    }

    public void setEms(int arg0) {
        real.setEms(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setError(java.lang.CharSequence arg0) {
        real.setError(arg0);
    }

    public void setError(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        real.setError(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg0) {
        real.setExtractedText(arg0 == null ? null : arg0.unwrap());
    }

    public void setFallbackLineSpacing(boolean arg0) {
        real.setFallbackLineSpacing(arg0);
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        real.setFilters(arg0);
    }

    public void setFirstBaselineToTopHeight(int arg0) {
        real.setFirstBaselineToTopHeight(arg0);
    }

    public void setFocusedSearchResultHighlightColor(int arg0) {
        real.setFocusedSearchResultHighlightColor(arg0);
    }

    public void setFocusedSearchResultIndex(int arg0) {
        real.setFocusedSearchResultIndex(arg0);
    }

    public void setFontFeatureSettings(java.lang.String arg0) {
        real.setFontFeatureSettings(arg0);
    }

    public boolean setFontVariationSettings(java.lang.String arg0) {
        return real.setFontVariationSettings(arg0);
    }

    public void setFreezesText(boolean arg0) {
        real.setFreezesText(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setHeight(int arg0) {
        real.setHeight(arg0);
    }

    public void setHighlightColor(int arg0) {
        real.setHighlightColor(arg0);
    }

    public void setHighlights(com.micklab.dcg.wrapper.android.text.Highlights arg0) {
        real.setHighlights(arg0 == null ? null : arg0.unwrap());
    }

    public void setHint(java.lang.CharSequence arg0) {
        real.setHint(arg0);
    }

    public void setHint(int arg0) {
        real.setHint(arg0);
    }

    public void setHintTextColor(int arg0) {
        real.setHintTextColor(arg0);
    }

    public void setHintTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setHintTextColor(arg0 == null ? null : arg0.unwrap());
    }

    public void setHorizontallyScrolling(boolean arg0) {
        real.setHorizontallyScrolling(arg0);
    }

    public void setHyphenationFrequency(int arg0) {
        real.setHyphenationFrequency(arg0);
    }

    public void setImeActionLabel(java.lang.CharSequence arg0, int arg1) {
        real.setImeActionLabel(arg0, arg1);
    }

    public void setImeHintLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setImeHintLocales(arg0 == null ? null : arg0.unwrap());
    }

    public void setImeOptions(int arg0) {
        real.setImeOptions(arg0);
    }

    public void setIncludeFontPadding(boolean arg0) {
        real.setIncludeFontPadding(arg0);
    }

    public void setInputExtras(int arg0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.setInputExtras(arg0);
    }

    public void setInputType(int arg0) {
        real.setInputType(arg0);
    }

    public void setJustificationMode(int arg0) {
        real.setJustificationMode(arg0);
    }

    public void setKeyListener(com.micklab.dcg.wrapper.android.text.method.KeyListener arg0) {
        real.setKeyListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setLastBaselineToBottomHeight(int arg0) {
        real.setLastBaselineToBottomHeight(arg0);
    }

    public void setLetterSpacing(float arg0) {
        real.setLetterSpacing(arg0);
    }

    public void setLineBreakStyle(int arg0) {
        real.setLineBreakStyle(arg0);
    }

    public void setLineBreakWordStyle(int arg0) {
        real.setLineBreakWordStyle(arg0);
    }

    public void setLineHeight(int arg0) {
        real.setLineHeight(arg0);
    }

    public void setLineHeight(int arg0, float arg1) {
        real.setLineHeight(arg0, arg1);
    }

    public void setLineSpacing(float arg0, float arg1) {
        real.setLineSpacing(arg0, arg1);
    }

    public void setLines(int arg0) {
        real.setLines(arg0);
    }

    public void setLinkTextColor(int arg0) {
        real.setLinkTextColor(arg0);
    }

    public void setLinkTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setLinkTextColor(arg0 == null ? null : arg0.unwrap());
    }

    public void setLinksClickable(boolean arg0) {
        real.setLinksClickable(arg0);
    }

    public void setLocalePreferredLineHeightForMinimumUsed(boolean arg0) {
        real.setLocalePreferredLineHeightForMinimumUsed(arg0);
    }

    public void setMarqueeRepeatLimit(int arg0) {
        real.setMarqueeRepeatLimit(arg0);
    }

    public void setMaxEms(int arg0) {
        real.setMaxEms(arg0);
    }

    public void setMaxHeight(int arg0) {
        real.setMaxHeight(arg0);
    }

    public void setMaxLines(int arg0) {
        real.setMaxLines(arg0);
    }

    public void setMaxWidth(int arg0) {
        real.setMaxWidth(arg0);
    }

    public void setMinEms(int arg0) {
        real.setMinEms(arg0);
    }

    public void setMinHeight(int arg0) {
        real.setMinHeight(arg0);
    }

    public void setMinLines(int arg0) {
        real.setMinLines(arg0);
    }

    public void setMinWidth(int arg0) {
        real.setMinWidth(arg0);
    }

    public void setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        real.setMinimumFontMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public void setMovementMethod(com.micklab.dcg.wrapper.android.text.method.MovementMethod arg0) {
        real.setMovementMethod(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnEditorActionListener(com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener arg0) {
        real.setOnEditorActionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        real.setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        real.setPaddingRelative(arg0, arg1, arg2, arg3);
    }

    public void setPaintFlags(int arg0) {
        real.setPaintFlags(arg0);
    }

    public void setPrivateImeOptions(java.lang.String arg0) {
        real.setPrivateImeOptions(arg0);
    }

    public void setRawInputType(int arg0) {
        real.setRawInputType(arg0);
    }

    public void setScroller(com.micklab.dcg.wrapper.android.widget.Scroller arg0) {
        real.setScroller(arg0 == null ? null : arg0.unwrap());
    }

    public void setSearchResultHighlightColor(int arg0) {
        real.setSearchResultHighlightColor(arg0);
    }

    public void setSearchResultHighlights(int... arg0) {
        real.setSearchResultHighlights(arg0);
    }

    public void setSelectAllOnFocus(boolean arg0) {
        real.setSelectAllOnFocus(arg0);
    }

    public void setSelected(boolean arg0) {
        real.setSelected(arg0);
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, int arg3) {
        real.setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setShiftDrawingOffsetForStartOverhang(boolean arg0) {
        real.setShiftDrawingOffsetForStartOverhang(arg0);
    }

    public void setShowSoftInputOnFocus(boolean arg0) {
        real.setShowSoftInputOnFocus(arg0);
    }

    public void setSingleLine() {
        real.setSingleLine();
    }

    public void setSingleLine(boolean arg0) {
        real.setSingleLine(arg0);
    }

    public void setSpannableFactory(com.micklab.dcg.wrapper.android.text.Spannable.Factory arg0) {
        real.setSpannableFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

    public void setText(int arg0) {
        real.setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        real.setText(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setText(int arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        real.setText(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setText(char[] arg0, int arg1, int arg2) {
        real.setText(arg0, arg1, arg2);
    }

    public void setTextAppearance(int arg0) {
        real.setTextAppearance(arg0);
    }

    public void setTextAppearance(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setTextAppearance(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        real.setTextClassifier(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextColor(int arg0) {
        real.setTextColor(arg0);
    }

    public void setTextColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTextColor(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextCursorDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTextCursorDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextCursorDrawable(int arg0) {
        real.setTextCursorDrawable(arg0);
    }

    public void setTextIsSelectable(boolean arg0) {
        real.setTextIsSelectable(arg0);
    }

    public void setTextKeepState(java.lang.CharSequence arg0) {
        real.setTextKeepState(arg0);
    }

    public void setTextKeepState(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        real.setTextKeepState(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTextLocale(java.util.Locale arg0) {
        real.setTextLocale(arg0);
    }

    public void setTextLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setTextLocales(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextMetricsParams(com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg0) {
        real.setTextMetricsParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextScaleX(float arg0) {
        real.setTextScaleX(arg0);
    }

    public void setTextSelectHandle(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTextSelectHandle(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextSelectHandle(int arg0) {
        real.setTextSelectHandle(arg0);
    }

    public void setTextSelectHandleLeft(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTextSelectHandleLeft(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextSelectHandleLeft(int arg0) {
        real.setTextSelectHandleLeft(arg0);
    }

    public void setTextSelectHandleRight(int arg0) {
        real.setTextSelectHandleRight(arg0);
    }

    public void setTextSelectHandleRight(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTextSelectHandleRight(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextSize(float arg0) {
        real.setTextSize(arg0);
    }

    public void setTextSize(int arg0, float arg1) {
        real.setTextSize(arg0, arg1);
    }

    public void setTransformationMethod(com.micklab.dcg.wrapper.android.text.method.TransformationMethod arg0) {
        real.setTransformationMethod(arg0 == null ? null : arg0.unwrap());
    }

    public void setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        real.setTypeface(arg0 == null ? null : arg0.unwrap());
    }

    public void setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0, int arg1) {
        real.setTypeface(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setUseBoundsForWidth(boolean arg0) {
        real.setUseBoundsForWidth(arg0);
    }

    public void setWidth(int arg0) {
        real.setWidth(arg0);
    }

    public boolean showContextMenu() {
        return real.showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return real.showContextMenu(arg0, arg1);
    }

    public static final int AUTO_SIZE_TEXT_TYPE_NONE = android.widget.TextView.AUTO_SIZE_TEXT_TYPE_NONE;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM;
    public static final int FOCUSED_SEARCH_RESULT_INDEX_NONE = android.widget.TextView.FOCUSED_SEARCH_RESULT_INDEX_NONE;

    public static final class BufferType {
        private final android.widget.TextView.BufferType real;

        public BufferType(android.widget.TextView.BufferType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.BufferType wrap(android.widget.TextView.BufferType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.BufferType(real);
        }

        public android.widget.TextView.BufferType unwrap() {
            return real;
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
        private final android.widget.TextView.OnEditorActionListener real;

        public OnEditorActionListener(android.widget.TextView.OnEditorActionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener wrap(android.widget.TextView.OnEditorActionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.OnEditorActionListener(real);
        }

        public android.widget.TextView.OnEditorActionListener unwrap() {
            return real;
        }

        public boolean onEditorAction(com.micklab.dcg.wrapper.android.widget.TextView arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return real.onEditorAction(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class SavedState {
        private final android.widget.TextView.SavedState real;

        public SavedState(android.widget.TextView.SavedState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TextView.SavedState wrap(android.widget.TextView.SavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextView.SavedState(real);
        }

        public android.widget.TextView.SavedState unwrap() {
            return real;
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
