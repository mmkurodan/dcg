package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;
import com.micklab.dcg.wrapper.android.os.Bundle;

public class PseudoMainActivity {
    private final OutputModel outputModel = new OutputModel();

    protected void onCreate(Bundle savedInstanceState) {
    }

    protected final void setContentView(Object contentView) {
        outputModel.setContentView(contentView);
    }

    protected final TextView println(Object value) {
        TextView textView = new TextView(this);
        textView.setText(value == null ? "" : String.valueOf(value));
        outputModel.appendInlineNode(textView);
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
        outputModel.appendInlineNode(button);
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
        outputModel.appendInlineNode(editText);
        return editText;
    }

    void __dcgRegisterConstructedView(View view) {
        outputModel.registerConstructedView(view);
    }

    void __dcgMarkAttached(View view) {
        outputModel.markAttached(view);
    }

    public final Object __dcgBuildOutputSpec() {
        return outputModel.buildSpec();
    }

    public final String __dcgGetOutputModelJson() {
        return outputModel.toJson();
    }
}
