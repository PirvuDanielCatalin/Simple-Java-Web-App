package com.javaapp;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

public class Test_2 {
    @Before
    public void prepare() {
        setBaseUrl("http://localhost:8080/SimpleJavaWebApp");
    }

    @Test
    public void testLogin() {
        beginAt("/");
        assertTitleEquals("Liquor Store");
    }
}
