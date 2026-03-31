package com.micklab.dcg.output;

import android.content.Context;
import android.view.View;

import com.micklab.dcg.model.DynamicUiRequest;
import com.micklab.dcg.model.ExecutionOutputItem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
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
}
