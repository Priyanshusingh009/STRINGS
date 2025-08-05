public class stringBuilder {
    public static void main(String[] args) {
        int n = 5;
         /* StringBuilder is used to create and build strings efficiently (better than using + repeatedly).
        Here, we create an empty StringBuilder called str. */
        StringBuilder str = new StringBuilder("hello");
             //append(string) to add words into string
            str.append("hello "); // adding hello to str
            //2.setCharAt(index,char)
            str.setCharAt(2, 'p');
            //3.insert(ind,char)
            str.insert(1,'s');
            //4.deleteCharAt(index)
            str.deleteCharAt(1);
            //5.reverse()
            str.reverse();
            //6.delete(s,e)
            str.delete(2, 7);
            
        

        String s = str.toString(); //this converts the StringBuilder into a regular String and stores it in s.
        System.out.println(s);
    }
}