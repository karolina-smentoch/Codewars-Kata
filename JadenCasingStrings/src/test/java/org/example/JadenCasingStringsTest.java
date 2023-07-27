package org.example;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class JadenCasingStringsTest {

	JadenCasingStrings jadenCase = new JadenCasingStrings();

@Test
public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)",
                "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
        }

@Test
public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
        }

@Test
public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
        }

        }

