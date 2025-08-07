import java.util.Scanner;

public class reverseinteger {
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int lastDigit = x % 10;     // Get the last digit
            x = x / 10;                 // Remove last digit
            reversed = reversed * 10 + lastDigit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int result = reverse(number);
        System.out.println("Reversed number: " + result);
    }
    
    
}
