package testsrc;

import com.timecomplexity.MissingPermutation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/23/16.
 */
public class MissingPermutationTest {

    @Test
    public void test_permutation_1()
    {
        MissingPermutation perm = getObject();
        int[] array = {1, 3, 4, 5};
        assertEquals(perm.solution(array), 2);
    }

    @Test
    public void test_permutation_2()
    {
        MissingPermutation perm = getObject();
        int[] array = {9, 8, 11, 0, 1, 3, 2, 7, 6, 5, 4};
        assertEquals(perm.solution(array), 10);
    }

    @Test
    public void test_permutation_3()
    {
        MissingPermutation perm = getObject();
        int[] array = {2, 3, 4, 5};
        assertEquals(perm.solution(array), 1);
    }

    public MissingPermutation getObject()
    {
        MissingPermutation perm = new MissingPermutation();
        return perm;
    }

}
