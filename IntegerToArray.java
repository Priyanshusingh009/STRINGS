import java.util.Arrays;

public class IntegerToArray {
    public static void main(String[] args) {
        int number = 12345;

        // Step 1: Convert the integer to a String
        String str = String.valueOf(number);
        System.out.println(str);

        // Step 2: Create an int array of the same length
        int[] digits = new int[str.length()];

        // Step 3: Convert each character to its digit
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0'; // '0' = 48 in ASCII, so this gives the digit value
        }

        // Output the array
        System.out.println("Array of digits: " + Arrays.toString(digits));
    }
}

