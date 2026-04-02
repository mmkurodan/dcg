package com.micklab.dcg.output;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OutputModelJsonParserTest {
    @Test
    public void parseSpecReadsWrappedOutputModelJson() {
        Object parsed = OutputModelJsonParser.parseSpec(
                "{\"version\":1,\"spec\":[{\"type\":\"text\",\"text\":\"Hello\"},{\"type\":\"button\",\"text\":\"Go\",\"action\":\"submit\"}]}");

        assertTrue(parsed instanceof List<?>);
        List<?> values = (List<?>) parsed;
        assertEquals(2, values.size());
        assertEquals("text", ((Map<?, ?>) values.get(0)).get("type"));
        assertEquals("submit", ((Map<?, ?>) values.get(1)).get("action"));
    }

    @Test
    public void parseSpecPreservesRowChildren() {
        Object parsed = OutputModelJsonParser.parseSpec(
                "{\"version\":1,\"spec\":[{\"type\":\"row\",\"children\":[{\"type\":\"button\",\"text\":\"7\",\"action\":\"press7\"},{\"type\":\"text\",\"text\":\"8\"},{\"type\":\"input\",\"id\":\"value\",\"hint\":\"Value\"}]}]}");

        assertTrue(parsed instanceof List<?>);
        List<?> values = (List<?>) parsed;
        assertEquals(1, values.size());
        Map<?, ?> row = (Map<?, ?>) values.get(0);
        assertEquals("row", row.get("type"));
        List<?> children = (List<?>) row.get("children");
        assertEquals(3, children.size());
        assertEquals("press7", ((Map<?, ?>) children.get(0)).get("action"));
        assertEquals("8", ((Map<?, ?>) children.get(1)).get("text"));
        assertEquals("value", ((Map<?, ?>) children.get(2)).get("id"));
    }

    @Test
    public void parseSpecPreservesExtendedDslNodes() {
        Object parsed = OutputModelJsonParser.parseSpec(
                "{\"version\":1,\"spec\":[{\"type\":\"title\",\"text\":\"Calculator\"},{\"type\":\"label\",\"key\":\"display\",\"text\":\"0\"},{\"type\":\"row\",\"children\":[{\"type\":\"button\",\"text\":\"7\",\"action\":\"press7\"},{\"type\":\"spacer\"},{\"type\":\"input\",\"id\":\"value\",\"hint\":\"Value\",\"editable\":false}]}]}");

        assertTrue(parsed instanceof List<?>);
        List<?> values = (List<?>) parsed;
        assertEquals(3, values.size());

        assertEquals("title", ((Map<?, ?>) values.get(0)).get("type"));
        assertEquals("display", ((Map<?, ?>) values.get(1)).get("key"));

        Map<?, ?> row = (Map<?, ?>) values.get(2);
        assertEquals("row", row.get("type"));
        List<?> children = (List<?>) row.get("children");
        assertEquals("spacer", ((Map<?, ?>) children.get(1)).get("type"));
        assertEquals(Boolean.FALSE, ((Map<?, ?>) children.get(2)).get("editable"));
    }

    @Test
    public void parseDocumentPreservesCommandsAlongsideSpec() {
        OutputModelJsonParser.OutputDocument document = OutputModelJsonParser.parseDocument(
                "{\"version\":1,\"spec\":[{\"type\":\"image\",\"key\":\"chart\",\"filename\":\"chart.png\"}],"
                        + "\"commands\":[{\"type\":\"saveBitmap\",\"filename\":\"chart.png\",\"imageBase64\":\"AA==\"},"
                        + "{\"type\":\"imageClick\",\"key\":\"chart\",\"handlerName\":\"tap\"}]}");

        assertTrue(document.getSpec() instanceof List<?>);
        List<?> spec = (List<?>) document.getSpec();
        assertEquals("image", ((Map<?, ?>) spec.get(0)).get("type"));

        List<Map<String, Object>> commands = document.getCommands();
        assertEquals(2, commands.size());
        assertEquals("saveBitmap", commands.get(0).get("type"));
        assertEquals("tap", commands.get(1).get("handlerName"));
    }
}
