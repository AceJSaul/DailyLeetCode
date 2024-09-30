package September2024;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackWithIncrementOperationTest {

    @Test
    @DisplayName("Is initializing with correct size")
    void isInitializing(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(2);
        assertEquals(2, stack.stackLen);
    }

    // No need to test if maxSize < 0 as "1 <= maxSize, x, k <= 1000"

    @Test
    @DisplayName("Is stack pushing (assuming perfect conditions)")
    void push() {
        StackWithIncrementOperation stack = new StackWithIncrementOperation(2);
        stack.push(1);
        stack.push(2);
        assertArrayEquals(new Integer[]{1, 2}, stack.stack);
    }

    @Test
    @DisplayName("Should not push if stack is full, it maintains same stack")
    void pushWhileFullStack(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(1);
        stack.push(1);
        stack.push(2);
        assertArrayEquals(new Integer[]{1}, stack.stack);
    }

    @Test
    @DisplayName("Pop return right value")
    void pop(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(2);
        stack.push(2);
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test
    @DisplayName("Pop return -1")
    void popReturnNegative(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(0);
        assertEquals(-1, stack.pop());
    }

    @Test
    @DisplayName("Increment 2 bottom elements in 3 element stack")
    void increment(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.inc(2, 100);
        assertArrayEquals(new Integer[]{101, 102, 3}, stack.stack);
    }

    @Test
    @DisplayName("Increment all elements because k > stack.len")
    void incrementAll(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.inc(4, 50);
        assertArrayEquals(new Integer[]{51, 52, 53, null, null}, stack.stack);
    }

    @Test
    @DisplayName("K is bigger than stack size")
    void incrementKBigger(){
        StackWithIncrementOperation stack = new StackWithIncrementOperation(3);
        stack.push(1);
        stack.push(2);
        stack.inc(6, 10);
        assertArrayEquals(new Integer[]{11, 12, null}, stack.stack);
    }
}