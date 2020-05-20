package cracking_the_coding_interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllCharactersInStringAreUniqueWithoutDataStructuresTest {

    AllCharactersInStringAreUniqueWithoutDataStructures allCharactersInStringAreUniqueWithoutDataStructures;

    @BeforeEach
    public void setup() {
        allCharactersInStringAreUniqueWithoutDataStructures = new AllCharactersInStringAreUniqueWithoutDataStructures();
    }

    @Test
    public void should_return_true_for_unique_lettered_words() {
        String word1 = "jafmon";
        String word2 = "12345";
        String word3 = "search";
        String word4 = "t";
        String word5 = "td";
        assertTrue(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word1));
        assertTrue(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word2));
        assertTrue(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word3));
        assertTrue(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word4));
        assertTrue(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word5));
    }

    @Test
    public void should_return_false_for_non_unique_lettered_words() {
        String word1 = "jaffa";
        String word2 = "television";
        String word3 = "dd";
        assertFalse(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word1));
        assertFalse(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word2));
        assertFalse(allCharactersInStringAreUniqueWithoutDataStructures.calculate(word3));
    }
}
