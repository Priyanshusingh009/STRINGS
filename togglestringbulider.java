import java.util.*;
public class togglestringbulider {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    StringBuilder str=new StringBuilder(sc.nextLine());
    System.out.println(str);
    //toggle
    //input mY nAmE
    //output My NaMe
    for(int i =0;i<str.length();i++){
        boolean flag1=true; //capital

        char ch=str.charAt(i);
        int asci=(int)ch;
        if(ch==' '){
            continue;
        }
        
        if(asci>=97){
            flag1=false;
        }
        if(flag1==true){
            asci+=32;
            char dh=(char)asci;
            str.setCharAt(i,dh);


        }
        else{
            asci-=32;
            char dh=(char)asci;
            str.setCharAt(i,dh);
        }
    }
    sc.close();
    System.out.println(str);
    

    }

    
}
