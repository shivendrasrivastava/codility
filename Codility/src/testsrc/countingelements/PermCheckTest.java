package testsrc.countingelements;

import com.countingelements.PermCheck;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/23/16.
 */
public class PermCheckTest {

    @Test
    public void testPermCheck_1()
    {
        PermCheck perm = new PermCheck();
        int[] array = {4, 2, 1};
        assertEquals(perm.solution(array), 0);
    }

    @Test
    public void testPermCheck_2()
    {
        PermCheck perm = new PermCheck();
        int[] array = {5, 7, 0, 1, 2, 3, 6};
        assertEquals(perm.solution(array), 0);
    }

    @Test
    public void testPermCheck_3()
    {
        PermCheck perm = new PermCheck();
        int[] array = {4, 3, 1, 2, 6, 8, 7, 5};
        assertEquals(perm.solution(array), 1);
    }

    @Test
    public void testPermCheck_4()
    {
        PermCheck perm = new PermCheck();
        int[] array = {2, 3, 4, 5};
        assertEquals(perm.solution(array), 0);
    }

    @Test
    public void testPermCheck_5()
    {
        PermCheck perm = new PermCheck();
        int[] array = {};
        assertEquals(perm.solution(array), 1);
    }

    @Test
    public void testPermCheck_6()
    {
        PermCheck perm = new PermCheck();
        int[] array = {1};
        assertEquals(perm.solution(array), 1);
    }
}
