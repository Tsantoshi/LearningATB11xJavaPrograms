package Tasks.task04april;

import java.util.Scanner;

public class Char_Vowel_Consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        String input = sc.next().toLowerCase();

        if(input.length() == 1 && Character.isLetter(input.charAt(0))){
            char ch = input.charAt(0);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }else {
                System.out.println("Constant");
            }
        }else {
            System.out.println("Invalid input! Please enter a single alphabet letter.");
        }
        sc.close();
    }


}
