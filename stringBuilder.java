public class stringBuilder {
    public static void main(String[] args) {
        int n = 5;
        StringBuilder str = new StringBuilder(); /* StringBuilder is used to create and build strings efficiently (better than using + repeatedly).
Here, we create an empty StringBuilder called str. */
        for (int i = 0; i < n; i++) {
            str.append("hello "); // adding hello to str
        }
        String s = str.toString(); //this converts the StringBuilder into a regular String and stores it in s.
        System.out.println(s);
    }
}