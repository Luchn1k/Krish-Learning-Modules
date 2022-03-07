import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOccurrencesTest {

    @Test
    void testNumberOfOccurrences() {
        String text = "numberOfOccurrences";
        String countedNumbers = NumberOfOccurrences.countNumbers(text);
        assertEquals("b - 1\n" + "c - 3\n" + "e - 3\n" + "f - 1\n" + "m - 1\n" + "n - 2\n" + "o - 2\n" + "r - 3\n" + "s - 1\n" + "u - 2", countedNumbers);
    }
    @Test
    void testSimpleAncCapital(){
        String text = "AaAaAa";
        String countedNumbers = NumberOfOccurrences.countNumbers(text);
        assertEquals("a - 6", countedNumbers);
    }
    @Test
    void testInvalidInput(){
        String text = "string…\tor be\u200Bhind\uFEFF";
        String countedNumbers = NumberOfOccurrences.countNumbers(text);
        assertEquals("b - 1\n" + "d - 1\n" + "e - 1\n" + "g - 1\n" + "h - 1\n" + "i - 2\n" + "n - 2\n" + "o - 1\n" + "r - 2\n" + "s - 1\n" + "t - 1", countedNumbers);
    }
    @Test
    void emptyText(){
        String text = "";
        String countedNumbers = NumberOfOccurrences.countNumbers(text);
        assertEquals("Need a text", countedNumbers);
    }
    void printInAlphabeticalOrder(){
        String text = "ABCD";
        String countedNumbers = NumberOfOccurrences.countNumbers(text);
        assertEquals("a - 1\n" + "b - 1\n" + "c - 1\n" + "d - 1", countedNumbers);
    }

}