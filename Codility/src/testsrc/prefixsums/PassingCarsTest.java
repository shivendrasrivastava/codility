package testsrc.prefixsums;

import com.prefixsums.PassingCars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shivendrasrivastava on 10/24/16.
 */
public class PassingCarsTest {

    @Test
    public void passingCarsTest_1(){
        PassingCars cars = new PassingCars();
        int[] carPairs = {0,1,0,1,1};
        assertEquals(5, cars.solution(carPairs));
    }

    @Test
    public void passingCarsTest_2(){
        PassingCars cars = new PassingCars();
        int[] carPairs = {0,1,0,1,1,0,1,1};
        assertEquals(11, cars.solution(carPairs));
    }

    @Test
    public void passingCarsTest_3(){
        PassingCars cars = new PassingCars();
        int[] carPairs = {0,1,0,1,1};
        assertEquals(5, cars.solution(carPairs));
    }

    @Test
    public void passingCarsTest_4(){
        PassingCars cars = new PassingCars();
        int[] carPairs = {0,1,0,1,1};
        assertEquals(5, cars.solution(carPairs));
    }
}
