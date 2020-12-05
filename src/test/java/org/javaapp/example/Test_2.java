package org.javaapp.example;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

// Trebuie pornita aplicatia inainte de teste: mvn tomcat7:run

public class Test_2 {
    @Before
    public void prepare() {
        setBaseUrl("http://localhost:8080/SimpleJavaWebApp");
    }

    @Test
    public void test_met1() {
        beginAt("/");
        assertTitleEquals("Start");
    }

    @Test
    public void test_met2() {
        beginAt("/");
        assertTitleEquals("Start");
    }
}
