package com.sorting;

import java.util.Arrays;

/**
 * Created by shivendrasrivastava on 10/26/16.
 *
 * A non-empty zero-indexed array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

 For example, array A such that:

 A[0] = -3
 A[1] = 1
 A[2] = 2
 A[3] = -2
 A[4] = 5
 A[5] = 6
 contains the following example triplets:

 (0, 1, 2), product is −3 * 1 * 2 = −6
 (1, 2, 4), product is 1 * 2 * 5 = 10
 (2, 4, 5), product is 2 * 5 * 6 = 60
 Your goal is to find the maximal product of any triplet.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty zero-indexed array A, returns the value of the maximal product of any triplet.

 For example, given array A such that:

 A[0] = -3
 A[1] = 1
 A[2] = 2
 A[3] = -2
 A[4] = 5
 A[5] = 6
 the function should return 60, as the product of triplet (2, 4, 5) is maximal.

 Assume that:

 N is an integer within the range [3..100,000];
 each element of array A is an integer within the range [−1,000..1,000].
 Complexity:

 expected worst-case time complexity is O(N*log(N));
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
public class MaxProductOfThree {

    public int solution(int[] A)
    {
        System.out.println(" Started testing ");

        int[] lessA = new int[A.length];

        for (int i=0; i<A.length; i++)
        {
            if (A[i] < 0)
            {
                lessA[i] = A[i];
            }
        }

        Arrays.sort(lessA);
        Arrays.sort(A);

        for (int k=0; k<A.length; k++)
        {
            System.out.println(" Values = "+A[k]);
        }

        for (int m=0; m<lessA.length; m++)
        {
            System.out.println(" Neg Values = "+lessA[m]);
        }

        int negProduct = 1;
        if (lessA.length >= 2)
        {
            negProduct = lessA[0] * lessA[1];
        }

        int product = 1;
        for (int i=A.length-3; i<A.length; i++)
        {
            product *= A[i];
        }

        negProduct = negProduct * A[A.length -1];



        return Math.max(negProduct, product);
    }
}
