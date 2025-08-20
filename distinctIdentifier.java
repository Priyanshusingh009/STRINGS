import java.util.Scanner;
public class distinctIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Create identifier (string + hashCode)
        String identifier = str + "_" + str.hashCode();
        System.out.println("Distinct Identifier: " + identifier);
        sc.close();
    }
    
}
