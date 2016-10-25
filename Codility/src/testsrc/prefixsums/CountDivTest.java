package testsrc.prefixsums;

import com.prefixsums.CountDiv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/24/16.
 */
public class CountDivTest {

    @Test
    public void countDivTest_1()
    {
        CountDiv div = new CountDiv();
        assertEquals(3, div.solution(6, 11, 2));
    }
}
