import java.util.Scanner;
public class endswith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you want to ends with--->");
        String ends=sc.nextLine();
        String str="exercises";
        boolean check=str.endsWith(ends);
        System.out.println(check);

    }
    
}
