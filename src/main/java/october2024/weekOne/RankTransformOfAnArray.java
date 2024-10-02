package october2024.weekOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class RankTransformOfAnArray {

    /*
    Given an array of integers arr, replace each element with its rank.

    The rank represents how large the element is. The rank has the following rules:

    Rank is an integer starting from 1.
    The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
    Rank should be as small as possible.
     */

    public int[] arrayRankTransform(int[] arr){
        int[] holderArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(holderArray);
        HashMap<Integer, Integer> valuesToRanks = new HashMap<>();

        int rank = 1;
        for (int i=0; i<holderArray.length; i++){
            if (i > 0 && holderArray[i] > holderArray[i-1]){
                rank++;
            }
            valuesToRanks.put(holderArray[i], rank);
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = valuesToRanks.get(arr[i]);
        }
        return arr;
    }
}
