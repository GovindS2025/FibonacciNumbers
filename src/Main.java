import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        var sc = new Scanner(System.in);

        // Take the input for the number of terms in the Fibonacci sequence
        var n = sc.nextInt();

        var a = 0;  // First number in the Fibonacci sequence
        var b = 1;  // Second number in the Fibonacci sequence

        // Loop to print the Fibonacci sequence
        for (var i = 0; i < n; i++) {
            System.out.println(a);  // Print the current Fibonacci number
            var sum = a + b;  // Calculate the next Fibonacci number
            a = b;  // Move b to a
            b = sum;  // Set b to the sum (next Fibonacci number)
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
