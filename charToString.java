//Write a Java program to create a String object with a character array.

import java.util.*;
public class charToString {
    public static void main(String[] args) {
        char[] ch=new char[]{'1', '2', '3', '4' };
        String str=String.copyValueOf(ch,1,3);
        System.out.println("open the book's page no "+str);

    }
    
}
