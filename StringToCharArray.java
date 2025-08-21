import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String text = "Hello Java";  // given string
     // convert string into character array
        char[] charArray = text.toCharArray();
        System.out.println("given string \n "+text);
        System.out.println("Character Array: \n " + Arrays.toString(charArray));
    }
}
