package testsrc.sorting;

import com.sorting.MaxProductOfThree;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by shivendrasrivastava on 10/26/16.
 */
public class MaxProductOfThreeTest {

    @Test
    public void testMaxProductOfThree_1()
    {
        MaxProductOfThree product = new MaxProductOfThree();
        int[] input_array = {-3, 1, 2, -2, 5, 6};
        assertEquals(60, product.solution(input_array));
    }

    @Test
    public void testMaxProductOfThree_2()
    {
        MaxProductOfThree product = new MaxProductOfThree();
        int[] input_array = {-5, 5, -5, 4};
        assertEquals(125, product.solution(input_array));
    }

    @Test
    public void testMaxProductOfThree_3()
    {

    }

    @Test
    public void testMaxProductOfThree_4()
    {

    }

    @Test
    public void testMaxProductOfThree_5()
    {

    }
}
