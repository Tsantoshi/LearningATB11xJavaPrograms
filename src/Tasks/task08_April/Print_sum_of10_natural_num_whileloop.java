package Tasks.task08_April;

public class Print_sum_of10_natural_num_whileloop {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while ( i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
