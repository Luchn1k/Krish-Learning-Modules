
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberFinderTest {
    @Test
    void testMissingNumberInMiddle(){
        String data = "11 12 14 13 15 17 16 19";
        String missingNumber = MissingNumberFinder.findMissingNumber(data.split(" "));
        assertEquals("18 is the missing number",missingNumber);

    }
    @Test
    void testMissingNumberFront(){
        String data = "11 12 14 13 15 17 16 19 18";
        String missingNumber = MissingNumberFinder.findMissingNumber(data.split(" "));
        assertEquals("This is a perfect sequence. No number is missing",missingNumber);
    }
    @Test
    void testMissingNumberBack(){
        String data = "11 12 14 13 15 17 16 19 18";
        String missingNumber = MissingNumberFinder.findMissingNumber(data.split(" "));
        assertEquals("This is a perfect sequence. No number is missing",missingNumber);
    }
    @Test
    void testMissingMoreThanTwoNumbers(){
        String data = "11 12 14 13 15 17 19";
        String missingNumber = MissingNumberFinder.findMissingNumber(data.split(" "));
        assertEquals("More than one number is missing",missingNumber);
    }
    @Test
    void testInvalidInput(){
        String data = "11 12 14 13 15 17 19 s .";
        String missingNumber = MissingNumberFinder.findMissingNumber(data.split(" "));
        assertEquals("You are only allowed to enter numbers dividend by a space",missingNumber);
    }
    



}