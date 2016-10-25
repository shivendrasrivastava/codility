package testsrc.uptake;

import com.uptake.UptakePreSuf;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by shivendrasrivastava on 10/24/16.
 */
public class UptakePreSufTest {

    @Test
    public void uptakeTest_1()
    {
        UptakePreSuf uptake = new UptakePreSuf();
        assertEquals(4, uptake.solution("abbabba"));
    }

    @Test
    public void uptakeTest_2()
    {
        UptakePreSuf uptake = new UptakePreSuf();
        assertEquals(0, uptake.solution("codility"));
    }
}
