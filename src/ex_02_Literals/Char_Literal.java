package ex_02_Literals;

public class Char_Literal {
    public static void main(String[] args) {

        char c1='A';  //A to Z, a-z, !@#$%^&*()_+
        // char c2="A";  // this not ab character it is a string variable.
        char c2='B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        System.out.println(c1);
        System.out.println(c1+c2); // adding ascii value of c1 and c2
        System.out.println(c7);

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("santoshi"+new_line+"Thakur");
        System.out.println("santoshi"+tab_line+"Thakur");
        System.out.println("santoshi"+back_space+"Thakur");
        System.out.println("santoshi"+carriage_return+"Thakur");

        System.out.println("hi am santoshi thakur"+new_line+"learing automation \n in learingATB11x");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
}
}
