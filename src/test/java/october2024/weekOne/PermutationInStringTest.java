package october2024.weekOne;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    @DisplayName("s1 = \"ab\", s2 = \"eidbaooo\"")
    void testOne(){
        PermutationInString permutation = new PermutationInString();
        assertTrue(permutation.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    @DisplayName("s1 = \"ab\", s2 = \"eidboaoo\"")
    void testTwo(){
        PermutationInString permutation = new PermutationInString();
        assertFalse(permutation.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    @DisplayName("s1 = \"adc\", s2 = \"dcda\"")
    void testThree(){
        PermutationInString permutation = new PermutationInString();
        assertTrue(permutation.checkInclusion("adc", "dcda"));
    }

    @Test
    @DisplayName("s1 = \"bc\", s2 = \"ad\"")
    void testFour(){
        PermutationInString permutation = new PermutationInString();
        assertFalse(permutation.checkInclusion("bc", "ad"));
    }

    @Test
    @DisplayName("s1 = \"abc\", s2 = \"defabc\"")
    void testFive(){
        PermutationInString permutation = new PermutationInString();
        assertTrue(permutation.checkInclusion("abc", "defabc"));
    }

    @Test
    @DisplayName("s1 = \"abcd\", s2 = \"abcaabdbcdeafgbcdiabcbbcaabclcabcababccabd\"")
    void testSix(){
        PermutationInString permutation = new PermutationInString();
        assertTrue(permutation.checkInclusion("abcd", "abcaabdbcdeafgbcdiabcbbcaabclcabcababccabd"));
    }

    @Test
    @DisplayName("s1 = \"hello\", s2 = \"ooolleoooleh\"")
    void testSeven(){
        PermutationInString permutation = new PermutationInString();
        assertFalse(permutation.checkInclusion("hello", "ooolleoooleh"));
    }

    @Test
    @DisplayName("s1 = \"rokx\", s2= \"otrxvfszxroxrzdsltg\"")
    void testEight(){
        PermutationInString permutation = new PermutationInString();
        assertFalse(permutation.checkInclusion("rokx", "otrxvfszxroxrzdsltg"));
    }
}