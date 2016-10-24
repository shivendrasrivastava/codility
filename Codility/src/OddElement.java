import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by shivendrasrivastava on 10/21/16.
 */
public class OddElement {

    public static void main(String[] args)
    {
        OddElement oddElement = new OddElement();

        int[] firstInput = {9,3,9,3,9,9,7};
        oddElement.solution(firstInput);
    }

    public int solution(int[] A)
    {
        List<Integer> arrayList = Arrays.stream(A).boxed().collect(Collectors.toList());


        Optional<Integer> odd = arrayList.stream().reduce((x, y) -> x^y);

        return odd.get();

    }
}
