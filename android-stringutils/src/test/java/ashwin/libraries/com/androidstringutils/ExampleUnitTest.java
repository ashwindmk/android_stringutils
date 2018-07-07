package ashwin.libraries.com.androidstringutils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void isBlankTests() throws Exception {
        assertEquals("null", true, StringUtils.isBlank(null));
        assertEquals("empty string", true, StringUtils.isBlank(""));
        assertEquals("single space", true, StringUtils.isBlank(" "));
        assertEquals("multiple spaces", true, StringUtils.isBlank("    "));
        assertEquals("single char", false, StringUtils.isBlank("a"));
        assertEquals("spaces with single char", false, StringUtils.isBlank("  a "));
        assertEquals("multiple chars", false, StringUtils.isBlank("abc"));
    }

    @Test
    public void isEmptyTests() throws Exception {
        assertEquals("null", true, StringUtils.isEmpty(null));
        assertEquals("empty string", true, StringUtils.isEmpty(""));
        assertEquals("single space", false, StringUtils.isEmpty(" "));
        assertEquals("multiple spaces", false, StringUtils.isEmpty("   "));
        assertEquals("single char", false, StringUtils.isEmpty("a"));
        assertEquals("spaces with single char", false, StringUtils.isEmpty("  a "));
        assertEquals("multiple chars", false, StringUtils.isEmpty("abc"));
    }

    @Test
    public void getLengthTests() throws Exception {
        assertEquals("null", 0, StringUtils.getLength(null));
        assertEquals("empty string", 0, StringUtils.getLength(""));
        assertEquals("single space", 1, StringUtils.getLength(" "));
        assertEquals("multiple spaces", 3, StringUtils.getLength("   "));
        assertEquals("single char", 1, StringUtils.getLength("a"));
        assertEquals("multiple chars", 3, StringUtils.getLength("abc"));
    }

    @Test
    public void getCountTests() throws Exception {
        assertEquals("null", 0, StringUtils.getCount(null, 'a'));
        assertEquals("empty string", 0, StringUtils.getCount("", 'a'));
        assertEquals("single char", 1, StringUtils.getCount("a", 'a'));
        assertEquals("multiple chars", 3, StringUtils.getCount("abcdaxyza", 'a'));
    }

    @Test
    public void getTitleCaseTests() throws Exception {
        assertEquals(null, StringUtils.getTitleCase(null));
        assertEquals("", StringUtils.getTitleCase(""));
        assertEquals(" ", StringUtils.getTitleCase(" "));
        assertEquals("Game Of Thrones", StringUtils.getTitleCase("game of thrones"));
        assertEquals("Game Of Thrones", StringUtils.getTitleCase("GAME OF THRONES"));
        assertEquals("Game Of Thrones", StringUtils.getTitleCase("gAME oF tHRONES"));
        assertEquals("Game Of Thrones 6", StringUtils.getTitleCase("game of thrones 6"));
        assertEquals("Game  Of   Thrones", StringUtils.getTitleCase("game  of   THRONES"));
    }

}