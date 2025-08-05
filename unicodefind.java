public class unicodefind {
    public static void main(String[] args) {
        String str = "Hello 😊";

        int index = 6; // index of the emoji
        //usecodePointAt(index) function for this
        int codePoint = str.codePointAt(index);

        System.out.println("Character at index " + index + " is: " + Character.toChars(codePoint));
        System.out.println("Unicode code point is: " + codePoint);
    }
    
}
