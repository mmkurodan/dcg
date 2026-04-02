package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class OutputModel {
    private static final int SCHEMA_VERSION = 1;

    private Object contentView;
    private final List<Object> inlineNodes = new ArrayList<>();
    private final List<View> constructedViews = new ArrayList<>();
    private final List<SpecNode> commands = new ArrayList<>();
    private RowElement currentRow;

    void setContentView(Object contentView) {
        this.contentView = contentView;
        if (contentView instanceof View) {
            ((View) contentView).__dcgMarkAttachedRecursively();
        }
    }

    void addDslNode(Object node) {
        if (node == null) {
            return;
        }
        if (currentRow != null) {
            currentRow.addChild(node);
            if (node instanceof View) {
                ((View) node).__dcgMarkAttachedRecursively();
            }
            return;
        }
        appendInlineNode(node);
    }

    void appendInlineNode(Object node) {
        if (node == null) {
            return;
        }
        inlineNodes.add(node);
    }

    void registerConstructedView(View view) {
        if (view == null || constructedViews.contains(view)) {
            return;
        }
        constructedViews.add(view);
    }

    void markAttached(View view) {
    }

    void addLabel(String key, String text) {
        addDslNode(new LabelElement(normalizeKey(key, "Label key must not be empty."), text));
    }

    void addTitle(String text) {
        addDslNode(new TitleElement(text));
    }

    void addImage(String key, String filename) {
        addDslNode(new ImageElement(
                normalizeKey(key, "Image key must not be empty."),
                normalizeNonEmpty(filename, "Image filename must not be empty.")));
    }

    void saveBitmap(String filename, Bitmap bitmap) {
        commands.add(new SaveBitmapCommand(
                normalizeNonEmpty(filename, "Bitmap filename must not be empty."),
                requireBitmap(bitmap)));
    }

    void addImageClickHandler(String key, String handlerName) {
        commands.add(new ImageClickHandler(
                normalizeKey(key, "Image key must not be empty."),
                normalizeNonEmpty(handlerName, "Image click handler name must not be empty.")));
    }

    void addSpacer() {
        addDslNode(new SpacerElement());
    }

    void setInputEditable(String key, boolean editable) {
        String normalizedKey = normalizeKey(key, "Input key must not be empty.");
        int matchedInputs = 0;
        for (View view : constructedViews) {
            if (!(view instanceof EditText)) {
                continue;
            }
            EditText editText = (EditText) view;
            if (!normalizedKey.equals(editText.__dcgGetId())) {
                continue;
            }
            editText.setEditable(editable);
            matchedInputs++;
        }
        if (matchedInputs == 0) {
            throw new IllegalArgumentException("No input found for key: " + normalizedKey);
        }
    }

    void beginRow() {
        if (currentRow != null) {
            throw new IllegalStateException("beginRow() called before closing the current row.");
        }
        currentRow = new RowElement();
    }

    void endRow() {
        if (currentRow == null) {
            throw new IllegalStateException("endRow() called without a matching beginRow().");
        }
        appendInlineNode(currentRow);
        currentRow = null;
    }

    boolean hasOpenRow() {
        return currentRow != null;
    }

    Object buildSpec() {
        List<Object> nodes = new ArrayList<>();
        Set<Object> emitted = Collections.newSetFromMap(new IdentityHashMap<>());
        appendNode(nodes, contentView, emitted, true);
        for (Object node : inlineNodes) {
            appendNode(nodes, node, emitted, false);
        }
        for (View view : constructedViews) {
            appendNode(nodes, view, emitted, false);
        }
        return nodes.isEmpty() ? null : nodes;
    }

    String toJson() {
        Object spec = buildSpec();
        LinkedHashMap<String, Object> root = new LinkedHashMap<>();
        root.put("version", SCHEMA_VERSION);
        root.put("spec", spec == null ? new ArrayList<>() : spec);
        if (!commands.isEmpty()) {
            List<Object> commandSpecs = new ArrayList<>(commands.size());
            for (SpecNode command : commands) {
                commandSpecs.add(command.toSpecValue());
            }
            root.put("commands", commandSpecs);
        }
        StringBuilder builder = new StringBuilder();
        appendJson(builder, root);
        return builder.toString();
    }

    private void appendNode(List<Object> destination, Object node, Set<Object> emitted, boolean allowAttachedView) {
        if (node == null || !emitted.add(node)) {
            return;
        }
        if (node instanceof View && !allowAttachedView && ((View) node).__dcgIsAttached()) {
            return;
        }
        Object normalized = toSpecValue(node);
        if (normalized == null) {
            return;
        }
        if (normalized instanceof Collection<?>) {
            destination.addAll((Collection<?>) normalized);
            return;
        }
        destination.add(normalized);
    }

    private Object toSpecValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof SpecNode) {
            return ((SpecNode) value).toSpecValue();
        }
        if (value instanceof View) {
            return ((View) value).__dcgToSpec();
        }
        if (value instanceof Bitmap) {
            return toImageNode((Bitmap) value);
        }
        if (value instanceof CharSequence || value instanceof Number || value instanceof Boolean) {
            return toTextNode(String.valueOf(value));
        }
        if (value instanceof Map<?, ?>) {
            Map<String, Object> normalized = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                normalized.put(String.valueOf(entry.getKey()), toSpecValue(entry.getValue()));
            }
            return normalized;
        }
        if (value instanceof Collection<?>) {
            List<Object> normalized = new ArrayList<>();
            for (Object child : (Collection<?>) value) {
                normalized.add(toSpecValue(child));
            }
            return normalized;
        }
        if (value.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(value);
            List<Object> normalized = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                normalized.add(toSpecValue(java.lang.reflect.Array.get(value, index)));
            }
            return normalized;
        }
        return toTextNode(String.valueOf(value));
    }

    private static void appendJson(StringBuilder builder, Object value) {
        if (value == null) {
            builder.append("null");
            return;
        }
        if (value instanceof Map<?, ?>) {
            appendJsonObject(builder, (Map<?, ?>) value);
            return;
        }
        if (value instanceof Collection<?>) {
            appendJsonArray(builder, (Collection<?>) value);
            return;
        }
        if (value.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(value);
            ArrayList<Object> values = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                values.add(java.lang.reflect.Array.get(value, index));
            }
            appendJsonArray(builder, values);
            return;
        }
        if (value instanceof Number || value instanceof Boolean) {
            builder.append(String.valueOf(value));
            return;
        }
        appendJsonString(builder, String.valueOf(value));
    }

    private static void appendJsonObject(StringBuilder builder, Map<?, ?> value) {
        builder.append('{');
        boolean first = true;
        for (Map.Entry<?, ?> entry : value.entrySet()) {
            if (!first) {
                builder.append(',');
            }
            first = false;
            appendJsonString(builder, String.valueOf(entry.getKey()));
            builder.append(':');
            appendJson(builder, entry.getValue());
        }
        builder.append('}');
    }

    private static void appendJsonArray(StringBuilder builder, Collection<?> values) {
        builder.append('[');
        boolean first = true;
        for (Object child : values) {
            if (!first) {
                builder.append(',');
            }
            first = false;
            appendJson(builder, child);
        }
        builder.append(']');
    }

    private static void appendJsonString(StringBuilder builder, String value) {
        builder.append('"');
        String safeValue = value == null ? "" : value;
        for (int index = 0; index < safeValue.length(); index++) {
            char current = safeValue.charAt(index);
            switch (current) {
                case '"':
                    builder.append("\\\"");
                    break;
                case '\\':
                    builder.append("\\\\");
                    break;
                case '\b':
                    builder.append("\\b");
                    break;
                case '\f':
                    builder.append("\\f");
                    break;
                case '\n':
                    builder.append("\\n");
                    break;
                case '\r':
                    builder.append("\\r");
                    break;
                case '\t':
                    builder.append("\\t");
                    break;
                default:
                    if (current < 0x20) {
                        builder.append(String.format("\\u%04x", (int) current));
                    } else {
                        builder.append(current);
                    }
                    break;
            }
        }
        builder.append('"');
    }

    static Map<String, Object> toTextNode(String text) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "text");
        node.put("text", text == null ? "" : text);
        return node;
    }

    static Map<String, Object> toImageNode(Bitmap bitmap) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "image");
        node.put("imageBase64", encodeBitmap(bitmap));
        return node;
    }

    static Map<String, Object> toImageFileNode(String key, String filename) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "image");
        node.put("key", key == null ? "" : key);
        node.put("filename", filename == null ? "" : filename);
        return node;
    }

    static Map<String, Object> toLabelNode(String key, String text) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "label");
        node.put("key", key == null ? "" : key);
        node.put("text", text == null ? "" : text);
        return node;
    }

    static Map<String, Object> toTitleNode(String text) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "title");
        node.put("text", text == null ? "" : text);
        return node;
    }

    static Map<String, Object> toSpacerNode() {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "spacer");
        return node;
    }

    static Map<String, Object> toSaveBitmapCommand(String filename, Bitmap bitmap) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "saveBitmap");
        node.put("filename", filename == null ? "" : filename);
        node.put("imageBase64", encodeBitmap(bitmap));
        return node;
    }

    static Map<String, Object> toImageClickCommand(String key, String handlerName) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "imageClick");
        node.put("key", key == null ? "" : key);
        node.put("handlerName", handlerName == null ? "" : handlerName);
        return node;
    }

    static String encodeBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.getReal() == null) {
            return "";
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        boolean compressed = bitmap.getReal().compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
        if (!compressed) {
            throw new IllegalStateException("Bitmap compression failed.");
        }
        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }

    private static String normalizeKey(String key, String errorMessage) {
        return normalizeNonEmpty(key, errorMessage);
    }

    private static String normalizeNonEmpty(String value, String errorMessage) {
        String normalizedValue = value == null ? "" : value.trim();
        if (normalizedValue.isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        }
        return normalizedValue;
    }

    private static Bitmap requireBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.getReal() == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        return bitmap;
    }

    private interface SpecNode {
        Object toSpecValue();
    }

    private final class RowElement implements SpecNode {
        private final List<Object> children = new ArrayList<>();

        private void addChild(Object child) {
            if (child != null) {
                children.add(child);
            }
        }

        @Override
        public Object toSpecValue() {
            LinkedHashMap<String, Object> node = new LinkedHashMap<>();
            node.put("type", "row");
            List<Object> childSpecs = new ArrayList<>(children.size());
            for (Object child : children) {
                Object normalizedChild = OutputModel.this.toSpecValue(child);
                if (normalizedChild == null) {
                    continue;
                }
                if (normalizedChild instanceof Collection<?>) {
                    childSpecs.addAll((Collection<?>) normalizedChild);
                    continue;
                }
                childSpecs.add(normalizedChild);
            }
            node.put("children", childSpecs);
            return node;
        }
    }

    private static final class LabelElement implements SpecNode {
        private final String key;
        private final String text;

        private LabelElement(String key, String text) {
            this.key = key;
            this.text = text;
        }

        @Override
        public Object toSpecValue() {
            return toLabelNode(key, text);
        }
    }

    private static final class TitleElement implements SpecNode {
        private final String text;

        private TitleElement(String text) {
            this.text = text;
        }

        @Override
        public Object toSpecValue() {
            return toTitleNode(text);
        }
    }

    private static final class SpacerElement implements SpecNode {
        @Override
        public Object toSpecValue() {
            return toSpacerNode();
        }
    }

    private static final class ImageElement implements SpecNode {
        private final String key;
        private final String filename;

        private ImageElement(String key, String filename) {
            this.key = key;
            this.filename = filename;
        }

        @Override
        public Object toSpecValue() {
            return toImageFileNode(key, filename);
        }
    }

    private static final class SaveBitmapCommand implements SpecNode {
        private final String filename;
        private final Bitmap bitmap;

        private SaveBitmapCommand(String filename, Bitmap bitmap) {
            this.filename = filename;
            this.bitmap = bitmap;
        }

        @Override
        public Object toSpecValue() {
            return toSaveBitmapCommand(filename, bitmap);
        }
    }

    private static final class ImageClickHandler implements SpecNode {
        private final String key;
        private final String handlerName;

        private ImageClickHandler(String key, String handlerName) {
            this.key = key;
            this.handlerName = handlerName;
        }

        @Override
        public Object toSpecValue() {
            return toImageClickCommand(key, handlerName);
        }
    }
}
