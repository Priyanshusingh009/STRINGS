public class Indexofallaphabet {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        str=str.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            System.out.print("Indexes of '" + ch + "': ");
            int indexof=str.indexOf(ch);
            if(indexof==-1){
                System.out.println("not found");
                continue;
            }
            while(indexof!=-1){
                System.out.print(indexof+",");
                indexof = str.indexOf(ch, indexof + 1); // search again from next position
            }
            System.out.println();
        }
    }
}
