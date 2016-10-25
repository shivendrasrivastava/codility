package com.uptake;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Created by shivendrasrivastava on 10/24/16.
 */
public class UptakePreSuf {

    public int solution(String S)
    {

            int length = S.length();
            int[] sizes = new int[length+1];
            String prefix;
            String suffix;
            for (int i=1; i<length; i++)
            {
                prefix = S.substring(i, i+1);
                suffix = S.substring(length-i, length);
                if(prefix.equalsIgnoreCase(suffix))
                {
                    sizes[i] = prefix.length();
                }
            }
            OptionalInt maxValue = Arrays.stream(sizes).max();

            if (maxValue.isPresent())
            {
                return maxValue.getAsInt();
            }



            return 0;





    }
}
