package testsrc.countingelements;

import com.countingelements.FrogRiverOne;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/24/16.
 */
public class FrogRiverOneTest {

    @Test
    public void testFrogRiverOne_1()
    {
        FrogRiverOne frog = new FrogRiverOne();
        int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
        assertEquals(6, frog.solution(5, array));
    }

    @Test
    public void testFrogRiverOne_2()
    {
        FrogRiverOne frog = new FrogRiverOne();
        int[] array = {2, 2, 2, 2, 2};
        assertEquals(-1, frog.solution(2, array));
    }

    @Test
    public void testFrogRiverOne_3()
    {
        FrogRiverOne frog = new FrogRiverOne();
        int[] array = {1, 3, 1, 3, 2, 1, 3};
        assertEquals(4, frog.solution(3, array));
    }

    @Test
    public void testFrogRiverOne_4()
    {
        FrogRiverOne frog = new FrogRiverOne();
        int[] array = {1};
        assertEquals(0, frog.solution(1, array));
    }

    @Test
    public void testFrogRiverOne_5()
    {
        FrogRiverOne frog = new FrogRiverOne();
        int[] array = {3};
        assertEquals(-1, frog.solution(5, array));
    }


}
