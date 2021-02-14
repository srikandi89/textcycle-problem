import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;
    private String expected;
    private String actual;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testTransformString() {
        expected = "cde";
        actual = solution.transformString("abc", 2);
        assertEquals(expected, actual);

        expected = "cde";
        actual = solution.transformString("abc", 28);
        assertEquals(expected, actual);

        expected = "abc";
        actual = solution.transformString("abc", 26);
        assertEquals(expected, actual);

        expected = "vvv";
        actual = solution.transformString("zzz", 22);
        assertEquals(expected, actual);

        expected = "vvv";
        actual = solution.transformString("zZz", 22);
        assertEquals(expected, actual);
    }

    @Test
    public void testTransformString2() {
        expected = "CDE";
        actual = solution.transformString2("ABC", 2);
        assertEquals(expected, actual);

        expected = "cDe";
        actual = solution.transformString2("aBc", 2);
        assertEquals(expected, actual);

        expected = "CDE";
        actual = solution.transformString2("ABC", 28);
        assertEquals(expected, actual);

        expected = "CdE";
        actual = solution.transformString2("AbC", 28);
        assertEquals(expected, actual);
    }
}