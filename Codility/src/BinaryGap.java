import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shivendrasrivastava on 10/21/16.
 */
public class BinaryGap {

    public static void main(String[] args)
    {
        BinaryGap binaryGap = new BinaryGap();
        int firstInput = 529;
        System.out.println(binaryGap.solution(firstInput));
        int secondInput = 6;
        System.out.println(binaryGap.solution(secondInput));
        int thirdInput = 2;
        System.out.println(binaryGap.solution(thirdInput));
        int fourthInput = 400;
        System.out.println(binaryGap.solution(fourthInput));
        int fifthInput = 2147483647;
        System.out.println(binaryGap.solution(fifthInput));
        int sixthInput = 66561;
        System.out.println(binaryGap.solution(sixthInput));
        int seventhInput = 74901729;
        System.out.println(binaryGap.solution(seventhInput));

    }

    public int solution(int N) {
        // write your code in Java SE 8
        String binaryInt = Integer.toBinaryString(N);
        System.out.println(" Binary Int "+binaryInt);
        char[] binaryCharArray = binaryInt.toCharArray();
        boolean binaryGap = false;
        List<Integer> numberList = new ArrayList<Integer>();
        int numberOfZeroes = 0;

        for(int i=0; i<binaryCharArray.length; i++)
        {
            if (binaryCharArray[i] == '1' || (i>0 && binaryCharArray[i-1] =='1'))
            {
                binaryGap = true;
            }
            if (binaryGap && i>0 && binaryCharArray[i] == '0')
            {
                numberOfZeroes += 1;
                System.out.println("Incrementing "+numberOfZeroes);
            }
            if (binaryGap && binaryCharArray[i] == '1')
            {
                binaryGap = false;
                if (numberOfZeroes > 0)
                {
                    numberList.add(numberOfZeroes);
                    numberOfZeroes = 0;
                }
            }
        }
        if(numberList.size() > 0)
        {
            Collections.sort(numberList);
            return numberList.get(numberList.size()-1);
        }

        return 0;

    }
}
