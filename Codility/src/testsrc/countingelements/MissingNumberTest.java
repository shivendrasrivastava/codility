package testsrc.countingelements;


import com.countingelements.MissingNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/23/16.

 */
public class MissingNumberTest {

    @Test
    public void testMissingNumber_1()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {4, 2, 1};
        assertEquals(3, miss.solution(array));
    }

    @Test
    public void testMissingNumber_2()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {5, 7, 1, 2, 3, 6};
        assertEquals(4, miss.solution(array));
    }

    @Test
    public void testMissingNumber_3()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {4, 3, 2, 6, 8, 7, 5};
        assertEquals(1, miss.solution(array));
    }

    @Test
    public void testMissingNumber_4()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {2, 3, 4, 5};
        assertEquals(0, miss.solution(array));
    }

    @Test
    public void testMissingNumber_5()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {};
        assertEquals(0, miss.solution(array));
    }

    @Test
    public void testMissingNumber_6()
    {
        MissingNumber miss = new MissingNumber();
        int[] array = {1};
        assertEquals(0, miss.solution(array));
    }

}
