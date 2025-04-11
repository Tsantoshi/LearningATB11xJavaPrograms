package Tasks.task08_April;

public class Print_even_1to20_with_whleloop {
    public static void main(String[] args) {

        int i=0;
        while (i<=20){
            if(i%2==0){
                System.out.println("number is even: " + i);

            }
            i++;
        }
    }
}
