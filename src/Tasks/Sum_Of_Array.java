package Tasks;

public class Sum_Of_Array {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        int sum = 0;

        for(int i =0; i<numbers.length; i++){
            sum =sum+numbers[i];
            //System.out.println(numbers[i]);

        }

        System.out.println(sum);

    }
}
