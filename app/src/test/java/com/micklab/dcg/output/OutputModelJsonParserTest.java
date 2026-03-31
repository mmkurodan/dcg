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
}
