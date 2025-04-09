package ex_10_For_Loop;

public class For_Loop_Break {
    public static void main(String[] args) {
        for(int i = 0; i<50; i++){
            if(i==5){
                break;

            }
            System.out.println(i); //When i is 5,
            // the if (i == 5) condition becomes true, and
            // the break statement terminates the loop, so i = 5 is not printed.
            // Therefore, the loop prints 0, 1, 2, 3, and 4.
        }
    }
}
