import java.util.Scanner;

public class LongestPalindrome {
    private static String expandAroundCenter(String str,int left,int right){
        while (left >= 0 && right < str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }

        return str.substring(left+1, right);
    }
    public static String longestPalindrome(String str){
        if(str.length()==0 || str.length()<1)return "";
        String longest="";
        for(int i=0;i<str.length();i++){
            String odd=expandAroundCenter(str,i,i);
            String even = expandAroundCenter(str, i, i + 1);
            if (odd.length() > longest.length()) {
                longest = odd;
            }
            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String input=sc.nextLine();
        System.out.println("The longest palindrome is \n"+longestPalindrome(input));

    }
    
}
