package org.javaapp.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_1 {

    @Test
    public void test_met1() {
        assertEquals("ab", "ab");
    }

    @Test
    public void test_met2() {
        assertEquals("cd", "cd");
    }
}