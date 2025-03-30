package Tasks;

public class Arrays_Max_Min {
    public static void main(String[] args) {

        int[] numbers = {10,20,50,90,60,44,38};

        int max_output = max_number(numbers);
        System.out.println(max_output);
       int min_output =  min_number(numbers);
        System.out.println(min_output);

    }

    static int max_number(int[] numbers){

        int max  = numbers[0];
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }

        }
        return max;
    }

    static int min_number(int[] numbers){

        int min = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[0]<min){
                min = numbers[i];
            }
        }
        return min;
    }
}
