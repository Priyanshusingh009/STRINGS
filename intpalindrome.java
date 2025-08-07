import java.util.Scanner;

public class intpalindrome {
    public static boolean isPalindrome(int x) {
        int temp=x;
        int reversed=0;
        boolean check=false;
        
        while(x!=0 &&x>0 ){
         int y=x%10;
         x=x/10;
            reversed=reversed *10 +y;
        }
        if(reversed==temp){
            check=true;
        }
        return check;

        
    }
    public static void main(String[] args) {
        System.out.println("enter the no ");
        Scanner sc=new Scanner(System.in);
        
        int input =sc.nextInt();
        boolean result=isPalindrome(input);
        System.out.println(result);
    }
    
}
