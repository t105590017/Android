package tw.edu.ntut.csie.app01_105590017;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodTest {
    private Method method;
    @Before
    public void setUp() throws Exception {
        method = new Method();
    }

    @After
    public void tearDown() throws Exception {
        method = null;
    }

    @Test
    public void letterGrade() throws Exception {
        assertEquals("等第:輸入分數應介於[0..100]",method.letterGrade(101));
        assertEquals("等第:A",method.letterGrade(95));
        assertEquals("等第:B",method.letterGrade(85));
        assertEquals("等第:C",method.letterGrade(75));
        assertEquals("等第:D",method.letterGrade(65));
        assertEquals("等第:F",method.letterGrade(55));
    }

}