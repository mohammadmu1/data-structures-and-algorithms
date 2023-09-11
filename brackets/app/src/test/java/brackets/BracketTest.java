package brackets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketTest {

    @Test
    public void testValidBrackets() {
        assertTrue(Bracket.validateBrackets(""));
        assertTrue(Bracket.validateBrackets("()"));
        assertTrue(Bracket.validateBrackets("{}"));
        assertTrue(Bracket.validateBrackets("[]"));
        assertTrue(Bracket.validateBrackets("({})"));
        assertTrue(Bracket.validateBrackets("([{}])"));
        assertTrue(Bracket.validateBrackets("{[()]}"));
    }

    @Test
    public void testInvalidBrackets() {
        assertFalse(Bracket.validateBrackets("("));
        assertFalse(Bracket.validateBrackets(")"));
        assertFalse(Bracket.validateBrackets("{"));
        assertFalse(Bracket.validateBrackets("}"));
        assertFalse(Bracket.validateBrackets("["));
        assertFalse(Bracket.validateBrackets("]"));
        assertFalse(Bracket.validateBrackets("({}"));
        assertFalse(Bracket.validateBrackets("{[()]}]"));
        assertFalse(Bracket.validateBrackets("[(])"));
        assertFalse(Bracket.validateBrackets(")("));
        assertFalse(Bracket.validateBrackets("{{[}}"));
    }
}
