package ex_10_For_Loop;

public class For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for(int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println("even number "+i);
                 continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
