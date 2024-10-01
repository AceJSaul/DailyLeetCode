package october2024.weekOne;

import java.util.HashMap;
import java.util.Objects;

public class CheckIfArrayPairsAreDivisibleByK {

    /*
    Given an array of integers arr of even length n and an integer k.
    We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
    Return true If you can find a way to do that or false otherwise.
     */

    /*
     Firstly, we must count the remainders in the array and how many times they appear
     Then, we check if that remainder appears as frequently as (k-remainder) *Because remainder + (k-remainder) = k; and each pair must be divisible by k*
     If remainder is 0, we must check if it appears an even amount of times
     */

    public static boolean canArrange(int[] arr, int k){
        HashMap<Integer, Integer> remainderCount = new HashMap<>();

        for (int number : arr){
            int remainder = ((number % k) + k) % k; // This way, it handles negative numbers
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0)+1);
        }

        for (int i : arr){
            int remainder = ((i%k) + k) % k;

            if(remainder == 0){
                if(remainderCount.get(0) % 2 == 1) return false; // If quantity of multiples of k is odd, we can not form valid pairs
            }
            else if(!Objects.equals(remainderCount.get(remainder), remainderCount.get(k - remainder))){
                return false;
            }
        }
        return true;
    }
}
