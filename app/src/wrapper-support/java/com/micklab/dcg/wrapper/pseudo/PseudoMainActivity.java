package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;
import com.micklab.dcg.wrapper.android.os.Bundle;

public class PseudoMainActivity {
    private final OutputModel outputModel = new OutputModel();

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
        appendDslNode(textView);
        return textView;
    }

    protected final void addLabel(String key, String text) {
        outputModel.addLabel(key, text);
    }

    protected final ImageView drawBitmap(Bitmap bitmap) {
        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        appendDslNode(imageView);
        return imageView;
    }

    protected final void addImage(String key, String filename) {
        outputModel.addImage(key, filename);
    }

    protected final void saveBitmap(String filename, Bitmap bmp) {
        outputModel.saveBitmap(filename, bmp);
    }

    protected final void onImageClick(String key, String handlerName) {
        outputModel.addImageClickHandler(key, handlerName);
    }

    protected final Button addButton(String text, String action) {
        Button button = new Button(this);
        button.setText(text);
        button.setAction(action);
        appendDslNode(button);
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
        appendDslNode(editText);
        return editText;
    }

    protected final void setInputEditable(String key, boolean editable) {
        outputModel.setInputEditable(key, editable);
    }

    protected final void addSpacer() {
        outputModel.addSpacer();
    }

    protected final void addTitle(String text) {
        outputModel.addTitle(text);
    }

    protected final void beginRow() {
        outputModel.beginRow();
    }

    protected final void endRow() {
        outputModel.endRow();
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

    private void appendDslNode(Object node) {
        outputModel.addDslNode(node);
    }

    private void ensureBalancedRows() {
        if (outputModel.hasOpenRow()) {
            throw new IllegalStateException("beginRow() must be paired with endRow() before rendering output.");
        }
    }
}
