/*Write a Java program to compare a given
 string to another string, ignoring case considerations. */
import java.util.*;
public class ignoreCase{
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "stephen edwin king";
        String str3 = "stephen edwin king";
        System.out.println("checking wether all strings are equal or not ");
        boolean check1=str1.equalsIgnoreCase(str2);
        if(check1){
            System.out.println("srt1 and str2 are equal");}
        if(str1.equalsIgnoreCase(str3)){
              System.out.println("str1 and str3 are equal");
        }
        if (str2.equalsIgnoreCase(str3)) {
                System.out.println("str2 and str3 are equal");
                System.out.println("All strings are equal");
        }
        
        
    }
}