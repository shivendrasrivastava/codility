package com.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shivendrasrivastava on 10/23/16.
 * For example, consider array A such that:

 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3
 We can split this tape in four places:

 P = 1, difference = |3 − 10| = 7
 P = 2, difference = |4 − 9| = 5
 P = 3, difference = |6 − 7| = 1
 P = 4, difference = |10 − 3| = 7
 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

 For example, given:

 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3
 the function should return 1, as explained above.

 Assume that:

 N is an integer within the range [2..100,000];
 each element of array A is an integer within the range [−1,000..1,000].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
public class TapeEquilibrium {

    public static void main(String[] args)
    {
        TapeEquilibrium tape = new TapeEquilibrium();
        int[] first_input = {3,1,2,4,3};
        System.out.println(tape.solution(first_input));
        int[] second_input = {1,3,5,7};
        System.out.println(tape.solution(second_input));
        int[] third_input = {1};
        System.out.println(tape.solution(third_input));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length ==1)
        {
            return A[0];
        }
        int firstPartSum = 0;
        int secondPartSum = 0;
        int completeSum = Arrays.stream(A).sum();
        int j = 0;
        int difference = 0;
        List<Integer> sumsList = new ArrayList<>();
        for(int i =0; i<A.length; i++)
        {
            j++;
            firstPartSum +=  A[i];
            secondPartSum = completeSum -firstPartSum;

            difference = firstPartSum - secondPartSum;
            if(difference < 0)
            {
                difference = difference * -1;
            }
            sumsList.add(difference);
        }

        return sumsList.stream().min(Integer::compare).get();
    }

}
