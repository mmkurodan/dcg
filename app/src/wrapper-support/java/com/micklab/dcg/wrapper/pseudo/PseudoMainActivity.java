package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;
import com.micklab.dcg.wrapper.android.os.Bundle;

public class PseudoMainActivity {
    private final OutputModel outputModel = new OutputModel();
    private LinearLayout currentRow;

    protected void onCreate() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        onCreate();
    }

    protected final void setContentView(Object contentView) {
        outputModel.setContentView(contentView);
    }

    protected final TextView println(Object value) {
        return addLabel(value);
    }

    protected final TextView addLabel(Object value) {
        TextView textView = new TextView(this);
        textView.setText(value == null ? "" : String.valueOf(value));
        appendInlineView(textView);
        return textView;
    }

    protected final ImageView drawBitmap(Bitmap bitmap) {
        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        outputModel.appendInlineNode(imageView);
        return imageView;
    }

    protected final Button addButton(String text, String action) {
        Button button = new Button(this);
        button.setText(text);
        button.setAction(action);
        appendInlineView(button);
        return button;
    }

    protected final EditText addInput(String id, String hint) {
        return addInput(id, hint, "");
    }

    protected final EditText addInput(String id, String hint, String value) {
        EditText editText = new EditText(this);
        editText.setId(id);
        editText.setHint(hint);
        editText.setText(value);
        appendInlineView(editText);
        return editText;
    }

    protected final void beginRow() {
        if (currentRow != null) {
            throw new IllegalStateException("beginRow() called before closing the current row.");
        }
        currentRow = new LinearLayout(this);
        currentRow.setOrientation(LinearLayout.HORIZONTAL);
    }

    protected final void endRow() {
        if (currentRow == null) {
            throw new IllegalStateException("endRow() called without a matching beginRow().");
        }
        outputModel.appendInlineNode(currentRow);
        currentRow = null;
    }

    void __dcgRegisterConstructedView(View view) {
        outputModel.registerConstructedView(view);
    }

    void __dcgMarkAttached(View view) {
        outputModel.markAttached(view);
    }

    public final Object __dcgBuildOutputSpec() {
        ensureBalancedRows();
        return outputModel.buildSpec();
    }

    public final String __dcgGetOutputModelJson() {
        ensureBalancedRows();
        return outputModel.toJson();
    }

    private void appendInlineView(View view) {
        if (currentRow != null) {
            currentRow.addView(view);
            return;
        }
        outputModel.appendInlineNode(view);
    }

    private void ensureBalancedRows() {
        if (currentRow != null) {
            throw new IllegalStateException("beginRow() must be paired with endRow() before rendering output.");
        }
    }
}
