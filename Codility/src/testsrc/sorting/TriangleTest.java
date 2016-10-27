package testsrc.sorting;

import com.sorting.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by shivendrasrivastava on 10/26/16.
 */
public class TriangleTest {

    @Test
    public void triangleTest_1()
    {
        Triangle triangle = new Triangle();
        int[] input_array = {10, 2, 5, 1, 8, 20};
        assertEquals(1, triangle.solution(input_array));
    }

    @Test
    public void triangleTest_2()
    {
        Triangle triangle = new Triangle();
        int[] input_array = {5, 3, 3};
        assertEquals(1, triangle.solution(input_array));
    }

    @Test
    public void triangleTest_3()
    {
        Triangle triangle = new Triangle();
        int[] input_array = {10, 50, 5, 1};
        assertEquals(0, triangle.solution(input_array));
    }

}
