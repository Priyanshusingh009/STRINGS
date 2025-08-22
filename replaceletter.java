public class replaceletter {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str1.replaceAll("brown", "pink"));// to change word
        String str2="hello my name is priyanshu singh";
        String change=str2.replace('e', 'm');//to change character.
        System.out.println(change);
    }
}

