package co.vgw.multimodule.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyModelTest {
    @Test void modelHasAGreeting() {
        MyModel classUnderTest = new MyModel();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
