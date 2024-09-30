package September2024;

import java.util.LinkedList;

public class StackWithIncrementOperation {
    /*
    Design a stack that supports increment operations on its elements.

    Implement the CustomStack class:

    CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack.
    void push(int x) Adds x to the top of the stack if the stack has not reached the maxSize.
    int pop() Pops and returns the top of the stack or -1 if the stack is empty.
    void inc(int k, int val) Increments the bottom k elements of the stack by val.
    If there are less than k elements in the stack, increment all the elements in the stack.
     */

    // I designed this as a linked list, I preferred to use an array because it's

    // Could be more efficient if topIndex was stored, instead of using loop everytime

    public Integer[] stack;
    public int stackLen;

    public StackWithIncrementOperation(int maxSize) {
        this.stack = new Integer[maxSize];
        stackLen = stack.length;
    }

    public void push(int x){
        int i=0;
        while (i != stackLen){
            if(stack[i] == null){
                stack[i] = x;
                break;
            }
            else{
                i+=1;
            }
        }
    }

    public int pop(){
       int i=stackLen-1;
       while (i >= 0){
           if(stack[i] != null){
               int valueToBeReturned = stack[i];
               stack[i] = null;
               return valueToBeReturned;
           }
           i--;
       }
       return -1;
    }

    public void inc(int k, int val){
        int i = 0;
        while (i < k){
            if(i >= stackLen) break;
            if(stack[i] == null) break;
            stack[i] += val;
            i++;
        }
    }
}
