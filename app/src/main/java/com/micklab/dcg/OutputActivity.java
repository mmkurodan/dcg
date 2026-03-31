package com.micklab.dcg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.micklab.dcg.model.DynamicUiRequest;
import com.micklab.dcg.model.ExecutionOutputItem;
import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.ExecutionStatus;
import com.micklab.dcg.output.DynamicOutputRuntime;
import com.micklab.dcg.output.OutputModelJsonParser;
import com.micklab.dcg.output.OutputStore;
import com.micklab.dcg.util.DiagnosticFormatter;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OutputActivity extends AppCompatActivity {
    private LinearLayout contentLayout;

    private final OutputStore.Listener outputListener = result -> runOnUiThread(() -> renderResult(result));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(buildContentView());
        renderResult(OutputStore.getLatestResult());
    }

    @Override
    protected void onStart() {
        super.onStart();
        OutputStore.addListener(outputListener);
        renderResult(OutputStore.getLatestResult());
    }

    @Override
    protected void onStop() {
        OutputStore.removeListener(outputListener);
        super.onStop();
    }

    private View buildContentView() {
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(color(R.color.surface));

        contentLayout = new LinearLayout(this);
        contentLayout.setOrientation(LinearLayout.VERTICAL);
        int padding = dp(16);
        contentLayout.setPadding(padding, padding, padding, padding);
        scrollView.addView(contentLayout, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT,
                ScrollView.LayoutParams.WRAP_CONTENT));
        return scrollView;
    }

    private void renderResult(ExecutionResult result) {
        ExecutionResult safeResult = result == null
                ? ExecutionResult.idle("Output ready", "Run a snippet to render stdout, images, and interactive UI here.")
                : result;
        contentLayout.removeAllViews();
        addView(contentLayout, buildHeader(safeResult));

        addTextSection(contentLayout, getString(R.string.result_stdout_label), safeResult.getStdout());
        boolean renderedOutputModel = renderOutputModelJson(
                contentLayout,
                safeResult.getOutputModelJson(),
                findInteractiveRequest(safeResult.getOutputItems()));
        if (!renderedOutputModel) {
            renderOutputItems(contentLayout, safeResult.getOutputItems());
        }
        addTextSection(contentLayout, getString(R.string.result_return_value_label), safeResult.getReturnValue());
        addTextSection(contentLayout, getString(R.string.result_error_label), safeResult.getError());
        addTextSection(contentLayout, getString(R.string.result_details_label), buildDetails(safeResult));

        if (contentLayout.getChildCount() == 1) {
            addTextSection(contentLayout, getString(R.string.result_output_label), "No execution output yet.");
        }
    }

    private View buildHeader(ExecutionResult result) {
        LinearLayout panel = createPanel();

        TextView statusView = new TextView(this);
        statusView.setText(result.getStatusLabel());
        statusView.setTextColor(colorFor(result.getStatus()));
        statusView.setTypeface(Typeface.DEFAULT_BOLD);
        statusView.setTextSize(14);
        addView(panel, statusView);

        if (!TextUtils.isEmpty(result.getHeadline())) {
            TextView headlineView = new TextView(this);
            headlineView.setText(result.getHeadline());
            headlineView.setTextColor(color(R.color.textPrimary));
            headlineView.setTextSize(24);
            headlineView.setTypeface(Typeface.DEFAULT_BOLD);
            setTopMargin(headlineView, 8);
            addView(panel, headlineView);
        }

        if (!TextUtils.isEmpty(result.getSummary())) {
            TextView summaryView = new TextView(this);
            summaryView.setText(result.getSummary());
            summaryView.setTextColor(color(R.color.textSecondary));
            summaryView.setTextSize(15);
            setTopMargin(summaryView, 8);
            addView(panel, summaryView);
        }

        return panel;
    }

    private void renderOutputItems(LinearLayout parent, List<ExecutionOutputItem> items) {
        if (items == null || items.isEmpty()) {
            return;
        }
        for (ExecutionOutputItem item : items) {
            if (item == null) {
                continue;
            }
            switch (item.getType()) {
                case IMAGE:
                    addView(parent, buildImageSection(item));
                    break;
                case INTERACTIVE:
                    addView(parent, buildInteractiveSection(item));
                    break;
                case TEXT:
                default:
                    addTextSection(parent, normalizeLabel(item.getLabel()), item.getText());
                    break;
            }
        }
    }

    private View buildImageSection(ExecutionOutputItem item) {
        LinearLayout panel = createPanel();
        addSectionLabel(panel, normalizeLabel(item.getLabel()));

        byte[] bytes = Base64.getDecoder().decode(item.getImageBase64());
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        if (bitmap == null) {
            addView(panel, createBodyText("Bitmap decode failed."));
            return panel;
        }

        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        imageView.setAdjustViewBounds(true);
        setTopMargin(imageView, 8);
        addView(panel, imageView);
        return panel;
    }

    private View buildInteractiveSection(ExecutionOutputItem item) {
        LinearLayout panel = createPanel();
        addSectionLabel(panel, normalizeLabel(item.getLabel()));

        DynamicUiRequest request = item.getInteractiveRequest();
        if (request == null) {
            addView(panel, createBodyText("Interactive output request is missing."));
            return panel;
        }

        try {
            if (request.getMode() == DynamicUiRequest.Mode.VIEW_FACTORY) {
                View interactiveView = DynamicOutputRuntime.createOutputView(this, request);
                detachFromParent(interactiveView);
                setTopMargin(interactiveView, 8);
                addView(panel, interactiveView);
                return panel;
            }

            LinearLayout interactiveRoot = new LinearLayout(this);
            interactiveRoot.setOrientation(LinearLayout.VERTICAL);
            setTopMargin(interactiveRoot, 8);
            LinkedHashMap<String, EditText> inputs = new LinkedHashMap<>();
            LinearLayout actionOutputLayout = new LinearLayout(this);
            actionOutputLayout.setOrientation(LinearLayout.VERTICAL);
            actionOutputLayout.setVisibility(View.GONE);

            View renderedSpec = buildInteractiveNode(request.getSpec(), request, inputs, actionOutputLayout);
            if (renderedSpec != null) {
                addView(interactiveRoot, renderedSpec);
            }
            addView(interactiveRoot, actionOutputLayout);
            addView(panel, interactiveRoot);
        } catch (Exception exception) {
            addTextSection(panel, getString(R.string.result_error_label), DiagnosticFormatter.formatThrowable(exception));
        }
        return panel;
    }

    private View buildInteractiveNode(
            Object node,
            DynamicUiRequest request,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        if (node == null) {
            return null;
        }
        if (node instanceof Map<?, ?>) {
            return buildInteractiveMap((Map<?, ?>) node, request, inputs, actionOutputLayout);
        }
        if (node instanceof Collection<?>) {
            return buildInteractiveCollection((Collection<?>) node, LinearLayout.VERTICAL, request, inputs, actionOutputLayout);
        }
        if (node.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(node);
            List<Object> values = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                values.add(java.lang.reflect.Array.get(node, index));
            }
            return buildInteractiveCollection(values, LinearLayout.VERTICAL, request, inputs, actionOutputLayout);
        }
        return createBodyText(String.valueOf(node));
    }

    private View buildInteractiveMap(
            Map<?, ?> spec,
            DynamicUiRequest request,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        String type = stringValue(spec.get("type")).toLowerCase();
        switch (type) {
            case "image":
                return buildImageNode(spec);
            case "row":
                return buildInteractiveCollection(asCollection(spec.get("children")), LinearLayout.HORIZONTAL, request, inputs, actionOutputLayout);
            case "column":
                return buildInteractiveCollection(asCollection(spec.get("children")), LinearLayout.VERTICAL, request, inputs, actionOutputLayout);
            case "input":
                return buildInputNode(spec, inputs);
            case "button":
                return buildButtonNode(spec, request, inputs, actionOutputLayout);
            case "text":
            default:
                return buildTextNode(spec);
        }
    }

    private View buildInteractiveCollection(
            Collection<?> nodes,
            int orientation,
            DynamicUiRequest request,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(orientation);
        if (nodes == null) {
            return layout;
        }
        int index = 0;
        for (Object child : nodes) {
            View childView = buildInteractiveNode(child, request, inputs, actionOutputLayout);
            if (childView == null) {
                continue;
            }
            LinearLayout.LayoutParams params;
            if (orientation == LinearLayout.HORIZONTAL
                    && (childView instanceof Button || childView instanceof EditText)) {
                params = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
            } else {
                params = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }
            if (orientation == LinearLayout.HORIZONTAL && index > 0) {
                params.setMarginStart(dp(8));
            }
            if (orientation == LinearLayout.VERTICAL && index > 0) {
                params.topMargin = dp(8);
            }
            childView.setLayoutParams(params);
            layout.addView(childView);
            index++;
        }
        return layout;
    }

    private View buildTextNode(Map<?, ?> spec) {
        TextView textView = createBodyText(stringValue(spec.get("text")));
        String emphasis = stringValue(spec.get("style")).toLowerCase();
        if ("title".equals(emphasis)) {
            textView.setTextSize(20);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(color(R.color.textPrimary));
        }
        return textView;
    }

    private View buildInputNode(Map<?, ?> spec, Map<String, EditText> inputs) {
        EditText editText = new EditText(this);
        editText.setHint(stringValue(spec.get("hint")));
        editText.setText(stringValue(spec.get("value")));
        editText.setTextColor(color(R.color.textPrimary));
        String keyboard = stringValue(spec.get("keyboard")).toLowerCase();
        if ("number".equals(keyboard) || booleanValue(spec.get("numeric"))) {
            editText.setInputType(InputType.TYPE_CLASS_NUMBER
                    | InputType.TYPE_NUMBER_FLAG_DECIMAL
                    | InputType.TYPE_NUMBER_FLAG_SIGNED);
        }
        String id = stringValue(spec.get("id"));
        if (!id.isEmpty()) {
            inputs.put(id, editText);
        }
        return editText;
    }

    private View buildButtonNode(
            Map<?, ?> spec,
            DynamicUiRequest request,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        Button button = new Button(this);
        String buttonText = stringValue(spec.get("text"));
        button.setText(buttonText.isEmpty() ? "Action" : buttonText);
        String action = stringValue(spec.get("action"));
        if (action.isEmpty() || request == null || request.getDynamicClass() == null) {
            button.setEnabled(false);
            return button;
        }
        button.setOnClickListener(view -> runInteractiveAction(request, action, inputs, actionOutputLayout));
        return button;
    }

    private View buildImageNode(Map<?, ?> spec) {
        ImageView imageView = new ImageView(this);
        imageView.setAdjustViewBounds(true);
        String encoded = stringValue(spec.get("imageBase64"));
        if (!encoded.isEmpty()) {
            byte[] bytes = Base64.getDecoder().decode(encoded);
            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
            if (bitmap == null) {
                return createBodyText("Bitmap decode failed.");
            }
            imageView.setImageBitmap(bitmap);
        }
        return imageView;
    }

    private void runInteractiveAction(
            DynamicUiRequest request,
            String action,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        try {
            Map<String, String> values = new LinkedHashMap<>();
            for (Map.Entry<String, EditText> entry : inputs.entrySet()) {
                CharSequence text = entry.getValue().getText();
                values.put(entry.getKey(), text == null ? "" : text.toString());
            }
            DynamicOutputRuntime.ActionOutput actionOutput = DynamicOutputRuntime.invokeAction(request, action, values, this);
            renderActionOutput(actionOutputLayout, actionOutput);
        } catch (Exception exception) {
            actionOutputLayout.removeAllViews();
            actionOutputLayout.setVisibility(View.VISIBLE);
            addTextSection(actionOutputLayout, getString(R.string.result_error_label), DiagnosticFormatter.formatThrowable(exception));
        }
    }

    private void renderActionOutput(LinearLayout actionOutputLayout, DynamicOutputRuntime.ActionOutput actionOutput) {
        actionOutputLayout.removeAllViews();
        if (actionOutput == null) {
            actionOutputLayout.setVisibility(View.GONE);
            return;
        }

        addTextSection(actionOutputLayout, getString(R.string.result_stdout_label), actionOutput.getStdout());
        addTextSection(actionOutputLayout, getString(R.string.result_error_label), actionOutput.getStderr());
        renderOutputItems(actionOutputLayout, actionOutput.getOutputItems());

        actionOutputLayout.setVisibility(actionOutputLayout.getChildCount() == 0 ? View.GONE : View.VISIBLE);
    }

    private void addTextSection(LinearLayout parent, String label, String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        LinearLayout panel = createPanel();
        addSectionLabel(panel, normalizeLabel(label));
        TextView valueView = createBodyText(text);
        valueView.setTextIsSelectable(true);
        setTopMargin(valueView, 8);
        addView(panel, valueView);
        addView(parent, panel);
    }

    private TextView createBodyText(String text) {
        TextView textView = new TextView(this);
        textView.setText(text == null ? "" : text);
        textView.setTextColor(color(R.color.textPrimary));
        textView.setTextSize(16);
        return textView;
    }

    private void addSectionLabel(LinearLayout parent, String label) {
        if (TextUtils.isEmpty(label)) {
            return;
        }
        TextView labelView = new TextView(this);
        labelView.setText(label);
        labelView.setTextColor(color(R.color.textSecondary));
        labelView.setTextSize(12);
        labelView.setTypeface(Typeface.DEFAULT_BOLD);
        addView(parent, labelView);
    }

    private LinearLayout createPanel() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackground(createPanelBackground());
        int padding = dp(12);
        layout.setPadding(padding, padding, padding, padding);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(12);
        layout.setLayoutParams(params);
        return layout;
    }

    private GradientDrawable createPanelBackground() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(dp(12));
        drawable.setColor(color(R.color.panel));
        drawable.setStroke(dp(1), color(R.color.stroke));
        return drawable;
    }

    private String buildDetails(ExecutionResult result) {
        StringBuilder builder = new StringBuilder();
        if (!TextUtils.isEmpty(result.getDetails())) {
            builder.append(result.getDetails());
        }
        if (result.getDurationMs() >= 0L) {
            if (builder.length() > 0) {
                builder.append("\n\n");
            }
            builder.append("Duration: ").append(result.getDurationMs()).append(" ms");
        }
        return builder.toString();
    }

    private int colorFor(ExecutionStatus status) {
        if (status == ExecutionStatus.SUCCESS) {
            return color(R.color.success);
        }
        if (status == ExecutionStatus.COMPILATION_ERROR
                || status == ExecutionStatus.RUNTIME_ERROR
                || status == ExecutionStatus.IO_ERROR) {
            return color(R.color.error);
        }
        if (status == ExecutionStatus.UNSUPPORTED) {
            return color(R.color.warning);
        }
        return color(R.color.info);
    }

    private Collection<?> asCollection(Object value) {
        if (value instanceof Collection<?>) {
            return (Collection<?>) value;
        }
        if (value != null && value.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(value);
            List<Object> values = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                values.add(java.lang.reflect.Array.get(value, index));
            }
            return values;
        }
        return new ArrayList<>();
    }

    private boolean booleanValue(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (value instanceof String) {
            return Boolean.parseBoolean((String) value);
        }
        return false;
    }

    private String stringValue(Object value) {
        return value == null ? "" : String.valueOf(value);
    }

    private String normalizeLabel(String label) {
        return TextUtils.isEmpty(label) ? getString(R.string.result_output_label) : label;
    }

    private DynamicUiRequest findInteractiveRequest(List<ExecutionOutputItem> items) {
        if (items == null) {
            return null;
        }
        for (ExecutionOutputItem item : items) {
            if (item != null && item.getType() == ExecutionOutputItem.Type.INTERACTIVE) {
                return item.getInteractiveRequest();
            }
        }
        return null;
    }

    private boolean renderOutputModelJson(
            LinearLayout parent,
            String outputModelJson,
            DynamicUiRequest request) {
        if (TextUtils.isEmpty(outputModelJson)) {
            return false;
        }
        try {
            Object spec = OutputModelJsonParser.parseSpec(outputModelJson);
            if (OutputModelJsonParser.isEmptySpec(spec)) {
                return false;
            }
            LinearLayout panel = createPanel();
            addSectionLabel(panel, getString(R.string.result_output_label));

            LinearLayout actionOutputLayout = new LinearLayout(this);
            actionOutputLayout.setOrientation(LinearLayout.VERTICAL);
            actionOutputLayout.setVisibility(View.GONE);
            LinkedHashMap<String, EditText> inputs = new LinkedHashMap<>();
            View renderedSpec = buildInteractiveNode(spec, request, inputs, actionOutputLayout);
            if (renderedSpec != null) {
                setTopMargin(renderedSpec, 8);
                addView(panel, renderedSpec);
            }
            addView(panel, actionOutputLayout);
            addView(parent, panel);
            return true;
        } catch (Exception exception) {
            addTextSection(parent, getString(R.string.result_error_label), DiagnosticFormatter.formatThrowable(exception));
            return false;
        }
    }

    private void addView(LinearLayout parent, View child) {
        if (child == null) {
            return;
        }
        if (child.getLayoutParams() == null) {
            child.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
        }
        parent.addView(child);
    }

    private void detachFromParent(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private void setTopMargin(View view, int marginDp) {
        ViewGroup.LayoutParams currentParams = view.getLayoutParams();
        LinearLayout.LayoutParams params;
        if (currentParams instanceof LinearLayout.LayoutParams) {
            params = (LinearLayout.LayoutParams) currentParams;
        } else {
            params = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        params.topMargin = dp(marginDp);
        view.setLayoutParams(params);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private int color(int colorRes) {
        return ContextCompat.getColor(this, colorRes);
    }
}
