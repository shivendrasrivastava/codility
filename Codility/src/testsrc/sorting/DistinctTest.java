package testsrc.sorting;

import com.sorting.Distinct;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/26/16.
 */
public class DistinctTest {

    @Test
    public void distinctTest_1()
    {
        Distinct distinct = new Distinct();
        int[] input_value = {1, 1, 1, 4};
        assertEquals(2, distinct.solution(input_value));
    }

    @Test
    public void distinctTest_2()
    {
        Distinct distinct = new Distinct();
        int[] input_value = {1, 1, 1, 1};
        assertEquals(1, distinct.solution(input_value));
    }

    @Test
    public void distinctTest_3()
    {
        Distinct distinct = new Distinct();
        int[] input_value = {1, 1, 1, 4, 3, 2, 9, 10, 2, 2};
        assertEquals(6, distinct.solution(input_value));
    }

    @Test
    public void distinctTest_4()
    {
        Distinct distinct = new Distinct();
        int[] input_value = {1};
        assertEquals(1, distinct.solution(input_value));
    }

    @Test
    public void distinctTest_5()
    {
        Distinct distinct = new Distinct();
        int[] input_value = {1, 1, 1, 4, 4, 4};
        assertEquals(2, distinct.solution(input_value));
    }

}
