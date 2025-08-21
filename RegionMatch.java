public class RegionMatch {
    public static void main(String[] args) {
        String str1 = "Hello Java World";
        String str2 = "Java";
        boolean match=str1.regionMatches(6, str2, 0, 4);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Do the regions match? " + match);
    }
    
}
