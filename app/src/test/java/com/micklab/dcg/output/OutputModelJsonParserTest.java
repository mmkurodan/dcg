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
}
