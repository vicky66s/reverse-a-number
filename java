import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user0
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();

        // Calculate the reverse number.
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }

        // Display the result.
        System.out.println("Reverse number: " + reverseNum);

        // Close the Scanner.
        scanner.close();
    }
}
