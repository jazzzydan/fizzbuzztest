import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzGeneratorTest {

    @Test
    void fizzBuzzOf_justNumber() {
        assertEquals("1", FizzBuzzGenerator.fizzBuzzOf(1));
    }

    @Test
    void fizzBuzzOf_fizz() {
        assertEquals("Fizz", FizzBuzzGenerator.fizzBuzzOf(3));
    }

    @Test
    void fizzBuzzOf_buzz() {
        assertEquals("Buzz", FizzBuzzGenerator.fizzBuzzOf(10));
    }

    @Test
    void fizzBuzzOf_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzGenerator.fizzBuzzOf(15));
    }

    @Test
    void generateFizzBuzzArray() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        ArrayList<String> result = FizzBuzzGenerator.generateFizzBuzzArray(15);
        assertEquals(expected, result);
    }
}