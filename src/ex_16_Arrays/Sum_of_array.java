package ex_16_Arrays;

public class Sum_of_array {
    public static void main(String[] args) {

        int[] numbers = {2,3,4,5,6};

        int sum=0;

       /* for(int i=0; i<numbers.length; i++){

            sum = sum+numbers[i];
        }
        System.out.println(sum);

        */

        System.out.println(" ---");

        System.out.println(" For Each ---"); //Enhanced for loop

        for(int n:numbers){
            sum =sum+n;
        }
        System.out.println(sum);
    }
}
