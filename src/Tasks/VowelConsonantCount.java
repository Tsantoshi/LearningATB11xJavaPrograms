package Tasks;

import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String input = scanner.nextLine();

        int VowelCount = 0;
        int ConsonantCount = 0;

        input = input.toLowerCase();

        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);

            if(ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                VowelCount++;
            }
            else if(ch>='a' && ch <='z'){
                ConsonantCount++;
            }
        }

        System.out.println("vowels: " +VowelCount);
        System.out.println("Consonants: "+ConsonantCount);


    }
}
