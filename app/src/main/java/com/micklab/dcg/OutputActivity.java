package com.micklab.dcg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.MotionEvent;
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
import com.micklab.dcg.output.DynamicOutputRuntime;
import com.micklab.dcg.output.ExecutionLogStore;
import com.micklab.dcg.output.OutputModelJsonParser;
import com.micklab.dcg.output.OutputStore;
import com.micklab.dcg.util.DiagnosticFormatter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OutputActivity extends AppCompatActivity {
    private static final String SPACER_TAG = "dcg-spacer";
    private static final String IMAGE_OUTPUT_DIRECTORY = "pseudo-output-images";
    private static final int FIXED_IMAGE_SIZE_PX = 80 * 8;

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
                ? ExecutionResult.idle("Output ready", "Run a snippet to render return values, images, and interactive UI here.")
                : result;
        contentLayout.removeAllViews();
        boolean renderedOutputModel = renderOutputModelJson(
                contentLayout,
                safeResult.getOutputModelJson(),
                findInteractiveRequest(safeResult.getOutputItems()));
        if (!renderedOutputModel) {
            renderOutputItems(contentLayout, safeResult.getOutputItems());
        }
        addTextSection(contentLayout, getString(R.string.result_return_value_label), safeResult.getReturnValue());

        if (contentLayout.getChildCount() == 0) {
            addTextSection(contentLayout, getString(R.string.result_output_label), getString(R.string.output_empty_message));
        }
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
            ExecutionLogStore.publish(ExecutionResult.runtimeError(
                    "Output rendering failed",
                    "Interactive output could not be rendered.",
                    "",
                    DiagnosticFormatter.formatThrowable(exception),
                    "",
                    -1L));
            addView(panel, createBodyText(getString(R.string.output_render_error_message)));
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
                return buildImageNode(spec, request, actionOutputLayout);
            case "row":
                return buildInteractiveCollection(asCollection(spec.get("children")), LinearLayout.HORIZONTAL, request, inputs, actionOutputLayout);
            case "column":
                return buildInteractiveCollection(asCollection(spec.get("children")), LinearLayout.VERTICAL, request, inputs, actionOutputLayout);
            case "input":
                return buildInputNode(spec, inputs);
            case "button":
                return buildButtonNode(spec, request, inputs, actionOutputLayout);
            case "label":
                return buildLabelNode(spec);
            case "title":
                return buildTitleNode(spec);
            case "spacer":
                return buildSpacerNode();
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
        boolean previousWasSpacer = false;
        for (Object child : nodes) {
            View childView = buildInteractiveNode(child, request, inputs, actionOutputLayout);
            if (childView == null) {
                continue;
            }
            boolean childIsSpacer = isSpacerView(childView);
            LinearLayout.LayoutParams params = createInteractiveChildLayoutParams(childView, orientation);
            if (orientation == LinearLayout.HORIZONTAL && index > 0 && !childIsSpacer && !previousWasSpacer) {
                params.setMarginStart(dp(8));
            }
            if (orientation == LinearLayout.VERTICAL && index > 0 && !childIsSpacer && !previousWasSpacer) {
                params.topMargin = dp(8);
            }
            childView.setLayoutParams(params);
            layout.addView(childView);
            index++;
            previousWasSpacer = childIsSpacer;
        }
        return layout;
    }

    private boolean shouldUseWeightedRowLayout(View childView) {
        return childView instanceof TextView;
    }

    private LinearLayout.LayoutParams createInteractiveChildLayoutParams(View childView, int orientation) {
        if (isSpacerView(childView)) {
            if (orientation == LinearLayout.HORIZONTAL) {
                return new LinearLayout.LayoutParams(0, 0, 1f);
            }
            return new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    dp(8));
        }
        if (isFixedSizeOutputImage(childView)) {
            return new LinearLayout.LayoutParams(FIXED_IMAGE_SIZE_PX, FIXED_IMAGE_SIZE_PX);
        }
        if (orientation == LinearLayout.HORIZONTAL && shouldUseWeightedRowLayout(childView)) {
            return new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        }
        if (orientation == LinearLayout.HORIZONTAL) {
            return new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        return new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private boolean isSpacerView(View childView) {
        return childView != null && SPACER_TAG.equals(childView.getTag());
    }

    private boolean isFixedSizeOutputImage(View childView) {
        ViewGroup.LayoutParams params = childView == null ? null : childView.getLayoutParams();
        return childView instanceof ImageView
                && params != null
                && params.width == FIXED_IMAGE_SIZE_PX
                && params.height == FIXED_IMAGE_SIZE_PX;
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

    private View buildLabelNode(Map<?, ?> spec) {
        TextView textView = createBodyText(stringValue(spec.get("text")));
        int horizontalPadding = dp(12);
        int verticalPadding = dp(10);
        textView.setPadding(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding);
        textView.setEnabled(false);
        textView.setFocusable(false);
        textView.setClickable(false);
        return textView;
    }

    private View buildTitleNode(Map<?, ?> spec) {
        TextView titleView = createBodyText(stringValue(spec.get("text")));
        titleView.setTextSize(24);
        titleView.setTypeface(Typeface.DEFAULT_BOLD);
        titleView.setTextColor(color(R.color.textPrimary));
        return titleView;
    }

    private View buildSpacerNode() {
        View spacerView = new View(this);
        spacerView.setTag(SPACER_TAG);
        return spacerView;
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
        boolean editable = !spec.containsKey("editable") || booleanValue(spec.get("editable"));
        if (!editable) {
            editText.setEnabled(false);
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
            editText.setClickable(false);
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

    private View buildImageNode(
            Map<?, ?> spec,
            DynamicUiRequest request,
            LinearLayout actionOutputLayout) {
        ImageView imageView = new ImageView(this);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String key = stringValue(spec.get("key"));
        String encoded = stringValue(spec.get("imageBase64"));
        String filename = stringValue(spec.get("filename"));
        if (!filename.isEmpty()) {
            imageView.setLayoutParams(new LinearLayout.LayoutParams(
                    FIXED_IMAGE_SIZE_PX,
                    FIXED_IMAGE_SIZE_PX));
        }
        if (!filename.isEmpty()) {
            Bitmap bitmap;
            try {
                bitmap = BitmapFactory.decodeFile(resolveImageOutputFile(filename).getAbsolutePath());
            } catch (IOException exception) {
                return createBodyText(exception.getMessage());
            }
            if (bitmap == null) {
                return createBodyText("Image file decode failed.");
            }
            imageView.setImageBitmap(bitmap);
        } else if (!encoded.isEmpty()) {
            byte[] bytes = Base64.getDecoder().decode(encoded);
            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
            if (bitmap == null) {
                return createBodyText("Bitmap decode failed.");
            }
            imageView.setImageBitmap(bitmap);
        }
        String handlerName = stringValue(spec.get("handlerName"));
        if (!key.isEmpty() && !handlerName.isEmpty()) {
            bindImageTouchHandler(imageView, request, handlerName, actionOutputLayout);
        }
        return imageView;
    }

    private void bindImageTouchHandler(
            ImageView imageView,
            DynamicUiRequest request,
            String handlerName,
            LinearLayout actionOutputLayout) {
        if (imageView == null
                || request == null
                || request.getDynamicClass() == null
                || TextUtils.isEmpty(handlerName)) {
            return;
        }
        imageView.setClickable(true);
        imageView.setOnTouchListener((view, event) -> {
            if (event == null) {
                return true;
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                int x = (int) event.getX();
                int y = (int) event.getY();
                Map<String, String> values = new HashMap<>();
                values.put("x", String.valueOf(x));
                values.put("y", String.valueOf(y));
                callJavaHandler(request, handlerName, values, actionOutputLayout);
            }
            return true;
        });
    }

    private void callJavaHandler(
            DynamicUiRequest request,
            String handlerName,
            Map<String, String> values,
            LinearLayout actionOutputLayout) {
        try {
            Object result = DynamicOutputRuntime.invokeImageClickHandler(request, handlerName, values);
            renderJavaHandlerOutput(actionOutputLayout, result);
        } catch (Exception exception) {
            actionOutputLayout.removeAllViews();
            actionOutputLayout.setVisibility(View.GONE);
            ExecutionLogStore.publish(ExecutionResult.runtimeError(
                    "Interactive action failed",
                    "Action \"" + handlerName + "\" threw an exception.",
                    "",
                    DiagnosticFormatter.formatThrowable(unwrapInvocationException(exception)),
                    "",
                    -1L));
        }
    }

    private void renderJavaHandlerOutput(LinearLayout actionOutputLayout, Object result) {
        actionOutputLayout.removeAllViews();
        if (!(result instanceof String)) {
            actionOutputLayout.setVisibility(View.GONE);
            return;
        }
        addTextSection(actionOutputLayout, getString(R.string.result_output_label), (String) result);
        actionOutputLayout.setVisibility(View.VISIBLE);
    }

    private Throwable unwrapInvocationException(Exception exception) {
        if (exception instanceof DynamicOutputRuntime.InvocationFailureException && exception.getCause() != null) {
            return exception.getCause();
        }
        if (exception instanceof InvocationTargetException && exception.getCause() != null) {
            return exception.getCause();
        }
        return exception;
    }

    private void runInteractiveAction(
            DynamicUiRequest request,
            String action,
            Map<String, EditText> inputs,
            LinearLayout actionOutputLayout) {
        runInteractiveActionWithValues(request, action, collectInputValues(inputs), actionOutputLayout);
    }

    private void runInteractiveActionWithValues(
            DynamicUiRequest request,
            String action,
            Map<String, String> values,
            LinearLayout actionOutputLayout) {
        try {
            DynamicOutputRuntime.ActionOutput actionOutput = DynamicOutputRuntime.invokeAction(request, action, values, this);
            publishActionLog(action, actionOutput);
            renderActionOutput(actionOutputLayout, actionOutput);
        } catch (Exception exception) {
            actionOutputLayout.removeAllViews();
            actionOutputLayout.setVisibility(View.GONE);
            ExecutionLogStore.publish(ExecutionResult.runtimeError(
                    "Interactive action failed",
                    "Action \"" + action + "\" threw an exception.",
                    "",
                    DiagnosticFormatter.formatThrowable(exception),
                    "",
                    -1L));
        }
    }

    private Map<String, String> collectInputValues(Map<String, EditText> inputs) {
        Map<String, String> values = new LinkedHashMap<>();
        if (inputs == null) {
            return values;
        }
        for (Map.Entry<String, EditText> entry : inputs.entrySet()) {
            CharSequence text = entry.getValue().getText();
            values.put(entry.getKey(), text == null ? "" : text.toString());
        }
        return values;
    }

    private void renderActionOutput(LinearLayout actionOutputLayout, DynamicOutputRuntime.ActionOutput actionOutput) {
        actionOutputLayout.removeAllViews();
        if (actionOutput == null) {
            actionOutputLayout.setVisibility(View.GONE);
            return;
        }

        renderOutputItems(actionOutputLayout, actionOutput.getOutputItems());

        actionOutputLayout.setVisibility(actionOutputLayout.getChildCount() == 0 ? View.GONE : View.VISIBLE);
    }

    private void publishActionLog(String action, DynamicOutputRuntime.ActionOutput actionOutput) {
        if (actionOutput == null) {
            return;
        }
        ExecutionLogStore.publish(ExecutionResult.success(
                "Interactive action succeeded",
                "Action \"" + action + "\" finished.",
                actionOutput.getStdout(),
                "",
                actionOutput.getStderr(),
                "",
                -1L));
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
            OutputModelJsonParser.OutputDocument document = OutputModelJsonParser.parseDocument(outputModelJson);
            Object spec = document.getSpec();
            List<Map<String, Object>> commands = document.getCommands();
            applyOutputModelCommands(commands);
            if (OutputModelJsonParser.isEmptySpec(spec)) {
                return false;
            }
            Object enrichedSpec = applyImageClickHandlers(spec, commands);
            LinearLayout panel = createPanel();
            addSectionLabel(panel, getString(R.string.result_output_label));

            LinearLayout actionOutputLayout = new LinearLayout(this);
            actionOutputLayout.setOrientation(LinearLayout.VERTICAL);
            actionOutputLayout.setVisibility(View.GONE);
            LinkedHashMap<String, EditText> inputs = new LinkedHashMap<>();
            View renderedSpec = buildInteractiveNode(enrichedSpec, request, inputs, actionOutputLayout);
            if (renderedSpec != null) {
                setTopMargin(renderedSpec, 8);
                addView(panel, renderedSpec);
            }
            addView(panel, actionOutputLayout);
            addView(parent, panel);
            return true;
        } catch (Exception exception) {
            ExecutionLogStore.publish(ExecutionResult.runtimeError(
                    "Output rendering failed",
                    "The output model could not be rendered.",
                    "",
                    DiagnosticFormatter.formatThrowable(exception),
                    "",
                    -1L));
            return false;
        }
    }

    private void applyOutputModelCommands(List<Map<String, Object>> commands) throws IOException {
        if (commands == null) {
            return;
        }
        for (Map<String, Object> command : commands) {
            if (command == null) {
                continue;
            }
            String type = stringValue(command.get("type")).toLowerCase();
            if ("savebitmap".equals(type)) {
                persistBitmapCommand(command);
            }
        }
    }

    private Object applyImageClickHandlers(Object spec, List<Map<String, Object>> commands) {
        Map<String, String> handlersByKey = new LinkedHashMap<>();
        if (commands != null) {
            for (Map<String, Object> command : commands) {
                if (command == null) {
                    continue;
                }
                if (!"imageclick".equals(stringValue(command.get("type")).toLowerCase())) {
                    continue;
                }
                String key = stringValue(command.get("key"));
                String handlerName = stringValue(command.get("handlerName"));
                if (!key.isEmpty() && !handlerName.isEmpty()) {
                    handlersByKey.put(key, handlerName);
                }
            }
        }
        if (handlersByKey.isEmpty()) {
            return spec;
        }
        return injectImageHandlers(spec, handlersByKey);
    }

    private Object injectImageHandlers(Object node, Map<String, String> handlersByKey) {
        if (node instanceof Map<?, ?>) {
            LinkedHashMap<String, Object> rewritten = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) node).entrySet()) {
                rewritten.put(String.valueOf(entry.getKey()), injectImageHandlers(entry.getValue(), handlersByKey));
            }
            String type = stringValue(rewritten.get("type")).toLowerCase();
            if ("image".equals(type)) {
                String key = stringValue(rewritten.get("key"));
                String handlerName = handlersByKey.get(key);
                if (!TextUtils.isEmpty(handlerName)) {
                    rewritten.put("handlerName", handlerName);
                }
            }
            return rewritten;
        }
        if (node instanceof Collection<?>) {
            List<Object> rewritten = new ArrayList<>();
            for (Object child : (Collection<?>) node) {
                rewritten.add(injectImageHandlers(child, handlersByKey));
            }
            return rewritten;
        }
        if (node != null && node.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(node);
            List<Object> rewritten = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                rewritten.add(injectImageHandlers(java.lang.reflect.Array.get(node, index), handlersByKey));
            }
            return rewritten;
        }
        return node;
    }

    private void persistBitmapCommand(Map<String, Object> command) throws IOException {
        String filename = stringValue(command.get("filename"));
        String encoded = stringValue(command.get("imageBase64"));
        if (filename.isEmpty()) {
            throw new IOException("Bitmap save command is missing a filename.");
        }
        if (encoded.isEmpty()) {
            throw new IOException("Bitmap save command is missing image data.");
        }
        byte[] bytes = Base64.getDecoder().decode(encoded);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        if (bitmap == null) {
            throw new IOException("Bitmap save command image decode failed.");
        }
        saveBitmapToInternalStorage(filename, bitmap);
    }

    private void saveBitmapToInternalStorage(String filename, Bitmap bitmap) throws IOException {
        File targetFile = resolveImageOutputFile(filename);
        File parentDirectory = targetFile.getParentFile();
        if (parentDirectory != null && !parentDirectory.exists() && !parentDirectory.mkdirs() && !parentDirectory.isDirectory()) {
            throw new IOException("Could not create image output directory.");
        }
        try (FileOutputStream outputStream = new FileOutputStream(targetFile)) {
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
                throw new IOException("Bitmap compression failed.");
            }
        }
    }

    private File resolveImageOutputFile(String filename) throws IOException {
        String trimmed = filename == null ? "" : filename.trim();
        if (trimmed.isEmpty()) {
            throw new IOException("Image filename must not be empty.");
        }
        File imageDirectory = new File(getFilesDir(), IMAGE_OUTPUT_DIRECTORY);
        File candidate = new File(imageDirectory, trimmed);
        File canonicalDirectory = imageDirectory.getCanonicalFile();
        File canonicalCandidate = candidate.getCanonicalFile();
        String directoryPath = canonicalDirectory.getPath();
        String candidatePath = canonicalCandidate.getPath();
        if (!candidatePath.equals(directoryPath) && !candidatePath.startsWith(directoryPath + File.separator)) {
            throw new IOException("Image filename resolves outside the app storage directory.");
        }
        return canonicalCandidate;
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
