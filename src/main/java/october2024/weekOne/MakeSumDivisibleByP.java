package october2024.weekOne;

public class MakeSumDivisibleByP {

    /*
   Acabei pensando que a pergunta era fazer a soma igual a P || I thought I had to make a sum equals to P
   Na verdade, era fazê-la ser divisível para P || Actually, I had to be divisible by P
   Aí complica as coisas || It's way more harder
   Não consegui resolver, o editorial está no leetcode || I couldn't solve it
     */

    /*
    Given an array of positive integers nums,
    remove the smallest subarray (possibly empty)
    such that the sum of the remaining elements is divisible by p.
    It is not allowed to remove the whole array.

    Return the length of the smallest subarray that you need to remove,
    or -1 if it's impossible.

    A subarray is defined as a contiguous block of elements in the array.
     */

    public static void main(String[] args){
        System.out.println(minSubArray(new int[]{3,1,4,2}, 6));
    }

    public static int minSubArray(int[] nums, int p){
        int sumOfNums = 0;
        for (int num : nums) sumOfNums+=num;

        if(sumOfNums == 0) return 0; // It's not needed to take out any number
        int lookingForSum = sumOfNums - p;

        int leftPointer = 0;
        int rightPointer = 0;

        int sumInsideSubArray = 0;
        Integer minLengthOfSubArray = null;
        while (rightPointer <= nums.length && leftPointer < nums.length){
            if (sumInsideSubArray < lookingForSum && rightPointer <= (nums.length-1)){
                sumInsideSubArray += nums[rightPointer];
                rightPointer++;
            }
            else if(sumInsideSubArray > lookingForSum){
                sumInsideSubArray -= nums[leftPointer];
                leftPointer++;
            }
            else if(sumInsideSubArray == lookingForSum){ // Must be equals to lookingForSum
                if(minLengthOfSubArray == null) minLengthOfSubArray = rightPointer-leftPointer;
                else minLengthOfSubArray = Math.min(minLengthOfSubArray, rightPointer-leftPointer);
                sumInsideSubArray -= nums[leftPointer];
                leftPointer++;
            }
            else {
                sumInsideSubArray -= nums[leftPointer];
                leftPointer++;
            }
        }
        return (minLengthOfSubArray == null)? -1 : minLengthOfSubArray;
    }
}
