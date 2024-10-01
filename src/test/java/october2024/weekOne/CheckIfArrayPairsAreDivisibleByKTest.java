package october2024.weekOne;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import october2024.weekOne.CheckIfArrayPairsAreDivisibleByK;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfArrayPairsAreDivisibleByKTest {

    @Test
    @DisplayName("arr = [1,2,3,4,5,10,6,7,8,9], k = 5")
    void testOne(){
        assertTrue(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5));
    }

    @Test
    @DisplayName("arr = [1,2,3,4,5,6], k = 7")
    void testTwo(){
        assertTrue(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{1,2,3,4,5,6}, 7));
    }

    @Test
    @DisplayName("arr = [1,2,3,4,5,6], k = 10")
    void testThree(){
        assertFalse(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{1,2,3,4,5,6}, 10));
    }

    @Test
    @DisplayName("arr = [1,2,3,4], k = 5")
    void testFour(){
        assertTrue(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{1,2,3,4}, 5));
    }

    @Test
    @DisplayName("arr = [1,2,3,4,5,6], k = 4")
    void testFive(){
        assertFalse(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{1,2,3,4,5,6}, 4));
    }

    @Test
    @DisplayName("arr = [10, 6, 7, 9, 5, 2], k = 3")
    void testSix(){
        assertTrue(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{10,6,7,9,5,2}, 3));
    }

    @Test
    @DisplayName("arr = [5,5,1,2,3,4], k = 10")
    void textSeven(){
        assertFalse(CheckIfArrayPairsAreDivisibleByK.canArrange(new int[]{5,5,1,2,3,4,}, 10));
    }
}