package testsrc;

import com.timecomplexity.FrogJump;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by shivendrasrivastava on 10/23/16.
 */
public class FrogJumpTest{


    @Test
    public void test_frog_jump_1()
    {
        FrogJump jump = getObject();
        assertEquals(jump.solution(10, 85, 30), 3);
    }

    @Test
    public void test_frog_jump_2()
    {
        FrogJump jump = getObject();
        assertEquals(jump.solution(20, 105, 30), 3);
    }

    public FrogJump getObject(){

        FrogJump jump = new FrogJump();

        return jump;
    }
}
