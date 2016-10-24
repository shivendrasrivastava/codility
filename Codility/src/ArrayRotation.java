/**
 * Created by shivendrasrivastava on 10/23/16.
 */
public class ArrayRotation {

    public static void main(String[] args)
    {
        ArrayRotation rotate = new ArrayRotation();
        int[] first_input = {1,2,3,4,5};
        rotate.solution(first_input, 2);
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        int temp =0;

        for(int i =0; i<K; i++)
        {
            result[i] = A[A.length-K+i];
        }
        for (int j=K; j<A.length; j++)
        {
           result[j] = A[j];
        }
        return result;
    }
}
