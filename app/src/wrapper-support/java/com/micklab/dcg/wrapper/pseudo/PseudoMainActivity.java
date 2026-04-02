package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;
import com.micklab.dcg.wrapper.android.os.Bundle;

public class PseudoMainActivity {
    private static final ThreadLocal<PseudoMainActivity> CURRENT_ACTIVITY = new ThreadLocal<>();
    private final OutputModel outputModel = new OutputModel();

    protected void onCreate() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        __dcgWithCurrentActivity(new Runnable() {
            @Override
            public void run() {
                onCreate();
            }
        });
    }

    protected final void __dcgRunOnCreateLifecycle() {
        __dcgWithCurrentActivity(new Runnable() {
            @Override
            public void run() {
                onCreate((Bundle) null);
            }
        });
    }

    protected static void setContentView(Object contentView) {
        requireCurrentActivity().outputModel.setContentView(contentView);
    }

    protected static TextView println(Object value) {
        return addLabel(value);
    }

    protected static TextView addLabel(Object value) {
        PseudoMainActivity activity = requireCurrentActivity();
        TextView textView = new TextView(activity);
        textView.setText(value == null ? "" : String.valueOf(value));
        activity.appendDslNode(textView);
        return textView;
    }

    protected static void addLabel(String key, String text) {
        requireCurrentActivity().outputModel.addLabel(key, text);
    }

    protected static ImageView drawBitmap(Bitmap bitmap) {
        PseudoMainActivity activity = requireCurrentActivity();
        ImageView imageView = new ImageView(activity);
        imageView.setImageBitmap(bitmap);
        activity.appendDslNode(imageView);
        return imageView;
    }

    protected static void addImage(String key, String filename) {
        requireCurrentActivity().outputModel.addImage(key, filename);
    }

    protected static void saveBitmap(String filename, Bitmap bmp) {
        requireCurrentActivity().outputModel.saveBitmap(filename, bmp);
    }

    protected static void onImageClick(String key, String handlerName) {
        requireCurrentActivity().outputModel.addImageClickHandler(key, handlerName);
    }

    protected static Button addButton(String text, String action) {
        PseudoMainActivity activity = requireCurrentActivity();
        Button button = new Button(activity);
        button.setText(text);
        button.setAction(action);
        activity.appendDslNode(button);
        return button;
    }

    protected static EditText addInput(String id, String hint) {
        return addInput(id, hint, "");
    }

    protected static EditText addInput(String id, String hint, String value) {
        PseudoMainActivity activity = requireCurrentActivity();
        EditText editText = new EditText(activity);
        editText.setId(id);
        editText.setHint(hint);
        editText.setText(value);
        activity.appendDslNode(editText);
        return editText;
    }

    protected static void setInputEditable(String key, boolean editable) {
        requireCurrentActivity().outputModel.setInputEditable(key, editable);
    }

    protected static void addSpacer() {
        requireCurrentActivity().outputModel.addSpacer();
    }

    protected static void addTitle(String text) {
        requireCurrentActivity().outputModel.addTitle(text);
    }

    protected static void beginRow() {
        requireCurrentActivity().outputModel.beginRow();
    }

    protected static void endRow() {
        requireCurrentActivity().outputModel.endRow();
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

    private void __dcgWithCurrentActivity(Runnable action) {
        PseudoMainActivity previous = CURRENT_ACTIVITY.get();
        CURRENT_ACTIVITY.set(this);
        try {
            action.run();
        } finally {
            restoreCurrentActivity(previous);
        }
    }

    private static PseudoMainActivity requireCurrentActivity() {
        PseudoMainActivity activity = CURRENT_ACTIVITY.get();
        if (activity == null) {
            throw new IllegalStateException("PseudoMainActivity helpers can only be used while rendering onCreate().");
        }
        return activity;
    }

    private static void restoreCurrentActivity(PseudoMainActivity previous) {
        if (previous == null) {
            CURRENT_ACTIVITY.remove();
            return;
        }
        CURRENT_ACTIVITY.set(previous);
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
