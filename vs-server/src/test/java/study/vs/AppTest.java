/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package study.vs;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        ServerApp classUnderTest = new ServerApp();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
