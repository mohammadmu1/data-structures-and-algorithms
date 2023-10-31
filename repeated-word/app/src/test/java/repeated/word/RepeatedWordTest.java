package repeated.word;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedWordTest {


 

    @Test
    public void testNoRepeatedWord() {
        String input = "No repeated words in this input";
        String result = RepeatedWord.repeatedWord(input);

        assertEquals("There is no repeated string", result);
    }

    @Test
    public void testRepeatedWordAtBeginning() {
        String input = "word word. word. repeated.";
        String result = RepeatedWord.repeatedWord(input);

        assertEquals("word", result);
    }

    @Test
    public void testRepeatedWordAtEnd() {
        String input = "This is the end, my only friend, the end.";
        String result = RepeatedWord.repeatedWord(input);

        assertEquals("the", result);
    }
}
