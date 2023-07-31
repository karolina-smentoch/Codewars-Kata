package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessiGoalsTest {
    @Test
    public void basicTests() {
        assertEquals(0, MessiGoals.goals(0, 0, 0));
        assertEquals(58, MessiGoals.goals(43, 10, 5));
    }
}
