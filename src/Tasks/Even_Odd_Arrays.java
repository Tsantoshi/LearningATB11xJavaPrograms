package Tasks;

public class Even_Odd_Arrays {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};


        // Arrays to store even and odd numbers
        int[] evenNumbers = new int[numbers.length];
        int[] oddNumbers = new int[numbers.length];

        // Variables to keep track of the current index for even and odd arrays
        int evenIndex = 0, oddIndex = 0;

        // Loop through the original array and separate the even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            } else {
                oddNumbers[oddIndex++] = num;
            }
        }

        // Print the even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }
}


