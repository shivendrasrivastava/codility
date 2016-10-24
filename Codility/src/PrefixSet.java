import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.OptionalInt;

public class PrefixSet {

    public int solution(int[] A)
    {
        Integer[] arrInt = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(arrInt,  Collections.reverseOrder());
        OptionalInt optionalInt = Arrays.stream(A).max();
        Iterator<Integer> ofInt=  Arrays.stream(arrInt).distinct().iterator();
        int maxValue = optionalInt.getAsInt();
        boolean prefixSet = false;
        while(ofInt.hasNext())
        {
            int value = ofInt.next();
            boolean isConsecutive = true;
            if (optionalInt.getAsInt() == value)
            {
                continue;
            }
            if (maxValue-1 == value && isConsecutive)
            {
                prefixSet = true;
                maxValue -= 1;
            }
            else{
                isConsecutive = false;
                prefixSet = false;
                break;
            }

            //System.out.println(ofInt.next());
        }
        if (prefixSet)
        {
            return optionalInt.getAsInt();
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] simple_input_1 = {2, 2, 1, 0, 1};
        PrefixSet prefixSet = new PrefixSet();
        System.out.println(prefixSet.solution(simple_input_1));

        int[] simple_input_2 = {3,4,0,1};
        System.out.println(prefixSet.solution(simple_input_2));

        int[] simple_input_3 = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(prefixSet.solution(simple_input_3));

        int[] simple_input_4 = {10};
        System.out.println(prefixSet.solution(simple_input_4));

    }
}
