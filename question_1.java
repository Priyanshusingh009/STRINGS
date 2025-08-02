/* input is "abcd"
 output should be 
 a
 ab
 abc
 abcd
 b
 bc
 bcd
 .
 .
 .
 d
 */
import java.util.*;
public class question_1 {
    public static void main(String[] args) {
        String str= "abcd";
        for(int i =0;i<=str.length()-1;i++){
            for(int j=i+1;j<=str.length();j++){
                
                System.out.println(str.substring(i, j));
            }
        }

        
    }
    
}
