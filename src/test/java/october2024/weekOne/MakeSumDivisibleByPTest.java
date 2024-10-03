package october2024.weekOne;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeSumDivisibleByPTest {

    @Test
    @DisplayName("nums = [3,1,4,2] p = 6")
    void testOne(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(1, test.minSubArray(new int[]{3,1,4,2}, 6));
    }

    @Test
    @DisplayName("nums = [6,3,5,2] p = 9")
    void testTwo(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(2, test.minSubArray(new int[]{6,3,5,2}, 9));
    }

    @Test
    @DisplayName("nums = [2,5,3,1,9] p = 8")
    void testThree(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(-1, test.minSubArray(new int[]{2,5,3,1,9}, 8));
    }

    @Test
    @DisplayName("nums = [6,3,1,5,3] p = 9")
    void testFour(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(2, test.minSubArray(new int[]{6,3,1,5,3}, 9));
    }

    @Test
    @DisplayName("nums = [3,7,8,9,1] p = 24")
    void testFive(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(3, test.minSubArray(new int[]{3,7,8,9,1}, 4));
    }

    @Test
    @DisplayName("nums = [1,2,3] p = 3")
    void testSix(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(0, test.minSubArray(new int[]{1,2,3}, 3));
    }

    @Test
    @DisplayName("nums = [6, 3] p = 2")
    void testSeven(){
        MakeSumDivisibleByP test = new MakeSumDivisibleByP();
        assertEquals(1, test.minSubArray(new int[]{6,3}, 2));
    }
}