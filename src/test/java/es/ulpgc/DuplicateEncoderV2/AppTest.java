package es.ulpgc.DuplicateEncoderV2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App app =  new App();
        assertTrue( "(".equals(app.enconder("a")));

        assertTrue("(".equals(app.enconder("e")));

        assertTrue("))".equals(app.enconder("aa")));

        assertTrue("((".equals(app.enconder("ae")));
    }
}
