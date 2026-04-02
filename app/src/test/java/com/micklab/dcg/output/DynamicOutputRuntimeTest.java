package com.micklab.dcg.output;

import android.content.Context;
import android.view.View;

import com.micklab.dcg.model.DynamicUiRequest;
import com.micklab.dcg.model.ExecutionOutputItem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DynamicOutputRuntimeTest {
    @Test
    public void extractStructuredOutputKeepsMainReturnValueAndAddsDeclarativeUi() throws Exception {
        DynamicOutputRuntime.StructuredOutput output =
                DynamicOutputRuntime.extractStructuredOutput(DeclarativeProgram.class, "Main return");

        assertEquals("Main return", output.getReturnValueText());
        assertEquals(1, output.getOutputItems().size());
        assertEquals(ExecutionOutputItem.Type.INTERACTIVE, output.getOutputItems().get(0).getType());
        assertEquals(
                DynamicUiRequest.Mode.DECLARATIVE_SPEC,
                output.getOutputItems().get(0).getInteractiveRequest().getMode());
    }

    @Test
    public void extractStructuredOutputIncludesOutputModelJson() throws Exception {
        DynamicOutputRuntime.StructuredOutput output =
                DynamicOutputRuntime.extractStructuredOutput(PseudoMainActivityProgram.class, null);

        assertTrue(output.getOutputModelJson().contains("\"type\":\"column\""));
        assertTrue(output.getOutputModelJson().contains("\"action\":\"submit\""));
    }

    @Test
    public void extractStructuredOutputTreatsExtendedDeclarativeNodesAsInteractiveUi() throws Exception {
        DynamicOutputRuntime.StructuredOutput output =
                DynamicOutputRuntime.extractStructuredOutput(ExtendedDeclarativeProgram.class, null);

        assertEquals(1, output.getOutputItems().size());
        assertEquals(ExecutionOutputItem.Type.INTERACTIVE, output.getOutputItems().get(0).getType());
        assertEquals(
                DynamicUiRequest.Mode.DECLARATIVE_SPEC,
                output.getOutputItems().get(0).getInteractiveRequest().getMode());
    }

    @Test
    public void invokeActionPassesInputsAndCapturesStdout() throws Exception {
        DynamicUiRequest request = DynamicUiRequest.declarative(DeclarativeProgram.class, new ArrayList<>());
        Map<String, String> values = new LinkedHashMap<>();
        values.put("left", "7");
        values.put("right", "5");

        DynamicOutputRuntime.ActionOutput output =
                DynamicOutputRuntime.invokeAction(request, "sum", values, null);

        assertEquals("summing", output.getStdout());
        assertEquals(1, output.getOutputItems().size());
        assertEquals("12", output.getOutputItems().get(0).getText());
    }

    @Test
    public void rebuildPseudoMainActivityOutputUsesUpdatedStateWithoutClassReload() throws Exception {
        ReloadingPseudoProgram.resetState();
        DynamicUiRequest request = DynamicUiRequest.declarative(ReloadingPseudoProgram.class, new ArrayList<>());

        DynamicOutputRuntime.StructuredOutput initial =
                DynamicOutputRuntime.rebuildPseudoMainActivityOutput(request);
        assertTrue(request.isPseudoMainActivityRequest());
        assertTrue(initial.getOutputModelJson().contains("\"text\":\"turn:0\""));
        assertEquals(1, ReloadingPseudoProgram.getInitializationCount());

        DynamicOutputRuntime.ActionOutput actionOutput =
                DynamicOutputRuntime.invokeAction(request, "play", Collections.singletonMap("delta", "1"), null);
        assertEquals("reload", actionOutput.getReturnValue());

        DynamicOutputRuntime.StructuredOutput reloaded =
                DynamicOutputRuntime.rebuildPseudoMainActivityOutput(request);
        assertTrue(reloaded.getOutputModelJson().contains("\"text\":\"turn:1\""));
        assertEquals(1, ReloadingPseudoProgram.getInitializationCount());
    }

    @Test
    public void invokeImageClickHandlerPassesCoordinatesToStaticMapMethod() throws Exception {
        DynamicUiRequest request = DynamicUiRequest.declarative(ImageClickProgram.class, new ArrayList<>());
        Map<String, String> values = new LinkedHashMap<>();
        values.put("x", "12");
        values.put("y", "34");

        Object output = DynamicOutputRuntime.invokeImageClickHandler(request, "onBoardClick", values);

        assertEquals("clicked: 12, 34", output);
    }

    @Test
    public void invokeImageClickHandlerReturnsNullWhenHandlerDoesNotReturnText() throws Exception {
        DynamicUiRequest request = DynamicUiRequest.declarative(ImageClickProgram.class, new ArrayList<>());
        Map<String, String> values = new LinkedHashMap<>();
        values.put("x", "8");
        values.put("y", "9");

        Object output = DynamicOutputRuntime.invokeImageClickHandler(request, "onBoardClickNoOutput", values);

        assertNull(output);
    }

    @Test
    public void extractStructuredOutputDetectsViewFactoryMethod() throws Exception {
        DynamicOutputRuntime.StructuredOutput output =
                DynamicOutputRuntime.extractStructuredOutput(ViewFactoryProgram.class, null);

        assertEquals(1, output.getOutputItems().size());
        ExecutionOutputItem item = output.getOutputItems().get(0);
        assertEquals(ExecutionOutputItem.Type.INTERACTIVE, item.getType());
        assertEquals(
                DynamicUiRequest.Mode.VIEW_FACTORY,
                item.getInteractiveRequest().getMode());
        assertTrue(item.getInteractiveRequest().requiresWrapperContext() || !item.getInteractiveRequest().requiresWrapperContext());
    }

    public static final class DeclarativeProgram {
        public static Object buildOutput() {
            List<Map<String, Object>> nodes = new ArrayList<>();

            Map<String, Object> title = new LinkedHashMap<>();
            title.put("type", "text");
            title.put("text", "Calculator");
            title.put("style", "title");
            nodes.add(title);

            Map<String, Object> input = new LinkedHashMap<>();
            input.put("type", "input");
            input.put("id", "left");
            input.put("hint", "Left");
            nodes.add(input);

            Map<String, Object> button = new LinkedHashMap<>();
            button.put("type", "button");
            button.put("text", "Add");
            button.put("action", "sum");
            nodes.add(button);
            return nodes;
        }

        public static Object sum(Map<String, String> values) {
            System.out.println("summing");
            int left = Integer.parseInt(values.get("left"));
            int right = Integer.parseInt(values.get("right"));
            return left + right;
        }
    }

    public static final class ViewFactoryProgram {
        public static View createOutputView(Context context) {
            return null;
        }
    }

    public static final class ExtendedDeclarativeProgram {
        public static Object buildOutput() {
            List<Map<String, Object>> nodes = new ArrayList<>();

            Map<String, Object> title = new LinkedHashMap<>();
            title.put("type", "title");
            title.put("text", "Canvas");
            nodes.add(title);

            Map<String, Object> image = new LinkedHashMap<>();
            image.put("type", "image");
            image.put("key", "chart");
            image.put("filename", "charts/chart.png");
            nodes.add(image);

            Map<String, Object> spacer = new LinkedHashMap<>();
            spacer.put("type", "spacer");
            nodes.add(spacer);

            return nodes;
        }
    }

    public static final class ImageClickProgram {
        public static Object onBoardClick(Map<String, String> values) {
            return "clicked: " + values.get("x") + ", " + values.get("y");
        }

        public static Object onBoardClickNoOutput(Map<String, String> values) {
            return null;
        }
    }

    public static final class PseudoMainActivityProgram {
        public static Object buildOutput() {
            List<Map<String, Object>> nodes = new ArrayList<>();

            Map<String, Object> root = new LinkedHashMap<>();
            root.put("type", "column");
            List<Map<String, Object>> children = new ArrayList<>();

            Map<String, Object> text = new LinkedHashMap<>();
            text.put("type", "text");
            text.put("text", "Pseudo");
            children.add(text);

            Map<String, Object> input = new LinkedHashMap<>();
            input.put("type", "input");
            input.put("id", "name");
            input.put("hint", "Name");
            children.add(input);

            Map<String, Object> button = new LinkedHashMap<>();
            button.put("type", "button");
            button.put("text", "Submit");
            button.put("action", "submit");
            children.add(button);

            root.put("children", children);
            nodes.add(root);
            return nodes;
        }

        public static String __dcgGetPseudoOutputModelJson() {
            return __dcgGetOutputModelJson();
        }

        public static String __dcgGetOutputModelJson() {
            return "{\"version\":1,\"spec\":[{\"type\":\"column\",\"children\":[{\"type\":\"text\",\"text\":\"Pseudo\"},{\"type\":\"input\",\"id\":\"name\",\"hint\":\"Name\"},{\"type\":\"button\",\"text\":\"Submit\",\"action\":\"submit\"}]}]}";
        }
    }

    public static final class ReloadingPseudoProgram {
        private static int initializationCount;
        private static int turn;

        static {
            initializationCount++;
            turn = 0;
        }

        public static void resetState() {
            turn = 0;
        }

        public static int getInitializationCount() {
            return initializationCount;
        }

        public static Object buildOutput() {
            List<Map<String, Object>> nodes = new ArrayList<>();
            Map<String, Object> label = new LinkedHashMap<>();
            label.put("type", "text");
            label.put("text", "turn:" + turn);
            nodes.add(label);
            return nodes;
        }

        public static Object play(Map<String, String> values) {
            turn += Integer.parseInt(values.get("delta"));
            return "reload";
        }

        public static String __dcgGetPseudoOutputModelJson() {
            return "{\"version\":1,\"spec\":[{\"type\":\"text\",\"text\":\"turn:" + turn + "\"}]}";
        }
    }
}
