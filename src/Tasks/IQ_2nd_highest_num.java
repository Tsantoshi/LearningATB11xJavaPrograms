package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IQ_2nd_highest_num {
    public static void main(String[] args) {

        int[] numbers = {1,4,6,8,10,9};

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-2]);
    }
}
