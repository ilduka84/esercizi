package LetterCombinationsofaPhoneNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private String digits;
    @BeforeEach
    void setUp() {
        digits = new String("23");
    }

    @Test
    void letterCombinations() {
        Solution solution = new Solution();
        String []array = new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> result = new LinkedList<String>(Arrays.asList(array));
        assertEquals(solution.letterCombinations(digits),result);
    }
}